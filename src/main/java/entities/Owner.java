package entities;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "owner")
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idowner", nullable = false)
    private Integer id;

    @Size(max = 45)
    @Column(name = "name", length = 45)
    private String name;

    @Size(max = 45)
    @Column(name = "adress", length = 45)
    private String adress;

    @Size(max = 45)
    @Column(name = "phone", length = 45)
    private String phone;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}