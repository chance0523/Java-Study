package jpashop.jpashop.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

import jpashop.jpashop.domain.Order;
import lombok.RequiredArgsConstructor;

/**
 * @author JeongJoon Seo
 */
@Repository
@RequiredArgsConstructor
public class OrderRepository {

    private final EntityManager em;

    public void save(Order order) {
        em.persist(order);
    }

    public Order findOne(Long id) {
        return em.find(Order.class, id);
    }

    // public List<Order> findAll(OrderSearch orderSearch) { ... }
}
