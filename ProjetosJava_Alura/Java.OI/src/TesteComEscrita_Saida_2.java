import java.io.*;

public class TesteComEscrita_Saida_2 {
    public static void main(String[] args) throws IOException {

//        OutputStream fos = new FileOutputStream("frases2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);

        //FileWriter fw = new FileWriter("frases2.1.txt");
        //BufferedWriter bw = new BufferedWriter(fw); // guardando no BufferedWriter e usando abaixo

        // Da pra deixar em uma linha esses dois objetos ( fw e o bw ) assim:
        BufferedWriter bw = new BufferedWriter(new FileWriter("frases2.1.txt"));

        bw.write("Para a pessoa errada você não terá valor 2");
        //fw.write("\n"); // poderia usar o \n para quebrar linha mais o java ja tem um para todos os SO
        //bw.write(System.lineSeparator()); // assim voce mantem a ideia de quebrar linha, em qualquer SO
        bw.newLine();// voltando pra newLine por que agora esta no BufferedWriter // mais clean
        bw.write("Você só terá valor para a pessoa certa 2");

        bw.close();
    }
}