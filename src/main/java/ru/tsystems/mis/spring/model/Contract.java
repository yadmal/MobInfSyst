package ru.tsystems.mis.spring.entity;


import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "contract")
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "phoneNamber", nullable = false, unique = true )
    private int phoneNamber;

    @Column(name = "tariff", nullable = false)
    private Tariff tariff;

    @Column(name = "optionList", nullable = false)
    private Set<Option> optionList;

    public Contract() {
    }

    public int getPhoneNamber() {
        return phoneNamber;
    }

    public void setPhoneNamber(int phoneNamber) {
        this.phoneNamber = phoneNamber;
    }

    public Tariff getTariff() {
        return tariff;
    }

    public void setTariff(Tariff tariff) {
        this.tariff = tariff;
    }

    public Set<Option> getOptionList() {
        return optionList;
    }

    public void setOptionList(Set<Option> optionList) {
        this.optionList = optionList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contract contract = (Contract) o;
        return phoneNamber == contract.phoneNamber &&
                Objects.equals(tariff, contract.tariff) &&
                Objects.equals(optionList, contract.optionList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(phoneNamber, tariff, optionList);
    }

    @Override
    public String toString() {
        return "Contract{" +
                "phoneNamber=" + phoneNamber +
                ", tariff=" + tariff +
                '}';
    }
}
