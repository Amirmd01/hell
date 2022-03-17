import java.util.Scanner;

public class S4 {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.print("Number of student scores : ");
          int ns = input.nextInt();
          float[] Scores = new float[ns];
          float sum = 0;
          int c = 1;
          for (int i = 0; i < ns; i++) {
               System.out.print("score " + c + " : ");
               Scores[i] = input.nextFloat();
               sum += Scores[i];
               c++;
          }
          // -------------(( بیشترین و کمترین نمره ))-------------
          double max = Scores[0];
          for (int j = 1; j < ns; j++) {
               if (Scores[j] > max)
                    max = Scores[j];
          }
          double min = Scores[0];
          for (int r = 1; r < ns; r++) {
               if (Scores[r] < min)
                    min = Scores[r];
          }
          // ----------------(( خروجی ))----------------
          System.out.print("Average : ");
          System.out.println(sum / ns);
          System.out.println("The highest score : " + max);
          System.out.print("The lowest score : " + min);
     }
}