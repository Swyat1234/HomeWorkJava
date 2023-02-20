package Author;

public class PublishingHouse {
    String HouseName;
    int foundationYear;

    public PublishingHouse(String houseName, int foundationYear) {
        HouseName = houseName;
        this.foundationYear = foundationYear;
    }

    public String getHouseName() {
        return HouseName;
    }

    public int getFoundationYear() {
        return foundationYear;
    }
}
