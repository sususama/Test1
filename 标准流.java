package edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 标准流 {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        String mesg=br.readLine();
        System.out.println(mesg);
    }
}
