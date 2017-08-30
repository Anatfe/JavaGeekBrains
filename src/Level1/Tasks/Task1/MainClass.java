package Level1.Task.Task1;

public class MainClass {
    public static void main(String[] args) {
        short year = 2016;
        System.out.println(isLeapYear(year));
    }

    public static boolean isLeapYear(short year){
//      Проверим год на кратность 100
        int var_year;
        var_year = year%100; // остаток от 100

//      Если год кратен 100 проверяем на исключение для каждого 400 года
//      Если не кратен проверяем на исключение каждого 4 года
        short mult_year = 4;

        if (var_year == 0) {
//          Нет остатка, значит кратно 100, необходимо проверить на 400 год
            mult_year = 400;
            var_year  = year;
        }

        // проверим год на кратность високосного года
        var_year %= mult_year;

        return var_year == 0;
    }
}
