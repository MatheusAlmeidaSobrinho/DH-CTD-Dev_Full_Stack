package ExercicioIntegrador.service.impl;

import ExercicioIntegrador.models.*;
import ExercicioIntegrador.service.IflyRoupa;
import ExercicioIntegrador.service.impl.*;

import java.util.Map;

public class FacadeRoupa implements IflyRoupa {
    private FlyRoupaTamanhoX roupaTamanhoX;
    private FlyRoupaTamanhoM roupaTamanhoM;
    private FlyRoupaTamanhoS roupaTamanhoS;
    private FlyRoupaEnova roupaEnova;
    private FlyRoupaEimportada roupaEimportada;

    public FacadeRoupa() {
        this.roupaTamanhoX = new FlyRoupaTamanhoX();
        this.roupaTamanhoM = new FlyRoupaTamanhoM();
        this.roupaTamanhoS = new FlyRoupaTamanhoS();
        this.roupaEnova = new FlyRoupaEnova();
        this.roupaEimportada = new FlyRoupaEimportada();
    }

    @Override
    public void getRoupa(String tamanho, String tipo, boolean eNova, boolean eImportada) {
        roupaTamanhoX.getRoupa(tamanho, tipo, eNova, eImportada);
        roupaTamanhoM.getRoupa(tamanho, tipo, eNova, eImportada);
        roupaTamanhoS.getRoupa(tamanho, tipo, eNova, eImportada);
        roupaEnova.getRoupa(tamanho, tipo, eNova, eImportada);
        roupaEimportada.getRoupa(tamanho, tipo, eNova, eImportada);
    }

    public Map<String, Roupa> getListaMaptamanhoX() {
        return roupaTamanhoX.getListaMaptamanhoX();
    }

    public Map<String, Roupa> getListaMaptamanhoM() {
        return roupaTamanhoM.getListaMaptamanhoM();
    }

    public Map<String, Roupa> getListaMaptamanhoS() {
        return roupaTamanhoS.getListaMaptamanhoS();
    }

    public Map<String, Roupa> getListaMapEnova() {
        return roupaEnova.getListaMapEnova();
    }

    public Map<String, Roupa> getListaMapEimportada() {
        return roupaEimportada.getListaMapEimportada();
    }
}
