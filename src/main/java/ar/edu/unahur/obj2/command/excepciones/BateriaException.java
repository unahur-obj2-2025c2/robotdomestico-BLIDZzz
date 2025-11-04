package ar.edu.unahur.obj2.command.excepciones;

public class BateriaException extends RuntimeException{
    public BateriaException(){
        super("El robot no tiene suficiente batería");
    }
}
