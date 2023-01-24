package entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class BoatHasHarbourId implements Serializable {
    private static final long serialVersionUID = -2920506431703381788L;
    @NotNull
    @Column(name = "boat_boatid", nullable = false)
    private Integer boatBoatid;

    @NotNull
    @Column(name = "harbour_idharbour", nullable = false)
    private Integer harbourIdharbour;

    public Integer getBoatBoatid() {
        return boatBoatid;
    }

    public void setBoatBoatid(Integer boatBoatid) {
        this.boatBoatid = boatBoatid;
    }

    public Integer getHarbourIdharbour() {
        return harbourIdharbour;
    }

    public void setHarbourIdharbour(Integer harbourIdharbour) {
        this.harbourIdharbour = harbourIdharbour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoatHasHarbourId entity = (BoatHasHarbourId) o;
        return Objects.equals(this.boatBoatid, entity.boatBoatid) &&
                Objects.equals(this.harbourIdharbour, entity.harbourIdharbour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(boatBoatid, harbourIdharbour);
    }

}