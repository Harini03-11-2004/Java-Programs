 class manualcopy {
    public static void main(String[] args) {
        
            int[] prices={100,200,300,400};
            int[] backup=new int[4];
            for(int i=0;i<prices.length;i++)
            {
                backup[i]=prices[i];
            }
        System.out.println("copies prices: ");
        for(int i=0;i<backup.length;i++)
        {
            System.out.println(backup[i]);
        }
    }
    }
