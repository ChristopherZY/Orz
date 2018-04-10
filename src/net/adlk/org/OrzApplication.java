package net.adlk.org;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrzApplication {

    public static void main(String[] args){
        System.out.println("Please input...");
        String s = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            try {
                String msg = br.readLine();
                System.out.println("                                        \\Yes!");
            } catch (IOException e) {
                System.out.println("                                        \\No...");
            }
        }
    }
}
