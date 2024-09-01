package JAV.Scooby_Doo.Misterios_SA;

public class Main 
{
    public static void main(String[] args)
    {
        Dog d1 = new Dog();
        d1.latir();
        d1.fala();
        d1.dadosA();
        d1.cor = "caramelo";
        d1.nome = "Scooby";
        d1.idade = 17;
        d1.peso = 33;

        Velma v1 = new Velma();
        v1.Jargao();
        v1.dadosH();
        v1.frase = "Acho que finalmente estou começando a entender este mistério.";
        v1.idade = 15;
        v1.nome = "Velma";
        v1.peso = 58;
        v1.olho = "Castanhos";
        v1.cabelo = "Castanhos";

        Daphne da1 = new Daphne();
        da1.Jargao();
        da1.dadosH();
        da1.frase = "Esse lugar me dá arrepios!";
        da1.idade = 16;
        da1.nome = "Daphne";
        da1.peso = 48;
        da1.olho = "Azuis";
        da1.cabelo = "Ruivo";

        Fred f1 = new Fred();
        f1.ff();
        f1.Jargao();
        f1.dadosH();
        f1.frase = "Acho que temos um novo mistério nas mãos.";
        f1.idade = 17;
        f1.nome = "Fred";
        f1.peso =62;
        f1.olho = "Azuis";
        f1.cabelo = "Loiros";

        Salsicha s1 = new Salsicha();
        s1.Jargao();
        s1.dadosH();
        s1.frase = "Ô, Diabo!";
        s1.idade = 17;
        s1.nome = "Salsicha";
        s1.peso = 55;
        s1.olho = "Castanhos";
        s1.cabelo = "Loiro Escuro";
        
    }

}
