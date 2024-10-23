package shop.samdul.greeting.entity;

import lombok.Setter;
import lombok.ToString;
import lombok.Getter;

@Setter
@Getter
@ToString
public class TodoEntity {
   private Integer id;
   private String subject;
   private String body;
   private Boolean completed;
}