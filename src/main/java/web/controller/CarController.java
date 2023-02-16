package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsService;


@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarsService carsService;

    @Autowired
    public CarController(CarsService carsService) {
        this.carsService = carsService;
    }

    @GetMapping("")
    public String showCarsByCount(@RequestParam(value="count",defaultValue = "5")int count, ModelMap model) {
       model.addAttribute("carslist",carsService.viewCarsByCount(count));
       return "cars";
    }
}
