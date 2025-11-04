package ar.edu.unahur.obj2.command.comandos;

import ar.edu.unahur.obj2.command.receiver.Robot;

public class Info extends Comando{

    public Info(){
        segundos = 0;
    }

    @Override
    protected void doExecute(Robot robot) {
        Integer promedio = robot.getSegundosTotalesTrabajados() / robot.getHistoryManager().getHistorial().size();
        System.out.println("Tiempo promedio de tareas: " + promedio); 
    }

}
