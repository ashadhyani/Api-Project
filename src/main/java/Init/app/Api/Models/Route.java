package Init.app.Api.Models;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalTime;


@Entity
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private int routeId;
    @Column
    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime startTime;
    @Column
    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime endTime;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "vehicleId",referencedColumnName = "vehicleId")
    private Vehicle vehicle;


    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public int getRouteId() {

        return routeId;
    }

    public void setRouteId(int routeId) {

        this.routeId = routeId;
    }
    public LocalTime getStartTime() {

        return startTime;
    }

    public void setStartTime(LocalTime startTime) {

        this.startTime = startTime;
    }

    public LocalTime getEndTime() {

        return endTime;
    }

    public void setEndTime(LocalTime endTime) {

        this.endTime = endTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}