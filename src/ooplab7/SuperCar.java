package ooplab7;

public class SuperCar {
    private String carBrand;
    private String carColor;
    private String engSize;
    private String maxspeed;
    private String countyoforigin;
    //constructor
    public SuperCar(){}
    public SuperCar(String b,String c, String e,String m,String r){

        this.carBrand = b;
        this.carColor = c;
        this.engSize = e;
        this.maxspeed= m;
        this.countyoforigin =r;
    }

    public String getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(String maxspeed) {
        this.maxspeed = maxspeed;
    }

    public String getCountyoforigin() {
        return countyoforigin;
    }

    public void setCountyoforigin(String countyoforigin) {
        this.countyoforigin = countyoforigin;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    //getter and setter methods
    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getEngSize() {
        return engSize;
    }

    public void setEngSize(String engSize) {
        this.engSize = engSize;
    }

    public String getSuperCarInfo() {
        return "SuperCar{" +
                "carBrand='" + carBrand + '\'' +
                ", carColor='" + carColor + '\'' +
                ", engSize='" + engSize + '\'' +
                ", maxspeed='" + maxspeed + '\'' +
                ", countyoforigin='" + countyoforigin + '\'' +
                '}';
    }
}