import java.util.List;

public class BebidaComLeite extends BebidaDecorator {

    public BebidaComLeite(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public List<String> obterIngredientes() {
        List<String> listaIngrediente = super.obterIngredientes();
        listaIngrediente.add("leite");
        return listaIngrediente;
    }

    @Override
    public double obterPreco() {
        return super.obterPreco() + 3.2;
    }
}
