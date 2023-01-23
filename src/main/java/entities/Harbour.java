package entities;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "harbour")
public class Harbour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idharbour", nullable = false)
    private Integer id;

    @Size(max = 45)
    @Column(name = "name", length = 45)
    private String name;

    @Size(max = 45)
    @Column(name = "adress", length = 45)
    private String adress;

    @Column(name = "capacity")
    private Integer capacity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

}