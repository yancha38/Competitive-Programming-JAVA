import java.util.Scanner;

public class RainSound {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Write your code here
        StringBuilder sb = new StringBuilder();
        System.out.println("Enter input numbers : ");
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
        	System.out.println("Enter lower range : ");
            double l = sc.nextDouble();
            System.out.println("Enter upper range : ");
            double r = sc.nextDouble();
            System.out.println("Enter rain sound : ");
            double s = sc.nextDouble();
            if(s > r){
                sb.append(-1 + " " + -1);
            } else {
                int min = (int) Math.ceil(l / s);
                int max = (int) Math.floor(r / s);

                if(min > max){
                    sb.append(-1 + " " + -1);
                } else sb.append(min + " " + max);
            }
            sb.append("\n");
        }
        sc.close();
        System.out.println(sb);
	}

}
