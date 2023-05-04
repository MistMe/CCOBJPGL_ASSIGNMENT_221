public class Exercise1 {
    static boolean iWillNotCheat = true;
    static boolean iWillWin = true;
    
    public static void main(String args[]) {
    
    
        assert iWillNotCheat == true: "Disqualified ka na";
    
        enterCompetition();
    
        assert iWillWin == true: "Nice try, Join us again next time";
    
    }
    
    static void enterCompetition(){
        iWillWin = false;
        }
}
