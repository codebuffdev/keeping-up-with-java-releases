package in.codebuffdev.release.java9.trywithresourcesenahancements.java6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NeedOfTryWithResources {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("abc.txt"));
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
