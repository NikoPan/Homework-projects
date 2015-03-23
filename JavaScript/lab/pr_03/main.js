/**
 * beginPath(), moveTo(), lineTo(), fillRect(), arc() and stroke()/fill()
 */


var canvas = document.getElementById('canvas');

var ctx = canvas.getContext('2d');

ctx.beginPath();
ctx.rect(100,180,300,200);
ctx.fillStyle = 'brown';
ctx.lineWidth = 2;
ctx.fill();
ctx.stroke();

ctx.beginPath();
ctx.moveTo(100,180);
ctx.lineTo(190,60);
ctx.lineTo(320,60);
ctx.lineTo(400,180);
ctx.fill();
ctx.stroke();

ctx.rect(340,50,20,100);
ctx.fill();

ctx.beginPath();
ctx.moveTo(360,50);
ctx.lineTo(360,140);
ctx.stroke();

ctx.beginPath();
ctx.moveTo(340,50);
ctx.lineTo(340,140);
ctx.stroke();

ctx.beginPath();
ctx.ellipse(350, 50, 10, 5, 0, 0, Math.PI*2);
ctx.lineWidth = 3;
ctx.fill();
ctx.stroke();

ctx.beginPath();
ctx.arc(150,320, 40, 0, Math.PI, Math.PI*2);
ctx.stroke();

ctx.beginPath();
ctx.moveTo(110,320);
ctx.lineTo(110,380);
ctx.stroke();

ctx.beginPath();
ctx.moveTo(190,320);
ctx.lineTo(190,380);
ctx.stroke();

ctx.beginPath();
ctx.moveTo(150,280);
ctx.lineTo(150,380);
ctx.stroke();

ctx.beginPath();
ctx.arc(140, 350, 5, 0, 10);
ctx.stroke();

ctx.beginPath();
ctx.arc(160, 350, 5, 0, 10);
ctx.stroke();


//windows
ctx.beginPath();
ctx.rect(120,190,120,60);
ctx.fillStyle = 'black';
ctx.fill();

ctx.beginPath();
ctx.rect(260,190,120,60);
ctx.fillStyle = 'black';
ctx.fill();

ctx.beginPath();
ctx.rect(260,280,120,60);
ctx.fillStyle = 'black';
ctx.fill();


ctx.beginPath();
ctx.strokeStyle = 'brown';
ctx.moveTo(185,190);
ctx.lineTo(185,250);
ctx.stroke();

ctx.beginPath();
ctx.strokeStyle = 'brown';
ctx.moveTo(120,220);
ctx.lineTo(240,220);
ctx.stroke();


ctx.beginPath();
ctx.strokeStyle = 'brown';
ctx.moveTo(260,220);
ctx.lineTo(380,220);
ctx.stroke();

ctx.beginPath();
ctx.strokeStyle = 'brown';
ctx.moveTo(320,190);
ctx.lineTo(320,250);
ctx.stroke();

ctx.beginPath();
ctx.strokeStyle = 'brown';
ctx.moveTo(320,280);
ctx.lineTo(320,340);
ctx.stroke();

ctx.beginPath();
ctx.strokeStyle = 'brown';
ctx.moveTo(260,310);
ctx.lineTo(380,310);
ctx.stroke();