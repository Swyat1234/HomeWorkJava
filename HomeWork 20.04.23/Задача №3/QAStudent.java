package HomeWork20_04_23;

public class QAStudent extends Student{
    public QAStudent(String name, Integer rate, Boolean finished, String type) {
        super(name, rate, finished, type);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public Integer getRate() {
        return super.getRate();
    }

    @Override
    public Boolean getFinished() {
        return super.getFinished();
    }

    @Override
    public String getType() {
        return super.getType();
    }
}
