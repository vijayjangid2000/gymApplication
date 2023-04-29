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
@Table(name = "customer_gym_mapping")
public class CustomerGymMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_pk_int", nullable = false)
    private Long idPk_int;

    @Column(name = "gym_id_fk_int", columnDefinition = "int")
    private int gmyIdFk_int;

    @Column(name = "user_id_fk_int", columnDefinition = "int")
    private int userIdFk_int;

    @Column(name = "locker_number_int", columnDefinition = "int")
    private int lockerNumber_int;

    @Column(name = "created_on_dtm", columnDefinition = "dateTime")
    private Timestamp createdOn_dtm;

    @Column(name = "created_by_int", columnDefinition = "int")
    private String createdBy_int;

    @Column(name = "is_active_bool", columnDefinition = "boolean")
    private boolean isActive_bool;

}
