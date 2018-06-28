package ru.tsystems.mis.spring.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surename", nullable = false)
    private String surename;

    @Column(name = "bithday", nullable = false)
    private Date birthday;

    @Column(name = "passportData", unique = true, nullable = false)
    private String passportData;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "contractList", nullable = false)
    private Set<Contract> contractList;

    public Client() {
    }

}
