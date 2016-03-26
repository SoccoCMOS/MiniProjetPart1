package com.example.widad.miniprojetpart1.Object;
import java.io.Serializable;
import java.util.List;
/**
 * Created by widad on 21/03/2016.
 */
public class Product implements Serializable {

                    private String name ;
                    private int cover ;
                    private int iconCover;
                    private String details ;
                    private float price ;


    public Product() {
    }

    public Product(String name, int cover, String details, float price) {
                        this.name = name;
                        this.cover = cover;
                        this.details = details;
                        this.price = price;
                    }

                    public int getIconCover() {
                        return iconCover;
                    }

                    public void setIconCover(int iconCover) {
                        this.iconCover = iconCover;
                    }
                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public int getCover() {
                        return cover;
                    }

                    public void setCover(int cover) {
                        this.cover = cover;
                    }

                    public String getDetails() {
                        return details;
                    }

                    public void setDetails(String details) {
                        this.details = details;
                    }

                    public float getPrice() {
                        return price;
                    }

                    public void setPrice(float price) {
                        this.price = price;
                    }
}
