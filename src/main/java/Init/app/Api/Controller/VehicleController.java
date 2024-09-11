package Init.app.Api.Controller;
import Init.app.Api.Models.Vehicle;
import Init.app.Api.Repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class VehicleController {
    @Autowired
    public VehicleRepository vehicleRepository;
    // @Autowired
    // public DriverRepository driverRepository;

    @PostMapping(value="/insertVehicleDetails")
    public Vehicle vehicleDetails(@RequestBody Vehicle vehicle){

        return vehicleRepository.save(vehicle);
    }


    }

