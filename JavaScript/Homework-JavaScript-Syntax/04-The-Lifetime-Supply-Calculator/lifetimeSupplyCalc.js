function calcSupply(age, maxAge, food, foodPerDay) {

    var totalKg = Math.round(365 * (maxAge - age) * foodPerDay);

    return totalKg + "kg of " + food + " would be enough until I am " + maxAge + " years old.";
}

//The parameters below are as follow: your age (years), your maximum age (years), your favorite food name (e.g. "chocolate"), estimate amount of your favorite food per day (a number).

console.log(calcSupply(38, 118, "chocolate", 0.5));
console.log(calcSupply(20, 87, "fruits", 2));
console.log(calcSupply(16, 102, "nuts", 1.1));