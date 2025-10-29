package com.it.entity;

/**
 * 食物实体类
 */
public class Food {
    //食物id
    private Integer id;
    //食物名称
    private String food_name;
    //食物类型
    private String food_type;
    //食物价格
    private double price;
    //是否清真
    private Integer is_halal;
    //食物图片
    private String food_img;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public String getFood_type() {
        return food_type;
    }

    public void setFood_type(String food_type) {
        this.food_type = food_type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getIs_halal() {
        return is_halal;
    }

    public void setIs_halal(Integer is_halal) {
        this.is_halal = is_halal;
    }

    public String getFood_img() {
        return food_img;
    }

    public void setFood_img(String food_img) {
        this.food_img = food_img;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", food_name='" + food_name + '\'' +
                ", food_type='" + food_type + '\'' +
                ", price=" + price +
                ", is_halal=" + is_halal +
                ", food_img='" + food_img + '\'' +
                '}';
    }
}
