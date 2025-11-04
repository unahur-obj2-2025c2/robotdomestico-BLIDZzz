package ar.edu.unahur.obj2.command;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.command.comandos.Clean;
import ar.edu.unahur.obj2.command.comandos.Info;
import ar.edu.unahur.obj2.command.comandos.Ligoff;
import ar.edu.unahur.obj2.command.comandos.Ligon;
import ar.edu.unahur.obj2.command.invoker.Programa;
import ar.edu.unahur.obj2.command.receiver.Robot;

public class RobotComandosTest {
    private Robot robot;
    private Programa programa;

    @BeforeEach
    public void setUp(){
        robot = new Robot();
        programa = new Programa();
    }

    @Test
    public void laInformacionSeImprimeBien(){
        programa.agregarComando(new Ligon(true));
        programa.agregarComando(new Ligoff(true));
        programa.agregarComando(new Clean(2));
        programa.agregarComando(new Info());
        programa.run(robot);
        assertEquals(robot.getSegundosTotalesTrabajados(), 475);
    }

}
