package quater;

public class TerminatorQuoter implements Quoter{
    private String massage;


    public String getMassage() {
        return massage;
    }
    public void setMassage(String massage) {
        this.massage = massage;
    }

    @Override
    public void sayQuote() {
        System.out.println("massage = " + massage);
    }
}
