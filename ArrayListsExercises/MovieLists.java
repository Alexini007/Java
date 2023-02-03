/**
 * File: MovieLists.java
 * Author: Aleks Atanasov
 * Date: 9/11/2022
 */
import java.util.*;
public class MovieLists {
    public static void main(String[] args)
    {
        ArrayList<String> movieList = new ArrayList<String>();
        movieList.add("Rush");
        movieList.add("Cars");
        movieList.add("Peter");
        movieList.add("FordVFerrari");
        movieList.add("Endgame");
        movieList.set(4,"Godfather");
        movieList.remove(2);
        System.out.println(movieList);
        int index = movieList.indexOf("Godfather");
        System.out.println(index);

        ArrayList<Double> doubleValues = new ArrayList<Double>();
        doubleValues.add(2.5);
        doubleValues.add(2.7);
        doubleValues.add(2.9);
        doubleValues.add(0,3.9);
        double number = doubleValues.get(1);
        System.out.println(number);
        doubleValues.remove(0);
        doubleValues.remove(doubleValues.size()-1);
        boolean contains = doubleValues.contains(2.5);
        System.out.println(contains);
        System.out.println(doubleValues);


    }
}