function operation() {
    var val1 = prompt('Digite um número');
    var val2 = prompt('Digite outro número');
    var operator = prompt('Digite a operação');
    var val1AsNumber = parseFloat(val1);
    var val2AsNumber = parseFloat(val2);
    var result = 0;
    switch(operator) {
            case('+'):
                result = val1AsNumber + val2AsNumber;
                break;
            case('-'):
                result = val1AsNumber - val2AsNumber;
                break;
            case('*'):
                result = val1AsNumber * val2AsNumber;
                break;
            case('/'):
                result = val1AsNumber / val2AsNumber;
                break;
    }
    document.write('<h1>Resultado da operação: ' + result + '</h1>');
}