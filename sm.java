class sm{
    public static void main(String args[])
    {
        String s="HELLO-KEC";
        String s1="ECE";
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s==s1);
        System.out.println(s.length());
        System.out.println(s.isEmpty());
        System.out.println(s.isBlank());
        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s1));
        System.out.println(s.compareTo(s1));
        System.out.println(s.contains("CE"));
        System.out.println(s.charAt(0));
        System.out.println(s.substring(1,4));
        System.out.println(s.indexOf("E"));
        System.out.println(s.lastIndexOf("O"));
        System.out.println(s.startsWith("KEC"));
        System.out.println(s1.endsWith("ECE"));
        System.out.println(s.replace("EL","LE"));
        System.out.println(s.trim());
        System.out.println(s.strip());
        System.out.println(s.length());
        System.out.println(s.repeat(2));
        System.out.println(s.toUpperCase());
        System.out.println(s1.toLowerCase());


    }
}