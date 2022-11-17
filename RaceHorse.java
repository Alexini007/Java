public class RaceHorse extends Horse {

    private int numOfRaces;
    public int getNumOfRaces()
    {
        return numOfRaces;
    }
    public void setNumOfRaces(int numOfRaces)
    {
        this.numOfRaces = numOfRaces;
    }
    public RaceHorse(String name,String color, int birthYear, int numOfRaces)
    {
        super(name,color,birthYear);
        setNumOfRaces(numOfRaces);
    }

    public static void main(String[] args) {

    }
}
