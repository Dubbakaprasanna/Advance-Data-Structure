class Test<T>{
    T obj;
     Test(T obj){
          this.obj = obj;
     }
     public T getObject() {
         return this.obj;
     }
}
public class Sample2 {
  public static void main (String[]args) {
      Test<Integer> sobj = new Test<Integer>("Good morn");
      System.out.println(sobj.getObject());