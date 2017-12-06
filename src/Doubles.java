import javafx.beans.binding.When;

public class Doubles {
    public static void main(String[] args) {

        double x = 0;

        while (x<3.1){
            System.out.printf("%.1f ",x);
            x += 0.1;
        }

        System.out.println("");

        double y = 0;

        do{
            System.out.printf("%.1f ",y);
            y += 0.1;
        } while (y<3.1);

    }
}
