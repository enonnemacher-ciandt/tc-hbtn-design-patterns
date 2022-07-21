public class VideoMediaPlayer implements AdvancedMediaPlayer {
    @Override
    public void reproduzirVlc(String nomeArquivoVlc) {
        System.out.print("Reproduzindo VLC: " + nomeArquivoVlc);
    }

    @Override
    public void reproduzirMp4(String nomeArquivoMp4) {
        System.out.print("Reproduzindo MP4: " + nomeArquivoMp4);
    }
}
