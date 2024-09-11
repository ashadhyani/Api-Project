package Init.app.Api.Models;
import org.springframework.stereotype.Component;

import jakarta.persistence.*;


@Entity
@Component
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicleId;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "driverId", referencedColumnName = "driverId")
    
    private Driver driver;
     
    public Vehicle() {
    }
    
    public Vehicle(Driver driver,Long vehicleId){
         this.driver=driver;
         this.vehicleId= vehicleId;

     }
    public Long getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }


}