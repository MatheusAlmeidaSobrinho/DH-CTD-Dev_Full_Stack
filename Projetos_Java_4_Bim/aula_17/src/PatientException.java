public class PatientException extends Exception
{
    public PatientException() {
        super();
    }

    public PatientException(String message){
        super(message);
    }

    @Override
    public String toString() {
        return getMessage();
    }
}
