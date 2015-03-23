function cylinderVolume(values) {
    var radius = values[0];
    var height = values[1];
    return (Math.PI * radius * radius * height).toFixed(3);
}

//The cylinder radius and height are given as [r,h]

console.log(cylinderVolume([2, 4]));
console.log (cylinderVolume([5, 8]));
console.log (cylinderVolume([12, 3]));