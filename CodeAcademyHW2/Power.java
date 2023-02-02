package mypac;
//Напишете програма, която повдига на степен 2-ра числата: -20,
//92, 638, 73, 200, -22, резултатите да се отпечатват на един и
//същи ред.
public class Power {
    public static void main (String[]args) {
        System.out.println((int)Math.pow(-20,2) + "   " + (int)Math.pow(92,2) + "   " + (int)Math.pow(638,2)
                + "   " + (int)Math.pow(73,2) + "   " + (int)Math.pow(200,2) + "   "
                + (int)Math.pow(-22,2));
    }
}
