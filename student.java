public class student {
    private String name;
    private int year;
    private String ID;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public student(String name, int age, String ID) {
        this.name = name;
        this.year = year;
        this.ID = ID;
    }
    public void in() {
        System.out.println("Nam sinh" + this.year);
        System.out.println("Ho ten" + this.name);
        System.out.println("MSSV"+this.ID);
    }
}