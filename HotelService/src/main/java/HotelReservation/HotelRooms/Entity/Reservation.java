package HotelReservation.HotelRooms.Entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.Date;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "reservation")
public class Reservation {

    @Id
    private String reservationId;

    @NotBlank(message = "The room number can not be blank")
    @NotNull(message = "The room number can not be null")
    private String roomNo;

    /*@NotNull(message = "The number of rooms can not be null")
    @Min(value=1,message = "The no. of rooms reserved should be 1 or more")
    @Positive(message = "Invalid Input")
    private int noOfRooms;*/

    @NotBlank(message = "The name of the guest can not be blank")
    @NotNull(message = "The name of the guest can not be null")
    private String name;
    private Date reservationDate;
}
