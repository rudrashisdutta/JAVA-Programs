package learn;

class ValidPhoneNumber {

    private String pno;
    //private int pnoInt;

    //Constructor
    public ValidPhoneNumber(String phoneNumber){
        pno = phoneNumber;
    }
    //Public Methods
    public  boolean isValid(){
        boolean isIt;
        isIt = isNumeric() && is10Digit();
        return isIt;
    }

    public static void main(String[] args) {
        //ValidPhoneNumber v = new ValidPhoneNumber("9437577049");
        System.out.println(Long.parseLong("9437577049"));
    }

    //Private Methods
    private boolean isNumeric(){
        boolean isIt = false;
        try{
            System.out.println(Integer.parseInt(pno));
            isIt = true;
        }catch (NumberFormatException numberFormatException){
            //numberFormatException.printStackTrace();
        }
        return isIt;
    }
    private  boolean is10Digit(){
        boolean isIt;
        isIt = pno.length()==10;
        return isIt;
    }
}
