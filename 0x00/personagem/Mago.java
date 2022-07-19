public class Mago extends Personagem {

    public Mago(String nome, int inteligencia, int forca, int vigor, int resistencia, int destreza) throws Exception {
        super(nome, TipoPersonagem.MAGO, inteligencia, forca, vigor, resistencia, destreza);

        if (inteligencia < forca || inteligencia < destreza)
            throw new Exception("Atributos invalidos para MAGO");
    }

    @Override
    public double getDanoAtaque() {
        return (getInteligencia() * 0.8) + (getForca() * 0.05) + (getDestreza() * 0.05) + (getVigor() * 0.1);
    }
}
