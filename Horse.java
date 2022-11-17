public class Horse {
    private String name;
    private String color;
    private int birthYear;
    public Horse(String name,String color, int birthYear)
    {
        setName(name);
        setColor(color);
        setBirthYear(birthYear);

    };
    public String getName()
    {
        return name;
    }
    public String getColor()
    {
        return color;
    }
    public int getBirthYear()
    {
        return birthYear;
    }

    public void setName(String name)
    {
        this.name= name;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public void setBirthYear(int birthYear)
    {
        this.birthYear = birthYear;
    }

    public void printHorse() {
        System.out.println(getName() + " " + getColor() + " " + getBirthYear());
    }

    public static void main(String[] args) {

    }

}
