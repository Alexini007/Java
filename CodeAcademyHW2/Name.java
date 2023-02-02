package mypac;

import java.util.Locale;
//Напишете програма, която отпечатва боят на буквите на
//първото ви име, след това го отпечатайте веднъж само с главни
//букви, и веднъж само с малки.
public class Name {
    public static void main (String[]args) {
        String my_name = "Aleks";
        System.out.println(my_name.length());
        System.out.println(my_name.toUpperCase());
        System.out.println(my_name.toLowerCase());
    }
}
