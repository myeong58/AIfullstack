$(function(){
    $.ajax({
        url: "product.json",
        dataType: "Json",
        success: function(data){
            let i = 0; 
            for (i; i<12; i++)
        {
            if(i<8){
            $(".product").eq(i).append('<a href="#"><img src='+data[i].url+'></a>')
            $(".product").eq(i).append('<a href="#"><p>'+data[i].product+'</p></a>')
            $(".product").eq(i).append('<a href="#"><span>'+data[i].price+'</span></a>')
            }else if(i>=8){
            $(".product").eq(i).append('<a href="#"><img src='+data[i-8].url+'></a>')
            $(".product").eq(i).append('<a href="#"><p>'+data[i-8].product+'</p></a>')
            $(".product").eq(i).append('<a href="#"><span>'+data[i-8].price+'</span></a>')
            }
        }
        }
    })
})