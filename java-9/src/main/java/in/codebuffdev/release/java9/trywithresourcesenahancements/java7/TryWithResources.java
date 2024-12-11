package in.codebuffdev.release.java9.trywithresourcesenahancements.java7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources{
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(reader.readLine());
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
    }
}
