import java.util.ArrayList;

import classes.Car;
import classes.CarbonFootprint;
import classes.House;
import classes.School;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<CarbonFootprint> objetos = new ArrayList<CarbonFootprint>();
        objetos.add(new House(3, false, 4, true));
        objetos.add(new House(5, false, 10, false));
        objetos.add(new School(30, true, 100, false));
        objetos.add(new School(100, true, 1000, true));
        objetos.add(new Car("Gasolina", 3.5f));
        objetos.add(new Car("Eletrico", 3.5f));

        System.out.println(
            objetos
                .stream()
                .mapToInt((element) -> element.getCarbonFootprint())
                .sum()
        );
    }
}
