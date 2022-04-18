package com.fbayhan.manageownlibrary.entities;


import javax.persistence.*;

@Entity
@Table(name="category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    private String categoryName;

    @ManyToOne
    private Category upperCategory;


    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Category getUpperCategory() {
        return upperCategory;
    }

    public void setUpperCategory(Category upperCategory) {
        this.upperCategory = upperCategory;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", upperCategory=" + upperCategory +
                '}';
    }
}
