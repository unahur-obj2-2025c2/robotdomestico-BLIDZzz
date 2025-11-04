package ar.edu.unahur.obj2.command;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.command.comandos.Carge;
import ar.edu.unahur.obj2.command.comandos.Ligon;
import ar.edu.unahur.obj2.command.invoker.Programa;
import ar.edu.unahur.obj2.command.receiver.Robot;

public class bateriaRobotTest {
    
    private Robot robot;
    private Programa programa;

    @BeforeEach
    public void setUp(){
        robot = new Robot();
        programa = new Programa();
    }

    @Test
    public void elRobotExisteYTiene100DeBateria(){
        assertEquals(100.0, robot.getBateria());
    }

    @Test
    public void elRobotEjecutaComandos(){
        programa.agregarComando(new Ligon(true));
        programa.run(robot);
        assertEquals(99.0, robot.getBateria());
    }

    @Test
    public void elRobotCarga(){
        programa.agregarComando(new Ligon(true));
        programa.run(robot);
        assertEquals(99.0, robot.getBateria());
        programa.limpiar();
        programa.agregarComando(new Carge(1));
        programa.run(robot);
        assertEquals(99.8, robot.getBateria());
    }

    @Test
    public void elRobotNoCargaMasDe100(){
        programa.agregarComando(new Ligon(true));
        programa.run(robot);
        assertEquals(99.0, robot.getBateria());
        programa.limpiar();
        programa.agregarComando(new Carge(10));
        programa.run(robot);
        assertEquals(100.0, robot.getBateria());
    }

}
