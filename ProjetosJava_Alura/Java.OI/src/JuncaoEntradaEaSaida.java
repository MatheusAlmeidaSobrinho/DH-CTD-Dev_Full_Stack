import java.io.*;

public class JuncaoEntradaEaSaida {
    public static void main(String[] args) throws IOException {
        // usando por polimorfismo a classe mãe  InputStream ( antes FileInputStream ) // SAIDA DE ARQUIVO
        //InputStream fis = new FileInputStream("frases.txt"); // pegando a entrada que é nossa frase.txt
        InputStream fis2 = System.in; // FileInputStream não recebe System.in (System.in = escrever no console) // SAIDA DE TECLADO
        Reader isr = new InputStreamReader(fis2);
        BufferedReader br = new BufferedReader(isr);

        // usando system.in na entrada e system.out na saida nao tem sentido, afinal lembre-se:
        // se vc usa system.in vc quer inserir algo pelo terminal, e o out para encrever em um arquivo que deveria
        // estar no in, entao ou deixe um arquivo na entrada e escreva na saida, ou deixe um arquivo na saida e escreva na entrada


        OutputStream fos = new FileOutputStream("frasesJuntandoEntradaEaSaida.txt"); // mandando para esse txt // SAIDA DE ARQUIVO
        //OutputStream fos = System.out; // SAIDA DE TECLADO
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = br.readLine();

        while( linha != null &&  !linha.isEmpty()){
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();
        }
        bw.write("Para a pessoa errada você não terá valor");
        bw.newLine();
        bw.write("Você só terá valor para a pessoa certa");

        br.close();
        bw.close();
    }
}
