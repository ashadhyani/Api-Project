package Init.app.Api.Repository;

import Init.app.Api.Models.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.time.LocalTime;
import java.util.List;



@Repository
public interface RouteRepository extends JpaRepository<Route, Long>{

//@Query("SELECT DISTINCT  r.vehicle.driver FROM Route r " +
       // "WHERE r.route_id = 2 and r.start_time Between '10:30:00' AND '12:30:00'")

   



          

          // @Query("SELECT r.startTime, r.endTime, d FROM Route r " +
          // "JOIN Vehicle v ON r.vehicle.vehicleId = v.vehicleId " +
          // "JOIN Driver d ON v.driver.driverId = d.driverId " +
          // "WHERE r.routeId = :routeId " +
          // "AND (:Time IS NULL OR (:Time BETWEEN r.startTime AND r.endTime))")

          @Query("""
         SELECT r.startTime , r.endTime, d FROM Route r \
         JOIN Vehicle v ON r.vehicle.vehicleId = v.vehicleId \
         JOIN Driver d ON v.driver.driverId = d.driverId \
         WHERE r.routeId = :routeId \
         AND (:Time IS NULL OR (:Time BETWEEN r.startTime AND r.endTime OR r.startTime=:Time OR r.endTime=:Time)) \
         """ )
          
          
        
          
    //public List<Driver>getDriverDetailsByRouteIdAndTime (@Param("routeId") int routeId, @Param("Time") LocalTime Time);
    public List<Object[]> getDriverDetailsByRouteIdAndTime(@Param("routeId") int routeId, @Param("Time") LocalTime Time);

   // public List<Driver> getDriverDetailsByRouteId(@Param("routeId") Integer routeId, @Param("startTime") LocalTime startTime,@Param("endTime") LocalTime endTime);
 //public List<Driver> findByRouteId(int routeId);




}