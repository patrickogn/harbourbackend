package entities;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "boat")
public class Boat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "boatid", nullable = false)
    private Integer id;

    @Size(max = 45)
    @Column(name = "brand", length = 45)
    private String brand;

    @Size(max = 45)
    @Column(name = "make", length = 45)
    private String make;

    @Size(max = 45)
    @Column(name = "name", length = 45)
    private String name;

    @Size(max = 45)
    @Column(name = "image", length = 45)
    private String image;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}