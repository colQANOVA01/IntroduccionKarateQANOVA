package Pruebas;
import com.intuit.karate.junit5.Karate;

public class pruebaRunner {
    @Karate.Test
    Karate testPOST(){
        return Karate.run("pruebaPost").relativeTo(getClass());
    }
}
