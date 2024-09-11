package Init.app.Api.Controller;
import Init.app.Api.Models.Driver;
import Init.app.Api.Models.Route;
import Init.app.Api.Models.Vehicle;
import Init.app.Api.Repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;
import java.util.List;

@RestController
public class RouteController {
  
   @Autowired
    public  RouteRepository routeRepository;
   
    

    @GetMapping("/{routeId}/DriverDetails")
    public  List<Object[]> getDriverDetails(
            @PathVariable int routeId,
       // @RequestParam(required = false) @DateTimeFormat(pattern = "HH:mm:ss") LocalTime startTime,
       // @RequestParam(required = false) @DateTimeFormat(pattern = "HH:mm:ss") LocalTime endTime,
        @RequestParam(required = false) @DateTimeFormat(pattern = "HH:mm:ss") LocalTime Time) {


        //  if (Time != null) {


         List<Object[]> results = routeRepository.getDriverDetailsByRouteIdAndTime(routeId,Time);
        //  }
        //  else{
             
        //      return routeRepository.findByRouteId(routeId);

        //  }
        return results;
      }

      
    @PostMapping("/insertRoute")
    public Route insertRouteDetails(@RequestBody Route route) {

      
         Vehicle vehicle = new Vehicle();
          Driver driver = new Driver();

        // vehicle.setVehicleId(vehicle.getVehicleId());


        // driver.setDriverId(driver.getDriverId());
        
         driver.setFirstName(route.getVehicle().getDriver().getFirstName());
         driver.setLastName(route.getVehicle().getDriver().getLastName());
         
          vehicle.setDriver(driver);
        // // Setting the vehicle in the route
         route.setVehicle(vehicle);


        return routeRepository.save(route);


    }
    

}
