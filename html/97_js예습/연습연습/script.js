// 글자 색 바꾸기
const name = document.querySelector(".name");

let check = 0;
var color = ['blue','green','orange', 'red']

function changeColor() {
    name.style.color = color[check];
    check = (check + 1) %4;

}

function popup(){
    var name = document.getElementById('name').value;
    var string = "이름은 " + name + "입니다!"
    alert(string)
}



document.getElementById('img').addEventListener('change',function(event) {
    const file = event.target.files[0];
    const imgPreview = document.getElementById('imgPreview');
    const img = document.getElementById('img');

    if(file){
        const reader = new FileReader();

        reader.onload = function(e){
            imgPreview.src = e.target.result;
            imgPreview.style.display = 'block';
            img.style.display = 'none';
        }

        reader.readAsDataURL(file);
    }else {
        imgPreview.src="";
        imgPreview.style.display = 'none'
    }
});

