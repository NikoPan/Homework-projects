var people = [
    {firstname: 'George', lastname: 'Kolev', age: 32, hasSmartphone: false},
    {firstname: 'Vasil', lastname: 'Kovachev', age: 40, hasSmartphone: true},
    {firstname: 'Bay', lastname: 'Ivan', age: 81, hasSmartphone: true},
    {firstname: 'Baba', lastname: 'Ginka', age: 40, hasSmartphone: false}];

function findYoungestPerson(array) {

    // filtering persons with smartphones
    var young = array.filter(function (person) {
        if (person.hasSmartphone) {
            return person;
        }
    });

    //the youngest person is first in the list
    array.sort(function (a, z) {
        return a.age > z.age; //sorting by name
    });

    //output
    console.log("The youngest person is " + young[0].firstname + " " + young[0].lastname);

};

findYoungestPerson(people); //The youngest person is Vasil Kovachev
