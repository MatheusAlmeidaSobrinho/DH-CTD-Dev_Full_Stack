public class Main {
    public static void main(String[] args) {
        PadroesDeQualidade produto = new ChegarQualidade();

        produto.verificarQualidade("a",1001,1250,"saud�vel");
        produto.verificarQualidade("b",1001,1250,"saudavel");
        produto.verificarQualidade("c",1001,1250,"quase saud�vel");

        produto.verificarQualidade("d",800,1250,"saud�vel"); // lote fora do padrao
        produto.verificarQualidade("e",1050,3000,"saud�vel"); // peso fora do padrao
        produto.verificarQualidade("f",1050,1250,"batata"); // embalagem fora do padrao

    }
}
