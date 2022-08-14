public class StringReverse   
{  
//recursive function to reverse a string      
public String reverseString(String str)  {  
//checks if the string is empty   
if(str.isEmpty())  {  
System.out.println("String is empty.")  
//if the above condition is true returns the same string      
return str;  
}   
else   {  
return reverseString(str.substring(1))+str.charAt(0);  
}  
}  
public static void main(String[] args)   
{  
StringReverse rs = new StringReverse();  
String resultantSting1 = rs.reverseString("JAVATPOINT");  
System.out.println(resultantSting1);  

}  
}  