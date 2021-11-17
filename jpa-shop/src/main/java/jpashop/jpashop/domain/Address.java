package jpashop.jpashop.domain;

import javax.persistence.Embeddable;

import lombok.Getter;

/**
 * @author JeongJoon Seo
 */
@Embeddable
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;
}
