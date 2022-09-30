public class Main {
    public static void main(String[] args) {
        ItSpecialist Steve = new Developer();
        ItSpecialist Mark = new ProjectManager();
        ItSpecialist Ann = new Designer();
        System.out.println(Steve.checkCode() + ", " + Steve.checkManagement() + ", " + Steve.checkDesign());
        System.out.println(Mark.checkManagement() + ", " + Mark.checkCode() + ", " + Mark.checkDesign());
        System.out.println(Ann.checkDesign() + ", " + Ann.checkCode() + ", " + Ann.checkManagement());
    }
}