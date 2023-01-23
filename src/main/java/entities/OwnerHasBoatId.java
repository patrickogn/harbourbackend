package entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OwnerHasBoatId implements Serializable {
    private static final long serialVersionUID = 5205428288539739990L;
    @NotNull
    @Column(name = "owner_idowner", nullable = false)
    private Integer ownerIdowner;

    @NotNull
    @Column(name = "boat_boatid", nullable = false)
    private Integer boatBoatid;

    public Integer getOwnerIdowner() {
        return ownerIdowner;
    }

    public void setOwnerIdowner(Integer ownerIdowner) {
        this.ownerIdowner = ownerIdowner;
    }

    public Integer getBoatBoatid() {
        return boatBoatid;
    }

    public void setBoatBoatid(Integer boatBoatid) {
        this.boatBoatid = boatBoatid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OwnerHasBoatId entity = (OwnerHasBoatId) o;
        return Objects.equals(this.boatBoatid, entity.boatBoatid) &&
                Objects.equals(this.ownerIdowner, entity.ownerIdowner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boatBoatid, ownerIdowner);
    }

}