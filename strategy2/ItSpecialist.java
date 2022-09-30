public class ItSpecialist {
    public CodingInterface codingBehaviour;
    public ManageInterface manageBehaviour;
    public DesignInterface designBehaviour;

    public String checkCode(){
        return codingBehaviour.writeCode();
    }

    public String checkManagement(){
        return manageBehaviour.manageProject();
    }

    public String checkDesign(){
        return designBehaviour.buildDesign();
    }

}
