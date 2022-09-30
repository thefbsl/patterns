public class Designer extends ItSpecialist {
    public Designer(){
        super();
        designBehaviour = new AbleToDesign();
        codingBehaviour = new UnAbleToCode();
        manageBehaviour = new UnAbleToManage();
    }

}