package exam1206;

public class Item {
    private String dealPrice;
    private int buildYear;
    private int dealYear;
    private String dong;
    private String apartNm;
    private int dealMon;
    private int dealDay;
    private int squre;
    private int zipCode;
    private int floor;

    //서술 1번
    public void setDealPrice(String dealPrice) {
        dealPrice = dealPrice.replace(",","");
        dealPrice = dealPrice.replace(" ","");
        this.dealPrice = dealPrice;
    }
    //서술 2번
    public String getDealDate(){
        String dm = "";
        String dd = "";
        dm = (dealMon>10)?dm+dealMon:0+dm+dealMon;
        dd = (dealDay>10)?dd+dealDay:0+dd+dealDay;
        return String.format("%d-%s-%s",dealYear,dm,dd);
    }
    //서술 3번
    public int getPyeong(){
        return (int)Math.round((squre/3.3));
    }


    public String getDealPrice() {
        return dealPrice;
    }


    public int getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    public int getDealYear() {
        return dealYear;
    }

    public void setDealYear(int dealYear) {
        this.dealYear = dealYear;
    }

    public String getDong() {
        return dong;
    }

    public void setDong(String dong) {
        this.dong = dong;
    }

    public String getApartNm() {
        return apartNm;
    }

    public void setApartNm(String apartNm) {
        this.apartNm = apartNm;
    }

    public int getDealMon() {
        return dealMon;
    }

    public void setDealMon(int dealMon) {
        this.dealMon = dealMon;
    }

    public int getDealDay() {
        return dealDay;
    }

    public void setDealDay(int dealDay) {
        this.dealDay = dealDay;
    }

    public int getSqure() {
        return squre;
    }

    public void setSqure(int squre) {
        this.squre = squre;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
