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

function shuffle(array){
    for (let i = array.length - 1; i > 0; i--){
        const j = Math.floor(Math.random() * (i + 1));
        [array[i], array[j]] = [array[j], array[i]];
    }
}

function createCards(){
    shuffle(images)
    const box =document.querySelector('s_box');
    images.forEach(image => {
        const card = document.createElement('img');
        card.src = "img/black.png";
        card.setAttribute('data-card', image.dataCard);
        card.addEventListener('click', flipCard);
        box.appendChild(card);
    });
}

function init() {
    createCards();
    const cards = document.querySelectorAll('.img');
    cards.forEach(card => {
        card.addEventListener('click', flipCard);
    });
}



document.querySelector('.s_button').addEventListener('click', init());
