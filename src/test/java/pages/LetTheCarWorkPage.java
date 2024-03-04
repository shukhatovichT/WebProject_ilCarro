package pages;

import org.openqa.selenium.WebDriver;

import java.util.Objects;

public class LetTheCarWorkPage extends BasePage{

    private String location;
    private String manufacturer;
    private String model;
    private String year;
    private String fuel; // Dropdown list for fuel
    private int seats; // Number input field with up and down arrows
    private String carClass;
    private String registrationNumber;
    private String price;
    private String about;

    public LetTheCarWorkPage(WebDriver driver) {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public LetTheCarWorkPage(String location, String manufacturer, String model, String year, String fuel, int seats, String carClass, String registrationNumber, String price, String about) {
        this.location = location;
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.fuel = fuel;
        this.seats = seats;
        this.carClass = carClass;
        this.registrationNumber = registrationNumber;
        this.price = price;
        this.about = about;
    }

    public LetTheCarWorkPage() {
    }

    @Override
    public String toString() {
        return "LetCarWork{" +
                "location='" + location + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", fuel='" + fuel + '\'' +
                ", seats=" + seats +
                ", carClass='" + carClass + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", price='" + price + '\'' +
                ", about='" + about + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LetTheCarWorkPage letCarWork)) return false;
        return seats == letCarWork.seats &&
                Objects.equals(location, letCarWork.location) &&
                Objects.equals(manufacturer, letCarWork.manufacturer) &&
                Objects.equals(model, letCarWork.model) &&
                Objects.equals(year, letCarWork.year) &&
                Objects.equals(fuel, letCarWork.fuel) &&
                Objects.equals(carClass, letCarWork.carClass) &&
                Objects.equals(registrationNumber, letCarWork.registrationNumber) &&
                Objects.equals(price, letCarWork.price) &&
                Objects.equals(about, letCarWork.about);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, manufacturer, model, year, fuel, seats, carClass, registrationNumber, price, about);
    }
}
