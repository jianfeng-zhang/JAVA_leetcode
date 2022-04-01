package 算法_二.进阶数据结构.图;

import java.util.ArrayList;
import java.util.List;

public class School_Calander {
    public static void main(String[] args) {

    }
    public boolean canFinish(int numCourses , int [][]prerequisites){
        List<List<Integer>> graph=new ArrayList<List<Integer>>();
        for(int i=0;i<numCourses;i++){
            graph.add(new  ArrayList<Integer>());
        }
        boolean available=false;
        int [] prenum=new int [numCourses];
        for(int i=0;i<prerequisites.length;i++){
            graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
            prenum[prerequisites[i][0]]++;
        }
        for(int i=0;i<numCourses;i++){
            available=false;
            for(int j=0;j<numCourses;j++){
                if(prenum[j]==0){
                    for(int k:graph.get(j)){//这里的graph。get(j )表示的是第j行数组，
                        //而这里的k表示的是数组里的元素表示的是第几个课而不是数量
                        //prenum数组存的才是数量以用prenum[k]
                        prenum[k]--;
                    }
                    available=true;
                    prenum[j]=-1;//因为前面让这个元素的数组内容都等于0了。所以到这里的元素都是0
                    //而每次课程只用上一遍就好，所以让prenum[j]=-1；一防重复
                    break;
                }
            }
            if(!available){
                return false;
        }


        }return true;
    }
}
