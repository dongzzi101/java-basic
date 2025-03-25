package class1;

public class ClassStart2 {

    public static void main(String[] args) {
        String[] studentsName = {"학생1", "학생2", "학생3"};
        int[] studentsAge = {15, 13, 16};
        int[] studentsGrade = {90, 80, 50};

        for (int i = 0; i < studentsName.length; i++) {
            System.out.println("이름: " + studentsName[i] + " 나이: " + studentsAge[i] + " 성적: " + studentsGrade[i]);
        }


    }
}
