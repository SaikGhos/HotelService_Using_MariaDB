package HotelReservation.HotelRooms.Service;

import HotelReservation.HotelRooms.Entity.Reservation;
import HotelReservation.HotelRooms.ExceptionHandler.ReservationNotFoundException;
import HotelReservation.HotelRooms.Repo.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Reservation saveReservation(Reservation reservation) {

        return hotelRepository.save(reservation);
    }

    @Override
    public List<Reservation> getAllReservations() {
        return hotelRepository.findAll();
    }

    @Override
    public Reservation getReservationById(int reservationId) throws ReservationNotFoundException {
        Optional<Reservation> reservation = hotelRepository.findById(reservationId);
        if(!reservation.isPresent()){
            throw new ReservationNotFoundException("Reservation with id "+reservationId+" does not exist");
        }
        return reservation.get();
    }

    @Override
    public Reservation deleteById(int reservationId) throws ReservationNotFoundException {
        Optional<Reservation> reservation = hotelRepository.findById(reservationId);
        if(!reservation.isPresent()){
            throw new ReservationNotFoundException("Reservation with id "+reservationId+" does not exist");
        }
        hotelRepository.deleteById(reservationId);
        return reservation.get();
    }

    @Override
    public Reservation updateReservation(int reservationId, Reservation reservation) throws ReservationNotFoundException {

        Optional<Reservation> oldReservation = hotelRepository.findById(reservationId);
        if(!oldReservation.isPresent()){
            throw new ReservationNotFoundException("Reservation with id "+reservationId+" does not exist");
        }
        Reservation updatedReservation = hotelRepository.findById(reservationId).get();
        updatedReservation.setRoomNo(reservation.getRoomNo());
        updatedReservation.setName(reservation.getName());
        updatedReservation.setCheckInDate(reservation.getCheckInDate());
        updatedReservation.setCheckOutDate(reservation.getCheckOutDate());
        hotelRepository.save(updatedReservation);
        return updatedReservation;
    }


}
