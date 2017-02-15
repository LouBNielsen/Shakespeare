package shakespeare;

import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author LouiseB
 */
public class Shakespeare
{

    int limit = 1000;
    String[] words = null;
    public String[] shakeSpeareWords = new String[limit];

    public static void main(String[] args)
    {
        Shakespeare shakespeare = new Shakespeare();

        Stopwatch stopwatchForSelectionSort = new Stopwatch();
        Algorithms selectionSortShakeSpeareWords = new Algorithms(shakespeare.ShakeSpeareTextFile());

        selectionSortShakeSpeareWords.selectionSort();

        double elapsedTimeForSelectionSort = stopwatchForSelectionSort.elapsedTime();

        System.out.println("Selection sort: " + selectionSortShakeSpeareWords.arrayToString());
        System.out.println("It took: " + elapsedTimeForSelectionSort);

        
        
        Stopwatch stopwatchForInsertionSort = new Stopwatch();
        Algorithms insertionSortShakeSpeareWords = new Algorithms(shakespeare.ShakeSpeareTextFile());

        insertionSortShakeSpeareWords.insertionSort();

        double elapsedTimeForInsertionSort = stopwatchForInsertionSort.elapsedTime();

        System.out.println("Insertion sort: " + insertionSortShakeSpeareWords.arrayToString());
        System.out.println("It took: " + elapsedTimeForInsertionSort);
        
        
        
        Stopwatch stopwatchForMerge = new Stopwatch();
        Algorithms mergeShakeSpeareWords = new Algorithms(shakespeare.ShakeSpeareTextFile());

        mergeShakeSpeareWords.sort();

        double elapsedTimeForMerge = stopwatchForMerge.elapsedTime();

        System.out.println("Merge: " + mergeShakeSpeareWords.arrayToString());
        System.out.println("It took: " + elapsedTimeForMerge);


    }

    public String[] ShakeSpeareTextFile()
    {
        try
        {
            words = FileUtility.toStringArray("C:\\Users\\LouiseB\\OneDrive\\Cphbusiness\\4.semester\\Datastruktur og algoritmer\\Shakespeare\\src\\shakespeare\\Shakespeare.txt", "[^A-Za-z]");
            shakeSpeareWords = Arrays.copyOfRange(words, 0, limit);
        } catch (IOException ex)
        {
            ex.toString();
        }
        return shakeSpeareWords;
    }

}
