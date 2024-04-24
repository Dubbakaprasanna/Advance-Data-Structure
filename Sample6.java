public class Sample6{
   public static void main(String[] args) {
         ArrayList<String> a1 = new ArrayList<>();
         a1.add("Apple");
         a1.add("Banana");
         a1.add("Cherry");
         ArrayList<String> a2 = new ArrayList<>(a1);
         System.out.println("After Adding");
         a2.add("guava")
         for(String i : a2) {
              System.out.println(i);
}
