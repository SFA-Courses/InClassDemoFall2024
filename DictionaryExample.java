import java.util.HashMap;

public class DictionaryExample {
    public static void main(String[] args) {
        HashMap<Integer, String> courses = new HashMap<>();

        // add courses to the dictionary
        courses.put(1302, "Principles");
        courses.put(2302, "Programming");
        courses.put(3302, "Data Structures");
        courses.put(2311, "Event Driven");
        courses.put(2314, "Architecture");
        courses.put(3333, "Discrete");

        // construction
        System.out.println(courses);

        // contains
        System.out.println("---------------CONTAINS");
        for (int i = 2000; i <= 3000; i++)
            if (courses.containsKey(i))
                System.out.println("Number: " + i + " Name " + courses.get(i));

        // remove
        System.out.println("---------------REMOVE");
        courses.remove(2314);

        // traverse
        for (Integer i : courses.keySet())
            System.out.println("Number: " + i + " Name " + courses.get(i));

        // traverse values
        for (String s : courses.values())
            System.out.println(s);

        // remove all
        courses.clear();
        System.out.println(courses);
    }
}