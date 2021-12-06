package example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        /*
        String str = "199412";
        SimpleDateFormat afterFormat = new SimpleDateFormat("yyyy-mm-dd");
        try {
            Date temp = afterFormat.parse(str);
            str = afterFormat.format(temp);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(str);
         */
        /*
        int dealYear = 1994;
        int dealMon = 12;
        int dealDay = 31;
        String dm = "";
        String dd = "";
        dm = (dealMon>10)?dm+dealMon:0+dm+dealMon;
        dd = (dealDay>10)?dd+dealDay:0+dd+dealDay;
        System.out.println(String.format("%d-%s-%s",dealYear,dm,dd));

         */
        /*


        String dealPrice = " 12323,213 123";
        dealPrice = dealPrice.replace(",","");
        dealPrice = dealPrice.replace(" ","");
        System.out.println(dealPrice);

         */
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String str = sdf.format(date);
        System.out.println(str);
    }
}
