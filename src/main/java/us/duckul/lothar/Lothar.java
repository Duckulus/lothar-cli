package us.duckul.lothar;

import java.io.PrintStream;
import java.util.Objects;

public class Lothar {

    private final String fullName;

    protected Lothar(String fullName) {
        this.fullName = fullName;
    }

    protected Lothar() {
        this("Lothar von Trotha");
    }

    public static Lothar newInstance() {
        return new Lothar();
    }

    public static Lothar newInstance(String fullName) {
        return new Lothar(fullName);
    }

    public static String getSisterName() {
        return "Clara";
    }

    protected void printName(PrintStream stream) {
        stream.println(fullName);
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lothar lothar = (Lothar) o;
        return Objects.equals(fullName, lothar.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName);
    }

    @Override
    public String toString() {
        return fullName;
    }

    public class LotharFactory {
      public static Lothar createLothar() {
          return new Lothar("Lothar von Factory");
      }
    }
}
