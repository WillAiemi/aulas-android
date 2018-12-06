package willian.duarte.calcidade.model;

import android.content.Context;

import willian.duarte.calcidade.R;

public class Pessoa {
    private String name;
    private int age;
    private int months;
    private int weeks;
    private int days;
    private Context context;

    public Pessoa(Context context) {
        this.context = context;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    //WRONG WRONG WRONG WRONG WRONG
    public void setAge(int age) {
        this.age = age;
        this.months = age * 12;
        this.weeks = age * 52;
        this.days = age * 365;
    }
    //WRONG WRONG WRONG WRONG WRONG

    @Override
    public String toString() {
        return "\n" + context.getResources().getString(R.string.ma_et_name) + ": " + name +
                "\n" + context.getResources().getString(R.string.ma_et_age_hint) + ": " + age +
                "\n" + context.getResources().getString(R.string.age_in) + " " + context.getResources().getString(R.string.months) + ": " + months +
                "\n" + context.getResources().getString(R.string.age_in) + " " + context.getResources().getString(R.string.weeks) + ": " + weeks +
                "\n" + context.getResources().getString(R.string.age_in) + " " + context.getResources().getString(R.string.days) + ": " + days + "\n";
    }
}
