package MySelfStudying.stirng_builder;

public class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        // 1 // .append()
        sb.append("Java");
        sb.append(sb);
        sb.append(9);
        sb.append('o');
        //sb.append("  ", 1,3);
        System.out.println(sb);

        // 2 // .insert()
        sb.insert(4,"  ");
        sb.insert(10,"  ");
        System.out.println(sb);

        // 3 // .replace()
        sb.replace(0,4,"Hello");
        System.out.println(sb);

        // 4 // .delete()
        sb.delete(11,15);
        System.out.println(sb);

        // 5 // .reverse()
        sb.reverse();
        System.out.println(sb);

        // 6 // .capacity()
        System.out.println(sb.capacity());

        // 7 // .ensureCapacity()
        sb.ensureCapacity(19);
        System.out.println(sb.capacity());

        // 8 ..
    }
}
