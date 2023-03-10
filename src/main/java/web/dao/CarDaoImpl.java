package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {

    private List<Car>cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", "red", 2001));
        cars.add(new Car("AUDI", "black", 2002));
        cars.add(new Car("TOYOTA", "white", 2003));
        cars.add(new Car("VW", "grey", 2004));
        cars.add(new Car("KIA", "green", 2005));
    }

    @Override
    public  List<Car> viewCarsByCount(int count) {

        return (count>=5?cars:cars.subList(0,count));
    }
}
