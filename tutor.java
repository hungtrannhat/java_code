public class tutor {
    private String name;
    private int year;
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
    public tutor(String name, int age) {
        this.name = name;
        this.year = year;
    }
    public void in() {
        System.out.println("Nam sinh" + this.year);
        System.out.println("Ho ten" + this.name);
    }
}