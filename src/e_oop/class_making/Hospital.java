package e_oop.class_making;

import java.util.Scanner;

public class Hospital {

   static String[][] timetable = new String[9][6];
   String[] hour = { "9:00    ", "10:00   ", "11:00   ", "1:00    ",
               "2:00    ", "3:00    ", "4:00    ", "5:00    " };

   void week() {
      for (int i = 0; i < 8; i++) {
         for (int j = 0; j < 5; j++) {
            timetable[i][j] = " ";
         }
      }
   }

   void timetable() {
      System.out.println();
      System.out.println("           월요일   화요일   수요일   목요일   금요일");

      for (int i = 0; i < 8; i++) {
         System.out.println();
         System.out.print(hour[i]);
         for (int j = 0; j < 5; j++) {
            String timetable = (this.timetable[i][j].equals(" ")) ? "□": "■";
            System.out.print(timetable + "     ");
         }
      }
      System.out.println();
   }

   public static void main(String[] args) {

      Hospital pt = new Hospital();
      pt.week();

      String user;
      int select, day, time;
      boolean flag = true;
      boolean exit = true;

      Scanner s = new Scanner(System.in);
      System.out.print("이름을 입력해주세요>");
      user = s.nextLine();

      do {
         System.out.println();
         System.out.println("==================================");
         System.out.println("1.진료예약  2.예약조회  3.예약취소  4.나가기");
         System.out.println("==================================");
         select = s.nextInt();

         if (select == 1) {
            do {
               System.out.println("요일을 선택하세요.>");
               System.out.println("0.월  1.화  2.수  3.목  4.금");
               day = s.nextInt();

               System.out.println("시간을 선택하세요.>");
               System.out.println("(12시~1시는 점심시간입니다.)");
               System.out.println();
               System.out.println("----오전진료----");
               System.out.println("0. 9:00~10:00");
               System.out.println("1. 10:00~11:00");
               System.out.println("2. 11:00~12:00");
               System.out.println("----오후진료----");
               System.out.println("3. 1:00~2:00");
               System.out.println("4. 2:00~3:00");
               System.out.println("5. 3:00~4:00");
               System.out.println("6. 4:00~5:00");
               System.out.println("7. 5:00~6:00");
               time = s.nextInt();

               if (timetable[time][day].equals(" ")) {
                  timetable[time][day] = user;

                  System.out.println();
                  System.out.println(user + "님,"+ "예약되었습니다.");

               } else {
                  System.out.println("이미 예약되었습니다. 다른 요일과 시간을 선택해 주세요.");
               }
               pt.timetable();

            } while (flag = false);

         } else if (select == 2) {
            System.out.println();
            System.out.println(user + "님의 예약입니다.");
            pt.timetable();

         } else if (select == 3) {

            for (int i = 0; i < 8; i++) {

               for (int j = 0; j < 5; j++)

                  if (timetable[i][j].equals(user)) {

                     String cancle;

                     System.out.print("최근예약을 취소하시겠습니까?(y/n)");
                     cancle = new Scanner(System.in).nextLine();

                     if (cancle.equals("y") || cancle.equals("Y")) {

                        timetable[i][j] = " ";
                        System.out.println();
                        System.out.println(user + "님의 예약이 취소되었습니다.");

                     } else {

                        System.out.println(user + "님의 예약이 취소되지 않았습니다.");

                     }
                     pt.timetable();

                  }

            }

         }

         else if (select == 4) {
            System.out.println("종료합니다.");
            break;
         }

      } while (exit);

   }

}