public class Date {

    public static void inputValue(){
        IOData.printMes("DATE MONTH YEAR");
        int date = IOData.addIntValue();
        int month = IOData.addIntValue();
        int year = IOData.addIntValue();
        nextDay(date, month, year);
    }

    private static void nextDay(int date, int month, int year){
        if(month <= 0 || month > 12 ||
           month == 1 && date > 31 ||
           month == 3 && date > 31 ||
           month == 5 && date > 31 ||
           month == 7 && date > 31 ||
           month == 8 && date > 31 ||
           month == 10 && date > 31 ||
           month == 4 && date > 30 ||
           month == 6 && date > 30 ||
           month == 9 && date > 30 ||
           month == 11 && date > 30){
            IOData.printMes("Incorrect data");
            return;
        }
        boolean bool = calcYear(year);
        if(month == 12 && date == 31){
            year++;
            IOData.printMes("1." + "1." + year);
        }
        else if(month == 1 && date == 31 ||
                month == 3 && date == 31 ||
                month == 5 && date == 31 ||
                month == 7 && date == 31 ||
                month == 8 && date == 31 ||
                month == 10 && date == 31){
            month++;
            IOData.printMes("1." + month + "."+ year);;
        }
        else if(bool && month == 2 && date == 29){
            month++;
            IOData.printMes("1." + month + "."+ year);
        }
        else if(!bool && month == 2 && date == 28){
            IOData.printMes("1." + month + "."+ year);
        }
        else if(month == 4 && date == 30 ||
                month == 6 && date == 30 ||
                month == 9 && date == 30 ||
                month == 11 && date == 30){
            month++;
            IOData.printMes("1." + month + "."+ year);
        }
        else {
            date++;
            IOData.printMes(date + "." + month + "." + year);
        }
    }

    private static boolean calcYear(int year){
        if (isLeap(year)){
            IOData.printMes("Is leap");
            return true;
        }
        else{
            IOData.printMes("Isn't leap");
            return false;
        }
    }

    private static boolean isInteger(double number){
        return number%1==0;
    }

    private static boolean isLeap(int year){
        boolean flag = false;
        if(isInteger(calc(year, 4)) && isInteger(calc(year, 100))){
        }
        else if(isInteger(calc(year, 4)) && isInteger(calc(year, 100)) && isInteger(calc(year, 400))){
            flag = true;
        }
        else if(isInteger(calc(year, 4))){
            flag = true;
        }
        return flag;
    }

    private static double calc(int year, int num){
        return year / (double)num;
    }
}
