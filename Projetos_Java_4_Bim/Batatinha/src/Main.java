import java.util.Locale;
import java.util.Scanner;

public class Main
{
   /* public static void main(String[] args) {
        String nome= "Matheus";
        int quantidade;
        char inicial;

        quantidade= nome.length();
        nome.toUpperCase();

        if (nome.equals("MATHEUS"))
        {
            System.out.println("Está em maiuscula");
        }
        inicial = nome.charAt();
    }
}*/

  /*  public static void main(String[] args) {
    int num1 = 15;
    int num2 = 15;
    int comparar;

    if (num1 == num2)
    {
        System.out.println("São iguais");
    }
        else
        {
            System.out.println("São diferentes");
        }

    }

   */

    /*public static void main(String[] args) {

        String dogName = "Shesheu";
        int dogAge = 2;
        double dogFood = 1.5;
        String dogSong = "Au au";

        String fishName = "Nemo";
        int fishAge = 1;
        double fishFood = 0.140;
        String fishSong = "Glob glob";

        String catName = "Snow";
        int catAge = 3;
        double catFood = 0.5;
        String catSong = "Miau miau";

    System.out.printf("%s tem %d anos, atualmente come %.1f kilos e emite o som '%s' %n",dogName, dogAge, dogFood, dogSong);
    System.out.printf("%s tem %d anos, atualmente come %.1f kilos e emite o som '%s'%n",fishName, fishAge, fishFood, fishSong);
    System.out.printf("%s tem %d anos, atualmente come %.1f kilos e emite o som '%s'%n",catName, catAge, catFood, catSong);
    }
    */

    /*public static void main(String[] args)
    {
        String text1 = "My name is Mathew";
        String text2 = "My name is Mathew";

        if (text1.equals(text2))
        {
            System.out.println("São Iguais");
        }
            else
            {
                System.out.println("São diferentes");
            }
    }
*/
    /*public static void main(String[] args) {
        int num1 = 10;
        int num2 = 15;
        int num3 = 20;

        if (num1 == num2 && num1 == num2 && num2 == num3)
        {
            System.out.printf("Todos os numeros sao iguais %n");
        }
        else
        {
            System.out.printf("Todos os numeros sao diferentes %n");
        }

        if (num1 > num2 && num1 > num3)
        {
            System.out.printf("Numero 1 é o maior de todos %n");
        }
        if (num2 > num3 && num2 > num1)
        {
            System.out.printf("Numero 2 é o maior de todos %n");
        }
        if (num3 > num1 && num3 > num2)
        {
            System.out.printf("Numero 3 é o maior de todos %n");
        }
        else
        {
            System.out.println("Nao sei");
        }
    }
    */

       /* public static void main(String[] args)
    {

        Scanner scanner;
        scanner = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.printf("Informe o primeiro numero: %n");
        num1= scanner.nextInt();
        System.out.printf("Informe o segundo numero: %n");
        num2= scanner.nextInt();
        System.out.printf("Informe o terceiro numero: %n");
        num3= scanner.nextInt();

        if (num1 == num2 && num1 == num2 && num2 == num3)
        {
            System.out.printf("Todos os numeros sao iguais %n");

        }
        else
        {
            System.out.printf("Todos os numeros sao diferentes %n");
        }

        if (num1 > num2 && num1 > num3)
        {
            System.out.printf("Numero 1 é o maior de todos %n");
        }
        if (num2 > num3 && num2 > num1)
        {
            System.out.printf("Numero 2 é o maior de todos %n");
        }
        if (num3 > num1 && num3 > num2)
        {
            System.out.printf("Numero 3 é o maior de todos %n");
        }
        else
        {
            System.out.println("Nao sei");
        }
    }
    */


     /* public static void main(String[] args)
    {
        Scanner batatinha;
        batatinha = new Scanner(System.in);

        String nome;
        String sobrenome;
        int idade;
        String cidade;


        System.out.printf("Informe seu nome: %n");
        nome= batatinha.next();
        System.out.printf("Informe seu sobrenome: %n");
        sobrenome= batatinha.next();
        System.out.printf("Qual é a sua idade? %n");
        idade= batatinha.nextInt();
        System.out.printf("Qual é a sua cidade? %n");
        cidade= batatinha.next();

        System.out.printf("Ficha cadastral:%nNome completo: %s %s %nAtualmente com %d anos, morador na cidade de %s",nome,sobrenome,idade,cidade);
    }
     */

    /*public static void main(String[] args)
    {
        Scanner batatinha;
        batatinha = new Scanner(System.in);

        String nome;
        char inicial;
        System.out.printf("Informe seu nome:");
        nome = batatinha.nextLine();
        inicial= nome.charAt(0);
        System.out.printf("Sua inicial é: %s", inicial);

    }
*/

   /* public static void main(String[] args)
    {
        Scanner batatinha;
        batatinha = new Scanner(System.in);

        String nome;
        String sobrenome;
        char ini1;
        char ini2;
        char ini11;
        char ini22;

        System.out.printf("Informe seu nome:");
        nome = batatinha.nextLine();

        System.out.printf("Informe seu sobrenome:");
        sobrenome = batatinha.nextLine();

        ini1= nome.charAt(0);
        ini11= nome.charAt(1);
        ini2= sobrenome.charAt(0);
        ini22= sobrenome.charAt(1);

        System.out.printf("Seu nome de MC e: %s%s %n",ini1,ini2);
        System.out.printf("Seu nome de pokemon é: %s%s%s%smon",ini1,ini11,ini2,ini22);

    }
    */
    /*
    public static void main(String[] args)
    {
        Scanner batatinha;
        batatinha = new Scanner(System.in);

        String nome;
        String sobrenome;

        char inicialNome;
        char inicialSobrenome;

        int dia;
        int mes;
        int ano;

        System.out.println("Informe seu nome:");
        nome = batatinha.next();

        System.out.println("Informe seu sobrenome:");
        sobrenome = batatinha.next();

        inicialNome= nome.charAt(0);
        inicialSobrenome= sobrenome.charAt(0);

        System.out.println("Informe o dia do seu nascimento:");
        dia = batatinha.nextInt();
        System.out.println("Informe o mes do seu nascimento:");
        mes = batatinha.nextInt();
        System.out.println("IInforme o ano do seu nascimento:");
        ano = batatinha.nextInt();

        System.out.printf("Suas iniciais sao: %s%s%n",inicialNome,inicialSobrenome);
        System.out.printf("Suas iniciais sao: " + inicialNome + inicialSobrenome + "%n");

        System.out.printf("Seu nome completo: %s %s%n",nome,sobrenome);
        System.out.printf("Sua data de nascimento: %d/%d/%d%n",dia,mes,ano);

    }
*/

/*
    public static void main(String[] args) {

        for (int i=1; i<=3; i++){
            System.out.println(i);
        }

        String word = "palavras";
        for (int i=1; i<=3; i++){
            System.out.println(word);
        }
    }

 */

   /* public static void main(String[] args)
    {
        Scanner batatinha;
        batatinha = new Scanner(System.in);

        int num;
        int num2 = 2;
        int num3 = 3;
        int num5 = 5;
        int num7 = 7;

        System.out.println("Informe um numero:");
        num = batatinha.nextInt();

        if (num == 2 || num == 3 || num == 5 || num == 7)
        {
            System.out.println("E um numero primo");
        }
        else if (num % num2 == 0 || num % num3 == 0 || num % num5 == 0 || num % num7 == 0)
        {
            System.out.println("Nao e um numero primo");
        }
        else
        {
            System.out.println("E um numero primo");
        }
    }
    /*


    /*public static void main(String[] args) {
        Scanner tresNumeros;
        tresNumeros = new Scanner(System.in);

        double num1;
        double num2;
        double num3;

        System.out.println("Informe primeiro numero:");
        num1 = tresNumeros.nextDouble();

        System.out.println("Informe segundo numero:");
        num2 = tresNumeros.nextDouble();

        System.out.println("Informe terceiro numero:");
        num3 = tresNumeros.nextDouble();

        if (num1 > num2 && num1 > num3)
        {
            System.out.println("Primeiro numero digitado: " + num1 + " e o maior");
        }
        if (num2 > num1 && num2 > num3)
        {
            System.out.println("Segundo numero digitado: " + num2 + " e o maior");
        }
        if (num3 > num1 && num3 > num2)
        {
            System.out.println("Terceiro numero digitado: " + num3 + " e o maior");
        }
        if (num1 == num2 && num1 == num3)
        {
            System.out.println("Os tres numeros sao iguais logo nenhum e maior");
        }
        else
        {
            System.out.println("Todos os numeros são diferentes, so pra informar vc =]");
        }
    }

     */

    /*public static void main(String[] args)
    {

        Scanner batatinha = new Scanner(System.in);

        int numero;
        int num2 = 2;
        int num3 = 3;
        int num5 = 5;
        int num7 = 7;

        System.out.println("Informe um numero:");
        numero = batatinha.nextInt();

        for (int i= 1; i <= numero; i++)
        {

            if (i == 2 || i == 3 || i == 5 || i == 7)
            {
                System.out.println(i);
            }
            else if (i % num2 == 0 || i % num3 == 0 || i % num5 == 0 || i % num7 == 0)
            {
            }
            else
            {
                System.out.println(i);
            }
        }

    }
     */
    /*static boolean ehDivisivel(int num, int divisor) {
        return num%divisor==0;
    }

    static boolean ehPrimo(int num){
        int numeroDeDivisores = 0;

        for(int i=1; i <= num; i++){
            if(ehDivisivel(num, i)){
                numeroDeDivisores++;
            }
        }
        if (numeroDeDivisores==2){
            return true;
        }
        return false;
    } */

    /*static void quantosPacotes(String nomeDoAnimal, double quilosPorDia){
        Scanner comida = new Scanner(System.in);

        int quantidadeDePacotes = 0;
        double totalQuilosRecebidos = 0.0;

        while(totalQuilosRecebidos < quilosPorDia){
            System.out.println("Quantos quilos tem esse pacote?");
            double quilosRecebidos = comida.nextDouble();
            totalQuilosRecebidos += quilosRecebidos;
            quantidadeDePacotes++;
        }
        System.out.println(nomeDoAnimal + " precisa de " + quantidadeDePacotes + " pacotes nesse dia!");
    }

    public static void main(String[] args) {
        Scanner dadosDoAnimal = new Scanner(System.in);

        System.out.println("Qual o nome do animal?");
        String nomeDoAnimal = dadosDoAnimal.nextLine();
        System.out.println("Quantos kg ele come por dia?");
        double quilosPorDia = dadosDoAnimal.nextDouble();
        quantosPacotes(nomeDoAnimal,quilosPorDia);
    }

     */


      /*  public static void main(String[] args)
        {
            Artigo batatinha = new Artigo("Artigo 1",1250.00,100);

            if (batatinha.temEstoque())
            {
                System.out.println("Tem estoque disponivel");
            }

            System.out.println("O preco de venda e: " + batatinha.consultarPreco());
        }
    */

   /* public static void main(String[] args)
    {
        for(int linha = 0; linha < 50; linha++)
        {
            for (int coluna = 0; coluna <= linha; coluna++)
            {
                        System.out.print( coluna +1 + " ");
            }
                    System.out.println();
        }
    }
*/
   /* public static void main(String[] args) {
       for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
           for(int contador = 1; contador <= 10; contador++) {
               System.out.print(multiplicador * contador);
               System.out.print(" ");
           }
           System.out.println();
       }


   } */

   /* public static void main(String[] args)
    {
        for (int i = 1; i < 150; i++)
        {
            if(i == 2 || i == 3 || i == 5 || i == 7)
            {
                System.out.println(i);
            }
            else if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0)
            {
                System.out.println(i);
            }
        }
    }

    */
    /*
   public static void main(String[] args)
   {
       int fatorial = 1;
       for (int i = 1; i < 11; i++)
       {
           fatorial *= i; System.out.println("Fatorial de " + i + " = " + fatorial);
       }
   }*/

}

