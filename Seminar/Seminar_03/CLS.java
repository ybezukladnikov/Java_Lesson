package Seminar.Seminar_03;
import java.io.IOException;
public class CLS {
    public static void main(String... arg) throws IOException, InterruptedException {
        System.out.println(34);
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
//        System.out.println("\f");
        System.out.println(56);
    }
}

