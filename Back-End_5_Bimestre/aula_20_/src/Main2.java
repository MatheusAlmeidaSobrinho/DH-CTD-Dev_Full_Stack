import model.Empresa;
import model.Funcionario;

import java.io.*;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("44.362.0001/87", "PotatoEnterprise");

        Funcionario fun1 = new Funcionario("Matheus", "Almeida", "43418492800", 1403.98);
        Funcionario fun2 = new Funcionario("Javinha", "Intellij", "25452563697", 9587.33);

        empresa.adicionaFuncionario(fun1);
        empresa.adicionaFuncionario(fun2);

        try {
            PrintWriter ps = new PrintWriter("empresaTeste2.txt");

            ps.print(empresa.getNome());
            ps.println();
            ps.print(empresa.getCnpj());
            ps.println();
            ps.print(empresa.getFuncionario());
            ps.close();

        } catch (Exception e) {
            e.getStackTrace();
        }

        List<Empresa> empresaList = null;
        try {
            FileInputStream fis = new FileInputStream("empresaTeste2.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            empresaList = (List<Empresa>) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (Empresa enterprise :  empresaList) {
            System.out.println(
                    "Nome: " + enterprise.getNome() + ", Cnpj: " + enterprise.getCnpj() +
                    ", Lista Funcionarios: " + enterprise.getFuncionario());
        }



    }
}
