import java.io.*;

// DOIS MUNDOS EXISTENTES NA SAIDA DE DADOS
// OutputStream que lê saida dados (bytes,arquivos,imagens)
// Writer que lê saida caracteres (textos)

public class TesteComEscrita_Saida {
    public static void main(String[] args) throws IOException {
        // Fluxo de entrada com Arquivo txt
        OutputStream fos = new FileOutputStream("frases2.txt"); // lendo o arquivo em bytes
        Writer osw = new OutputStreamWriter(fos); // transformando o arquivo em bytes para caracteres
        BufferedWriter bw = new BufferedWriter(osw); // transformando os caracteres em palavras

        bw.write("Para a pessoa errada você não terá valor");
        bw.newLine();
        bw.write("Você só terá valor para a pessoa certa");

        bw.close();
    }
}