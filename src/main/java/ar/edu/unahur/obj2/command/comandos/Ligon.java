package ar.edu.unahur.obj2.command.comandos;

import ar.edu.unahur.obj2.command.receiver.Robot;

public class Ligon extends Comando{

    private Boolean estaEncendida;

    public Ligon(Boolean estaEncendida){
        this.estaEncendida = estaEncendida;
    }

    @Override
    public void doExecute(Robot robot) {
        if (estaEncendida) {
            segundos = 25;
            robot.descargar(1.0);
        } else {
            segundos = 90;
            robot.descargar(5.0);
        }
    }

}
