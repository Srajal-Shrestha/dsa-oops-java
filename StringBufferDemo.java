public class StringBufferDemo {
    public static void main (String [] args) {
        StringBuffer buff = new StringBuffer("Danfe Collage");
        System.out.println("Applying different methods avilable in string buffer");
        System.out.println("Length =" + buff.length());
        System.out.println("Capacity =" + buff.capacity());
        System.out.println("Character at index 3 = " + buff.charAt(3));
        System.out.println("Substring = " + buff.substring(6, 13));
        System.out.println("Insert  = " + buff.insert(6,"is best "));
        System.out.println("Append = "+ buff.append(" at Sinamangal, Kathmandu"));
        System.out.println("Delete = "+ buff.delete(0, 5));
        System.out.println("Reverse = "+ buff.reverse());
        
    }
}