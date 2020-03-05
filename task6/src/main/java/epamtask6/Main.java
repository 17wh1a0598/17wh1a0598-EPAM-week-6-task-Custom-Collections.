package epamtask6;

public class Main
{
    public static void main(String[] args) 
    {
        CustomLists<String> list = new CustomLists<>();
        list.add("Life");
        list.add("is");
        list.add("beautiful");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println( list.get(0) );
        System.out.println( list.get(1) );
        System.out.println(list.size());
    }
}