package Init.app.Api.Models;
import org.springframework.stereotype.Component;

import jakarta.persistence.*;

@Entity
@Component
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long driverId;
    @Column
    private String firstName;
    @Column
    private String lastName;

    // Default constructor
   
    public Driver() {
    }
    public Driver(Long driverId, String firstName, String lastName) {
        this.driverId = driverId;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Long getDriverId() {
        return driverId;
    }

    public void setDriverId(Long driverId) {
        this.driverId = driverId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



}


