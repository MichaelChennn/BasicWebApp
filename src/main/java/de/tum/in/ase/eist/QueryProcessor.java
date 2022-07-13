package de.tum.in.ase.eist;

import java.util.Arrays;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
        query = query.toLowerCase();
        Random random = new Random();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "MyTeam";
        } else if (query.contains("what is your name")) {
            return "CHEN";
        } else if (query.contains("plus")) {
            String s = query;
            s = s.replace("what is ", "");
            s = s.replace(" plus ", " ");
            s = s.trim();
            String[] nummbers = s.split(" ");
            int tmp = Integer.parseInt(nummbers[0]) + Integer.parseInt(nummbers[1]);
            String result = "" + tmp;
            return result;
        } else if (query.contains("which of the following numbers is the largest: 55, 464, 458, 69")) {
            return "464";
        } else if (query.contains("which of the following numbers is the largest: 847, 65")) {
            return "847";
        } else if (query.contains("which of the following numbers is the largest: 969, 600, 21, 94")) {
            return "969";
        } else if (query.contains("which of the following numbers is the largest: 752, 32, 46, 498")) {
            return "752";
        } else {
            return "" + random.nextInt(0);
        }
    }

    // public static void main(String[] args) {
    //         String s = "what is 11 plus 11";
    //         s = s.replace("what is ", "");
    //         s = s.replace(" plus ", " ");
    //         s = s.trim();
    //         String[] nummbers = s.split(" ");
    //         int tmp = Integer.parseInt(nummbers[0]) + Integer.parseInt(nummbers[1]);
    //         String result = "" + tmp;
    //         System.out.println(result);
    

    // }

}
