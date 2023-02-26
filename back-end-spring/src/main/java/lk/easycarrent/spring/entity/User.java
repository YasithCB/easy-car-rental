package lk.easycarrent.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import net.bytebuddy.asm.Advice;
import sun.security.util.Password;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

/**
 * author  Yasith C Bandara
 * created 2/15/2023 - 12:04 PM
 * project back-end-spring
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Reservation> reservationList;
}
