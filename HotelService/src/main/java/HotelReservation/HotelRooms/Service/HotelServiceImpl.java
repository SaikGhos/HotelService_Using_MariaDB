package HotelReservation.HotelRooms.Service;

import HotelReservation.HotelRooms.Entity.Reservation;
import HotelReservation.HotelRooms.Repo.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Reservation saveReservation(Reservation reservation) {

        return hotelRepository.save(reservation);
    }
}
