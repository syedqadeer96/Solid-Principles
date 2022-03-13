package com.company;


 class Hospital {


     public void info() {
         System.out.println("This is a hospital");
     }

     public void inpatient() {}



     public void outpatient() {
     }

     public void billingDepartment() {
     }

     public void intensiveCareUnit() {
        // System.out.println(" specialised treatment given to patients who are acutely unwell " +
                 //"and require critical medical care");
     }


 }

/////OPEN-CLOSED PRINCIPLE
class Department {

     private String sUnitName;
     public void printHODName(String sUnitName) {
         if (sUnitName.equals("InCU")) {
             System.out.println("Intermediate care units HOD name");
             }
         else if (sUnitName.equals("NSCU")) {
             System.out.println("Neo natal special care units HOD name");


         }
     }
 }
//LISKOV PRINCIPLE
class DentalHospital extends Hospital {


    //public void inpatient(){}
    //public void outpatient(){}
    //public void billingDepartment(){}
    public void intensiveCareUnit() {
        System.out.println(" specialised treatment given to patients who are acutely unwell " +
                "and require critical medical care 24/7");
    }


}








//LISKOV PRINCIPLE



//INTERFACE SEGREGATION
interface Task{
     public void diagnoisingCommonDiseases();
     public void performingComplexSurgeries();

     }
class Intern implements Task {
    public void diagnoisingCommonDiseases() {
        System.out.println(" Performing general check up and diagnoising the disease and produce necessary reports and documentation");


    }

    public void performingComplexSurgeries() {
        System.out.println("Perform specialised operations");
    }
}
class Surgeon implements Task{

    public void diagnoisingCommonDiseases() {
        System.out.println(" Performing general check up and diagnoising the disease and produce necessary reports and documentation");

    }
       public void performingComplexSurgeries(){
    System.out.println("Perform specialised operations");
    }


 }

////////Dependency Inversion Principle
class Info{
    public void infoDisplay(String report){
        System.out.println(report);
    }
}






class PatientData {
    private Info data;

    public PatientData(Info d) {
        this.data = d;
    }

    public void access() {
        data.infoDisplay("Display history  of patients");

    }

}


public class Main {

    public static void main(String[] args) {
        //Hospital h=new Hospital();
        //h.intensiveCareUnit();
        Department d=new Department();
        d.printHODName("InCU");
        DentalHospital de=new DentalHospital();
        de.info();
        de.intensiveCareUnit();
       Intern in=new Intern();
       in.diagnoisingCommonDiseases();

        PatientData p=new PatientData(new  Info());
        p.access();

    }
}