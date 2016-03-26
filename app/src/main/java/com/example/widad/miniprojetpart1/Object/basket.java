package com.example.widad.miniprojetpart1.Object;

import java.util.List;

/**
 * Created by widad on 23/03/2016.
 */
public class basket {

    private String  thing ;
    private List<Product> productList ;
    private float totalPrice ;

    public basket(String thing, List<Product> productList, float totalPrice) {
        this.thing = thing;
        this.productList = productList;
        this.totalPrice = totalPrice;
    }

    public String getThing() {
        return thing;
    }

    public void setThing(String thing) {
        this.thing = thing;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
}
