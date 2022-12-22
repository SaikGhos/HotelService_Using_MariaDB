package HotelReservation.HotelRooms.Controllers;

import HotelReservation.HotelRooms.Entity.Reservation;
import HotelReservation.HotelRooms.Service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelControllers {

    @Autowired
    private HotelService hotelService;

    @PostMapping("/reservation")
    public Reservation saveReservation(@RequestBody Reservation reservation) {
        return hotelService.saveReservation(reservation);
    }
}
