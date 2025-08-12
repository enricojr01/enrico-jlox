//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.IOException;
import lox.Lox;

public class Main {
    public static void main(String[] args) {
        try {
            Lox.main(args);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}