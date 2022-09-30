public class ProjectManager extends ItSpecialist {
    public ProjectManager(){

        super();
        manageBehaviour = new AbleToManage();
        codingBehaviour = new UnAbleToCode();
        designBehaviour = new UnAbleToDesign();
    }

}