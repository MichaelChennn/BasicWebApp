package de.tum.in.ase.eist;

import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
        query = query.toLowerCase();
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
            s = s.substring(10);
            s = s.replace("what is ", "");
            s = s.replace(" plus ", " ");
            s = s.trim();
            String[] nummbers = s.split(" ");
            int tmp = Integer.parseInt(nummbers[0]) + Integer.parseInt(nummbers[1]);
            String result = "" + tmp;
            return result;
        } else if (query.contains("largest")) {
            String s = query;
            s = s.substring(10);
            s = s.replace("which of the following numbers is the largest: ", "");
            s = s.replace(", ", " ");
            s = s.trim();
            String[] nummbers = s.split(" ");
            int result = Integer.parseInt(nummbers[0]);
            for (int i = 1; i < nummbers.length; i++) {
                if (Integer.parseInt(nummbers[i]) > result) {
                    result = Integer.parseInt(nummbers[i]);
                }
            }
            String tmp = "" + result;
            return tmp;
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
            String s = "6861f020: which of the following numbers is the largest: 914, 61";
            // String s1 = "what is 8 plus 4";
            // s = s.replace("which of the following numbers is the largest: ", "");
            // s = s.replace(", ", " ");
            // s = s.trim();
            // String[] nummbers = s.split(" ");
            // int result = Integer.parseInt(nummbers[0]);
            // for (int i = 1; i < nummbers.length; i++) {
            //     if (Integer.parseInt(nummbers[i]) > result) {
            //         result = Integer.parseInt(nummbers[i]);
            //     }
            // }
            // String tmp = "" + result;
            //QueryProcessor queryProcessor = new QueryProcessor();
            //System.out.println(queryProcessor.process(s));
            // System.out.println(queryProcessor.process(s1));
    }

}
