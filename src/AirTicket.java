import java.io.*;
import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.ListIterator;
import java.util.Scanner;

class Ticket implements Serializable {
    String pnr;
    String pName;
    String date;
    String src;
    String dst;

    Ticket(String pnr, String pName, String date, String src, String dst){
        this.pnr = pnr;
        this.pName = pName;
        this.date = date;
        this.src = src;
        this.dst = dst;
    }
    public String toString(){
        return pnr+" "+date+" "+src+" "+dst+" "+pName;
    }
}
public class AirTicket {
    public static void main(String[] args) throws Exception {
        int choice = -1;

        String SRC = null, DST = null;

        Scanner in = new Scanner(System.in);
        Scanner s = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");

        ArrayList<Ticket> al = new ArrayList<Ticket>();
        File file = new File("Records.txt");
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        ListIterator li = null;

        if (file.isFile()) {
            ois = new ObjectInputStream(new FileInputStream(file));
            al = (ArrayList<Ticket>) ois.readObject();
            ois.close();
        }


        do {
            System.out.println("1.BOOKING");
            System.out.println("2.PNR CHECK");
            System.out.println("3.UPDATE DETAILS");
            System.out.println("4.CANCEL");
            System.out.println("0.EXIT");
            System.out.print("Enter your choice : ");

            choice = in.nextInt();


            switch (choice) {
                case 1 -> {
                    String pNR = sdf.format(new Date());
                    System.out.println("For Date of Journey ");
                    System.out.print("Enter year : ");
                    String y = s.nextLine();
                    System.out.print("Enter month : ");
                    String m = s.nextLine();
                    System.out.print("Enter day : ");
                    String d = s.nextLine();
                    String date = d + "/" + m + "/" + y;
                    System.out.println("""
                            1.\tNew Delhi           \t2.\tAmritsar         \t3.\tNagpur
                            4.\tMumbai              \t5.\tAhmedabad        \t6.\tChandigarh
                            7.\tChennai             \t8.\tJaipur           \t9.\tJammu
                            10.\tBangalore          \t11.\tLucknow         \t12.\tSrinagar
                            13.\tKochi              \t14.\tCoimbatore      \t15.\tMangalore
                            16.\tHyderabad          \t17.\tTiruchirappalli \t18.\tPort Blair
                            19.\tThiruvananthapuram \t20.\tPune            \t21.\tIndore
                            22.\tKolkata            \t23.\tSiliguri        \t24.\tAgartala
                            25.\tCalicut            \t26.\tGuwahati        \t27.\tPatna
                            28.\tVasco da Gama      \t29.\tMadura          \t30.\tRanchi
                            """
                    );
                    System.out.println("Choose Source for Journey : ");
                    int tempSRC = in.nextInt();
                    switch (tempSRC) {
                        case 1:
                            SRC = "New Delhi";
                            break;
                        case 2:
                            SRC = "Amritsar";
                            break;
                        case 3:
                            SRC = "Nagpur";
                            break;
                        case 4:
                            SRC = "Mumbai";
                            break;
                        case 5:
                            SRC = "Ahmedabad";
                            break;
                        case 6:
                            SRC = "Chandigarh";
                            break;
                        case 7:
                            SRC = "Chennai";
                            break;
                        case 8:
                            SRC = "Jaipur";
                            break;
                        case 9:
                            SRC = "Jammu";
                            break;
                        case 10:
                            SRC = "Bangalore";
                            break;
                        case 11:
                            SRC = "Lucknow";
                            break;
                        case 12:
                            SRC = "Srinagar";
                            break;
                        case 13:
                            SRC = "Kochi";
                            break;
                        case 14:
                            SRC = "Coimbatore";
                            break;
                        case 15:
                            SRC = "Mangalore";
                            break;
                        case 16:
                            SRC = "Hyderabad";
                            break;
                        case 17:
                            SRC = "Tiruchirappalli";
                            break;
                        case 18:
                            SRC = "Port Blair";
                            break;
                        case 19:
                            SRC = "Thiruvananthapuram";
                            break;
                        case 20:
                            SRC = "Pune";
                            break;
                        case 21:
                            SRC = "Indore";
                            break;
                        case 22:
                            SRC = "Kolkata";
                            break;
                        case 23:
                            SRC = "Siliguri";
                            break;
                        case 24:
                            SRC = "Agartala";
                            break;
                        case 25:
                            SRC = "Calicut";
                            break;
                        case 26:
                            SRC = "Guwahati";
                            break;
                        case 27:
                            SRC = "Patna";
                            break;
                        case 28:
                            SRC = "Vasco da Gama";
                            break;
                        case 29:
                            SRC = "Madura";
                            break;
                        case 30:
                            SRC = "Ranchi";
                            break;
                    }
                    System.out.println("Choose Destination for Journey : ");
                    int tempDST = in.nextInt();
                    switch (tempDST) {
                        case 1:
                            DST = "New Delhi";
                            break;
                        case 2:
                            DST = "Amritsar";
                            break;
                        case 3:
                            DST = "Nagpur";
                            break;
                        case 4:
                            DST = "Mumbai";
                            break;
                        case 5:
                            DST = "Ahmedabad";
                            break;
                        case 6:
                            DST = "Chandigarh";
                            break;
                        case 7:
                            DST = "Chennai";
                            break;
                        case 8:
                            DST = "Jaipur";
                            break;
                        case 9:
                            DST = "Jammu";
                            break;
                        case 10:
                            DST = "Bangalore";
                            break;
                        case 11:
                            DST = "Lucknow";
                            break;
                        case 12:
                            DST = "Srinagar";
                            break;
                        case 13:
                            DST = "Kochi";
                            break;
                        case 14:
                            DST = "Coimbatore";
                            break;
                        case 15:
                            DST = "Mangalore";
                            break;
                        case 16:
                            DST = "Hyderabad";
                            break;
                        case 17:
                            DST = "Tiruchirappalli";
                            break;
                        case 18:
                            DST = "Port Blair";
                            break;
                        case 19:
                            DST = "Thiruvananthapuram";
                            break;
                        case 20:
                            DST = "Pune";
                            break;
                        case 21:
                            DST = "Indore";
                            break;
                        case 22:
                            DST = "Kolkata";
                            break;
                        case 23:
                            DST = "Siliguri";
                            break;
                        case 24:
                            DST = "Agartala";
                            break;
                        case 25:
                            DST = "Calicut";
                            break;
                        case 26:
                            DST = "Guwahati";
                            break;
                        case 27:
                            DST = "Patna";
                            break;
                        case 28:
                            DST = "Vasco da Gama";
                            break;
                        case 29:
                            DST = "Madura";
                            break;
                        case 30:
                            DST = "Ranchi";
                            break;
                    }
                    System.out.print("Enter number of Person : ");
                    int n = in.nextInt();
                    System.out.print("Enter " + n + " Person Name : ");
                    String pName = s.nextLine();
                    String tempPNR = pNR;
                    al.add(new Ticket(pNR, pName, date, SRC, DST));
                    oos = new ObjectOutputStream(new FileOutputStream(file));
                    oos.writeObject(al);
                    oos.close();
                    System.out.println("\n");
                    System.out.println("------------------------------------------");
                    System.out.println("Ticket Confirmed.");
                    System.out.println("PNR Number : " + tempPNR);
                    System.out.println("Name of Passenger : " + pName);
                    System.out.println("Date of Journey : " + date);
                    System.out.println("Source : " + SRC);
                    System.out.println("Destination : " + DST);
                    System.out.println("------------------------------------------");
                    System.out.println("\n");
                }
                case 2 -> {
                    if (file.isFile()) {
                        ois = new ObjectInputStream(new FileInputStream(file));
                        al = (ArrayList<Ticket>) ois.readObject();
                        ois.close();

                        boolean found = false;
                        System.out.print("Enter PNR to Check : ");
                        String pnr = s.nextLine();
                        System.out.println("------------------------------------------");
                        li = al.listIterator();
                        while (li.hasNext()) {
                            Ticket e = (Ticket) li.next();
                            int tempstr = stringCompare(e.pnr, pnr);
                            if (tempstr == 0) {
                                System.out.println(e);
                                found = true;
                            }
                        }
                        if (!found) {
                            System.out.println("Record not found....!");
                        }
                        System.out.println("------------------------------------------");
                    } else {
                        System.out.println("Data not found.......!");
                    }
                }
                case 3 -> System.out.println("Coming soon....!");
                case 4 -> {
                    if (file.isFile()) {
                        ois = new ObjectInputStream(new FileInputStream(file));
                        al = (ArrayList<Ticket>) ois.readObject();
                        ois.close();

                        boolean found = false;
                        System.out.println("Enter PNR to Cancel : ");
                        String pnr = s.nextLine();
                        System.out.println("------------------------------------------");
                        li = al.listIterator();
                        while (li.hasNext()) {
                            Ticket e = (Ticket) li.next();
                            int tempstr = stringCompare(e.pnr, pnr);
                            if (tempstr == 0) {
                                li.remove();
                                found = true;
                            }
                        }
                        if (found) {
                            oos = new ObjectOutputStream(new FileOutputStream(file));
                            oos.writeObject(al);
                            oos.close();
                            System.out.println("PNR Cancelled successfully.......!");
                        } else {
                            System.out.println("Record not found....!");
                        }
                        System.out.println("------------------------------------------");
                    } else {
                        System.out.println("File is nit found.....!");
                    }
                }
                case 9 -> {
                    if (file.isFile()) {
                        ois = new ObjectInputStream(new FileInputStream(file));
                        al = (ArrayList<Ticket>) ois.readObject();
                        ois.close();

                        System.out.println("------------------------------------------");
                        li = al.listIterator();
                        while (li.hasNext())
                            System.out.println(li.next());
                        System.out.println("------------------------------------------");
                    } else {
                        System.out.println("File is nit found.....!");
                    }
                }
            }
        } while (choice != 0);

    }

    public static int stringCompare(String str1, String str2)
    {
        int l1 = str1.length();
        int l2 = str2.length();
        int lmin = Math.min(l1, l2);
        for (int i = 0; i < lmin; i++) {
            int str1_ch = (int)str1.charAt(i);
            int str2_ch = (int)str2.charAt(i);
            if (str1_ch != str2_ch) {
                return str1_ch - str2_ch;
            }
        }
        if (l1 != l2) {
            return l1 - l2;
        }
        // If none of the above conditions is true,
        // it implies both the strings are equal
        else {
            return 0;
        }
    }
}