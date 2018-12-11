package willian.duarte.exerciciosintentpermissions.model;

import android.os.Parcelable;
import android.os.Parcel;

public class Person implements Parcelable {
    private String name;
    private int age;

    public Person() {
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

    public void setAge(int age) {
        this.age = age;
    }

    public int getAgeInMonths(){
        return this.age * 12;
    }

    public int getAgeInWeeks(){
        return this.age * 52;
    }

    public int getAgeInDays(){
        return this.age * 365;
    }

    @Override
    public String toString() {
        return "\nName: " + this.name +
                "\nAge: " + this.age +
                "\nAge in months: " + this.getAgeInMonths() +
                "\nAge in weeks: " + this.getAgeInWeeks() +
                "\nAge in days: " + this.getAgeInDays();
    }

    protected Person(Parcel in) {
        name = in.readString();
        age = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(age);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Person> CREATOR = new Parcelable.Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };
}