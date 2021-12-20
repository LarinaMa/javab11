package firstweek;

public class TruthTable {
    public static void main(String[] args) {
        // == equal to
        // || short-circuit OR (if first value fail it will not check further
        // && short-circuit AND
        boolean visa = true;
        boolean ticket = true;
        boolean myVisa = false;
        boolean myTicket = true;
        boolean canTravel = visa == myVisa && ticket == myTicket;
        System.out.println(canTravel);
        boolean onLine = true;
        boolean campus = true;
        boolean student = true;
        boolean askQuestion = student == onLine || student == campus;
        System.out.println("Can I ask question? " + askQuestion);
        boolean _onLine = true;
        boolean _campus = true;
        boolean _student = false;
        boolean _askQuestion = _student == _onLine || _student == _campus;
        System.out.println("Can I ask question? " + _askQuestion);
        int regAttendance = 90;
        int regScore = 80;
        int myAttendance = 100;
        int myScore = 70;
        boolean pass = myAttendance >= regAttendance && myScore >= regScore;
        System.out.println("Can I pass the class -->" + pass);
    }
}
