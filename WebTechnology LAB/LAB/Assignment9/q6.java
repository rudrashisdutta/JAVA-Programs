package WebTechJAVA.LAB.Assignment9;

public class q6 {
    public static void main(String[] args) {
        int noOfArgs;
        noOfArgs = args.length;
        try {
            if (noOfArgs > 4) {
                throw new CheckArgument(noOfArgs);
            }
            System.out.println("Arguments Properly Entered!");
        } catch (CheckArgument checkArgument) {
            checkArgument.printStackTrace();
        }
    }
}

class CheckArgument extends Exception {
    private static final long serialVersionUID = 1L;
    int noOfArgs;

    CheckArgument(int noOfArgs) {
        this.noOfArgs = noOfArgs;
    }

    @Override
    public void printStackTrace() {
        System.out.println(
                "\nCHECK ARGUMENT EXCEPTION THROWN!\nNumber of arguments should be 4 or less!\nYou have entered "
                        + noOfArgs + " arguments through command line!");
    }
}