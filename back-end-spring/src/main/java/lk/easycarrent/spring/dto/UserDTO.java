package lk.easycarrent.spring.dto;

import lk.easycarrent.spring.entity.Reservation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * author  Yasith C Bandara
 * created 2/16/2023 - 8:48 PM
 * project back-end-spring
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDTO {
    private Long id;
    private String userName;
    private String password;
    private String email;
    private String contact;
    private String nicNo;
    private byte[] nicImageFront;
    private byte[] nicImageBack;
    private String drivingLicenseNo;
    private byte[] drivingLicenseImageFront;
    private byte[] drivingLicenseImageBack;

    private List<Reservation> reservationList;
}
