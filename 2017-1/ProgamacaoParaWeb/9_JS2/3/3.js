function calculate(qtdKwh, valKwh) {
    var valAsNumber = parseFloat(valKwh);
    var qtdAsNumber = parseFloat(qtdKwh);
    var valFinal = 0;
    if((qtdAsNumber > 100) && (qtdAsNumber <= 200)) {
        valFinal = valAsNumber * 1.25;
    } else if(qtdAsNumber > 200) {
        valFinal = valAsNumber * 1.50;
    } else {
        valFinal = valAsNumber;
    }
    var total = valFinal * qtdAsNumber;
    alert('Valor total: ' + total);
}