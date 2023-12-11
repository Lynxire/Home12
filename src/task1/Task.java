package task1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task {
    String reg = "\\b[a-zа-яё]{2,6}\\b";
    Scanner scanner = new Scanner(System.in);
    String tex = scanner.nextLine();
    public void foundReg(){
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(tex);
        while (matcher.find()){

                System.out.println(matcher.group());


        }

    }

}
