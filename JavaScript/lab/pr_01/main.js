/**
 * Problem 1.    Write your name with glow .
 */
var canvas = document.getElementById('canvas');

var ctx = canvas.getContext('2d');

//stroke
ctx.font = "100px Arial";
ctx.lineWidth = 10;
ctx.strokeStyle='pink';
ctx.strokeText('Nikolay', 200, 200);//fill before stroke

//fill
ctx.font = "100px Arial";
ctx.fillStyle='green';
ctx.fillText('Nikolay', 200, 200);
ctx.fillStyle='green';









