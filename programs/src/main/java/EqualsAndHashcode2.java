import java.util.HashMap;
import java.util.Map;

public class EqualsAndHashcode2 {

   // Case 2 : Overriding only the equals(Object) method


    String name;
    int id;

    EqualsAndHashcode2(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj)
    {
        // if both the object references are
        // referring to the same object.
        if(this == obj)
            return true;

        // it checks if the argument is of the
        // type Geek by comparing the classes
        // of the passed argument and this object.
        // if(!(obj instanceof Geek)) return false; ---> avoid.
        if(obj == null || obj.getClass()!= this.getClass())
            return false;

        // type casting of the argument.
        EqualsAndHashcode2 geek = (EqualsAndHashcode2) obj;

        // comparing the state of argument with
        // the state of 'this' Object.
        return (geek.name.equals(this.name) && geek.id == this.id);
    }
}

class GFG
{
    public static void main (String[] args)
    {

        // creating two Objects with
        // same state
        EqualsAndHashcode2 g1 = new EqualsAndHashcode2("aditya", 1);
        EqualsAndHashcode2 g2 = new EqualsAndHashcode2("aditya", 1);

        Map<EqualsAndHashcode2, String> map = new HashMap<>();
        map.put(g1, "CSE");
        map.put(g2, "IT");

        for(EqualsAndHashcode2 geek : map.keySet())
        {
            System.out.println(map.get(geek).toString());
        }

    }

}
