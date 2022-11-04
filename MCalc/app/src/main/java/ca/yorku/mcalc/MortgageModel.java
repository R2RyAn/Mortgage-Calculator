package ca.yorku.mcalc;

public class MortgageModel {


    public String p="";
    public String a="";
    public String i="";

    public MortgageModel(String p, String a, String i){
        this.p=p;
        this.a=a;
        this.i=i;

    }

    public String computePayment(){

        double pD = Double.parseDouble(p);
        double aTemp = Double.parseDouble(a);
        double iTemp = Double.parseDouble(i);
        double iD = (iTemp/100)/12;
        double aD = aTemp*12;
        double answer = (iD*pD)/(1-(Math.pow(1+iD,-aD)));
        return String.format("$%,.2f", answer);

    }








}
