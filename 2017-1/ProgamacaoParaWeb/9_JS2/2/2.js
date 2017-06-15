function tipoTriangulo(lado1, lado2, lado3) {
    var tipo = '';
    if((lado1 == lado2) && (lado2 == lado3)) {
        tipo = 'Equilátero';
    } else if((lado1 == lado2) || (lado2 == lado3) || (lado1 == lado3)) {
        tipo = 'Isóceles';
    } else {
        tipo = 'Escaleno';
    }
    
    document.write('<div><h1>' + tipo + '</h1></div>');
}