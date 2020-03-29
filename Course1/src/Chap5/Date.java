package Chap5;

public class Date {
    private int month, day, year;

    public Date(int m, int d, int y) {
        month = m;
        day = d;
        year = y;
    }

    public Date(int m, int y) {
        month = m;
        day = 0;
        year = y;
    }

    public Date() {
        month = 0;
        day = 0;
        year = 0;
    }

    public String toString() {
        return month + "/" + day + "/" + year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
