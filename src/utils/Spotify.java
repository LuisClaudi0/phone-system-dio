package utils;

import controller.MusicPlayer;

public class Spotify implements MusicPlayer{
  @Override
    public void tocar() {
        System.out.println("Reproduzindo musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Reproduzindo: " + musica);
    }
}
