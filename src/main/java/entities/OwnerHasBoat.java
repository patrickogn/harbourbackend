package entities;

import javax.persistence.*;

@Entity
@Table(name = "owner_has_boat")
public class OwnerHasBoat {
    @EmbeddedId
    private OwnerHasBoatId id;

    @MapsId("ownerIdowner")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "owner_idowner", nullable = false)
    private Owner ownerIdowner;

    @MapsId("boatBoatid")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "boat_boatid", nullable = false)
    private Boat boatBoatid;

    public OwnerHasBoatId getId() {
        return id;
    }

    public void setId(OwnerHasBoatId id) {
        this.id = id;
    }

    public Owner getOwnerIdowner() {
        return ownerIdowner;
    }

    public void setOwnerIdowner(Owner ownerIdowner) {
        this.ownerIdowner = ownerIdowner;
    }

    public Boat getBoatBoatid() {
        return boatBoatid;
    }

    public void setBoatBoatid(Boat boatBoatid) {
        this.boatBoatid = boatBoatid;
    }

}