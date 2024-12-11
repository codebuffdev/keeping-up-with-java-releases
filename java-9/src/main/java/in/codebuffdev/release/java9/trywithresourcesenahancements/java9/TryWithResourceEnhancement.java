package in.codebuffdev.release.java9.trywithresourcesenahancements.java9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResourceEnhancement {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try (bufferedReader) {
            // from java9
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
