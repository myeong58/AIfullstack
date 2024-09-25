
function slide(){
    $("#slider-image-wrap").stop().animate({ marginLeft:-1920 }, 1000, function () {
           $(".image").eq(0).appendTo("#slider-image-wrap");
           $("#slider-image-wrap").css({ marginLeft: 0 });
    });           
}

$(slide,setInterval(slide,3000))
