package edu.infnet.spring.dto;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class CustomersDTO {

    @Id
    @GeneratedValue
    private Long customer_id;

    private String fist_name;
    private String middle_name;
    private String last_name;
    private String customer_phone;
    private String customer_email;
    private String other_customer_details;

    @OneToMany(targetEntity=CustomerOrdersDTO.class, mappedBy="customer", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private Set<CustomerOrdersDTO> orders;

    public CustomersDTO() {

    }

    public CustomersDTO(String fist_name, String middle_name, String last_name, String customer_phone,
            String customer_email, String other_customer_details) {
        this.fist_name = fist_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.customer_phone = customer_phone;
        this.customer_email = customer_email;
        this.other_customer_details = other_customer_details;
    }

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public String getFist_name() {
        return fist_name;
    }

    public void setFist_name(String fist_name) {
        this.fist_name = fist_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getCustomer_phone() {
        return customer_phone;
    }

    public void setCustomer_phone(String customer_phone) {
        this.customer_phone = customer_phone;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public String getOther_customer_details() {
        return other_customer_details;
    }

    public void setOther_customer_details(String other_customer_details) {
        this.other_customer_details = other_customer_details;
    }   
}
