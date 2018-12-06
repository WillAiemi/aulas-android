package willian.duarte.notasaluno.model;

import android.content.Context;

import willian.duarte.notasaluno.R;

public class Alumn {
    private String name;
    private double n1;
    private double n2;
    private String sex;
    private Context context;

    public Alumn(Context context) {
        this.context = context;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "\n" + context.getResources().getString(R.string.ma_et_name) + ": " + name + "\n" +
                "\n" + n1 +
                ", n2=" + n2 +
                ", sex='" + sex + '\'' +
                '}';
    }
}
