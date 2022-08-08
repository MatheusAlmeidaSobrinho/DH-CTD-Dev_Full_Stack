public class Usuario {
    private String nome;
    private int id;

    private String plano;

    public Usuario(String nome, int id, String plano) {
        this.nome = nome;
        this.id = id;
        this.plano = plano;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public String getPlano() {
        return plano;
    }
}
