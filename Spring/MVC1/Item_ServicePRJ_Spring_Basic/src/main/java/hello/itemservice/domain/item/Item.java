package hello.itemservice.domain.item;

import lombok.Data;

import java.util.List;

@Data // @Data를 사용하는 것은 위험.(예측하지 못한 상황을 만들 수 있다.) DTO의 정도에서는 괜찮다고 함.
public class Item {
    private Long id;
    private String itemName;
    private Integer price; // Integer를 사용하는 이유는 Null 값이 들어갈 수도 있기 때문.
    private Integer quantity;
    private Boolean open;
    private List<String> regions;
    private ItemType itemType;
    private String deliveryCode;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

}
