import java.util.*;

public class week12_task9_StudentMarksIndexingSystem {
    static class StudentRecord {
        String id;
        String name;
        double marks;

        StudentRecord(String id, String name, double marks) {
            this.id = id;
            this.name = name;
            this.marks = marks;
        }

        @Override
        public String toString() {
            return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
        }
    }

    private Map<String, StudentRecord> indexMap = new HashMap<>();

    public void addRecord(StudentRecord record) {
        indexMap.put(record.id, record);
    }

    public StudentRecord queryById(String id) {
        return indexMap.get(id);
    }

    public static void main(String[] args) {
        week12_task9_StudentMarksIndexingSystem system =
                new week12_task9_StudentMarksIndexingSystem();

        system.addRecord(new StudentRecord("S101", "Alice", 92.5));
        system.addRecord(new StudentRecord("S102", "Bob", 88.0));

        System.out.println("Query S101: " + system.queryById("S101"));
        System.out.println("Query S102: " + system.queryById("S102"));
    }
}

/*
Output:
Query S101: ID: S101, Name: Alice, Marks: 92.5
Query S102: ID: S102, Name: Bob, Marks: 88.0
*/
