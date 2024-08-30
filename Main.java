public class Main 
{
    public static void main(String[] args)
    {
        Animal a1 = new Animal();
        a1.nome = "Mel";
        a1.idade = 5;
        a1.peso = 15;
        a1.dadosanimal();

        Dog d1 = new Dog();
        d1.latir();
        d1.existir();
        d1.cor = "caramelo";
        d1.nome = "Scooby";
        d1.idade = 12;
        d1.peso = 5;
        d1.dadosanimal();
    
        Fish f1 = new Fish();
        f1.nothing();
        f1.existir();
        f1.cor = "Vermelho e listras pretas e brancas";
        f1.nome = "Nemo";
        f1.idade = 2;
        f1.peso = 075;
        f1.dadosanimal();

        Velma v1 = new Velma();
        v1.cor = "branca";
        v1.idade = 23;
        v1.nome = "Velma";
        v1.peso = 58;
        v1.dadosh();
    }

}

