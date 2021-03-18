package tech.itpark.avito.manager;

import tech.itpark.avito.domain.Flat;
import tech.itpark.avito.domain.FlatCreate;
import tech.itpark.avito.domain.FlatUpdate;

import java.time.OffsetDateTime;
import java.util.ArrayList;

public class FlatManager {
    private long nextId = 1;
    private ArrayList<Flat> flats = new ArrayList<>();

    public Flat register(FlatCreate dto) {
        Flat flat = new Flat(
                nextId++,
                dto.getName(),
                dto.getMetro(),
                dto.getUrl(),
                dto.getImage(),
                dto.getStreet(),
                dto.getAgency(),
                false,
                dto.getRoom(),
                dto.getSquare(),
                dto.getFloor(),
                dto.getMaxFloor(),
                dto.getPrice(),
                dto.getDistance(),
                OffsetDateTime.now().toEpochSecond(),
                false);
        flats.add(flat);
        return flat;
    }

    public Flat updateById(long id, FlatUpdate dto) {
        for (Flat flat : flats) {
            if (flat.getId() == id) {
                flat.setName(dto.getImage());
                flat.setName(dto.getName());
                flat.setPrice(dto.getPrice());
                return flat;
            }
        }
        return null;
    }

    public void removeById(long id) {
        for (Flat flat : flats) {
            if (flat.getId() == id) {
                flat.setRemoved(true);
            }
        }
    }

    public ArrayList<Flat> getAll() {
        return flats;
    }

    public Flat getById(long id) {
        for (Flat flat : flats) {
            if (flat.getId() == id) {
                return flat;
            }
        }
        return null;

    }

    public ArrayList<Flat> searchByPrice(int minPrice, int maxPrice) {
        ArrayList<Flat> filter = new ArrayList<>();
        for (Flat flat : flats) {

            if (
                    flat.getPrice() >= minPrice &&
                            flat.getPrice() <= maxPrice
            ) {
                filter.add(flat);
            }
        }
        return filter;
    }

}