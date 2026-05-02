class strbuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("");
        System.out.println(sb);
        char ch[] = {'h','a','p','p','y'};
        for(int i=0;i<ch.length;i++){
            sb.append(ch[i]);   
        }
        System.out.println(sb);
        sb.replace(0,5,"Coffee powder");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.insert(7,"and");
        System.out.println(sb);
        sb.delete(7,10);
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        StringBuffer sb2 = new StringBuffer("  coffee powder   ");
        System.out.println(sb2.capacity());
        sb2.trimToSize();
        System.out.println(sb2.capacity());



    }
}
