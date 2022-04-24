import java.util.*;
import java.io.*;

public class HW1 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int power = scn.nextInt();
         int age = scn.nextInt();
        
        if (power % 4 == 0 && age>=18) {
            System.out.println("He is young avengers");
        } else {
            System.out.println("He is too Young");
        }

        // Homework: If Student is Adult AND Power is Divisible by 4
        // Then Print "He is a Young Avenger";
        // Else Print "He is too Young";
        scn.close();
    }
}