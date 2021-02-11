
package lifeexpectancy;

import java.util.Scanner;
import java.time.LocalDate;



public class LifeExpectancy {

   
    public static void main(String[] args) {
      
        final double lifeExpectancy = 81.16;
        
        Scanner input = new Scanner(System.in);
        LocalDate date = LocalDate.now();
        
        System.out.println("Today's date is " + date);
        System.out.println("What is your birth year: ");
        int birthYear = input.nextInt();
        
        System.out.println("what is your birth month: ");
        int birthMonth = input.nextInt();
        
       System.out.println("When is your birth day: ");
       int birthDay = input.nextInt();
       
       System.out.println("Your date of birth is "+ birthDay +"/"+birthMonth +"/" +birthYear);
       
       int todayYear = 2020;
       int yearsAlive = todayYear-birthYear;
       
       short minutesPerHour = 60;
       short hoursInADay = 24;
       short secondsInADay =3600;
       int DaysAlive = 365*yearsAlive;
       int hoursAlive = hoursInADay*DaysAlive;
       int minutesAlive = (minutesPerHour*24)*DaysAlive;
       int secondsAlive = (minutesPerHour*minutesPerHour)*(hoursInADay*DaysAlive);
       System.out.println("You've been alive for " + DaysAlive + " days, " + hoursAlive + " hours, " + minutesAlive + " minutes and " + secondsAlive + " seconds ");
       
       
      int lifeExpectancyValue = (int)lifeExpectancy;
    
      
      int daysToLive = (lifeExpectancyValue*365)-DaysAlive;
      int hoursToLive = (lifeExpectancyValue*365*hoursInADay)-hoursAlive;
      int minutesToLive = (lifeExpectancyValue*365*hoursInADay*minutesPerHour)-minutesAlive;
      int secondsToLive = (lifeExpectancyValue*365*hoursInADay*secondsInADay)-secondsAlive;
      System.out.println("You have " + daysToLive + " days" + hoursToLive + " hours " + minutesToLive + " minutes and " + secondsToLive + " seonds to live");
      
      int userAge = todayYear-birthYear;
      int userLifeExpectancy = lifeExpectancyValue-userAge;
      
    }
}

