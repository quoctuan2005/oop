public class StudentManagement {
    private Student[] students = new Student[100];
    private int cnt;

    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    public void addStudent(Student newStudent) {
        if (cnt < 100) {
            students[cnt] = newStudent;
            cnt++;
        }
    }

    public String studentsByGroup() {
        StringBuilder res = new StringBuilder();
        int index = 1;
        String[] groups = new String[100];
        groups[0] = students[0].getGroup();

        for (int i = 1; i < cnt; i++) {
            String currentGroup = students[i].getGroup();
            boolean isNewGroup = true;

            for (int j = 0; j < index; j++) {
                if (groups[j].equals(currentGroup)) {
                    isNewGroup = false;
                    break;
                }
            }

            if (isNewGroup) {
                groups[index++] = currentGroup;
            }
        }

        for (int i = 0; i < index; i++) {
            res.append(groups[i]).append("\n");
            for (int j = 0; j < cnt; j++) {
                if (groups[i].equals(students[j].getGroup())) {
                    res.append(students[j].getInfo()).append("\n");
                }
            }
        }

        return res.toString();
    }

    public void removeStudent(String id) {
        int index = -1;

        for (int i = 0; i < cnt; i++) {
            if (students[i].getId().equals(id)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < cnt - 1; i++) {
                students[i] = students[i + 1];
            }
            students[cnt - 1] = null;
            cnt--;
        }
    }
}
