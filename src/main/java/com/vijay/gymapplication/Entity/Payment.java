package com.vijay.gymapplication.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_pk_int", nullable = false)
    private Long idPk_int;

    @Column(name = "user_id_fk_int", columnDefinition = "int")
    private int userIdFk_int;

    @Column(name = "gym_id_fk_int", columnDefinition = "int")
    private int gmyIdFk_int;

    @Column(name = "amount_int", columnDefinition = "int")
    private String amount_int;

    @Column(name = "from_date", columnDefinition = "date")
    private String fromDate_date;

    @Column(name = "to_date", columnDefinition = "date")
    private String toDate_date;

    @Column(name = "plans_id_fk_int", columnDefinition = "int")
    private String plansIdFk_int;

    @Column(name = "created_on_dtm", columnDefinition = "dateTime")
    private Timestamp createdOn_dtm;

    @Column(name = "created_by_int", columnDefinition = "int")
    private String createdBy_int;

    @Column(name = "is_active_bool", columnDefinition = "boolean")
    private boolean isActive_bool;


}
