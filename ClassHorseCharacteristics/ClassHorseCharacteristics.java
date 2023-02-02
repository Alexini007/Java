public class Horse {
    private String name;
    private String color;
    private int birthYear;
    public Horse(String name, String color, int birthYear) {
        setName(name);
        setColor(color);
        setBirthYear(birthYear);
    };
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public void printHorse() {
        System.out.println("Horse name: " + getName() + "\ncolor: " + getColor() + "\nage: " + getBirthYear());
    }
    public static class RaceHorse extends Horse {
        private int numOfRaces;
        public int getNumOfRaces() {
            return numOfRaces;
        }
        public void setNumOfRaces(int numOfRaces) {
            this.numOfRaces = numOfRaces;
        }
        public RaceHorse(String name, String color, int birthYear, int numOfRaces) {
            super(name, color, birthYear);
            setNumOfRaces(numOfRaces);
        }
        public void printRacingHorse() {
            System.out.println("Horse name: " + getName() + "\ncolor: " + getColor() + "\nage: " + getBirthYear()
                    + " \nnumber of races: " + getNumOfRaces());
        }
    }
        public static void main(String[] args) {
            Horse Lingfield15 = new Horse("GreenVault","black",3);
            RaceHorse Wolverhampton4 = new RaceHorse("Tribusko", "brown", 6, 5);

            Lingfield15.printHorse();
            System.out.println("\n");
            System.out.println(Wolverhampton4.getName() + " " +
                    Wolverhampton4.getColor() +  " " +
                    Wolverhampton4.getBirthYear() + " " +
                    Wolverhampton4.getNumOfRaces());
            System.out.println("\n");
            Wolverhampton4.printRacingHorse();
        }
    }

