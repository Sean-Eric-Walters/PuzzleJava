public class TestPuzzleJava {
    public static void main (String[] args){
        PuzzleJava tester = new PuzzleJava();
        tester.get10Rolls();
        System.out.println(tester.getRandomLetter());
        tester.getNewPasswordSet(10);
        int[] testNums = {1,7,3,8,9};
    }
}