package 算法_二.进阶数据结构.HashMap;

public class Minium_window_substring {
    public static void main(String[] args) {

    }
    public String minWindow(String s,String t){
        int []pattern= new int [256];
        int []text   = new int [256];//以后都写成256
        for(int i=0;i<t.length();i++){
            pattern[t.charAt(i)]++;
        }
        int start=0,end=0,minstart=0,minend=0;
        int minlen=s.length()+1;
        int count=t.length();
        while(true){
         if(end<s.length()){
             text[s.charAt(end)]++;
             if(text[s.charAt(end)]<=pattern[s.charAt(end)]){//这里大于等于如果调转应该是小于等于，必须有等于
                 count--;
             }
         }else{break;}
         if( count==0){
             while(text[s.charAt(start)]>pattern[s.charAt(start)]){
                 text[s.charAt(start)]--;
                 start++;

             }
             if(minlen>end-start+1){//这里的end是算做字符串里的，所以要加1
                 minlen=end-start+1;
                 minstart=start;
                 minend=end;
             }//这里这个if不能放在while循环里，因为text[s.charAt(start)]>pattern[s.charAt(start) 这条判断循环的语句
             //如果你放入这个循环最后end和start会少一步
         }
         end++;
        }
        if(count==0)
        {return s.substring(minstart,minend+1);}//这里的end是算做字符串里的，所以要加1
        else{return " ";}
    }
}
