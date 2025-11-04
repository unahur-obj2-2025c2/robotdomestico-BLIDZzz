package ar.edu.unahur.obj2.command.comandos;

import ar.edu.unahur.obj2.command.receiver.Robot;

public class Carge extends Comando{

    private Integer minutos;

    public Carge(Integer minutos){
        this.minutos = minutos;
    }

    @Override
    public void doExecute(Robot robot) {
        segundos = robot.getSegundosCargados(minutos);
        robot.cargar(minutos);
    }

}
