package WebTechJAVA.LAB.Assignment9;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        int hours, mins, secs;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the hours, minutes and seconds->");
        hours = scanner.nextInt();
        mins = scanner.nextInt();
        secs = scanner.nextInt();
        scanner.close();
        try {
            if (hours < 0 || hours > 24) {
                throw new HrsException();
            }
            if (mins < 0 || mins > 60) {
                throw new MinsException();
            }
            if (secs < 0 || secs > 60) {
                throw new SecException();
            }
        } catch (HrsException hrsException) {
            hrsException.printStackTrace();
        } catch (MinsException minsException) {
            minsException.printStackTrace();
        } catch (SecException secException) {
            secException.printStackTrace();
        }
    }
}

class HrsException extends Exception {
    @Override
    public void printStackTrace() {
        System.out.println("\nHours Not Possible Exception generated\nHours can only be between 0 and 24");
    }

    private static final long serialVersionUID = 1L;
}

class MinsException extends Exception {
    @Override
    public void printStackTrace() {
        System.out.println("\nMinutes Not Possible Exception generated\nMinutes can only be between 0 and 60");
    }

    private static final long serialVersionUID = 1L;
}

class SecException extends Exception {
    @Override
    public void printStackTrace() {
        System.out.println("\nSeconds Not Possible Exception generated\nSeconds can only be between 0 and 60");
    }

    private static final long serialVersionUID = 1L;
}