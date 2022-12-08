
package wipro;

public class Wipro {


    public String employee_name;
    public int employee_id;
    public String venture;
    public double basic_pay;


    Wipro(String employee_name, int employee_id, String venture) {
        this.employee_name = employee_name;
        this.employee_id = employee_id;
        this.venture = venture;

    }

    Wipro(){

    }

    public double getBasic_pay() {
        return basic_pay=15000;
    }


}

class WiproTech extends Wipro {


    public WiproTech(String employee_name, int employee_id, String venture) {
        this.employee_name=employee_name;
        this.employee_id=employee_id;
        this.venture=venture;

    }

    public double getBasicpay() {

        return basic_pay = 25000;

    }

}



class WiproInfo extends Wipro {


    public WiproInfo(String employee_name, int employee_id, String venture) {
        this.employee_name=employee_name;
        this.employee_id=employee_id;
        this.venture=venture;

    }

    public double getBasicpay() {

        return basic_pay = 22000;

    }

}



class WiproBPO extends Wipro {



    WiproBPO(String employee_name, int employee_id, String venture) {

        this.employee_name = employee_name;

        this.employee_id = employee_id;

        this.venture= venture;

    }



    public double getBasicpay() {

        return basic_pay = 18000;

    }

}



class Demo {



    public static void main(String[] args) {

        Wipro a = new Wipro("Karthik", 120, "employee");

        WiproTech b = new WiproTech("Aswin", 121, "Developer");

        WiproInfo c = new WiproInfo("Rahul", 123, "Services");

        WiproBPO d = new WiproBPO("sai",   124, "Telecaller");



        System.out.println("Employee Salary in Wipro: " + a.getBasic_pay());

        System.out.println("Developer Salary in WiproTech: " + b.getBasicpay());

        System.out.println("Salary in WiproInfo: " + c.getBasicpay());

        System.out.println("Salary in WiproBPO: " + d.getBasicpay());
        System.out.println(d.basic_pay);

    }



}






