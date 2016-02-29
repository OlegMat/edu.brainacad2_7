package Lab2_7_1;

/**
 * Created by Nastya on 26.02.2016.
 */
public class Device {
    private String manufacturer;
    private float price;
    private String serialNamber;

    public Device(String manufacturer, float price, String serialNamber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNamber = serialNamber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNamber() {
        return serialNamber;
    }

    public void setSerialNamber(String serialNamber) {
        this.serialNamber = serialNamber;
    }

    @Override
    public String toString() {
        return "Device" +
                "manufacturer=" + manufacturer + '\'' +
                ", price=" + price +
                ", serialNamber=" + serialNamber  ;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Device)) return false;

        Device device = (Device) o;

        if (Float.compare(device.price, price) != 0) return false;
        if (!manufacturer.equals(device.manufacturer)) return false;
        return serialNamber.equals(device.serialNamber);

    }

    @Override
    public int hashCode() {
        int result = manufacturer.hashCode();
        result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
        result = 31 * result + serialNamber.hashCode();
        return result;
    }
}



