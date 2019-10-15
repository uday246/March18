package Mar15th;

import java.util.LinkedList;
/*
 * here we are using generics conect <E>. it usefull to accept any kind of data type,it will not restrict us to work with single type. for our hashtable we can insert any type of data
 * 
 * * 
 * 
 * 
 * 
 */
interface HTable<E> {

    public void add(E element);

    public boolean contains(Object o);

    public void print();

}
public class Hashtable<E> implements HTable<E>{
	LinkedList[] list = null;

	public Hashtable() {
		list = new  LinkedList[15];
		for(int i=0;i<15;i++){
			list[i] =  new LinkedList<E>();
		}
	}
	/*
	 * creating the array of linked list with given size
	 */
	public Hashtable(int size) {
		list = new  LinkedList[size];
		for(int i=0;i<size;i++){
			list[i] =  new LinkedList<E>();
		}
	}

/*
 * getting the hashcode, Math.abs() will make the number positive if we get negative number
 * by performing the % we will get the index within our array size so that's why we are doing % list.length
 * we will get random index we will insert the object at that location
 * 
 */
	@Override
	public void add(E ele) {
		int index = 0;
		index = Math.abs(ele.hashCode())%list.length;
		list[index].add(ele);
	}
/*
 * similary we will get the index here for the same object so we will get the linked list at that location we will check whether our object is present in that list or not
 * 
 */
	@Override
	public boolean contains(Object aO) {
		int index = Math.abs(aO.hashCode())%list.length;
		return list[index].contains(aO);
		
	}

	@Override
	public void print() {
		for(LinkedList<E> temp:list){
			if(temp.size()!=0)
			System.out.println(temp);
		}
		
	}
	public static void main(String[] args) {
		Hashtable<String> h = new Hashtable<String>();

        String s = "happy meals are quite tasty and make round children";

        String[] a = s.split(" ");

        for(String w : a) {

            h.add(w);

        }

        System.out.println(h.contains("tasty"));

        System.out.println(h.contains("fruity"));

        h.print();
	}
}