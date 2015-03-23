function extractObjects(array) {
    var objects = [];
    for (var i in array) {
        if (typeof array[i] === 'object' && Object.prototype.toString.call(array[i]) !== '[object Array]') {
            objects.push(array[i]);
        }
    }
    console.log(objects);
};
extractObjects([
    "Pesho", 4, 4.21,
    {name: 'Valyo', age: 16},
    {type: 'fish', model: 'zlatna ribka'},
    [1, 2, 3], "Gosho",
    {name: 'Penka', height: 1.65}
]);