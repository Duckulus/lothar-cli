package us.duckul.lothar;

import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {
        PrintStream printStream = System.out;
        Lothar lothar = Lothar.newInstance();



        if (args.length == 0) {
            printStream.println("Welcome to lothar-cli. Choose one of the following commands: \n" +
                    "run");
            return;
        }

        String operation = args[0];

        if (operation.equals("run")) {
            lothar.printName(printStream);
        } else {
            throw new UnsupportedOperationException("Operation %s not Supported".formatted(operation));
        }
    }

}