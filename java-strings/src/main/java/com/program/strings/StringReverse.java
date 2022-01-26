package com.program.strings;

import com.google.common.base.CaseFormat;


public class StringReverse {


    //Recursive function that reverses a string
     public String reverse(String str) {
        if ((str.isEmpty())) {
            return str;
        } else {
            return reverse(str.substring(1)) + str.charAt(0);
        }
    }

    public static void main(String args[]){
         StringReverse reverse = new StringReverse();

        System.out.println( reverse.reverse("ABC"));
    }
    public String camelCase2Underscore(String str) {
         if (isBlank(str)) {
            return str;
        }
        return str.replaceAll("([A-Z])", "_$1")
                .replaceFirst("^_", "").toLowerCase();
    }

    private  boolean isBlank(String str) {
        return str == null || str.trim().isEmpty();
    }

    public String underScoreToCamel(String str){
         return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, str);
    }
}
