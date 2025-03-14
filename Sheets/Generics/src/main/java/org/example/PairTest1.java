package src.main.java.org.example;

public class PairTest1
{   public static void main(String[] args){
        String[] words = { "Mary", "had", "a", "little", "lamb" };
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());

        double[] array = new double[3];
        array[0] = 3.14;
        array[1] = 1729;
        array[2] = 0;

        String middle = ArrayAlg.getMedian(words);
        //String middle2 = ArrayAlg.getMedian(array);

    }
}