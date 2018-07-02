package ru.tsystems.mis.spring.model;


import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "contract")
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @Column(name = "phone_number", nullable = false, unique = true)
    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "tariff_id")
    private Tariff tariff;

    @ManyToMany
    @JoinTable(name = "contract_connected_options",
            joinColumns = @JoinColumn(name = "contract_id"),
            inverseJoinColumns = @JoinColumn(name = "option_id"))
    private List<Option> optionList;

    @Column(name = "blocked_by_client", nullable = false)
    private boolean blockedByClient;

    @Column(name = "blocked_by_operator", nullable = false)
    private boolean blockedByOperator;

    public Contract() {
    }

    public Contract(Client client, String phoneNumber, Tariff tariff, List<Option> optionList, boolean blockedByClient, boolean blockedByOperator) {
        this.client = client;
        this.phoneNumber = phoneNumber;
        this.tariff = tariff;
        this.optionList = optionList;
        this.blockedByClient = blockedByClient;
        this.blockedByOperator = blockedByOperator;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Tariff getTariff() {
        return tariff;
    }

    public void setTariff(Tariff tariff) {
        this.tariff = tariff;
    }

    public List<Option> getOptionList() {
        return optionList;
    }

    public void setOptionList(List<Option> optionList) {
        this.optionList = optionList;
    }

    public boolean isBlockedByClient() {
        return blockedByClient;
    }

    public void setBlockedByClient(boolean blockedByClient) {
        this.blockedByClient = blockedByClient;
    }

    public boolean isBlockedByOperator() {
        return blockedByOperator;
    }

    public void setBlockedByOperator(boolean blockedByOperator) {
        this.blockedByOperator = blockedByOperator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contract contract = (Contract) o;
        return blockedByClient == contract.blockedByClient &&
                blockedByOperator == contract.blockedByOperator &&
                Objects.equals(id, contract.id) &&
                Objects.equals(client, contract.client) &&
                Objects.equals(phoneNumber, contract.phoneNumber) &&
                Objects.equals(tariff, contract.tariff) &&
                Objects.equals(optionList, contract.optionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, client, phoneNumber, tariff, optionList, blockedByClient, blockedByOperator);
    }

    @Override
    public String toString() {
        return "Contract{" +
                "id=" + id +
                ", client=" + client.getName()+ " " + client.getSurename()+ " " +
                ", phone number='" + phoneNumber + '\'' +
                ", tariff=" + tariff.getTitle() +
                ", connected options=" + optionList.size() +
                ", blocked by client=" + blockedByClient +
                ", blocked by operator=" + blockedByOperator +
                '}';
    }
}
