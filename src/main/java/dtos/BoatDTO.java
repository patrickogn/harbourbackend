package dtos;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

/**
 * A DTO for the {@link entities.Boat} entity
 */
public class BoatDTO implements Serializable {
    private Integer id;
    private String brand;
    private String make;
    private String name;
    private String image;
    private Set<HarbourDto> harbours;
    private Set<OwnerDto> owners;



    public BoatDTO(Integer id, String brand, String make, String name, String image, Set<HarbourDto> harbours, Set<OwnerDto> owners) {
        this.id = id;
        this.brand = brand;
        this.make = make;
        this.name = name;
        this.image = image;
        this.harbours = harbours;
        this.owners = owners;
    }

    public BoatDTO() {
    }

    public Integer getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getMake() {
        return make;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public Set<HarbourDto> getHarbours() {
        return harbours;
    }

    public Set<OwnerDto> getOwners() {
        return owners;
    }

    /**
     * A DTO for the {@link entities.Harbour} entity
     */
    public static class HarbourDto implements Serializable {
        private Integer id;
        @Size(max = 45)
        private String name;
        @Size(max = 45)
        private String adress;
        private Integer capacity;

        public HarbourDto(Integer id, String name, String adress, Integer capacity) {
            this.id = id;
            this.name = name;
            this.adress = adress;
            this.capacity = capacity;
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

        public Integer getCapacity() {
            return capacity;
        }

    }

    /**
     * A DTO for the {@link entities.Owner} entity
     */
    public static class OwnerDto implements Serializable {
        private Integer id;
        @Size(max = 45)
        private String name;
        @Size(max = 45)
        private String adress;
        @Size(max = 45)
        private String phone;

        public OwnerDto(Integer id, String name, String adress, String phone) {
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

    }
}