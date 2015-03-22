package homework3;

public class Repairman extends EmployeeSC{

    private Equipment equipment;


    public void takeEquipment(Equipment equipment){
        this.equipment = equipment;
    }

    public void repair(){
        if(this.equipment != null) {
            equipment.setCondition(true);
        }
    }

    public Equipment returnEquipment(){
        return equipment;
    }
}
