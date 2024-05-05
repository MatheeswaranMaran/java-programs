class SpiralMatrix {
    static void spiralMatrix(int bottom, int right, int a[][]){
        int i,top=0,left=0;
        while(top<bottom && left<right){
            for(i=left;i<right;i++){
                System.out.print(a[top][i] + " ");
            }
            top++;
            for(i=top;i<bottom;i++){
                System.out.print(a[i][right-1]+" ");
            }
            right--;
            if(top<bottom){
                for(i=right-1;i>=left;i--){
                    System.out.print(a[bottom-1][i]+" ");
                }
                bottom--;
            }
            if(left<right){
                for(i=bottom-1;i>=top;i--){
                    System.out.print(a[i][left]+" ");
                }
                left++;
            }
        }
    }
    public static void main(String[] args) {
        int[][] array={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        spiralMatrix(5,5,array);
    }
}