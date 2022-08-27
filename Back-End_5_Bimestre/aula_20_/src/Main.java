import model.Empresa;
import model.Funcionario;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<Funcionario> funcionarioList = new ArrayList<Funcionario>();

        Funcionario fun01 = new Funcionario("Maria", "Aparecida", "12175548530", 2000);
        Funcionario fun02 = new Funcionario("Jose", "Carmo", "58575548660", 3000);
        Funcionario fun03 = new Funcionario("Pedro", "Abravanel", "82575548541", 4000);
        Funcionario fun04 = new Funcionario("Carlos", "Gular", "10275548564", 5000);
        Funcionario fun05 = new Funcionario("Killua", "Zoldick", "74175548555", 6000);

        funcionarioList.add(fun01);
        funcionarioList.add(fun02);
        funcionarioList.add(fun03);
        funcionarioList.add(fun04);
        funcionarioList.add(fun05);

        try {
            FileOutputStream fos = new FileOutputStream("listFun.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(funcionarioList);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<Funcionario> funcionarioList1 = null;
        try {
            FileInputStream fis = new FileInputStream("listFun.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            funcionarioList1 = (List<Funcionario>) ois.readObject();

        } catch (FileNotFoundException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Empresa enterprise = new Empresa("224.563.0001/17", "EnterpriseCompany", funcionarioList1);

        try {
            FileOutputStream fos = new FileOutputStream("Empresa.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(enterprise.getNome() + ", portadora do CNPJ: " + enterprise.getCnpj() + " empregadora dos seguintes funcionarios:");
            oos.writeObject(funcionarioList1);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(enterprise.getNome()
                + ", portadora do CNPJ: "
                + enterprise.getCnpj()
                + " empregadora dos seguintes funcionarios:"
                + enterprise.getFuncionario());

    }
}
