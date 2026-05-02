class strbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        System.out.println(sb);
        char ch[] = {'h','a','p','p','y'};
        for(int i=0;i<ch.length;i++){
            sb.append(ch[i]);   
        }
        System.out.println(sb);
        sb.replace(0,5,"hello girls");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.insert(6,"and");
        System.out.println(sb);
        sb.delete(6,9);
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        StringBuilder sb2 = new StringBuilder("  Hello girls   ");
        System.out.println(sb2.capacity());
        sb2.trimToSize();
        System.out.println(sb2.capacity());


    }
}
