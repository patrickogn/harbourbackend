package dtos;

import entities.Owner;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A DTO for the {@link entities.Owner} entity
 */
public class OwnerDTO implements Serializable {
    private final Integer id;
    @Size(max = 45)
    private final String name;
    @Size(max = 45)
    private final String adress;
    @Size(max = 45)
    private final String phone;

    public OwnerDTO(Owner rm) {
        this.id = rm.getId();
        this.name = rm.getName();
        this.adress = rm.getAdress();
        this.phone = rm.getPhone();
    }

    public OwnerDTO(Integer id, String name, String adress, String phone) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.phone = phone;
    }



    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public String getPhone() {
        return phone;
    }

    public static List<OwnerDTO> getDtos(List<Owner> rms) {
        List<OwnerDTO> rmdtos = new ArrayList();
        rms.forEach(rm -> rmdtos.add(new OwnerDTO(rm)));
        return rmdtos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OwnerDTO entity = (OwnerDTO) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.name, entity.name) &&
                Objects.equals(this.adress, entity.adress) &&
                Objects.equals(this.phone, entity.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, adress, phone);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "name = " + name + ", " +
                "adress = " + adress + ", " +
                "phone = " + phone + ")";
    }
}