
function solve(input) {

    //valid scores
    var scores = input.filter(function (a) {
        return a > 0 & a <= 400;
    });

    //20% off and round to 1 sign after the floating point
    var split = scores.map(function (score) {
        return Math.round((score * 0.8)*100)/100;
    });

    //ascending sort
    split.sort(function (a, b) {
        return a - b
    });

    //output
    console.log(split);
};
solve([200, 120, 23, 67, 350, 420, 170, 212, 401, 615, -1]);
