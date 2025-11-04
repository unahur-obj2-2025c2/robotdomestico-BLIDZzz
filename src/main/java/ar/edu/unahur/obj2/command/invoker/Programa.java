package ar.edu.unahur.obj2.command.invoker;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.command.comandos.Ejecutable;
import ar.edu.unahur.obj2.command.receiver.Robot;

public class Programa {
    
    private List<Ejecutable> comandos;

    public Programa(){
        comandos = new ArrayList<Ejecutable>();
    }

    public void agregarComando(Ejecutable comando){
        comandos.add(comando);
    }

    public void run(Robot robot){
        robot.getHistoryManager().run(comandos, robot);
    }

    public void limpiar(){
        comandos = new ArrayList<Ejecutable>();
    }

}
