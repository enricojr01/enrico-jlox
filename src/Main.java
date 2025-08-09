//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

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