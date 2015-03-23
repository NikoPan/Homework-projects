function quad(form) {
    var a = eval(form.a.value),
        b = eval(form.b.value),
        c = eval(form.c.value),
        x1 = -b / 2 / a + Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5) / 2 / a,
        x2 = -b / 2 / a - Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5) / 2 / a;
    form.x1.value = x1;
    form.x2.value = x2;
    if (form.x1.value == "NaN") form.x1.value = "No real roots";
    if (form.x2.value == "NaN") form.x2.value = "No real roots";
}