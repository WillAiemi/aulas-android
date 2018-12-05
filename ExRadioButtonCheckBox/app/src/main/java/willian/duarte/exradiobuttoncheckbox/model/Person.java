package willian.duarte.exradiobuttoncheckbox.model;

import java.util.ArrayList;

public class Person {

    private String name;
    private String gender;
    private ArrayList<String> prefs;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ArrayList<String> getPrefs() {
        return prefs;
    }

    public void setPrefs(ArrayList<String> prefs) {
        this.prefs = prefs;
    }

    @Override
    public String toString() {
        return "\nName: " + this.name +
                "\nGender: " + this.gender +
                "\nPrefs: " + this.prefs + "\n";
    }
}//close Person
