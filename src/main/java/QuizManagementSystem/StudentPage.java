package QuizManagementSystem;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class StudentPage {
    public static void studentFeature() throws IOException, ParseException {
        JSONArray arr = readJson();
        Random random = new Random();
        Scanner sc=new Scanner(System.in);
        int total=0;
        HashSet<JSONObject>hash=new HashSet<>();
        if(arr.size()>10)
        {
        while(hash.size()<10){
            int index = random.nextInt(arr.size());
            JSONObject obj = (JSONObject) arr.get(index);
            if(hash.add(obj))
            {
            System.out.println(obj.get("question"));
            System.out.println("1."+obj.get("option 1"));
            System.out.println("2."+obj.get("option 2"));
            System.out.println("3."+obj.get("option 3"));
            System.out.println("4."+obj.get("option 4"));
            String ans=sc.nextLine();
           if(correct(ans,obj))
           {
               total++;
           }
        }}}
        else {
            for (int i = 0; i < 10; i++) {
                int index = random.nextInt(arr.size());
                JSONObject obj = (JSONObject) arr.get(index);

                System.out.println(obj.get("question"));
                System.out.println("1." + obj.get("option 1"));
                System.out.println("2." + obj.get("option 2"));
                System.out.println("3." + obj.get("option 3"));
                System.out.println("4." + obj.get("option 4"));
                String ans = sc.nextLine();
                if (correct(ans, obj)) {
                    total++;
                }
            }
        }
        if(total>=8 && total<=10)
        {
            System.out.println("Excellent! You have got "+total+" out of 10");
        }
        else if(total>=5 && total<=7)
        {
            System.out.println("Good. You have got "+total+" out of 10");
        }
        else if(total>=3 && total<=4)
        {
            System.out.println("Very poor! You have got "+total+" out of 10");
        }
        else if(total>=0 && total<=2)
        {
            System.out.println("Very sorry you are failed. You have got "+total+" out of 10");
        }
    }
    public static JSONArray readJson() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        JSONArray arr = (JSONArray) parser.parse(new FileReader("./src/main/resources/quiz.json"));
        return arr;
    }
    public static boolean correct(String ans,JSONObject obj)
    {
       if(ans.equals(obj.get("answerkey")))
        {
            return true;
        }
        return false;
    }
}
