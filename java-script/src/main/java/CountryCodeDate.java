import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class CountryCodeDate {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(com.ibm.icu.util.TimeZone.getAvailableIDs("IN")));
//        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
//        df.setTimeZone(TimeZone.getTimeZone(icom.ibm.icu.util.TimeZone.getAvailableIDs("IN")));
//        System.out.println(df.format(new Date()));

        Map<String, Set<TimeZone>> availableTimezones =
                new HashMap<String, Set<TimeZone>>();

        // Loop through all available locales
        System.out.println(Locale.getAvailableLocales().toString());
        for (Locale locale : Locale.getAvailableLocales())
        {
            final String countryCode = locale.getCountry();
          //  System.out.println(countryCode);
            // Locate the timezones added for this country so far
            // (This can be moved to inside the loop if depending
            // on whether country with no available timezones should
            // be in the result map with an empty set,
            // or not included at all)

            Set<TimeZone> timezones = availableTimezones.get("IN");
            if (timezones==null)
            {
                timezones = new HashSet<TimeZone>();
                availableTimezones.put(countryCode, timezones);
            }

            // Find all timezones for that country (code) using ICU4J

            for (String id :
                    com.ibm.icu.util.TimeZone.getAvailableIDs("IN"))
            {
                // Add timezone to result map
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                df.setTimeZone(TimeZone.getTimeZone(id));
             //   System.out.println(df.format(new Date()));

                timezones.add(TimeZone.getTimeZone(id));

            }

        }
    }
}
