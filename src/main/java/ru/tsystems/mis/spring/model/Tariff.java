package ru.tsystems.mis.spring.model;


import javax.persistence.*;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tariff")
public class Tariff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false, unique = true)
    private String title;

    @Column(name = "tariff_description")
    private String description;

    @Column(name = "price", nullable = false)
    private Double price;

    @OneToMany(mappedBy = "tariff")
    private List<Contract> contractList;

    @ManyToMany
    @JoinTable(name = "tariff_option",
            joinColumns = @JoinColumn(name = "tariff_id"),
            inverseJoinColumns = @JoinColumn(name = "option_id"))
    private List<Option> availableOptions;

    public Tariff() {
    }

    public Tariff(String title, String description, Double price, List<Contract> contractList, List<Option> availableOptions) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.contractList = contractList;
        this.availableOptions = availableOptions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }

    public List<Option> getAvailableOptions() {
        return availableOptions;
    }

    public void setAvailableOptions(List<Option> availableOptions) {
        this.availableOptions = availableOptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tariff tariff = (Tariff) o;
        return Objects.equals(id, tariff.id) &&
                Objects.equals(title, tariff.title) &&
                Objects.equals(description, tariff.description) &&
                Objects.equals(price, tariff.price) &&
                Objects.equals(contractList, tariff.contractList) &&
                Objects.equals(availableOptions, tariff.availableOptions);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, title, description, price, contractList, availableOptions);
    }

    @Override
    public String toString() {
        return "Tariff{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", number of contract=" + contractList.size() +
                ", number of available options=" + availableOptions.size() +
                '}';
    }
}
