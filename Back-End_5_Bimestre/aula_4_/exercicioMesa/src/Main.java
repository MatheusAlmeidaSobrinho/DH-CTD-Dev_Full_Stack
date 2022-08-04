public class Main {
    public static void main(String[] args) {
        PadroesDeQualidade produto = new ChegarQualidade();

        produto.verificarQualidade("a",1001,1250,"saudável");
        produto.verificarQualidade("b",1001,1250,"saudavel");
        produto.verificarQualidade("c",1001,1250,"quase saudável");

        produto.verificarQualidade("d",800,1250,"saudável"); // lote fora do padrao
        produto.verificarQualidade("e",1050,3000,"saudável"); // peso fora do padrao
        produto.verificarQualidade("f",1050,1250,"batata"); // embalagem fora do padrao

    }
}
