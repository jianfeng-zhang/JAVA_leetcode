package 打卡;

public class 二维数组的遍历 {
    public static void main(String[] args) {
        int [][]boxTypes = {{1,3},{2,2},{3,1},{4,8}};
        int truckSize = 4;
        for(int []i:boxTypes){
            for(int a:i){
                System.out.print(a);
            }
            System.out.println(" ");
        }
        //boxTypes[0]表示第一个一维数组，
        for(int i:boxTypes[0]){
            System.out.print(i);
        }//输出的就是1和3
        System.out.println("---");
        System.out.println(boxTypes.length);//输出3意思就是这个二维数组里面有几个1维数组
        //遍历二维数组
        System.out.println("--");
        for(int i=0;i<boxTypes.length;i++){
            for(int j=0;j<boxTypes[i].length;j++){//这里放的是数组[i]的长度
                System.out.print(boxTypes[i][j]);
            }
        }
        //二维数组排序
        for(int j=0;j<boxTypes.length-1;j++){
        for(int i=0;i<boxTypes.length-1-j;i++){
            if(boxTypes[i][1]<boxTypes[i+1][1]){
                int []temp=boxTypes[i];
                boxTypes[i]=boxTypes[i+1];
                boxTypes[i+1]=temp;
            }
        }
        }
        System.out.println("--");
        for(int i=0;i<boxTypes.length;i++){
            for(int j=0;j<boxTypes[i].length;j++){//这里放的是数组[i]的长度
                System.out.print(boxTypes[i][j]);
            }
        }
        System.out.println("------");
        int res=truckSize;
        int r=0;

        for(int i=0;i<boxTypes.length;i++){
            if(boxTypes[i][0]>=res){
                r= res*boxTypes[i][1];
            }else {
                r=(res-boxTypes[i][0])*boxTypes[i][1];
                res=res-boxTypes[i][0];


            }

        }
        System.out.println(r);



    }
}
