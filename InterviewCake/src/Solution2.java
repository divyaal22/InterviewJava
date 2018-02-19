class Solution2 {

    public static int[] getProductsOfAllIntsExceptAtIndex(int[] intArray) {
        
        int[] result = new int[intArray.length];
        

        for(int i=0;i<intArray.length;i++)
        {
            int j=0,test=1;
           while(j<intArray.length){
               if(i!=j)  
               {
                    test = test * intArray[j];
               }
               j++;
           }
           result[i]=test;
        }
        

        return result;
    }

    public static void main(String[] args) {
        int[] intArray = {1, 7, 3, 4};
        int[] result = getProductsOfAllIntsExceptAtIndex(intArray);
        for (int value : result) {
            System.out.printf("%d ", value);
        }
        System.out.println();
    }
}