package Pruebas;
import com.intuit.karate.junit5.Karate;
public class PruebaRunner {
    @Karate.Test
        /* Karate testGET() {
        return Karate.run("PrimeraPrueba").relativeTo(getClass());
    }*/
    Karate testPOST(){
        return Karate.run("pruebaPost").relativeTo(getClass());
    }
}
