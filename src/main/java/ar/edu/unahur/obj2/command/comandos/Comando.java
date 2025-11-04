package ar.edu.unahur.obj2.command.comandos;

import ar.edu.unahur.obj2.command.receiver.Robot;

public abstract class Comando implements Ejecutable{

    protected Robot robotDeBackUp;

    protected Integer segundos;

    @Override
    public void execute(Robot robot){
        robotDeBackUp = robot.copiar();
        doExecute(robot);
    }

    protected abstract void doExecute(Robot robot);

    public Integer getSegundos(){
        return segundos;
    }

    public Robot getRobotDebackUp(){
        return robotDeBackUp;
    }

}
