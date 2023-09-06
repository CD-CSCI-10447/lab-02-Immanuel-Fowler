package edu.desu.codingchallenge;

public class Problem {

    /* com.codingchallenge.Problem 13
    XX marks the spot! Treasure hunters are on the lookout for anywhere that contains "xx".
    They want to know how many spots contain "xx" so they can know if they need to split up to reach all
    the spots before nightfall.

    The hunters need you to count the number of "xx" in the given locations. Overlapping is allowed, so
    "xxx" contains 2 "xx".

    Return the number of "xx".

    Example:
    doubleXX("abcxx") --> 1
    doubleXX("xxx") --> 2
    doubleXX("xxxx") --> 3
     */
    public static Integer doubleXX(String x) {
        int count = 0;

        for(int i = 1; i<x.length(); i++){
            if(x.charAt(i-1) == "x".charAt(0) && x.charAt(i) == "x".charAt(0)){
                count++;
            }
        }
        return count;
    }


    /* com.codingchallenge.Problem 14
    A word explosion mystery has occurred. To figure out the mystery and how a word explodes into a reoccurring new one,
    you will only be provided an example with no context clues.

    A non-empty string such as "Code" is turned into "CCoCodCode".

    Return a new string similar to the string given above.

    Example:
    mysteryExplosion("Code") --> "CCoCodCode"
    mysteryExplosion("abc") --> "aababc"
    mysteryExplosion("ab") --> "aab"
     */
    public static String mysteryExplosion(String word) {
        String result = "";
        int count = word.length()-1;

        for(int i = 0; i < word.length(); i++){
            result += word.substring(0, word.length()-count);
            count--;
        }
        return result;
    }


    /* com.codingchallenge.Problem 15
    Were on a time crunch and were looking for teams of 9 players only. The top teams will be ranked within the top 4 spots.
    Only teams of 9 that are ranked within the top four are allowed to be taken into the next tournament.

    We need for you to evaluate the set of given teams and there team player amount, the array length may be less than 4.

    Return true if one of the top 4 teams in the array set has a team of 9 players.

    Example:
    topTeams([1, 2, 9, 3, 4]) --> true
    topTeams([1, 2, 3, 4, 9]) --> false
    topTeams([1, 2, 3, 4, 5]) --> false
     */
    public static Boolean topTeams(int[] team) {
        for(int i = 0; i<3; i++){
            if(team[i] == 9){
                return true;
            }
        }

        return false;
    }


    /* com.codingchallenge.Problem 16
    X'tinction has come about for the letter 'x'. It's about that time to let all the x's go.
    There are two exceptions to removing an 'x':
        1st: an 'x' at the very start should not be removed
        2nd: an 'x' at the very end should not be removed

    Return a new "string" version where all the 'x' have been removed for good besides the 2 rules.

    Example:
    xtinction("xxHxix") --> "xHix"
    xtinction("abxxxcd") --> "abcd"
    xtinction("xabxxxcdx") --> "xabcdx"
     */
    public static String xtinction(String x) {
        String result = "";

        for(int i = 0; i<x.length(); i++){
            if(i == 0){
                result += x.charAt(i);
            }else if(i == x.length() -1){
                result += x.charAt(i);
            }else{
                if(!(x.charAt(i)== "x".charAt(0))){
                    result += x.charAt(i);
                }
            }
        }

        return result;
    }


    /* com.codingchallenge.Problem 17
    Agent 66 has been on hide out for a couple of months now, due to a last assignment going wrong on his part.
    Agent 66 also goes by agent 67; we need you to be on the lookout to see if he returns within a group of other agents.

    A given array of "code" agent numbers will be given to you to evaluate. Doing the below task will allow us to know
    if he appears based off his number or other code name number being seen.

    Return the number of times that two 6's are next to each other, also count instances where the second "6" is actually a 7.

    Example:
    agent667([6, 6, 2]) --> 1
    agent667([6, 6, 2, 6]) --> 1
    agent667([6, 7, 2, 6]) --> 1
     */
    public static Integer agent667(int[] codes) {
        int count = 0;

        for(int i = 1; i<codes.length; i++){
            if(codes[i-1] == 6 && (codes[i] == 6 || codes[i] == 7)){
                count++;
            }
        }

        return count;
    }
}