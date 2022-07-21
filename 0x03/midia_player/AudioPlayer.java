public class AudioPlayer implements MediaPlayer {

    @Override
    public void reproduzir(TipoMedia tipoMedia, String nomeArquivo) {
        if (tipoMedia.equals(TipoMedia.MP3))
            System.out.print("Reproduzindo MP3: " + nomeArquivo);
        else {
            MediaPlayerAdapter mediaPlayerAdapter = new MediaPlayerAdapter(tipoMedia);
            mediaPlayerAdapter.reproduzir(tipoMedia, nomeArquivo);
        }
    }
}
