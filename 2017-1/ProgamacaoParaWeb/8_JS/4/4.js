function iteration() {
    var name = prompt('Digite seu nome');
    var times = prompt('Digite um número');
    for(i = 0; i < times; i++) {
        document.write('<h1>' + name + '</h1>');
    }
}