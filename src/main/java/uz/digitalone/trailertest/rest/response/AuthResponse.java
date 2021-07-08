package uz.digitalone.trailertest.rest.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponse {

    private Integer id;
    private String type;
    private String login;
    private String email;
    private String token;
    private String fullName;
    private Integer customerId;
    private String customerName;

}
