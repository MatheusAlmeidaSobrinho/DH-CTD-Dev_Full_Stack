public class Main {
    public static void main(String[] args) {
        Usuario user = new Usuario("Batata", 1,"FREE");
        Usuario user2 = new Usuario("Alfa", 3,"PreMium");
        Usuario user3 = new Usuario("Beta", 3,"premium");
        Usuario user4 = new Usuario("Javinha", 4,"olocoBixo");

        Plano plan = new servicoDownloadProxy();
        Plano plan2 = new servicoDownload();

        plan.planoAtual(user.getNome(), user.getId(),user.getPlano());
        plan2.planoAtual(user.getNome(), user.getId(),user.getPlano());

        System.out.println();

        plan.planoAtual(user2.getNome(), user2.getId(),user2.getPlano());
        plan2.planoAtual(user2.getNome(), user2.getId(),user2.getPlano());

        System.out.println();

        plan.planoAtual(user3.getNome(), user3.getId(),user3.getPlano());
        plan2.planoAtual(user3.getNome(), user3.getId(),user3.getPlano());

        System.out.println();

        plan.planoAtual(user4.getNome(), user4.getId(),user4.getPlano());
        plan2.planoAtual(user4.getNome(), user4.getId(),user4.getPlano());
    }
}