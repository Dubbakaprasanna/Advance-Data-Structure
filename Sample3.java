public class Sample3{
   public static void main(String[]args) {
         ArrayList<String> a1 = new ArrayList<>();
         a1.add("Apple");
         a1.add("Banana");
         a1.add("Cherry");
         System.out.println(a1.get(0));
         a1.remove(0);
         System.out.println("After removing");
         for(String i : a1) {
              System.out.println(i);
}
