package 打卡;

public class 二维数组遍历_简洁 {
    public static void main(String[] args) {
        int [][]boxTypes = {{5,10},{2,5},{4,7},{3,9}};


        int truckSize = 4;
        for(int j=0;j<boxTypes.length-1;j++){
            for(int i=0;i<boxTypes.length-1-j;i++){
                if(boxTypes[i][1]<boxTypes[i+1][1]){
                    int []temp=boxTypes[i];
                    boxTypes[i]=boxTypes[i+1];
                    boxTypes[i+1]=temp;
                }
            }
        }//排序
        System.out.println("--");
        for(int i=0;i<boxTypes.length;i++){
            for(int j=0;j<boxTypes[i].length;j++){//这里放的是数组[i]的长度
                System.out.print(boxTypes[i][j]);
            }
        }
        System.out.println(" ---");
        int res=truckSize;
        int r=0;
for(int i=0;i<boxTypes.length;i++) {


        if(boxTypes[i][0]>=res){
            r= r+res*boxTypes[i][1];
        }else {
            r=r+(boxTypes[i][0])*boxTypes[i][1];
            res=res-boxTypes[i][0];
    }
}System.out.println("");
        System.out.println(r);





    }
}
