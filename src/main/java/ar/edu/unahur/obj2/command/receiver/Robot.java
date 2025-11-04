package ar.edu.unahur.obj2.command.receiver;

import ar.edu.unahur.obj2.command.careTaker.HistoryManager;
import ar.edu.unahur.obj2.command.excepciones.BateriaException;

public class Robot {
    Double bateria;

    HistoryManager historial;

    public Robot(){
        bateria = 100.0;
        historial = new HistoryManager();
    }

    public void descargar(Double porcentaje){
        if (bateria < porcentaje) {
            throw new BateriaException();
        }
        bateria -= porcentaje;
    }

    public void cargar(Integer minutos){
        bateria = Math.min(bateria + (minutos * 0.8), 100);
    }

    public Double getBateria(){
        return bateria;
    }

    public Integer getVidaUtil(){
        // Asumo que los segundos estimados son la suma de los 3 equivalentes por cada tarea
        // dividido 3 -> (18 + 25 + 36) / 3 = 26.33 -> 26s
        return (bateriaRedondeada() * 26);
    }

    private Integer bateriaRedondeada(){
        Integer porcentaje = 0;
        for (int i = 0; i < bateria ; i++) {
            porcentaje = i;
        }
        return porcentaje;
    }

    public Integer getSegundosTotalesTrabajados(){
        return historial.getHistorial().stream().mapToInt(comando -> comando.getSegundos()).sum();
    }

    public HistoryManager getHistoryManager(){
        return historial;
    }

    public Integer getSegundosCargados(Integer minutos) {
        Double salida = 0.0;
        if (bateria < 100.0) {
            salida = ((100 - bateria) / 0.8) * 60;
        }
        return salida.intValue();
    }

    public Robot copiar() {
        return this;
    }

}
