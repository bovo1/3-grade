var slides = document.querySelector('.slide1');
var slide = document.querySelectorAll('.slide1 li');
var slides2 = document.querySelector('.slide2');
var slide2 = document.querySelectorAll('.slide2 li');

const slide_img = document.querySelectorAll('.slide1 li img');

var currnetIndex = 0;
var currnetIndex2 = 0;
var slideCount = slide.length;
var slideCount2 = slide2.length;
var slidewidth = 410;
var slidemargin = 20;

var prevB = document.querySelector('.prev');
var nextB = document.querySelector('.next');
var prevB2 = document.querySelector('.prev2');
var nextB2 = document.querySelector('.next2');


slides.style.width = (slidewidth * slideCount) + (slidemargin * (slideCount - 1)) + 'px';
slides2.style.width = (slidewidth * slideCount2) + (slidemargin * (slideCount2 - 1)) + 'px';

autoslide();
autoslide2();

function moveSlide(num)
{
    slides.style.left = (-num * 430) + 'px';
    currnetIndex = num;
}

function moveSlide2(num)
{
    slides2.style.left = (-num * 430) + 'px';
    currnetIndex2 = num;
}

nextB.addEventListener('click', function(){
    if(currnetIndex < slideCount - 4){
        moveSlide(currnetIndex + 1);
    }
    else{
        moveSlide(0);
    }
});

prevB.addEventListener('click', function(){
    if(currnetIndex > 0){
        moveSlide(currnetIndex - 1);
    }
    else{
        moveSlide(slideCount - 4);
    }
});

nextB2.addEventListener('click', function(){
    if(currnetIndex2 < slideCount2 - 4){
        moveSlide2(currnetIndex2 + 1);
    }
    else{
        moveSlide2(0);
    }
});

prevB2.addEventListener('click', function(){
    if(currnetIndex2 > 0){
        moveSlide2(currnetIndex2 - 1);
    }
    else{
        moveSlide2(slideCount2 - 4);
    }
});

function autoslide()
{
    setInterval(function()
    {
        nextB.click();
    }, 3000);
}

function autoslide2()
{
    setInterval(function()
    {
        nextB2.click();
    }, 3000);
}
