import java.util.ArrayList;

public class Names {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("Abigail");
        display(names);
        names.add("Brian");
        display(names);
        names.add("Zachary");
        display(names);

        names.add(2,"Christy");
        display(names);
        names.remove(1);
        display(names);
        names.set(0,"Annete");

        display(names);
    }

    public static void display(ArrayList<String>names)
    {
        System.out.println("\nSize of list:" + names.size());
        for ( int i=0 ; i < names.size() ; ++i)
        {
            System.out.println("position " + i + " name:" + names.get(i));
        }

    }
}