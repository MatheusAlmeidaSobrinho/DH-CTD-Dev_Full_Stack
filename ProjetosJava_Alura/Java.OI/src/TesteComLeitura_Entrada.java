import java.io.*;

// DOIS MUNDOS EXISTENTES NA ENTRADA DE DADOS
// InputStream que lê entrada dados (bytes,arquivos,imagens)
// Reader que lê entrada caracteres (textos)

public class TesteComLeitura_Entrada {
    public static void main(String[] args) throws IOException {
        // Fluxo de entrada com Arquivo txt
        FileInputStream fis = new FileInputStream("frases.txt"); // lendo o arquivo em bytes
        InputStreamReader isr = new InputStreamReader(fis); // transformando o arquivo em bytes para caracteres
        BufferedReader br = new BufferedReader(isr); // transformando os caracteres em palavras

        String linha = br.readLine(); // transformando as palavras e lendo elas em linha

        while( linha != null){ // rodando um enquanto linha não for null, continue transformando-as
            System.out.println(linha);
            linha = br.readLine();
        }

        br.close();
    }
}