function doOperation() {
    var val1 = document.getElementById('val1').value;
    var val2 = document.getElementById('val2').value;
    var val1AsNumber = parseFloat(val1);
    var val2AsNumber = parseFloat(val2);
    var operator = document.getElementById('cboOperations').value;
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
    alert('Resultado da operação: ' + result);
}