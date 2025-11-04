package ar.edu.unahur.obj2.command.comandos;

import ar.edu.unahur.obj2.command.receiver.Robot;

public class Clean extends Comando{

    private Integer metrosCuadrados;

    public Clean(Integer metrosCuadrados){
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    protected void doExecute(Robot robot) {
        robot.descargar(metrosCuadrados * 5.0);
        segundos = metrosCuadrados * 180;
    }

}
