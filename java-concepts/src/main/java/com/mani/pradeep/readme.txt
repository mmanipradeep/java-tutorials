Dependency (references)
It means there is no conceptual link between two objects. e.g. EnrollmentService object references Student & Course objects (as method parameters or return types)

public class EnrollmentService {
    public void enroll(Student s, Course c){}
}
Association (has-a)
It means there is almost always a link between objects (they are associated). Order object has a Customer object

public class Order {
    private Customer customer
}
Aggregation (has-a + whole-part)
Special kind of association where there is whole-part relation between two objects. they might live without each other though.

public class PlayList {
    private List<Song> songs;
}
OR

public class Computer {
    private Monitor monitor;
}
Note: the trickiest part is to distinguish aggregation from normal association. Honestly, I think this is open to different interpretations.

Composition (has-a + whole-part + ownership)
Special kind of aggregation. An Apartment is composed of some Rooms. A Room cannot exist without an Apartment. when an apartment is deleted, all associated rooms are deleted as well.

public class Apartment{
    private Room bedroom;
    public Apartment() {
       bedroom = new Room();
    }
}