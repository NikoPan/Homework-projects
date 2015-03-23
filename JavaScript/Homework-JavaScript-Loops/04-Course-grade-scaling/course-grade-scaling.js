
function solve(input) {

    input = input.map(function (student) {
        student.score += student.score * 0.10; //increasing each score with 10%
        return student;
    });

    input.forEach(function (student) {
        if (student.score >= 100) {
            student.hasPassed = true; //if score is 100+, hasPassed is true
            return student;
        }
    });

    var output = input.filter(function (student) {
        if (student.hasPassed == true) {    //filtering hasPassed students
            return student;
        }
    });

    output.sort(function (a, z) {
        return a.name > z.name; //sorting by name
    });

    console.log(output);
}

//input
solve([{'name': 'Пешо', 'score': 91}, {'name': 'Лилия', 'score': 290}, {
    'name': 'Алекс',
    'score': 343
}, {'name': 'Габриела', 'score': 400}, {'name': 'Жичка', 'score': 70}]);