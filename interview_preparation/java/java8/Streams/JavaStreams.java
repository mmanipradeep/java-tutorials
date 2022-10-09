import java.util.*;
import java.util.stream.Collectors;  
import java.util.stream.Stream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

class JavaStreams{
	
	public static void main(String args[]) throws Exception{
		
		List<Integer> sqNum = List.of(1,2,3,4,5).stream().map(a->a*a).collect(Collectors.toList());
		System.out.println(sqNum);

		   List<Customer> customers = List.of(new Customer(23, "sam", true),
                new Customer(32, "lisa", true),
                new Customer(20, "jason", false),
                new Customer(39, "jemmy", true));

		
		List<String> targetUserNames = customers.stream()
                .filter(a->a.isPremium())
                .map(c -> c.getName())
                .collect(Collectors.toList());
				System.out.println(targetUserNames);
				
      //  List<Customer> premiumCustomers = customers.stream()
          //      .filter(ops::premiumCustomer)
              //  .collect(Collectors.toList());
		
				System.out.println(sqNum);
				
				List<List<Integer>> data = List.of(List.of(1), List.of(2), List.of(3));
System.out.println(data);
List<Integer> data1 = data.stream().flatMap(a -> a.stream()).collect(Collectors.toList());
System.out.println(data1);


Stream<String> lines = Files.lines(Path.of("C://mani")); // add filePath
Stream<String> lines1 = Files.lines(Path.of("")); // add filePath
Stream<String> lines2 = Files.lines(Path.of("")); // add filePath
List<Stream<String>> lines3 = List.of(lines, lines1, lines2);
List<String> mergedFiles = lines3.stream().flatMap(a -> a).collect(Collectors.toList());

Files.lines(Path.of(""))
    .skip(1)
    .forEach(System.out::println);
	

  List<Integer> integers = List.of(1, 2, -3, 4, -6, 7);
        List<Integer> positive = integers.stream()
                .filter(e -> e > 0)
                .collect(Collectors.toList());
				
				Stream.generate(()-> UUID.randomUUID()).limit(5).forEach(System.out::println);
				
				customers.stream().peek(c->c.getName()).forEach(System.out::println);
				
				customers.stream()
          .peek(a-> System.out.println(a.getName()))
           .collect(Collectors.toList());
		   
		   List.of(1,2,3,4,5,3).stream()
        .distinct()
        .collect(Collectors.toList())
        .forEach(System.out::println);
		
		
		List.of(5,2,3,4,5,0).stream()
           .sorted()
           .forEach(System.out::println);
		   
		    List.of(5,2,3,4,5,0).stream()
           .sorted((a,b)->b-a)
           .forEach(System.out::println);
		   
		   
				
				
	}
	
	
	 private static boolean premiumCustomer(Customer customer) {
        return customer.isPremium();
    }
	
	static class Customer{
        private int age;
        private String name;
        private boolean isPremium;

        public Customer(int age, String name, boolean isPremium) {
            this.age = age;
            this.name = name;
            this.isPremium = isPremium;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isPremium() {
            return isPremium;
        }

        public void setPremium(boolean premium) {
            isPremium = premium;
        }
    }
	
}