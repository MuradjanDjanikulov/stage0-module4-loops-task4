package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int number = 0;
        if (numberToSkip>lastInRow ){
            System.out.println("number to skip is bigger then the last");}
        else if (lastInRow<0){
            System.out.println("last number in row is negative");}
        else if(numberToSkip==lastInRow){
            for (int i=0; i<=lastInRow; i++){
                number+=i;}
            System.out.println("skipped sum is " +number+ "\n"+ "counted sum is " + 0);}
        else {
            for (int i=0; i<lastInRow; i++){
                if(i==numberToSkip){
                    continue;}
                number+=i;}
            System.out.println("skipped sum is " +(numberToSkip+lastInRow)+ "\n"+ "counted sum is " + number);}

    }
}