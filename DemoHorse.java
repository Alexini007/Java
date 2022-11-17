public class DemoHorse {
    public static void main(String[] args) {

        Horse Lingfield15 = new Horse("GreenVault","black",3);
        RaceHorse Wolverhampton4 = new RaceHorse("Tribusko", "brown", 6, 5);
        Lingfield15.printHorse();
        System.out.println(Wolverhampton4.getName());
        System.out.println(Wolverhampton4.getColor());
        System.out.println(Wolverhampton4.getBirthYear());
        System.out.println(Wolverhampton4.getNumOfRaces());

    }
}