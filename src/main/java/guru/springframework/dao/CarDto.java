package guru.springframework.dao;

public class CarDto {

    private String make;
    private int seatCount;  // map to Car numberOfSeats field
    private String desc;

    public CarDto(String make, int seatCount, String desc) {
        this.make = make;
        this.seatCount = seatCount;
        this.desc = desc;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "CarDto{" +
                "make='" + make + '\'' +
                ", seatCount=" + seatCount +
                ", desc='" + desc + '\'' +
                '}';
    }
}
