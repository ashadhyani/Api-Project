package Init.app.Api.Controller;


import Init.app.Api.Models.Driver;
import Init.app.Api.Repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class DriverController {
    @Autowired
    private DriverRepository driverRepository;

    @GetMapping(value = "/")
    public String getPage() {

        return "hello world";

    }
    @GetMapping(value="/driverDetails")

     public List<Driver> getDriver() {

        return driverRepository.findAll();
    }
    @PostMapping(value="/saveDriver")
    public Driver saveDriver(@RequestBody Driver driver){

       return driverRepository.save(driver);


  }





    }



