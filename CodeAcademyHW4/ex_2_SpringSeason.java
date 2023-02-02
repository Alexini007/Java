package Homework5;

//Напишете програма SpringSeason, в която дефинирате 2 int
//променливи - month & day. Програмата трябва да отпечатва true
//ако денят е между 20ти Март (включително) и 20ти Юни
//(включително) и false в противен случай. Булева стойност на израза
//? „yes” : “false”

public class ex_2_SpringSeason {
    public static void main (String[]args) {
        int month = 3;
        int date = 19;
        String isBetween = ( month == 3 && date >= 20 ) || ( 3 <month && month < 6) || ( month == 6 && date <=20) ? "yes" : "false";
        System.out.println(isBetween);

    }
}
