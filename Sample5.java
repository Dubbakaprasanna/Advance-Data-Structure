import java.util.ArrayList;
interface PositionalList<E> {
    void insert(E element ,int index);
    void remove(int index);
    void set(int index, E element);
    E get(int index);
    boolean isEmpty();
    int size();
}
class ArrayPositionalList<E> implements positionalList<E>{
     private ArrayList<E> list;
     public ArrayPositionalList(){
        list = new ArrayList<>();
}
@override
public void insert(E element,int index){
   list.add(index, element);
}
@override
public void remove(int index){
   list.remove(index);
}
public class Sample5{
      public static void main(String[]args){
          positionalList<String> list = new ArrayListPositionalList
          list.insert("a",0);
          list.insert("b",1);
          list.insert("c",2);
      