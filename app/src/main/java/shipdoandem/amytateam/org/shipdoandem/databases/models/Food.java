package shipdoandem.amytateam.org.shipdoandem.databases.models;

import android.widget.ImageView;

/**
 * Created by DUC THANG on 3/16/2017.
 */

public class Food {
    private ImageView ivFood;
    private int price;

    public Food(ImageView iFood, int price) {
        this.ivFood = iFood;
        this.price = price;
    }

    public Food(int x) {
        this.price = x;
    }

    public ImageView getiFood() {
        return ivFood;
    }

    public void setiFood(ImageView iFood) {
        this.ivFood = iFood;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Food{" +
                "ivFood=" + ivFood +
                ", price='" + price + '\'' +
                '}';
    }
}
