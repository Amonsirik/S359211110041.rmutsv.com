package ooplab7;

public class SuperCar {
     public void getSuperCarinfo (SuperCar s) {
        System.out.println("SupperCar info: ");
        System.out.println("carbrand :" + s.getCarbrand());
        System.out.println("carcolor :" + s.getCarcolor());
        System.out.println("Carenginesize :" + s.getCarenginesize());
        System.out.println("Maxspeed :" + s.getMaxspeed());
        System.out.println("countryoforigin :" + s.getCountryoforigin());
    }

    private String carbrand;
    private String carcolor;
    private String carenginesize;
    private String maxspeed;
    private String countryoforigin;

    public SuperCar(){}


    public String getCarbrand() {
        return carbrand;
    }

    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand;
    }

    public String getCarcolor() {
        return carcolor;
    }

    public void setCarcolor(String carcolor) {
        this.carcolor = carcolor;
    }

    public String getCarenginesize() {
        return carenginesize;
    }

    public void setCarenginesize(String carenginesize) {
        this.carenginesize = carenginesize;
    }

    public String getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(String maxspeed) {
        this.maxspeed = maxspeed;
    }

    public String getCountryoforigin() {
        return countryoforigin;
    }

    public void setCountryoforigin(String countryoforigin) {
        this.countryoforigin = countryoforigin;
    }

    public SuperCar(String brand, String color, String size, String speed, String origin) {
        this.carbrand = brand;
        this.carcolor = color;
        this.carenginesize = size;
        this.maxspeed = speed;
        this.countryoforigin = origin;


    }
}
