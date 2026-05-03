 class libbooksort {
    public static void main(String args[])
    {
        int[] book = {501, 202, 403, 108, 306};

        for (int i = 0; i < book.length; i++) {
            for (int j = i + 1; j < book.length; j++) {
                if (book[i] > book[j]) {
                    int temp = book[i];
                    book[i] = book[j];
                    book[j] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");

        for (int i = 0; i < book.length; i++) {
            System.out.print(book[i] + " ");
    }
}}
 
