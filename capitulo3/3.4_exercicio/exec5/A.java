package exec5;
class A {
    b.B variable;
}

/**
Aresposta certa é (e). Oarquivo B compila pois é uma classe normal. O
arquivo C não compila pois tenta acessar B, que está em outro pacote,
mas lembre-se que devemos acessar os pacotes diretamente, não existe
subpacote. O mesmo vale para A. Portanto, nem A nem C compilam.
 */