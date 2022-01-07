import java.util.HashMap;
import java.util.Map;

public class EqualsAndHashcode3 {

    //Case 3: Overriding only hashCode() method

    String name;
    int id;

    EqualsAndHashcode3(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    @Override
    public int hashCode()
    {

        // We are returning the Geek_id
        // as a hashcode value.
        // we can also return some
        // other calculated value or may
        // be memory address of the
        // Object on which it is invoked.
        // it depends on how you implement
        // hashCode() method.
        return this.id;
    }

}

class GFG1
{
    public static void main (String[] args)
    {

        // creating two Objects with
        // same state
        EqualsAndHashcode3 g1 = new EqualsAndHashcode3("aditya", 1);
        EqualsAndHashcode3 g2 = new EqualsAndHashcode3("aditya", 1);

        Map<EqualsAndHashcode3, String> map = new HashMap<EqualsAndHashcode3, String>();
        map.put(g1, "CSE");
        map.put(g2, "IT");

        for(EqualsAndHashcode3 geek : map.keySet())
        {
            System.out.println(map.get(geek).toString());
        }

    }
}
