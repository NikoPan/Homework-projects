
function replaceATag(str) {
    String.prototype.replaceAt = function (index, character) {
        return this.substr(0, index) + character + this.substr(index + character.length);
    };
    str = str.replace('<a', '[URL').replace('</a>', '[/URL]');
    str = str.replaceAt(str.length - 24, ']');

    return str;
}
console.log(replaceATag("<ul><li><a href=http://softuni.bg>SoftUni</a></li></ul>"));