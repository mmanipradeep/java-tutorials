public record PersonRecord(String name, int age) {


    public static void main(String[] args) {
         PersonRecord personRecord = new PersonRecord("Abc", 1);
        System.out.println(personRecord.age());
    }

//    int[] arr = null;
//    arr[0] = 1;
//
//    Exception in thread "main" java.lang.NullPointerException
//    at com.baeldung.MyClass.main(MyClass.java:27)

//java.lang.NullPointerException: Cannot store to int array because "a" is null


}

//- Record type
    //    A record is a data class that stores pure data.
//    The idea behind introducing records is to quickly create simple and concise classes devoid of boilerplate
//    code in the model POJOs.

      //  The important difference between class and record is that a record aims to eliminate all
//  the boilerplate code needed to set and get the data from instance. Records transfer this responsibility to
//  java compiler which generates the constructor, field getters, hashCode() and equals() as well toString() methods.




//    Before Java 14:
//        if (obj instanceof Journaldev) {
//        Journaldev jd = (Journaldev) obj;
//        System.out.println(jd.getAuthor());
//        }
//
//
//        Java 14 Onwards:
//        if (obj instanceof Journaldev jd) {
//        System.out.println(jd.getAuthor());
//        }