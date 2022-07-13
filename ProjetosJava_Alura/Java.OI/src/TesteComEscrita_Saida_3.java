import java.io.*;

public class TesteComEscrita_Saida_3 {
    public static void main(String[] args) throws IOException {

        //3 formas entao ficaram:

        //BufferedWriter bw = new BufferedWriter(new FileWriter("frases2.1.txt"));
        //PrintStream ps = new PrintStream("frases3.txt");
        PrintWriter ps = new PrintWriter("frases3.txt");

        ps.print("Para a pessoa errada você não terá valor 3");
        ps.println();
        ps.print("Você só terá valor para a pessoa certa 3");

        ps.close();
    }
}