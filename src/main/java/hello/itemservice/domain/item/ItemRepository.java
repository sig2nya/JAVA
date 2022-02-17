package hello.itemservice.domain.item;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository // @Repository를 이용하면 @Component도 포함되어 있기 때문에, ComponentScan의 대상이 된다.
public class ItemRepository {
    private static final Map<Long, Item> store = new HashMap<>();
    // Thread 처리를 위하여 ConcurrentHashMap을 이용하는 것이 좋다.(동시 접근 시에 값의 에러 발생가능)
    private static long sequence = 0L;

    public Item save(Item item){
        item.setId(++sequence);
        store.put(item.getId(), item);
        return item;
    }

    public Item findById(Long id){
        return store.get(id);
    }

    public List<Item> findAll(){
        return new ArrayList<>(store.values());
    }

    public void update(Long itemId, Item updateParam){
        Item findItem = findById(itemId);
        findItem.setItemName(updateParam.getItemName());
        findItem.setPrice(updateParam.getPrice());
        findItem.setQuantity(updateParam.getQuantity());
    }

    public void clearStore(){
        store.clear();
    }
}
// 개발자 -> 중복이냐 명확성이냐? 답은 명확성이다.