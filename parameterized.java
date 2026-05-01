class parameterized{
    public static void main(String args[]){
        constructor a = new constructor("harini");
        constructor a1 = new constructor("sri");
        System.out.println(a.name);
        System.out.println(a1.name);
    }
}
class constructor{
    String name;
    constructor(String nm){
        name=nm;
    }
}