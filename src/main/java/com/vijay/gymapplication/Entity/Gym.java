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
@Table(name = "gym")
public class Gym {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_pk_int", nullable = false)
    private Long idPk_int;

    @Column(name = "user_id_fk_int", columnDefinition = "int")
    private int userIdFk_int;

    @Column(name = "address_txt", columnDefinition = "varchar(1000)")
    private String address_txt;

    @Column(name = "mobile_txt", columnDefinition = "varchar(20)")
    private String mobile_txt;

    @Column(name = "email_txt", columnDefinition = "varchar(255)")
    private String email_txt;

    @Column(name = "created_on_dtm", columnDefinition = "dateTime")
    private Timestamp createdOn_dtm;

    @Column(name = "created_by_int", columnDefinition = "int")
    private String createdBy_int;

    @Column(name = "last_modified_on_dtm", columnDefinition = "dateTime")
    private Timestamp lastModifiedOn_dtm;

    @Column(name = "last_modified_by_int", columnDefinition = "int")
    private String lastModifiedBy_int;

    @Column(name = "is_active_bool", columnDefinition = "boolean")
    private boolean isActive_bool;


}
