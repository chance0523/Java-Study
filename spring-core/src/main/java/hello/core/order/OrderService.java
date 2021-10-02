package hello.core.order;

/**
 * @author JeongJoon Seo
 */
public interface OrderService {

    Order createOrder(Long memberId, String itemName, int itemPrice);
}
