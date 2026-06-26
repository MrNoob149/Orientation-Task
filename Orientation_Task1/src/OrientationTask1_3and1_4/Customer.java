package OrientationTask1_3and1_4;


public class Customer {

    private int id;
    private long startTime;
    private long endTime;

    public Customer(int id) {
        this.id = id;
        this.startTime = System.currentTimeMillis();

    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public int getId() {
        return id++;
    }

    public long waitingTime() {
        return (endTime - startTime);
    }


}
