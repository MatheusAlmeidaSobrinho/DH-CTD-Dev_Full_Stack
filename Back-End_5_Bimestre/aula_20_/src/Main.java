import model.Empresa;
import model.Funcionario;

import java.io.*;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("44.362.0001/87", "PotatoEnterprise");

        Funcionario fun1 = new Funcionario("Matheus", "Almeida", "43418492800", 1403.98);
        Funcionario fun2 = new Funcionario("Javinha", "Intellij", "25452563697", 9587.33);

        empresa.adicionaFuncionario(fun1);
        empresa.adicionaFuncionario(fun2);

        try {
            FileOutputStream fos = new FileOutputStream("empresa.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(empresa.getNome());
            oos.writeObject(empresa.getCnpj());
            oos.writeObject(empresa.getFuncionario());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<Empresa> empresaList = null;
        try {
            FileInputStream fis = new FileInputStream("listaDeContatos.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            empresaList = (List<Empresa>) ois.readObject();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}