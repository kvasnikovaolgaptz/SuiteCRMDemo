package dto;

import lombok.*;

import java.util.Objects;

//аннотация ломбок только для dto, не подходит для Page
//@ToString // аннотация ломбок, чтобы метод ToString добавлялся автоматически
//@EqualsAndHashCode
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    String model;
    int speed;


}
