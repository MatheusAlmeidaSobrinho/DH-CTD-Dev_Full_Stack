import dao.ConfiguracaoJDBC;
import dao.impl.FilialDaoImpl;
import model.Filial;
import service.FilialService;

public class Main {
    public static void main(String[] args) {

        FilialService filialService = new FilialService(new FilialDaoImpl(new ConfiguracaoJDBC()));


        Filial filial = new Filial("Potato", "sei la", 37, "sp", "sp", true);
        filialService.salvar(filial);
        }

}
