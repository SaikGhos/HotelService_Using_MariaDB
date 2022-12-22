package HotelReservation.HotelRooms.Service;


import HotelReservation.HotelRooms.Entity.Reservation;
import HotelReservation.HotelRooms.ExceptionHandler.ReservationNotFoundException;

import java.util.List;
import java.util.Optional;

public interface HotelService {
    public Reservation saveReservation(Reservation reservation);

    public List<Reservation> getAllReservations();

    public Reservation getReservationById(int reservationId) throws ReservationNotFoundException;

    public Reservation deleteById(int reservationId) throws ReservationNotFoundException;

    public Reservation updateReservation(int reservationId, Reservation reservation) throws ReservationNotFoundException;
}
