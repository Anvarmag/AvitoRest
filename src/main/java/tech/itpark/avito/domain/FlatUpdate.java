package tech.itpark.avito.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class FlatUpdate {
    private String name;
    private String image;
    private int price;

}
