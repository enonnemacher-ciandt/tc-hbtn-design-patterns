import java.util.HashSet;

public class Pedido {

    private HashSet<ItemPedido> itensDentroCaixa = new HashSet<>();
    private HashSet<ItemPedido> itensForaCaixa = new HashSet<>();

    public void adicionarItemDentroCaixa(ItemPedido item) {
        itensDentroCaixa.add(item);
    }

    public void adicionarItemForaCaixa(ItemPedido item) {
        itensForaCaixa.add(item);
    }

    @Override
    public String toString() {
        String pedido = "\tFora da Caixa:\n";
        for (ItemPedido itemPedido : itensForaCaixa) {
            pedido += (String.format("\t\t- %s %s\n", itemPedido.getTipo(), itemPedido.getNome()));
        }

        pedido += "\tDentro da Caixa:\n";
        for (ItemPedido itemPedido : itensDentroCaixa) {
            pedido += (String.format("\t\t- %s %s\n", itemPedido.getTipo(), itemPedido.getNome()));
        }

        return pedido;
    }
}
