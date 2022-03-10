package interfaces;

 
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

 

public class HashLinkedSortedSet {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub

     HashSet h = new HashSet();
     h.add("aravind");
     h.add("vegi");
     h.add("chowdary");
     h.add("aravind");
     
//   in HashSet duplicates not allowed,insertion order is not mainted
     
     System.out.print(h);
     System.out.print(h.size());
     System.out.println(h.contains("chowdary"));
   
    
    LinkedHashSet l = new LinkedHashSet();
    
    l.add("aravind");
    l.add("vegi");
    l.add("chowdary");
    l.add("aravind");
//   in HashSet duplicates not allowed,insertion order is mainted
    
    System.out.println(l);
    
    SortedSet s = new TreeSet();
    s.add(101);
    s.add(103);
    s.add(102);
    s.add(107);
    s.add(105);
    s.add(109);
    
//   headSet,tailSet,first,last,subset
   
    System.out.println(s);
    System.out.println(s.first());
    System.out.println(s.tailSet(103));
    System.out.println(s.headSet(103));
    }

}