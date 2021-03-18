package tech.itpark.avito.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class FlatCreate {
    private long id;
    private String name;
    private String metro;
    private String url;
    private String image;
    private String street;
    private String agency;
    private int room;
    private double square;
    private int floor;
    private int maxFloor;
    private int price;
    private double distance;
}
