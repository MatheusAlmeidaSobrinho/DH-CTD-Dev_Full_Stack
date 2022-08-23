package ExercicioMesa;

import ExercicioAula.Cachorro;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Contato> contatinhos = new ArrayList<Contato>();

        Contato contato01 = new Contato("Tatiane","tatiane@email.com","17-991234567");
        Contato contato02 = new Contato("Roberto","roberto@email.com","17-992345678");
        Contato contato03 = new Contato("Giovana","giovana@email.com","17-993456789");
        Contato contato04 = new Contato("Batata","batata@email.com","17-990605040");
        Contato contato05 = new Contato("Javinha","javinha@email.com","17-991807090");

        contatinhos.add(contato01);
        contatinhos.add(contato02);
        contatinhos.add(contato03);
        contatinhos.add(contato04);
        contatinhos.add(contato05);

        contatinhos.stream().filter(c -> c.getNome().equalsIgnoreCase("Batata"));


        try {
            FileOutputStream fos = new FileOutputStream("listaDeContatos.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(contatinhos);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<Contato> contatinhos1 = null;
        try {
            FileInputStream fis = new FileInputStream("listaDeContatos.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            contatinhos1 = (List<Contato>) ois.readObject();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (Contato contato :  contatinhos1) {
            System.out.println("Nome: " + contato.getNome() + ", email: " + contato.getEmail() + ", tel: " + contato.getTelefone());
        }
    }

}