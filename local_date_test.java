import java.util.*;
import java.time.LocalDate;
public class local_date_test {
    public static void main(String[] args){
        LocalDate bday= LocalDate.of(2007,9,20);
        LocalDate today= LocalDate.now();
        System.out.println(bday.getYear());
        System.out.println(today.getDayOfMonth());
        

    }
}