package oct20;

public class EncapsulationPrac {

  private int SSN;
  private String SecurityQuestion;

  //setter - set value
  //getter - return value

    public void setSSN(int SSN) {
       this.SSN = SSN;
    }

    public int getSSN(){
        System.out.println(SSN);
        return SSN;
    }

    public void setSecurityQuestion(String Question){
        SecurityQuestion = Question;
    }

    public String getSecurityQuestion(){
        return SecurityQuestion;
    }



}
