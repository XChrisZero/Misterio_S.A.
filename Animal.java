package JAV.Scooby_Doo.Misterios_SA;

public class Animal 
{
    String nome;
    int idade;
    float peso;
    String cor;

    void dadosA() 
    {
        System.out.print("nome: ");
        System.out.println(nome);
        System.out.print("idade: ");
        System.out.println(idade);
        System.out.print("peso: ");
        System.out.println(peso);
        System.out.print("Cor: ");
        System.out.println(cor);
        System.out.println("------------");
    }
    void fala()
    {
        System.out.println("Scooby-Doo By_Doo!!!");
    }
}
