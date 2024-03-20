import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            WeatherInfo w = new WeatherInfo(date, day, weather);
            if(w.weather.equals("Rain")){
                if(res.date.compareTo(w.date) > 0)
                    res = w;
            }
        }
        System.out.printf("%s %s %s", res.date, res.day, res.weather);
    }

    public static WeatherInfo res = new WeatherInfo("9999-99-99", "", "");
}

class WeatherInfo {
    String date, day, weather;

    public WeatherInfo(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
};