package Data_structure_NCI.week3.lab;

/**
 * @author Mendy
 * @create 2023-02-11 13:15
 */
public class Car{
    private String reg;
    private String owner;
    private String contactum;
    private String issues;
    private int cost;
    private boolean ready;



    public Car(String customer, String issues, String contact, String reg){
        this.reg = reg;
        this.owner = customer;
        this.contactum = contact;
        this.issues = issues;
        this.cost = 0;
        this.ready = false;
    }


    public void setReg(String reg){
        this.reg = reg;
    }


    public void setOwner(String owner){
        this.owner = owner;
    }


    public void setNum(String contactum){
        this.contactum = contactum;
    }


    public void setissues(String issues){
        this.issues = issues;
    }


    public void setCost(int cost){
        this.cost = cost;
    }


    public void setStatus(boolean status){
        this.ready = status;
    }


    public String getReg(){
        return reg;
    }


    public String getOwner(){
        return owner;
    }


    public String getNum(){
        return contactum;
    }


    public String getissues(){
        return issues;
    }


    public int getCost(){
        return cost;
    }


    public boolean getStatus(){
        return ready;
    }


    @Override
    public String toString(){
        String output = "Car Details\n";
        output+= "Contact Number: "+getNum()+"\n";
        output+= "Problem Description: "+getissues()+"\n";
        output+= "Cost of Fixing the Problem: "+getCost()+"\n";
        if(getStatus()){
            output+= "Car Status: Ready for Collection";
        }else{
            output+= "Car Status: Not Ready for Collection";
        }
        return output;
    }



    public static void main(String []args){
        System.out.println("We have started executing");
        Car myCar = new Car("Keith", "My car wont start", "087", "182-d-123");
        System.out.println(myCar);
        myCar.setStatus(true);
        System.out.println(myCar);
    }
}
