public class ImpressaoFactory {

    public static Impressao createImpressao(TamanhoImpressao tamanhoImpressao, int totalPaginas, int paginasColoridas, boolean ehFrenteVerso) {
        return new Impressao(tamanhoImpressao, totalPaginas, paginasColoridas, ehFrenteVerso);
    }
}
