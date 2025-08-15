package Collection_interfaces.challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {
    public static void main(String[] args) {
        Map<String,String> countryMap = new HashMap<>();
        countryMap.put("Bharat","New Delhi");
        countryMap.put("China","Beijing");
        countryMap.put("Pakistan","Islamabad");
        countryMap.put("Sri Lanka","Columbo");
        countryMap.put("Bangaldesh","Dhaka");

        Scanner read = new Scanner(System.in);
        System.out.print("Please enter the country name: ");
        String country= read.next();
        if (countryMap.containsKey(country)){
            System.out.printf("Capital of %s is %s",country,countryMap.get(country));
        }else{
            System.out.println("Sorry we dont know the capital");
        }


    }
}
