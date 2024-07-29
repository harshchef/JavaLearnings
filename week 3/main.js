
// function test1(message)
// {
//     alert(message);

// }

// test()
// test1("hellow world")
// test1(6+9)

function testDoucument()
{
    document.querySelector("p#weather").innerHTML="test";

}
testDoucument();

document.querySelector("p#weather").addEventListener("click",function(){
    alert('p elemnent clicled');

})


document.querySelector("p#weather").innerHTML="test";

document.querySelector("#open-nav-menu").addEventListener("click",function(){
    document.querySelector("header nav .wrapper").classList.add("nav-open")
    });
document.querySelector("#close-nav-menu").addEventListener("click",function(){
    document.querySelector("header nav .wrapper").classList.remove("nav-open")
    });


    const weather="sunny";

 let temperature=69.908;


   
    function convert(temp)
    {
        let t1=temp*32/9;
        return t1;

    }

let weatherF=`hello from ${convert(temperature).toFixed(1)} today the ${weather}`;
let weathercel=`hello from ${(temperature)} today the ${weather}`;



document.querySelector(".weather-group").addEventListener("click",function(e){
    console.log(e.target.id);
    if(e.target.id=="fahr")
    {
        document.querySelector("#greeting").innerHTML=weatherF;
    }
    else{
        document.querySelector("#greeting").innerHTML=weathercel;
    }
    


})


//kab tak function chalega
// setTimeout(function(){




    
//     let localTime=new Date();
    
//     document.querySelector("span[data-time=hours]").textContent=localTime.getHours();
    
//     document.querySelector("span[data-time=minutes]").textContent=localTime.getMinutes();
//     document.querySelector("span[data-time=seconds]").textContent=localTime.getSeconds();
    
//     },1000);
    
setInterval(function() {
    let localTime = new Date();

    document.querySelector("span[data-time=hours]").textContent = localTime.getHours().toString().padStart(2, "0");
    document.querySelector("span[data-time=minutes]").textContent = localTime.getMinutes().toString().padStart(2, "0");
    document.querySelector("span[data-time=seconds]").textContent = localTime.getSeconds().toString().padStart(2, "0");

}, 1000);


let person={'name':"adi", "age":90};
for(let p in person)
        console.log(p+" "+person[p]);





let galleryImage=[
    {
src:"./assets/gallery/image1.jpg", alt:"Thumbnail Image 1"
    },
    {
src:"./assets/gallery/image2.jpg", alt:"Thumbnail Image 2"
    },
    {
        src:"./assets/gallery/image3.jpg", alt:"Thumbnail Image 3"
    }
]

let mainImage=document.querySelector("#gallery >img")

mainImage.src=galleryImage[1].src;
mainImage.alt=galleryImage[1].alt;




let thumbnail=document.querySelector("#gallery .thumbnails")

galleryImage.forEach(function(image,index)
{
    let thumb=document.createElement("img");
    thumb.src=image.src;
    thumb.alt=image.alt;
    thumb.dataset.arrayIndex=index;
    thumb.dataset.selected=false;

    thumbnail.appendChild(thumb);


})


document.addEventListener('DOMContentLoaded', function() {
    const form = document.getElementById('registration-form');
  
    form.addEventListener('submit', function(event) {
      const datetimeInput = document.getElementById('datetime');
      const datetimeValue = datetimeInput.value;
  
      if (!datetimeValue) {
        alert('Please select a date and time.');
        event.preventDefault(); // Prevent form submission
      } else {
        // You can add additional validation or processing here
        console.log('Selected date and time:', datetimeValue);
      }
    });
  });
  


// let weathertest=`hello from ${(temperature).toFixed(1)} today the ${weather}`;
//     document.querySelector("#greeting").innerHTML=weathertest;

