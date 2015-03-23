
function calculateKnots(value) {
    return Number((value / 1.852).toFixed(2));

}
// The test value is in kmh. The result is in knots.

console.log (calculateKnots(20));
console.log (calculateKnots(112));
console.log (calculateKnots(400));