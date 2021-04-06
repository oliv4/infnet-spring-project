package edu.infnet.spring.dto;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class ProductsDTO {
    
    @Id
    @GeneratedValue
    private Long id;
    private String product_type_code;
    private String supplier_code;
    private Double product_price;
    private String book_isbn;
    private String book_author;
    private Timestamp book_publication_date;
    private String book_title;
    private String food_contains_yn;
    private String food_name;
    private String food_description;
    private String food_flavor;
    private String food_ingredients;
    private String other_product_details;

    public ProductsDTO() {

    }

    public ProductsDTO(String product_type_code, String supplier_code, Double product_price, String book_isbn,
            String book_author, Timestamp book_publication_date, String book_title, String food_contains_yn,
            String food_name, String food_description, String food_flavor, String food_ingredients,
            String other_product_details) {
        this.product_type_code = product_type_code;
        this.supplier_code = supplier_code;
        this.product_price = product_price;
        this.book_isbn = book_isbn;
        this.book_author = book_author;
        this.book_publication_date = book_publication_date;
        this.book_title = book_title;
        this.food_contains_yn = food_contains_yn;
        this.food_name = food_name;
        this.food_description = food_description;
        this.food_flavor = food_flavor;
        this.food_ingredients = food_ingredients;
        this.other_product_details = other_product_details;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct_type_code() {
        return product_type_code;
    }

    public void setProduct_type_code(String product_type_code) {
        this.product_type_code = product_type_code;
    }

    public String getSupplier_code() {
        return supplier_code;
    }

    public void setSupplier_code(String supplier_code) {
        this.supplier_code = supplier_code;
    }

    public Double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(Double product_price) {
        this.product_price = product_price;
    }

    public String getBook_isbn() {
        return book_isbn;
    }

    public void setBook_isbn(String book_isbn) {
        this.book_isbn = book_isbn;
    }

    public String getBook_author() {
        return book_author;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public Timestamp getBook_publication_date() {
        return book_publication_date;
    }

    public void setBook_publication_date(Timestamp book_publication_date) {
        this.book_publication_date = book_publication_date;
    }

    public String getBook_title() {
        return book_title;
    }

    public void setBook_title(String book_title) {
        this.book_title = book_title;
    }

    public String getFood_contains_yn() {
        return food_contains_yn;
    }

    public void setFood_contains_yn(String food_contains_yn) {
        this.food_contains_yn = food_contains_yn;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public String getFood_description() {
        return food_description;
    }

    public void setFood_description(String food_description) {
        this.food_description = food_description;
    }

    public String getFood_flavor() {
        return food_flavor;
    }

    public void setFood_flavor(String food_flavor) {
        this.food_flavor = food_flavor;
    }

    public String getFood_ingredients() {
        return food_ingredients;
    }

    public void setFood_ingredients(String food_ingredients) {
        this.food_ingredients = food_ingredients;
    }

    public String getOther_product_details() {
        return other_product_details;
    }

    public void setOther_product_details(String other_product_details) {
        this.other_product_details = other_product_details;
    }

}
