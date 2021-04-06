package edu.infnet.spring.dto;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="customer_orders")
public class CustomerOrdersDTO {
    
    @Id
    @GeneratedValue
    private Long order_id;

    private Timestamp date_order_placed;
    private Timestamp date_order_paid;
    private Double der_total_order_price;
    private String other_order_details;

    @ManyToOne(optional=false, fetch=FetchType.LAZY)
    @JoinColumn(name="customer_id", nullable=false)
    private CustomersDTO customer;

    public CustomerOrdersDTO() {

    }

    public CustomerOrdersDTO(Timestamp date_order_placed, Timestamp date_order_paid, Double der_total_order_price,
            String other_order_details, CustomersDTO customer) {
        this.date_order_placed = date_order_placed;
        this.date_order_paid = date_order_paid;
        this.der_total_order_price = der_total_order_price;
        this.other_order_details = other_order_details;
        this.customer = customer;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public Timestamp getDate_order_placed() {
        return date_order_placed;
    }

    public void setDate_order_placed(Timestamp date_order_placed) {
        this.date_order_placed = date_order_placed;
    }

    public Timestamp getDate_order_paid() {
        return date_order_paid;
    }

    public void setDate_order_paid(Timestamp date_order_paid) {
        this.date_order_paid = date_order_paid;
    }

    public Double getDer_total_order_price() {
        return der_total_order_price;
    }

    public void setDer_total_order_price(Double der_total_order_price) {
        this.der_total_order_price = der_total_order_price;
    }

    public String getOther_order_details() {
        return other_order_details;
    }

    public void setOther_order_details(String other_order_details) {
        this.other_order_details = other_order_details;
    }

    public CustomersDTO getCustomer() {
        return customer;
    }

    public void setCustomer(Long customer_id) {
        this.customer.setCustomer_id(customer_id);
    }
}
