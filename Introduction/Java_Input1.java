package Introduction;

import java.io.*;

public class Java_Input1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string");
//         String s = br.readLine();
        int s = Integer.parseInt(br.readLine());
        System.out.println(s);
    }
}