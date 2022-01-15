package guru.springframework.dao;

public class CarDto {

    private String make;
    private int seatCount;  // map to Car numberOfSeats field

    public CarDto(String make, int seatCount) {
        this.make = make;
        this.seatCount = seatCount;
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

    @Override
    public String toString() {
        return "CarDto{" +
                "make='" + make + '\'' +
                ", seatCount=" + seatCount +
                '}';
    }
}
