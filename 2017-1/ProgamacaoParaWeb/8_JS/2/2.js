function sum() {
    var val1 = prompt('Digite um número');
    var val2 = prompt('Digite outro número');
    var val1AsNumber = parseFloat(val1);
    var val2AsNumber = parseFloat(val2);
    document.write('<h1>Resultado da soma: ' + (val1AsNumber + val2AsNumber) + '</h1>');
}