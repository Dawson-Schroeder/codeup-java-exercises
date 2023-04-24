package rpg;

public class Quote {

    public static int onetofive(){
        return (int) (Math.random()*5) + 1;
    }
    public static String randomQuote(){
        int num = onetofive();
        if(num == 1){
            return "option 1";
        } else if (num == 2){
            return "option 2";
        } else if (num == 3){
            return "option 3";
        } else if (num == 4){
            return "option 4";
        } else {
            return "Option 5";
        }
    }

    // switch statement version of randomQuote
    /*
    public static String randomQuote2(){
        int randomNumber = (int) ((Math.random() * 4) + 1);
        switch(randomNumber){
            case 1: return "oui";
            case 2: return "no";
            case 3: return "race";
            case 4: return "car";
            default: return "not a default";
        }
    }
    */
}
