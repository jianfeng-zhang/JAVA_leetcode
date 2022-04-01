package 打卡;

import java.util.HashMap;
import java.util.Map;

public class _0724_953字典顺序 {
    public static void main(String[] args) {
        String[] words = {"hello","leetcode"};
        String order =  "hlabcdefgijkmnopqrstuvwxyz";
        System.out.println(isAlienSorted(words,order));
    }


        public static boolean isAlienSorted (String[]words, String order){



            Map<Character, Integer> m = new HashMap<>();
            for (int i = 0; i < order.length(); i++) {
                m.put(order.charAt(i), i);
            }


            for(int i=0;i<words.length-1;i++){

                for(int j=0;j<words[i].length();j++){
                    if(j>words[i+1].length()-1){
                        return false;
                    }

                    int a = m.get(words[i].charAt(j));
                    int b = m.get(words[i + 1].charAt(j));
                    if(a==b){continue;}
                    else {if(a>b){return false;}

                        break;

                }}
            }


            return true;
            }
        }








