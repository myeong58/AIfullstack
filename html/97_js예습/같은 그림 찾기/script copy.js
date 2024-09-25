const images = [
    { src: 'img/딸기.png', dataCard: '딸기' },
    { src: 'img/딸기.png', dataCard: '딸기' },
    { src: 'img/레몬.png', dataCard: '레몬' },
    { src: 'img/레몬.png', dataCard: '레몬' },
    { src: 'img/바나나.png', dataCard: '바나나' },
    { src: 'img/바나나.png', dataCard: '바나나' },
    { src: 'img/사과.png', dataCard: '사과' },
    { src: 'img/사과.png', dataCard: '사과' },
    { src: 'img/포도.png', dataCard: '포도' },
    { src: 'img/포도.png', dataCard: '포도' },
    { src: 'img/수박.png', dataCard: '수박' },
    { src: 'img/수박.png', dataCard: '수박' }
];

let firstCard = null;
let secondCard = null;
let lockBoard = false;

// 배열 섞기 함수
function shuffle(array) {
    for (let i = array.length - 1; i > 0; i--) {
        const j = Math.floor(Math.random() * (i + 1));
        [array[i], array[j]] = [array[j], array[i]];
    }
}

// 카드 생성 함수
function createCards() {
    shuffle(images); // 카드 섞기
    const box = document.querySelector('.s_box');
    images.forEach(image => {
        const card = document.createElement('img');
        card.classList.add('img');
        card.src = 'img/뒤집힌카드.png'; // 초기 상태의 카드 이미지
        card.setAttribute('data-card', image.dataCard);
        card.addEventListener('click', flipCard);
        box.appendChild(card); // 카드 추가
    });
}

// 카드 클릭 이벤트 핸들러
function flipCard() {
    if (lockBoard) return; // 카드 클릭 잠금
    if (this === firstCard) return; // 이미 선택된 카드 클릭 무시

    this.classList.add('flip'); // 카드 뒤집기
    if (!firstCard) {
        firstCard = this; // 첫 번째 카드 저장
        return;
    }
    
    secondCard = this; // 두 번째 카드 저장
    checkForMatch();
}

// 카드 매칭 확인
function checkForMatch() {
    let isMatch = firstCard.dataset.card === secondCard.dataset.card;

    isMatch ? disableCards() : unflipCards();
}

// 카드 비활성화
function disableCards() {
    firstCard.removeEventListener('click', flipCard);
    secondCard.removeEventListener('click', flipCard);
    resetBoard();
}

// 카드 다시 뒤집기
function unflipCards() {
    lockBoard = true; // 카드 클릭 잠금
    setTimeout(() => {
        firstCard.classList.remove('flip');
        secondCard.classList.remove('flip');
        resetBoard();
    }, 1500);
}

// 보드 초기화
function resetBoard() {
    [firstCard, secondCard, lockBoard] = [null, null, false];
}

// 게임 초기화
function init() {
    createCards(); // 카드 생성
}

// 리셋 버튼 클릭 시 리셋 기능
document.querySelector('.r_button').addEventListener('click', resetGame);

function resetGame() {
    const cards = document.querySelectorAll('.img');
    cards.forEach(card => {
        card.classList.remove('flip');
        card.addEventListener('click', flipCard);
    });
    resetBoard();
}

// 초기화 함수 호출
init();