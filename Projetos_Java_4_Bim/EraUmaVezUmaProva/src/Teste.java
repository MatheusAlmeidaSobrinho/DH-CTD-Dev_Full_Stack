public class Teste {
    public static void main(String[] args) {

        Publico p1 = new Publico("Potato",new Consulta("20-06-2022","Cardio",22,50),true,1);

        Publico p2 = new Publico("Fries",new Consulta("20-06-2022","Drogas",22,30),false,2);

        int comparacao = p1.compareTo(p2);


    }
}
