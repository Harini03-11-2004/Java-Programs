public class copy {
    
       public static void main(String args[]){
        constructor a = new constructor("harini");
        constructor a1 = new constructor(a);
        System.out.println(a.name);
        System.out.println(a1.name2);
    }
}
class constructor{
    String name;
    String name2;
    constructor(String nm){
        name=nm;
    }
    constructor(constructor j)
    {
        name2=j.name;
    }
}
