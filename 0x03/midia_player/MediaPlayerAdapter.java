public class MediaPlayerAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(TipoMedia tipoMedia) {
        if (!tipoMedia.equals(TipoMedia.MP3))
            this.advancedMediaPlayer = new VideoMediaPlayer();
    }

    @Override
    public void reproduzir(TipoMedia tipoMedia, String nomeArquivo) {
        if (tipoMedia.equals(TipoMedia.MP4)) {
            advancedMediaPlayer.reproduzirMp4(nomeArquivo);
        } else if (tipoMedia.equals(TipoMedia.VLC))
            advancedMediaPlayer.reproduzirVlc(nomeArquivo);
    }
}
