public class Impressao {

    private int paginasTotais;
    private int paginasColoridas;
    private boolean ehFrenteVerso;
    private double valorColoridasFrenteVerso;
    private double valorPretoBrancoFrenteVerso;
    private double valorColoridasFrenteApenas;
    private double valorPretoBrancoFrenteApenas;
    private int paginaPretoeBranco;
    private TamanhoImpressao tamanhoImpressao;


    public Impressao(TamanhoImpressao tamanhoImpressao, int paginasTotais, int paginasColoridas, boolean ehFrenteVerso) {
        this.tamanhoImpressao = tamanhoImpressao;
        this.paginasTotais = paginasTotais;
        this.paginasColoridas = paginasColoridas;
        this.ehFrenteVerso = ehFrenteVerso;
        this.paginaPretoeBranco = paginasTotais - paginasColoridas;
    }

    public double calcularTotal() {
        double totalColoridas = 0.0;
        double totalPretoeBranco = 0.0;

        if (tamanhoImpressao.equals(TamanhoImpressao.A2) && ehFrenteVerso) {
            valorColoridasFrenteVerso = 0.28;
            valorPretoBrancoFrenteVerso = 0.18;
            totalColoridas = paginasColoridas * valorColoridasFrenteVerso;
            totalPretoeBranco = paginaPretoeBranco * valorPretoBrancoFrenteVerso;
        } else if (tamanhoImpressao.equals(TamanhoImpressao.A2)) {
            valorColoridasFrenteApenas = 0.32;
            valorPretoBrancoFrenteApenas = 0.22;
            totalColoridas = paginasColoridas * valorColoridasFrenteApenas;
            totalPretoeBranco = paginaPretoeBranco * valorPretoBrancoFrenteApenas;
        } else if (tamanhoImpressao.equals(TamanhoImpressao.A3) && ehFrenteVerso) {
            valorColoridasFrenteVerso = 0.25;
            valorPretoBrancoFrenteVerso = 0.15;
            totalColoridas = paginasColoridas * valorColoridasFrenteVerso;
            totalPretoeBranco = paginaPretoeBranco * valorPretoBrancoFrenteVerso;
        } else if (tamanhoImpressao.equals(TamanhoImpressao.A3)) {
            valorColoridasFrenteApenas = 0.30;
            valorPretoBrancoFrenteApenas = 0.20;
            totalColoridas = paginasColoridas * valorColoridasFrenteApenas;
            totalPretoeBranco = paginaPretoeBranco * valorPretoBrancoFrenteApenas;
        } else if (ehFrenteVerso) {
            valorColoridasFrenteVerso = 0.20;
            valorPretoBrancoFrenteVerso = 0.10;
            totalColoridas = paginasColoridas * valorColoridasFrenteVerso;
            totalPretoeBranco = paginaPretoeBranco * valorPretoBrancoFrenteVerso;
        } else {
            valorColoridasFrenteApenas = 0.25;
            valorPretoBrancoFrenteApenas = 0.15;
            totalColoridas = paginasColoridas * valorColoridasFrenteApenas;
            totalPretoeBranco = paginaPretoeBranco * valorPretoBrancoFrenteApenas;
        }

        return totalColoridas + totalPretoeBranco;
    }

    @Override
    public String toString() {
        return String.format("total de paginas: %d, total coloridas: %d, total preto e branco: %d, %s. total: R$ %.2f",
                paginasTotais, paginasColoridas, paginasTotais - paginasColoridas, ehFrenteVerso ? "frente e verso" : "frente apenas", calcularTotal());
    }
}
