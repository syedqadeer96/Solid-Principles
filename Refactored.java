package com.company;



class Hospital {

    public void info(){
        System.out.println("This is a hospital");
    }
}
class InpatientDetails {
    public void inpatient() {
    }

}

class OutpatientDetatis{
    public void outpatient(){}}


class Billing {
    public void billingDepartment() {
    }
}
class unit {
    public void intensiveCareUnit() {System.out.println(" specialised treatment given to patients who are acutely unwell " +
            "and require critical medical care");

    }
}


//OPEN CLOSED PRINCIPLE

abstract class Department {
    public abstract void printHODName();

}
class IntermediateCareUnit extends Department{


    public void printHODName() {
        System.out.println("Intermediate care units HOD name");
    }
}
class CoronaryCareUnit extends Department{


    public void printHODName() {
        System.out.println("coronary care units HOD name");
    }
}











//LISKOV PRINCIPLE
class DentalHospital extends Hospital{



    public void info(){
        System.out.println("This is a Dental hospital");
    }

}




//INTERFACE SEGREGATION
interface InternTask {
    public void diagnoisingCommonDiseases();

}

interface SurgeonTask{
    public void performingComplexSurgeries();

}
class Intern implements InternTask {
    public void diagnoisingCommonDiseases() {
        System.out.println(" Performing general check up and diagnoising the disease and produce necessary reports and documentation");


    }


}
class Surgeon implements SurgeonTask{

    public void performingComplexSurgeries(){
        System.out.println("Perform specialised operations");
    }
}
///////////////////////////////////

interface IInfo{
    public void infoDisplay(String report);
}
class Info implements IInfo{
    public void infoDisplay(String report){
        System.out.println(report);
    }
}






class PatientData {
    private IInfo data;

    public PatientData(IInfo d) {
        this.data = d;
    }

    public void access() {
        data.infoDisplay("Display history  of patients");

    }

}











public class Refactored {

    public static void main(String[] args) {
        IntermediateCareUnit i=new IntermediateCareUnit();
        i.printHODName();
        DentalHospital de=new DentalHospital();
        de.info();
        Intern in=new Intern();
        in.diagnoisingCommonDiseases();
        PatientData p=new PatientData(new  Info());
        p.access();
    }
}