package exercicioSerie;

public class GradeDeSeries implements IGradeDeSeries {
    @Override
    public String getSerie(String nomeBusca) throws SerieNaoHabilitadaException {
        Serie s = null;
        String link = "www." + nomeBusca.replace(" ", "").toLowerCase() + ".com";

        s = switch (nomeBusca) {
            case "The Witcher" -> new Serie("The Witcher", link);
            case "Two And A Half Men" -> new Serie("Two And A Half Men", link);
            case "Breaking Bad" -> new Serie("Breaking Bad", link);
            case "How i Meet Your Mother" -> new Serie("How i Meet Your Mother", link);
            case "Vikings" -> new Serie("Vikings", link);
            case "A Serie Das Batatas" -> new Serie(("A Serie Das Batatas"), link);
            default ->
                    throw new SerieNaoHabilitadaException("Serie: " + nomeBusca + " fora do nosso catalogo disponivel.");
        };
        return link;
    }
}

// CASO DO SWITCH antigo sem lambda (duvida que ficou, o break ainda esta la?)
//        switch (nomeBusca){
//            case "The Witch":
//                s = new Serie("The Witch",link);
//                break;

