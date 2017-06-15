function isGreaterThanTen() {
    const TEN = 10;
    var input = prompt('Digite um número');
    var inputNumber = parseInt(input, 10); //the 10 parameter indicates decimal values
    if(inputNumber < TEN) {
        document.write('<h1>Menor que dez</h1>');
    } else if(inputNumber == TEN) {
        document.write('<h1>Igual a dez</h1>');
    } else {
        document.write('<h1>Maior que dez</h1>');
    }
}