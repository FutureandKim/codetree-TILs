import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        WeatherInfo[] w = new WeatherInfo[n];

        for(int i = 0; i < n; i++){
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            w[i] = new WeatherInfo(date, day, weather);
        }

        int min = 2101;
        int cnt = 0;
        for(int i = 0; i < n; i++){
            if(w[i].weather.equals("Rain")){
                int y = Integer.valueOf(w[i].date.substring(0,4));
                if(y < min)
                    min = y;
            }
        }

        int minM = 13;
        for(int i = 0; i < n; i++){
            if(w[i].weather.equals("Rain") && Integer.valueOf(w[i].date.substring(0,4)) == min){
                int m = Integer.valueOf(w[i].date.substring(5, 7));
                if(m < minM)
                    minM = m;
            }
        }

        int minD = 32;
        for(int i = 0; i < n; i++){
            if(w[i].weather.equals("Rain") && Integer.valueOf(w[i].date.substring(0,4)) == min && Integer.valueOf(w[i].date.substring(5, 7)) == minM){
                int d = Integer.valueOf(w[i].date.substring(8));
                if(d < minD){
                    minD = d;
                    cnt = i;
                }
            }
        }
        System.out.printf("%s %s %s", w[cnt].date, w[cnt].day, w[cnt].weather);
    }
}

class WeatherInfo {
    String date, day, weather;

    public WeatherInfo(String date, String day, String weather) {
        this.date = date;
        this.day = day;
        this.weather = weather;
    }
};