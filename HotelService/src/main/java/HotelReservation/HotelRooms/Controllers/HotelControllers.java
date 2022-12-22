package HotelReservation.HotelRooms.Controllers;

import HotelReservation.HotelRooms.Entity.Reservation;
import HotelReservation.HotelRooms.ExceptionHandler.ReservationNotFoundException;
import HotelReservation.HotelRooms.Service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HotelControllers {

    @Autowired
    private HotelService hotelService;

    @PostMapping("/reservation")
    public Reservation saveReservation(@RequestBody Reservation reservation) {
        return hotelService.saveReservation(reservation);
    }

    @GetMapping("/getAllReservations")
    public List<Reservation> getAllReservations(){
        return hotelService.getAllReservations();
    }

    @GetMapping("/getById/{reservationId}")
    public Reservation getReservationById(@PathVariable int reservationId) throws ReservationNotFoundException {
        return hotelService.getReservationById(reservationId);
    }

    @DeleteMapping("/deleteById/{reservationId}")
    public Reservation deleteById(@PathVariable int reservationId) throws ReservationNotFoundException {
        return hotelService.deleteById(reservationId);
    }

    @PutMapping("/updateReservation/{reservationId}")
    public Reservation updateReservation(@PathVariable int reservationId, @RequestBody Reservation reservation) throws ReservationNotFoundException {
        return hotelService.updateReservation(reservationId, reservation);
    }
}
