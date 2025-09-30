package QuizManagementSystem;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LoginFlow {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your username");
        String userName = sc.next();
        System.out.print("Enter password");
        String password = sc.next();
        if (verifyUser(userName, password).equals("admin")) {
            System.out.println("Welcome admin! Please create new questions in the question bank.");
            AdminPage.AdminFeature();
        }
        else if (verifyUser(userName, password).equals("salman")){
            System.out.println("Welcome salman to the quiz! We will throw you 10 questions. Each MCQ mark is 1 and no negative marking. Are you ready? Press 's' to start.");
            String input=sc.next();
            if(input.equals("s")) {
                StudentPage.studentFeature();
            }
        }
        else
        {
            System.out.println("User not found");
        }

    }

    public static JSONArray readJson() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        JSONArray arr = (JSONArray) parser.parse(new FileReader("./src/main/resources/users.json"));
        return arr;
    }

    public static String verifyUser(String userName, String password) throws IOException, ParseException {
        JSONArray arr = readJson();
        for (Object obj : arr) {
            JSONObject userObj = (JSONObject) obj;
            String actualName = userObj.get("username").toString();
            String actualPassword = userObj.get("password").toString();
            if (actualName.equals(userName) && actualPassword.equals(password)) {
                return actualName;
            }

        }
        return "-1";
    }

}
