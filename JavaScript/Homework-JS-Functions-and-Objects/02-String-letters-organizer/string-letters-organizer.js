
function sortLetters(string, boolean) {
    var sorted = string.split("");

    if (boolean) {
        sorted.sort(function (a, z) {
            return a.toLowerCase().localeCompare(z.toLowerCase());
        });
        var strAZ= sorted.join('');
        console.log(strAZ);
    }
    else {
        sorted.sort(function (a, z) {
            return z.toLowerCase().localeCompare(a.toLowerCase());
        });
        var strZA = sorted.join('');
        console.log(strZA);
    }
};

//input
sortLetters('HelloWorld', true);    //'deHllloorW'
sortLetters('HelloWorld', false);   //'WroolllHed'