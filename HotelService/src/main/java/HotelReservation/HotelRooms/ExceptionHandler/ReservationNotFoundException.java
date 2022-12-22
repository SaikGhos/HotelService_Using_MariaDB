package HotelReservation.HotelRooms.ExceptionHandler;

public class ReservationNotFoundException extends Exception {
    public ReservationNotFoundException() {
        super();
    }

    public ReservationNotFoundException(String message) {
        super(message);
    }
}
