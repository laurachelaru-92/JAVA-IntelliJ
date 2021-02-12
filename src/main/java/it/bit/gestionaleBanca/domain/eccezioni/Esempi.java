package it.bit.gestionaleBanca.domain.eccezioni;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Esempi {

    public static void main(String[] args) {
        try {
            int x = 3;
            f1();
            System.out.println(x);
        } catch (Exception n) {
            System.out.println("Ops c'è una exception");
        }

    }

    public static void f1() {
        int y = 6;
        try {
            f2();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(y);

    }

    public static void f2() throws IOException, FileNotFoundException {
        int z = 9;
//        FileInputStream fs= null;
//        try {
//
//            fs = new FileInputStream("Non esisto.txt");
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }finally {
//            if (fs != null) {
//                fs.close();
//            }
//        }
        try (FileInputStream fs = new FileInputStream("Non esisto.txt")) {
            //...
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }


        System.out.println(z);
    }
}
