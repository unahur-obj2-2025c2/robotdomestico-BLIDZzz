package ar.edu.unahur.obj2.command.comandos;

import ar.edu.unahur.obj2.command.receiver.Robot;

public class Ligoff extends Comando{

    private Boolean estaEncendida;

    public Ligoff(Boolean estaEncendida){
        this.estaEncendida = estaEncendida;
    }

    @Override
    protected void doExecute(Robot robot) {
        if (estaEncendida) {
            robot.descargar(5.0);
            segundos = 90;
        } else {
            robot.descargar(1.0);
            segundos = 25;
        }
    }

}
