package com.vijay.gymapplication.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.Date;

@Getter
@Setter
@ToString
@Entity
@Table(name = "USER")
public class User {

    public enum Gender {
        MALE,
        FEMALE
    }

    public enum UserType {
        OWNER,
        CUSTOMER
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_pk_int", nullable = false)
    private Long idPk_int;

    @Column(name = "first_name_txt", columnDefinition = "varchar(255)")
    private String firstName_txt;

    @Column(name = "last_name_txt", columnDefinition = "varchar(255)")
    private String lastName_txt;

    @Column(name = "date_of_birth_date", columnDefinition = "date")
    private Date dateOfBirth_date;

    @Column(name = "registered_on_date", columnDefinition = "date")
    private String registeredOn_date;

    @Column(name = "mobile_txt", columnDefinition = "varchar(12)")
    private String mobile_txt;

    @Column(name = "email_txt", columnDefinition = "varchar(500)")
    private String email_txt;

    @Column(name = "created_on_dtm", columnDefinition = "dateTime")
    private Timestamp createdOn_dtm;

    @Column(name = "is_active_bool", columnDefinition = "boolean")
    private boolean isActive_bool;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    private UserType userType ;
}
