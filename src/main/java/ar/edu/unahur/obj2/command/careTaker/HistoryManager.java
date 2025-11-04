package ar.edu.unahur.obj2.command.careTaker;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.command.comandos.Ejecutable;
import ar.edu.unahur.obj2.command.receiver.Robot;

public class HistoryManager {
    List<Ejecutable> historial;

    public HistoryManager(){
        historial = new ArrayList<Ejecutable>();
    }

    public void run(List<Ejecutable> comandos, Robot robot){
        for (Ejecutable ejecutable : comandos) {
            ejecutable.execute(robot);
            historial.add(ejecutable);
        }
    }

    public List<Ejecutable> getHistorial(){
        return historial;
    }
}
