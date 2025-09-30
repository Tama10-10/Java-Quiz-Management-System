package QuizManagementSystem;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AdminPage {
    public static void AdminFeature() throws IOException, ParseException {
        JSONArray arr=new JSONArray();
        arr=readJson();
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("Input your question");
            String question = sc.nextLine();
            System.out.println("Input option 1:");
            String option1 = sc.nextLine();
            System.out.println("Input option 2:");
            String option2 = sc.nextLine();
            System.out.println("Input option 3:");
            String option3 = sc.nextLine();
            System.out.println("Input option 4:");
            String option4 = sc.nextLine();
            System.out.println("What is the answer key?");
            String key = sc.nextLine();
            JSONObject obj=new JSONObject();
            obj.put("question",question);
            obj.put("option 1",option1);
            obj.put("option 2",option2);
            obj.put("option 3",option3);
            obj.put("option 4",option4);
            obj.put("answerkey",key);

             arr.add(obj);
            writeJson(arr);
            System.out.println("Saved successfully!");
            System.out.println("Do you want to add more questions? (press 's' to start, 'q' to quit)");
            String input=sc.nextLine();
            if(input.equals("q"))
            {
                break;
            }
            else if(input.equals("s"))
            {
                continue;
            }
        }

    }
    public static void writeJson(JSONArray arr) throws IOException, ParseException {

        FileWriter writer=new FileWriter("./src/main/resources/quiz.json");
        writer.write(arr.toJSONString());
        writer.flush();
        writer.close();
    }
    public static JSONArray readJson() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        JSONArray arr = (JSONArray) parser.parse(new FileReader("./src/main/resources/quiz.json"));
        return arr;
    }

}
