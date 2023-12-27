public class Main {

    public static void main(String[] args) {
        CourseDAO courseDAO = new CourseDAO();

        // Вставка данных
        Course course1 = new Course("Mathematics", 60);
        Course course2 = new Course("History", 45);

        courseDAO.insertCourse(course1);
        courseDAO.insertCourse(course2);

        // Чтение данных
        Course retrievedCourse1 = courseDAO.getCourseById(1);
        Course retrievedCourse2 = courseDAO.getCourseById(2);

        System.out.println("Retrieved Course 1: " + retrievedCourse1);
        System.out.println("Retrieved Course 2: " + retrievedCourse2);

        // Обновление данных
        retrievedCourse1.setTitle("Advanced Mathematics");
        courseDAO.updateCourse(retrievedCourse1);

        Course updatedCourse1 = courseDAO.getCourseById(1);
        System.out.println("Updated Course 1: " + updatedCourse1);

        // Удаление данных
        courseDAO.deleteCourse(2);
        Course deletedCourse = courseDAO.getCourseById(2);
        System.out.println("Deleted Course 2: " + deletedCourse);
    }
}
