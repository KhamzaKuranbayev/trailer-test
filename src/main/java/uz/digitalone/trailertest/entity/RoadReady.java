package uz.digitalone.trailertest.entity;

import lombok.*;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.sql.Timestamp;
import java.util.TimeZone;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class RoadReady extends _Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private String login;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String token;

    @Column(nullable = false)
    private String roles;

    @Column(nullable = false)
    private Timestamp loginData;

    @Column(nullable = false)
    private Integer customerId;

    @Column(nullable = false)
    private String customerName;

    @Column(nullable = false)
    private boolean useHeatIndex;

    @Column(nullable = false)
    private boolean dualFactorEnabled;

    @Column(nullable = false)
    private boolean phoneConfirm;

    @Column(nullable = false)
    private String temperatureUnit;

    @Column(nullable = false)
    private String pressureUnit;

    @Column(nullable = false)
    private String distanceUnit;

    @Column(nullable = false)
    private String speedUnit;

    @Column(nullable = false)
    private Integer sessionId;

    @Column(nullable = false)
    private Integer fleetId;

    @Column(nullable = false)
    private String fleetName;

    @Column(nullable = false)
    private TimeZone timeZone;


}
