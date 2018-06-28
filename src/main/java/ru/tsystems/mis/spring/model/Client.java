package ru.tsystems.mis.spring.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "client")
public class Client {

    public enum User{
        CLIENT, MANAGER, ADMINISTRATOR;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surename", nullable = false)
    private String surename;

    @Column(name = "bithday", nullable = false)
    private Date birthday;

    @Column(name = "passport_number", unique = true, nullable = false)
    private String passportNumber;

    @Column(name = "passport_description", nullable = false)
    private String passportDescription;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @OneToMany (mappedBy = "client")
    private List<Contract> contractList;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "user_type")
    private User userType;

    public Client() {
    }

    public Client(String name, String surename, Date birthday, String passportNumber, String passportDescription, String address, String email, String password, List<Contract> contractList, User userType) {
        this.name = name;
        this.surename = surename;
        this.birthday = birthday;
        this.passportNumber = passportNumber;
        this.passportDescription = passportDescription;
        this.address = address;
        this.email = email;
        this.password = password;
        this.contractList = contractList;
        this.userType = userType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id) &&
                Objects.equals(name, client.name) &&
                Objects.equals(surename, client.surename) &&
                Objects.equals(birthday, client.birthday) &&
                Objects.equals(passportNumber, client.passportNumber) &&
                Objects.equals(passportDescription, client.passportDescription) &&
                Objects.equals(address, client.address) &&
                Objects.equals(email, client.email) &&
                Objects.equals(password, client.password) &&
                Objects.equals(contractList, client.contractList) &&
                userType == client.userType;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, surename, birthday, passportNumber, passportDescription, address, email, password, contractList, userType);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getPassportDescription() {
        return passportDescription;
    }

    public void setPassportDescription(String passportDescription) {
        this.passportDescription = passportDescription;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }

    public User getUserType() {
        return userType;
    }

    public void setUserType(User userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surename='" + surename + '\'' +
                ", birthday=" + birthday +
                ", passport number='" + passportNumber + '\'' +
                ", passport description='" + passportDescription + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", number of contracts=" + contractList.size() +
                ", user type=" + userType.name() +
                '}';
    }
}
