package lk.easycarrent.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

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
    private String nicImageFront;
    private String nicImageBack;
    private String drivingLicenseNo;
    private String drivingLicenseImageFront;
    private String drivingLicenseImageBack;
    private LocalDate date;
    private boolean isApproved;
}
