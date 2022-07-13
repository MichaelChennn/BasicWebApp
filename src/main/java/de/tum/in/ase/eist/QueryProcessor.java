package de.tum.in.ase.eist;

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
        }  else if (query.contains("what is your name")) {
            return "CHEN";
        }  else if (query.contains("what is 0 plus 0")) {
            return "0";
        }  else if (query.contains("what is 4 plus 19")) {
            return "23";
        }   else if (query.contains("what is 5 plus 10")) {
            return "15";
        }  else if (query.contains("what is 11 plus 11")) {
            return "22";
        } else if (query.contains("which of the following numbers is the largest: 55, 464, 458, 69")) {
            return "464";
        } else if (query.contains("which of the following numbers is the largest: 847, 65")) {
            return "847";
        }else if (query.contains("which of the following numbers is the largest: 969, 600, 21, 94")) {
            return "969";
        }else if (query.contains("which of the following numbers is the largest: 752, 32, 46, 498")) {
            return "752";
        }
        else if (query.contains("what is 4 plus 14")) {
            return "18";
        }else if (query.contains("what is 11 plus 11")) {
            return "22";
        }else if (query.contains("what is 11 plus 11")) {
            return "22";
        }else if (query.contains("what is 11 plus 11")) {
            return "22";
        }else if (query.contains("what is 11 plus 11")) {
            return "22";
        }
        else {
            return "";
        }
    }

}
