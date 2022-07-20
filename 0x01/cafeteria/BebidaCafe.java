import java.util.ArrayList;
import java.util.List;

public class BebidaCafe extends Bebida {
    @Override
    public List<String> obterIngredientes() {
        List<String> listaIngrediente = new ArrayList<>();
        listaIngrediente.add("cafe");
        return listaIngrediente;
    }

    @Override
    public double obterPreco() {
        return 5.35;
    }
}
