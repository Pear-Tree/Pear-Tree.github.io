import java.util.Scanner;


class maths_game{
    public static void main(String arg[]) {
      System.out.println("********************     Quick Maths Game     ********************");
        Scanner userInputNumber = new Scanner(System.in);
        double q1, q2, q3, q4, q5;

      System.out.println("Start off With An Easy One 10+10?   ");
      q1 = userInputNumber.nextDouble();
              if (q1 == 20){
                System.out.println("******************** Your Doing Great 4 More Questions To Go ********************");
              }
                else{
                System.out.println("******************** Sudden Death Question ********************");

                Scanner userInputWrong = new Scanner(System.in);
                double wq1 ;

                System.out.println("10+20?  ");
                wq1 = userInputWrong.nextDouble();

                              if (wq1 ==30){
                              System.out.println("******************** You Have Redemed Yourself ********************");  }
                              else{
                                  System.out.println("******************** You Can't Be Helped ********************");
                                  System.exit(0);
                                        }
}

      System.out.println("200 Divided 4? ");
      q2 = userInputNumber.nextDouble();

          if(q2 ==50){
          System.out.println("******************** Your Doing Great 3 More Questions To Go ********************");}

              else{
                  System.out.println("******************** Sudden Death Question ********************");

                  Scanner userInputWrong1 = new Scanner(System.in);
                  double wq2;

                  System.out.println("6+6? ");
                  wq2 = userInputWrong1.nextDouble();

                      if(wq2 == 12){
                        System.out.println("******************** You Have Redemed Yourself ********************");}

                      else{
                        System.out.println("******************** You Can't Be Helped ********************");
                        System.exit(0);}
}

      System.out.println("What is 6 divided by 4? ");
      q3 = userInputNumber.nextDouble();

            if(q3 == 1.5){
              System.out.println("******************** Your Doing Great 2 More Questions To Go ********************");}

            else{
              System.out.println("******************** Sudden Death Question ********************");

              Scanner userInputWrong2 = new Scanner(System.in);
              double wq3;

              System.out.println("What is 2.1 + 2.5? ");
              wq3 = userInputWrong2.nextDouble();

                    if(wq3 ==4.6){
                          System.out.println("******************** You Have Redemed Yourself ********************");}

                    else{
          System.out.println("******************** You Can't Be Helped ********************");
          System.exit(0);}
}

System.out.println("What is 10 divided by 4? ");
q4 = userInputNumber.nextDouble();

      if(q4 == 2.5){
        System.out.println("******************** Your Doing Great 1 More Questions To Go ********************");}

      else{
        System.out.println("******************** Sudden Death Question ********************");

        Scanner userInputWrong3 = new Scanner(System.in);
        double wq4;

        System.out.println("What is 15 + 2.5? ");
        wq4 = userInputWrong3.nextDouble();

              if(wq4 ==17.5){
                    System.out.println("******************** You Have Redemed Yourself ********************");}

              else{
    System.out.println("******************** You Can't Be Helped ********************");
    System.exit(0);}
}

System.out.println("15 divided 4? ");
q5 = userInputNumber.nextDouble();

      if(q5 == 3.75){
        System.out.println("******************** Congratulation You Maths Pro ********************");}

      else{
        System.out.println("******************** Sudden Death Question ********************");

        Scanner userInputWrong4 = new Scanner(System.in);
        double wq5;

        System.out.println("What is 17 + 5? ");
        wq5 = userInputWrong4.nextDouble();

              if(wq5 ==22){
                    System.out.println("******************** Well Done You Finished The Game ********************");
                    System.exit(0);}
              else{
    System.out.println("******************** You Can't Be Helped ********************");
    System.exit(0);}
}


  }
}
