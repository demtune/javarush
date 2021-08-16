package com.javarush.task.task19.task1903;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.text.MaskFormatter;


/* 
Адаптация нескольких интерфейсов
*/

public class Solution {

    public static Map<String, String> countries = new HashMap<String, String>();

    static {

        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {

    }

    public static class IncomeDataAdapter implements Customer, Contact  {
        private IncomeData data;

        public IncomeDataAdapter(IncomeData incomeData) {
            this.data = incomeData;
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }


        @Override
        public String getName() {
            return data.getContactLastName() + ", " + data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() throws ParseException {
            String res = String.format("+%d(%2$s)%3$s-%4$s-%5$s", data.getCountryPhoneCode(),


                    String.format("%010d", data.getPhoneNumber()).substring(0, 3),
                    String.format("%010d", data.getPhoneNumber()).substring(3, 6),
                    String.format("%010d", data.getPhoneNumber()).substring(6, 8),
                    String.format("%010d", data.getPhoneNumber()).substring(8));

            return res;
            //            String phoneMask =  "+" + data.getCountryPhoneCode() + "(###)###-##-##";
//            int phoneNumber = data.getPhoneNumber();
//            MaskFormatter maskFormatter = new MaskFormatter(phoneMask);
//            maskFormatter.setValueContainsLiteralCharacters(false);
//            maskFormatter.valueToString(phoneNumber);
//
//            return //


        }
    }


    public interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example1: 501234567, For example2: 71112233
    }

    public interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber() throws ParseException;        //For example1: +38(050)123-45-67, For example2: +38(007)111-22-33
    }
}