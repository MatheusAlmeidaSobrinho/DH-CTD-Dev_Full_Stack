package ExercicioAula;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cachorro> dogs = new ArrayList<Cachorro>();

        Cachorro scot = new Cachorro(8, "Scot");
        Cachorro blu = new Cachorro(2, "Blu");
        Cachorro kiara = new Cachorro(10, "Kiara");
        Cachorro manuela = new Cachorro(9, "Manuela");
        Cachorro lola = new Cachorro(6, "Lola");

        dogs.add(scot);
        dogs.add(blu);
        dogs.add(kiara);
        dogs.add(manuela);
        dogs.add(lola);

        try {
            FileOutputStream fos = new FileOutputStream("listadogs.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(dogs);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<Cachorro> dogs1 = null;
        try {
            FileInputStream fis = new FileInputStream("listadogs.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            dogs1 = (List<Cachorro>) ois.readObject();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (Cachorro doguinhos :  dogs1) {
            System.out.println("Nome dog: " + doguinhos.getNome() + ", idade: " + doguinhos.getIdade());
        }
    }

}
