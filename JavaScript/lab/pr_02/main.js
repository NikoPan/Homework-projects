/**
 * Problem 2.	Draw a face using paths in canvas
 *
 * Using beginPath(), moveTo(), lineTo(), arc()
 * and stroke()/fill() try to visualize the following image:
 */

var canvas = document.getElementById('canvas');

var ctx = canvas.getContext('2d');

//head fill
ctx.beginPath();
ctx.arc(250, 250, 100, 0, 10);
ctx.fillStyle = 'lightblue';
ctx.fill();

//head stroke
ctx.arc(250, 250, 100, 0, 10);
ctx.strokeStyle = 'darkblue';
ctx.lineWidth = 3;
ctx.stroke();

//right eye
ctx.beginPath();
ctx.ellipse(200, 250, 20, 10, 0, 0, Math.PI*2);
ctx.strokeStyle = 'darkblue';
ctx.lineWidth = 3;
ctx.stroke();

ctx.beginPath();
ctx.ellipse(190, 250, 5, 10, 0, 0, Math.PI*2);
ctx.fillStyle = 'darkblue';
ctx.lineWidth = 3;
ctx.fill();


//left eye
ctx.beginPath();
ctx.ellipse(270, 250, 20, 10, 0, 0, Math.PI*2);
ctx.strokeStyle = 'darkblue';
ctx.lineWidth = 3;
ctx.stroke();

ctx.beginPath();
ctx.ellipse(260, 250, 5, 10, 0, 0, Math.PI*2);
ctx.fillStyle = 'darkblue';
ctx.lineWidth = 3;
ctx.fill();


//nose
ctx.beginPath();
ctx.moveTo(235, 250);
ctx.lineTo(220, 280);
ctx.lineTo(250, 280);
ctx.stroke();

//mouth
ctx.beginPath();
ctx.ellipse(240, 310, 40, 10, 0.2, 0, Math.PI*2);
ctx.strokeStyle = 'darkblue';
ctx.lineWidth = 3;
ctx.stroke();

//hat
ctx.beginPath();
ctx.ellipse(250, 180, 120, 40, 0, 0, Math.PI*2);
ctx.fillStyle = 'blue';
ctx.fill();

ctx.ellipse(250, 180, 120, 40, 0, 0, Math.PI*2);
ctx.strokeStyle = 'darkblue';
ctx.lineWidth = 3;
ctx.stroke();


ctx.beginPath();
ctx.moveTo(180, 180);
ctx.lineTo(250, 90);
ctx.lineTo(310,180);
ctx.fill();

ctx.beginPath();
ctx.moveTo(180, 180);
ctx.lineTo(250, 90);
ctx.lineTo(310,180);
ctx.stroke();




