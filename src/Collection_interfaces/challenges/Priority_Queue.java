package Collection_interfaces.challenges;

import java.util.Comparator;
import java.util.PriorityQueue;

class Priority_Queue {

    public static void main(String[] args) {
        // PriorityQueue with custom comparator for grades
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getGrade() - s2.getGrade(); // ascending order by grade
            }
        });

        queue.offer(new Student("Avi", 'A'));
        queue.offer(new Student("John", 'C'));
        queue.offer(new Student("Mike", 'B'));

        while (!queue.isEmpty()) {
            Student s = queue.poll();
            System.out.println(s.getName() + " - " + s.getGrade());
        }
    }

    private static class Student {
        private final String name;
        private final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }
    }
}
