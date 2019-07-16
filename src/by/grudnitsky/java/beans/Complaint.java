package by.grudnitsky.java.beans;

public class Complaint {
    private long id;
    private String complaint;

    @Override
    public String toString() {
        return "Сomplaint: " + complaint;
    }

    public Complaint() {
    }

    public Complaint(String complaint) {
        this.complaint = complaint;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }
}
