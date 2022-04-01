import java.util.*;

public class Practice {
    public static void main(String[] args) {

    }
    public boolean  seecow(int course, int[][] prerequirement){
       List<List<Integer>> graph=new ArrayList<>();
       for(int i=0;i<course;i++){
           graph.add(new ArrayList<>());
       }
        boolean available=false;
       int [] prenum=new int [course];
       for(int i=0;i<course;i++){
           graph.get(prerequirement[i][1]).add(prerequirement[i][0]);
           prenum[prerequirement[i][0]]++;
       }
       for(int i=0;i<course;i++){
           available=false;
           for(int j=0;j<course;j++){
               if(prenum[j]==0){
                   for(int s:graph.get(j)){prenum[s]--;}
                   available=true;
                   prenum[j]=-1;
               }

           }
       }
       return available;

    }
}