package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;
import java.util.List;

@Service
public class CarsServiceImpl implements CarsService{

    private CarDao carDao;

    @Autowired
    public CarsServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> viewCarsByCount(int count) {
        return carDao.viewCarsByCount(count);
    }
}
