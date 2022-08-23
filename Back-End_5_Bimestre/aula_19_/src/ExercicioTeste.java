import java.io.*;

public class ExercicioTeste {
    public static void main(String[] args) throws IOException {

        // Fluxo de entrada com Arquivo txt
        FileInputStream fis = new FileInputStream("entradaListaContatos.txt"); // lendo o arquivo em bytes
        InputStreamReader isr = new InputStreamReader(fis); // transformando o arquivo em bytes para caracteres
        BufferedReader br = new BufferedReader(isr); // transformando os caracteres em palavras

        // Fluxo de saida com Arquivo txt
        OutputStream fos = new FileOutputStream("saidaListaContatos.txt"); // lendo o arquivo em bytes
        Writer osw = new OutputStreamWriter(fos); // transformando o arquivo em bytes para caracteres
        BufferedWriter bw = new BufferedWriter(osw); // transformando os caracteres em palavras

        String linha = br.readLine(); // transformando as palavras e lendo elas em linha
        System.out.println(linha);

        bw.write("Tatiane");
        bw.newLine();
        bw.write("tatiane@email.com");
        bw.newLine();
        bw.write("17991625252");
        bw.newLine();


        while( linha != null && !linha.isEmpty()){ // rodando um enquanto linha não for null, continue transformando-as e se nao for vazia
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();
            System.out.println(linha);
        }


        br.close();
        bw.close();

    }
}