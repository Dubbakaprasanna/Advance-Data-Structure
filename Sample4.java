public class Sample4{
   public static void main(String[]args) {
         ArrayList<INteger> a1 = new ArrayList<>();
         a1.add(1);
         a1.add(0);
         a1.add(5);
         a1.add(4);
         System.out.println(a1.get(0));
         System.out.println(a1.get(1));
         System.out.println(a1.get(2));
         System.out.println(a1.get(3));
         a1.remove(2);
         for(INteger i : a1) {
              System.out.println(i);
}
