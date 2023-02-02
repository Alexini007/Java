package Homework4;

//Напишете програма, която:
//1. Извежда името ви в конзолата.
//2. Сравнява го с име на приятел/ка, като използвате equals(),
//equalsIgnoreCase(), compareTo(), резултатите да излизат на отделни редове.
//3. Долепя до името ви вашата фамилия, на нов ред.
//4. Извежда на нов ред вашата възраст.
//5. Извежда името фамилията и годините ви на един ред.
//6. Извежда името фамилията и годините на приятелят/ката ви на нов ред.

public class ex_4 {
    public static void main (String[]args) {
        String my_name = "Alex";
        String my_surname = "Atanasov";
        String friend_name = "Dimitur";
        String friend_surname = "Dimitrov";
        int my_age = 19;
        int friend_age = 23;
        System.out.println(my_name);
        System.out.println(my_name.equals(friend_name));
        System.out.println(my_name.equalsIgnoreCase(friend_name));
        System.out.println(my_name.compareTo(friend_name));
        System.out.println(my_name.concat(my_surname));
        System.out.println(my_age);
        System.out.println(my_name + " " + my_surname + " " + my_age);
        System.out.println(friend_name + " " + friend_surname + " " + friend_age);
    }
}
