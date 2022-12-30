import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AutoDate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = -1;
        System.out.println("Enter: ");
        do {
            System.out.println("1.name");
            System.out.println("2.roll");
            System.out.println("3.class");
            System.out.println("4.date");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    int newChoice = -1;
                    System.out.println("1.first name");
                    System.out.println("2.last name");
                    System.out.println("enter");
                    newChoice = in.nextInt();

                    switch (newChoice) {
                        case 1:
                            System.out.println("Aman");
                            break;
                        case 2:
                            System.out.println("Kumar");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("22");
                    break;
                case 3:
                    System.out.println("4");
                    break;
                case 4:
                    SimpleDateFormat saddf = new SimpleDateFormat("yyMMddHHmmss");
                    String date = saddf.format(new Date());
                    System.out.println(date);
                    break;
                case 5:
                    Scanner inn = new Scanner(System.in);
                    System.out.println("Enter day : ");
                    String day = inn.nextLine();
                    System.out.println("Enter month : ");
                    String m = inn.nextLine();
                    System.out.println("Enter year : ");
                    String y = inn.nextLine();
                    String date1 = day+"/"+m+"/"+y;
                    System.out.println(date1);
                    break;
                case 6:
                    System.out.println("1.\tNew Delhi\t2.\tAmritsar\t3.\tNagpur\n" +
                            "4.\tMumbai\t5.\tAhmedabad\t6.\tChandigarh\n" +
                            "7.\tChennai\t8.\tJaipur\t9.\tJammu\n" +
                            "10.\tBangalore\t11.\tLucknow\t12.\tSrinagar\n" +
                            "13.\tKochi\t14.\tCoimbatore\t15.\tMangalore\n" +
                            "16.\tHyderabad\t17.\tTiruchirappalli\t18.\tPort Blair\n" +
                            "19.\tThiruvananthapuram\t20.\tPune\t21.\tIndore\n" +
                            "22.\tKolkata\t23.\tSiliguri\t24.\tAgartala\n" +
                            "25.\tCalicut\t26.\tGuwahati\t27.\tPatna\n" +
                            "28.\tVasco da Gama\t29.\tMadura\t30.\tRanchi\n" +
                            "\n");
                    break;
                case 7:
                    Scanner in1 = new Scanner(System.in);
                    System.out.println("y");
                    String ye = in1.nextLine();
                    System.out.println("m");
                    String mo = in1.nextLine();
                    System.out.println("d");
                    String da = in1.nextLine();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
                    String d1 = simpleDateFormat.format(new Date());
                    String d2 = ye+mo+da;
                    System.out.println("nw date : " + d1);
                    System.out.println("date : " + d2);

            }
        }while (choice!=0);
    }
}

