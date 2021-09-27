import java.text.DecimalFormat;
public class Ques7 {
    public static void main(String[] args) {
        DecimalFormat f = new DecimalFormat("##.00");
        float seconds = 547895;
        float minutes = seconds / 60;
        float hours = minutes / 60;
        float days = hours / 24;
        System.out.println("seconds " + f.format(seconds) + " minutes " + f.format(minutes) + " hours " + f.format(hours) + " days " + f.format(days));
    }
}
