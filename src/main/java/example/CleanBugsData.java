package example;

public class CleanBugsData {
    //TODO SunYujie Please add code here
    //Step 1 checkout all bugs
    //Step 2 get Testcases
    //Step 3 run test on  work version and bic version
    //Step 4 confirm testcase pass on work and fail on bic
    //Step 5 store result
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("sxz");
        System.out.println(stringBuilder.charAt(1));
        StringBuffer stringBuffer = new StringBuffer("sxz");
        System.out.println(stringBuffer.charAt(1));
    }
}
