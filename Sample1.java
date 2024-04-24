class Test<T>{
    T obj;
     Test(T obj){
          this.obj = obj;
     }
     public T getObject() {
         return this.obj;
     }
}
public class Sample1 {
  public static void main (String[]args) {
      Test<String> sobj = new Test<String>("Good morn");
      System.out.println(sobj.getObject());