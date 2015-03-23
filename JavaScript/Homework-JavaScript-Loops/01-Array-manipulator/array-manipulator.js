
function solve(input) {

    var filteredArr = input.filter(function (a) {
        return !isNaN(a);
    });

    //frequency check
    function mostFrequent(filteredArr) {
        if (filteredArr.length == 0)
            return null;

        var modeMap = {},
            maxEl = filteredArr[0],
            maxCount = 1;

        for (var i = 0; i < filteredArr.length; i++) {
            var el = filteredArr[i];

            if (modeMap[el] == null)
                modeMap[el] = 1;
            else
                modeMap[el]++;

            if (modeMap[el] > maxCount) {
                maxEl = el;
                maxCount = modeMap[el];
            }
            else if (modeMap[el] == maxCount) {
                maxEl += '&' + el;
                maxCount = modeMap[el];
            }
        }
        return maxEl;
    }

    //output
    console.log("Min number: " + Math.min.apply(null, filteredArr));
    console.log("Max number: " + Math.max.apply(null, filteredArr));
    console.log("Most frequent number: " + mostFrequent(filteredArr));
    console.log(filteredArr.sort(function (a, b) {
        return b - a
    }));
}

//input
solve(["Pesho", 2, "Gosho", 12, 2, "true", 9, undefined, 0, "Penka", {bunniesCount: 10}, [10, 20, 30, 40]]);