import models.Impressora;
import models.ImpressoraCannon;
import models.ImpressoraEpson;

public class Main
{
    public static void main(String[] args)
    {
        Impressora imp = new ImpressoraCannon("ZXC","Usb", 2, 2.0);

        System.out.println(imp.temPapel());
        System.out.println(imp.temTinta());
        System.out.println(imp.imprimir());
        System.out.println(imp.getFolhasDisponiveis());
        System.out.println(imp.getPorcentagemTinta());
        System.out.println(imp.imprimir());
        System.out.println(imp.getFolhasDisponiveis());
        System.out.println(imp.getPorcentagemTinta());
        System.out.println(imp.imprimir());

    }

}