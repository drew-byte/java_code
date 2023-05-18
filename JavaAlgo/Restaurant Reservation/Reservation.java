public class Reservation {

    private String name;
    private String date;
    private String time;
    private int numOfAdults;
    private int numOfChildren;

    Reservation(String name, String date, String time, int numOfAdults, int numOfChildren) {
        this.name = name;
        this.date = date;
        this.time = time;
        this.numOfAdults = numOfAdults;
        this.numOfChildren = numOfChildren;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getNumOfAdults() {
        return numOfAdults;
    }

    public void setNumOfAdults(int numOfAdults) {
        this.numOfAdults = numOfAdults;
    }

    public int getNumOfChildren() {
        return numOfChildren;
    }

    public void setNumOfChildren(int numOfChildren) {
        this.numOfChildren = numOfChildren;
    }
}
