package rvt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
    public static void Money(){
        Money macins1 = new Money(0, 2);
        Money macins2 = new Money(0, 3);
        Money kopejais_macins = macins1.plus(macins2);
        System.out.println();
        System.out.println("Kopā abos maciņos ir " + kopejais_macins + " eiro");
        System.out.println("Pirmajā maciņā ir vairāk nekā otrajā maciņā: "+ macins1.less(macins2));
        Money Starp_macins = macins1.minus(macins2);
        System.out.println("Atņemot no pirmā maciņa otro, paliek " + Starp_macins + " eiro");
}
}
