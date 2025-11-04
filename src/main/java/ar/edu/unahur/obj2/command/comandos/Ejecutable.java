package ar.edu.unahur.obj2.command.comandos;

import ar.edu.unahur.obj2.command.receiver.Robot;

public interface Ejecutable {
    public abstract void execute(Robot robot);

    public abstract Integer getSegundos();

    public abstract Robot getRobotDebackUp();
}
