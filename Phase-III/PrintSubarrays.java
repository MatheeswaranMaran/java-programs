class PrintSubarrays {
    public static void main(String[] args) {
        int[] arr = {5,6,7,-3,-13,8,-2,5,-6,7,-11,3,10,-10,-6,-10,-10,7,2};
        for(int i =0;i<arr.length;i++){
            for(int j =i;j<arr.length;j++){
                for(int k =i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}