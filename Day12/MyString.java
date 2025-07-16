import java.util.Scanner;

public class MyString {
    public static void main(String[] args) {
        // String name = "Mukesh";
        // System.out.println(name);

        // int arr[] = new int[3];
        // arr[0] = 4;
        // System.out.println(arr[0]);

        // int brr[] = arr;
        // brr[0] = 7;
        // System.out.println(brr[0]);
        
        // System.out.println(arr[0]);
        
        // int crr[] = new int[4];
        // crr[0] = 6;

        // System.out.println(arr[0]);
        // System.out.println(brr[0]);
        // System.out.println(crr[0]);

        // String name1 = "Mukesh";
        // System.out.println(name1);

        // String name2 = name1;
        // name2 = "Mukku";

        // System.out.println(name1);
                
        // String name3 = "Choudharyji";

        // System.out.println(name1);
        // System.out.println(name2);
        // System.out.println(name3);

        // ==
        // String name1 = "Mukesh";
        // String name2 = "Mukesh";
        // String name3 = "Mukesh";
        // String name4 = name1;

        // System.out.println(name1 == name2);
        // System.out.println(name2 == name3);
        // System.out.println(name3 == name4);
        // System.out.println(name4 == name2);
        // System.out.println(name1 == name4);

        // int name1[] = new int[3];
        // int name2[] = new int[3];
        // int name3[] = new int[3];
        // int name4[] = name1;

        // System.out.println(name1.equals(name2));
        // System.out.println(name2.equals(name3));
        // System.out.println(name3.equals(name4));
        // System.out.println(name4.equals(name2));
        // System.out.println(name1.equals(name4));

        // System.out.println(name1 == name2);
        // System.out.println(name2 == name3);
        // System.out.println(name3 == name4);
        // System.out.println(name4 == name2);
        // System.out.println(name1 == name4);

        // String name1 = new String("Mukesh");
        // String name2 = new String("Mukesh");
        // String name3 = new String("Mukesh");
        // String name4 = name1;

        // System.out.println(name1 == name2);
        // System.out.println(name2 == name3);
        // System.out.println(name3 == name4);
        // System.out.println(name4 == name2);
        // System.out.println(name1 == name4);

        // System.out.println(name1.equals(name2));
        // System.out.println(name2.equals(name3));
        // System.out.println(name3.equals(name4));
        // System.out.println(name4.equals(name2));
        // System.out.println(name1.equals(name4));

        Scanner obj = new Scanner(System.in);
        // System.out.println("Enter a word : ");
        // String word = obj.next();
        // System.out.println("Enter a line : ");
        // String line = obj.nextLine();
        // System.out.println("Enter a line : ");
        // String line = obj.nextLine();
        // System.out.println("Enter a word : ");
        // String word = obj.next();

        // System.out.println(" Word is "+ word);
        // System.out.println(" Line is "+ line);

        // String str = "Mukesh Choudhary";
        // System.out.println(str.toLowerCase());
        // System.out.println(str);
        // System.out.println(str.toUpperCase());
        // System.out.println(str);

        // System.out.println(str.charAt(0));

        // System.out.println(str.indexOf('C'));
        // System.out.println(str.indexOf('c'));

        // System.out.println(str.lastIndexOf('h'));

        // System.out.println(str.length());

        // // to convert char array
        // char ch[] = str.toCharArray();
        // for(int i=0; i<ch.length; i++){
        //     System.out.print(ch[i] + " ");
        // }

        // System.out.println("MUKESH".compareTo("MUK"));
        // System.out.println("MUK".compareTo("MUKESH"));
        // System.out.println("MUKESH".compareTo("MUKESH"));
        // System.out.println("MUK".compareTo("ESH"));

        // System.out.println("       Mukesh          ");
        // System.out.println("       Mukesh          ".trim());

        // System.out.println("Mukesh Choudhary".startsWith("Mukesh"));
        // System.out.println("Mukesh Choudhary".startsWith("mukesh"));
        // System.out.println("Mukesh Choudhary".startsWith("MuKesh"));
        
        // System.out.println("Mukesh Choudhary".endsWith("ary"));
        // System.out.println("Mukesh Choudhary".endsWith("ary "));

        // System.out.println("Mukesh".substring(3,5));


        // String myLocations = "hyderabad, chennai, bangaluru, noida, pune";

        // String myLocList[] = myLocations.split(",");
        // for(int i=0; i<myLocList.length; i++){
        //     System.out.println(myLocList[i]);
        // }

        String email1 = "mukeshch1767@gmail.com";
        String email2 = "random1234@hotmail.com";

        String emailArr[] = email2.split("@");
        String lastPart = emailArr[emailArr.length-1];
        int dotIndex = lastPart.lastIndexOf('.');
        System.out.println(lastPart.substring(0, dotIndex));

        StringBuilder name1 = new StringBuilder("Mukesh");
        StringBuilder name2 = new StringBuilder("Mukesh");
        StringBuilder name3 = new StringBuilder("Mukesh");
        StringBuilder name4 = name1;

        System.out.println(name1 == name2);
        System.out.println(name2 == name3);
        System.out.println(name3 == name4);
        System.out.println(name4 == name2);
        System.out.println(name1 == name4);

        name4.append("Choudhary");

        System.out.println(name1 == name2);
        System.out.println(name2 == name3);
        System.out.println(name3 == name4);
        System.out.println(name4 == name2);
        System.out.println(name1 == name4);

    }
}
