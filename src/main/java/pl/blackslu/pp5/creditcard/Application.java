package pl.blackslu.pp5.creditcard;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main (String[] args) {

        System.out.println("Its gonna be some card check payout. Be AWARE. Comming soon");
        SpringApplication.run(Application.class, args);
    }
}
