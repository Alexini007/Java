package Homework5;

//Напишете програма Distance, която изчислява разстоянието от
//точка (x,y) до (0,0) по формулата:
//sqrt(x^2+y^2)

public class ex_1 {
    public static void main (String[]args) {
        int x = 4;
        int y = 5;
        double result;
        result = Math.sqrt((x*x) + (y*y));
        System.out.println(result);

    }
}
