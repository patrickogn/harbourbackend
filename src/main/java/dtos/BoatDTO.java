package dtos;

import entities.Boat;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

/**
 * A DTO for the {@link entities.Boat} entity
 */
public class BoatDTO implements Serializable {
    private int id;
    private String brand;
    private String make;
    private String name;
    private String image;
    private Set<HarbourDto> harbours;
    private Set<OwnerDto> owners;

    public BoatDTO(int id, String brand, String image, String make, String name) {
        this.id = id;
        this.brand = brand;
        this.image = image;
        this.make = make;
        this.name = name;
    }

    public BoatDTO() {
    }

    public BoatDTO(Boat boat) {
        this.id = boat.getId();
        this.brand = boat.getBrand();
        this.image = boat.getImage();
        this.make = boat.getMake();
        this.name = boat.getName();

    }

    public int getId() {
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



    /**
     * A DTO for the {@link entities.Harbour} entity
     */
    public static class HarbourDto implements Serializable {
        private Integer id;
        @Size(max = 45)
        private String name;
        @Size(max = 45)
        private String adress;
        private int capacity;

        public HarbourDto(int id, String name, String adress, int capacity) {
            this.id = id;
            this.name = name;
            this.adress = adress;
            this.capacity = capacity;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getAdress() {
            return adress;
        }

        public int getCapacity() {
            return capacity;
        }

    }

    /**
     * A DTO for the {@link entities.Owner} entity
     */
    public static class OwnerDto implements Serializable {
        private int id;
        @Size(max = 45)
        private String name;
        @Size(max = 45)
        private String adress;
        @Size(max = 45)
        private String phone;

        public OwnerDto(int id, String name, String adress, String phone) {
            this.id = id;
            this.name = name;
            this.adress = adress;
            this.phone = phone;
        }

        public int getId() {
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