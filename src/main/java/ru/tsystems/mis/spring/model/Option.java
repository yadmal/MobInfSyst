package ru.tsystems.mis.spring.model;


import javax.persistence.*;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "option")
public class Option {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false, unique = true)
    private String title;

    @Column (name = "option_description")
    private String description;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "connection_cost", nullable = false)
    private Double connectionCost;

    @ManyToMany(mappedBy = "availableOptions")
    private List<Tariff> connectedTariffs;

    @ManyToMany(mappedBy = "optionList")
    private List<Contract> connectedContracts;

    @ManyToMany
    @JoinTable(name = "incompatible_options",
            joinColumns = @JoinColumn (name = "option_id"),
            inverseJoinColumns = @JoinColumn(name = "incompatible_options_id"))
    private List<Option> incompatibleOptions;

    @ManyToMany
    @JoinTable(name = "related_options",
            joinColumns = @JoinColumn (name = "option_id"),
            inverseJoinColumns = @JoinColumn(name = "related_options_id"))
    private List<Option> relatedOptions;

    public Option() {
    }

    public Option(String title, String description, Double price, Double connectionCost, List<Tariff> connectedTariffs, List<Contract> connectedContracts, List<Option> incompatibleOptions, List<Option> relatedOptions) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.connectionCost = connectionCost;
        this.connectedTariffs = connectedTariffs;
        this.connectedContracts = connectedContracts;
        this.incompatibleOptions = incompatibleOptions;
        this.relatedOptions = relatedOptions;
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

    public Double getConnectionCost() {
        return connectionCost;
    }

    public void setConnectionCost(Double connectionCost) {
        this.connectionCost = connectionCost;
    }

    public List<Tariff> getConnectedTariffs() {
        return connectedTariffs;
    }

    public void setConnectedTariffs(List<Tariff> connectedTariffs) {
        this.connectedTariffs = connectedTariffs;
    }

    public List<Contract> getConnectedContracts() {
        return connectedContracts;
    }

    public void setConnectedContracts(List<Contract> connectedContracts) {
        this.connectedContracts = connectedContracts;
    }

    public List<Option> getIncompatibleOptions() {
        return incompatibleOptions;
    }

    public void setIncompatibleOptions(List<Option> incompatibleOptions) {
        this.incompatibleOptions = incompatibleOptions;
    }

    public List<Option> getRelatedOptions() {
        return relatedOptions;
    }

    public void setRelatedOptions(List<Option> relatedOptions) {
        this.relatedOptions = relatedOptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Option option = (Option) o;
        return Objects.equals(id, option.id) &&
                Objects.equals(title, option.title) &&
                Objects.equals(description, option.description) &&
                Objects.equals(price, option.price) &&
                Objects.equals(connectionCost, option.connectionCost) &&
                Objects.equals(connectedTariffs, option.connectedTariffs) &&
                Objects.equals(connectedContracts, option.connectedContracts) &&
                Objects.equals(incompatibleOptions, option.incompatibleOptions) &&
                Objects.equals(relatedOptions, option.relatedOptions);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, title, description, price, connectionCost, connectedTariffs, connectedContracts, incompatibleOptions, relatedOptions);
    }

    @Override
    public String toString() {
        return "Option{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", connection cost=" + connectionCost +
                ", number of tariffs=" + connectedTariffs.size() +
                ", number of:" +
                ", connected contracts=" + connectedContracts.size() +
                ", incompatible options=" + incompatibleOptions.size() +
                ", related options=" + relatedOptions.size() +
                '}';
    }
}
