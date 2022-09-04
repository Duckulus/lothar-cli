package us.duckul.lothar;

import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {
        PrintStream printStream = System.out;

        Lothar lothar = Lothar.newInstance();
        lothar.printName(printStream);
    }

}