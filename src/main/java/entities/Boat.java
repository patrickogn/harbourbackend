package entities;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "boat")
public class Boat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "boatid", nullable = false)
    private int id;

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

    @ManyToMany
    @JoinTable(name = "boat_has_harbour",
            joinColumns = @JoinColumn(name = "boat_boatid"),
            inverseJoinColumns = @JoinColumn(name = "harbour_idharbour"))
    private Set<Harbour> harbours = new LinkedHashSet<>();

    @ManyToMany
    @JoinTable(name = "owner_has_boat",
            joinColumns = @JoinColumn(name = "boat_boatid"),
            inverseJoinColumns = @JoinColumn(name = "owner_idowner"))

    private Set<Owner> owners = new LinkedHashSet<>();

    public Boat() {
    }

    public Boat(int id, String brand, String image, String make, String name) {
        this.id = id;
        this.brand = brand;
        this.image = image;
        this.make = make;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Set<Harbour> getHarbours() {
        return harbours;
    }

    public void setHarbours(Set<Harbour> harbours) {
        this.harbours = harbours;
    }

    public Set<Owner> getOwners() {
        return owners;
    }

    public void setOwners(Set<Owner> owners) {
        this.owners = owners;
    }

}