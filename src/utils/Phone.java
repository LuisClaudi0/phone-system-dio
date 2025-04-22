package utils;

import controller.CallingSystem;

public class Phone implements CallingSystem{
  @Override
    public void atender() {
        System.out.println("Ligação atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }

    @Override
    public void ligar() {
        System.out.println("Ligação executada");
    }
}
