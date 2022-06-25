public class anoymous {
    public int  arrret(int arr[])
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                sum=sum+arr[i];
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        anoymous a1=new anoymous();
        int res=a1.arrret(new int[]{10,1,3,5,8,15,20});
        System.out.println(res);
    }

}

    
