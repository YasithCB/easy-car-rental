package lk.easycarrent.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * author  Yasith C Bandara
 * created 2/16/2023 - 10:08 PM
 * project back-end-spring
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AdminDTO {
    private Long id;
    private String name;
    private String contact;
    private String email;
    private String address;
}
