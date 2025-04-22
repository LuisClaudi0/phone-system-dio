package model;

import utils.Safari;
import utils.Spotify;
import utils.Phone;

public class Iphone  {

    private final Safari safari = new Safari();

    public void exibirPagina(){
        safari.exibirPagina();
    }

    public void adicionarNovaAba(){
        safari.adicionarNovaAba();
    }

    public void atualizarPagina(){
        safari.atualizarPagina();
    }

    private final Phone phone = new Phone();

    public void ligar(){
        phone.ligar();
    }

    public void atender(){
        phone.ligar();
    }

    public void iniciarCorreioVoz(){
        phone.ligar();
    }

    private final Spotify spotify = new Spotify();

    public void tocar() {
        spotify.tocar();
    }

    public void pausar() {
        spotify.pausar();
    }

    public void selecionarMusica(String musica) {
        spotify.selecionarMusica(musica);
    }

}
