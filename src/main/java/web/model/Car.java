package web.model;

public class Car {

    private String vendor;
    private String color;
    private int year;

    public Car(String vendor, String color, int year) {
        this.vendor = vendor;
        this.color = color;
        this.year = year;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return
                "vendor=" + vendor ;
    }
}
