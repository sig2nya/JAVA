package hello.itemservice.domain.item;

import lombok.Data;

@Data // Lombok을 사용하는 것은 위험하다고 합니다.(예측하지 못한 상황을 만들 수 있다.) DTO의 정도에서는 괜찮다고 함.
public class Item {
    private Long id;
    private String itemName;
    private Integer price; // Integer를 사용할 경우에 값이 없을 경우를 가정
    private Integer quantity; // Null값이 들어올 수도 있다.

    public Item(){}

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
