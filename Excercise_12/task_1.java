package com.company.Excercise_12;

class Test {
    public static void main(String[] args){
        int count = 5;
        Student[] students = {new Student(536, "Ivan", "ivbo"),
        new Student(324, "Petr", "ikbo"),
        new Student(211, "Vova", "imbo"),
        new Student(155, "Fill", "ivbo")};
        showData(students);

        for (int left = 0; left < students.length; left++) {
            // Вытаскиваем значение элемента
            Student value = students[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value.getId() < students[i].getId()) {
                    students[i + 1] = students[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            students[i + 1] = value;
        }

        showData(students);
    }

    public static void showData(Student[] students){
        for (Student student : students) {
            System.out.println(student.getId() + " " + student.getName() + " " + student.getGroup());
        }
    }
}


class Student{
    private int id;
    private String name;
    private String group;

    public Student(int id, String name, String group){
        this.id = id;
        this.name = name;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public String getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }


}