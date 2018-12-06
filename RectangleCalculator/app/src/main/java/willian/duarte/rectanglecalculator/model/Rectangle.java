package willian.duarte.rectanglecalculator.model;

import android.content.Context;
import willian.duarte.rectanglecalculator.R;

public class Rectangle {
    private double width;
    private double height;
    private Context context;

    public Rectangle(Context context) {
        this.context = context;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return this.width * this.height;
    }

    public double getPerimeter(){
        return this.height * 2 + this.width * 2;
    }

    @Override
    public String toString() {
        return "\n" + context.getResources().getString(R.string.ma_et_width_hint) + ": " + this.width +
                "\n" + context.getResources().getString(R.string.ma_et_height_hint) + ": " + this.height +
                "\n" + context.getResources().getString(R.string.area) + ": " + this.getArea() +
                "\n" + context.getResources().getString(R.string.perimeter) + ": " + this.getPerimeter();
    }
}
