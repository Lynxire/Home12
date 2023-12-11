package task2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

    String reg = "([a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\\.[a-zA-Z0-9_-]+)"; //mail
    String reg1 = "\\d{4}-\\d{4}-\\d{2}"; //document
    String reg2 = "\\(\\d{2}\\)\\d{3}-?\\d{4}"; //number
    Scanner scanner = new Scanner(System.in);
    String tex = scanner.nextLine();



    public void foundDoc(){
        Pattern pattern = Pattern.compile(reg);
        Pattern pattern1 = Pattern.compile(reg1);
        Pattern pattern2 = Pattern.compile(reg2);
        Matcher matcher = pattern.matcher(tex);
        Matcher matcher1 = pattern1.matcher(tex);
        Matcher matcher2 = pattern2.matcher(tex);

        while (matcher.find()){

            System.out.println("mail = " + matcher.group() );
        }
        while (matcher1.find()){
            System.out.println("document = " + matcher1.group());
        }
        while (matcher2.find()){
            System.out.println("number = " + matcher2.group());
        }
    }
}
