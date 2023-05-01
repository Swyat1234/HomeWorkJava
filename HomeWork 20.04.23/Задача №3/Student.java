package HomeWork20_04_23;

public class Student extends StudentTest{
    String name;
   public Integer rate;
    Boolean finished;
    String type;

    public Student(String name, Integer rate, Boolean finished, String type) {
        this.name = name;
        this.rate = rate;
        this.finished = finished;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}