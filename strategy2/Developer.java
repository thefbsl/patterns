public class Developer extends ItSpecialist {
    public Developer(){
        super();
        codingBehaviour = new AbleToCode();
        manageBehaviour = new UnAbleToManage();
        designBehaviour = new UnAbleToDesign();
    }

}