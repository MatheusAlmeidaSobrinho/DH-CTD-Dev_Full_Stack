import java.util.*;

public class Main {

    public static void main(String[] args) throws PatientException {

        try {
            Paciente p1 = new Paciente("Potato","Fries","sei la", new Date(2022,06,21));
        } catch (PatientException ex){
            System.err.println(ex.getMessage());
        }
    }
}