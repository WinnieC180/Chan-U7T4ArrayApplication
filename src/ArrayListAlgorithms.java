import java.util.ArrayList;

public class ArrayListAlgorithms {
    /** Returns true if any of the elements in stringList contain
     *  target as a substring; false otherwise.  Use indexOf instead of contains
     *  for AP practice! (although in reality, contains is preferred)
     *
     *  Does NOT mutate (modify) elements of stringList.
     *  PRECONDITION: stringList.size() > 0
     *
     *  @param stringList  original arraylist of Strings
     *  @return  true if target is found in any of the strings, false otherwise
     */
    public static boolean containsTarget(ArrayList<String> stringList, String target) {
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).indexOf(target) >= 0) {
                return true;
            }
        }
        return false;
    }

    /** Returns number of elements in intList that are less than the
     *  average of all elements.
     *
     *  Does NOT mutate (modify) elements of intList.
     *  PRECONDITION: intList.size() > 0
     *
     *  @param intList  original arraylist of Integers
     *  @return  the number of ints in intList that are less than the average
     */
    public static int belowAverage(ArrayList<Integer> intList)
    {
        double avg = 0;
        for (int i = 0; i<intList.size(); i++){
            avg+= intList.get(i);
        }
        avg/= intList.size();

        int numOfElements = 0;
        for (int i = 0; i<intList.size(); i++){
            if (intList.get(i)< avg){
                numOfElements++;
            }
        }
        return numOfElements;
    }

    /** Replaces all words in wordList that end in "s" with the all-uppercase
     *  version of the word.  For example, "apples" should be replaced with "APPLES".
     *  Assume all letters of all words in wordList are lowercase initially (no need
     *  to worry about checking for case or converting first to lowercase)
     *
     *  DOES mutate (modify) elements of wordList.
     *  PRECONDITION: wordList.size() > 0
     *
     *  @param wordList  original arraylist of words
     */
    public static void replaceWithCaps(ArrayList<String> wordList) {
        for (int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i).indexOf("s") >= 0) {
                wordList.set(i, wordList.get(i).toUpperCase());
            }
        }
    }

    /** Returns the index at which the minimum value of all integers in
     *  intList appears; if the minimum value appears more than once in
     *  the arraylist, return the index of the first occurrence
     *
     *  Does NOT mutate (modify) elements in intList.
     *  PRECONDITION: intList.size() > 0
     *
     *  @param intList  original arraylist of Integers
     *  @return  the index at which the minimum value occurs
     */
    public static int indexOfMinimum(ArrayList<Integer> intList)
    {
        int min = intList.get(0);
        int indexOfMin = 0;
        for (int i = 0; i<intList.size(); i++){
            if (intList.get(i)<min){
                min = intList.get(i);
                indexOfMin = i;
            }
        }
        return indexOfMin;
    }

    /** Returns true if two array lists of the same length contain the exact
     *  same elements in the same order (i.e. the two arraylists are identical).
     *  Returns false otherwise.
     *
     *  Does NOT mutate (modify) elements in either arraylist
     *  PRECONDITION: numList1.size() == numList2.size()
     *
     *  @param numList1  first arraylist of Integers
     *  @param numList2  second arraylist of Integers, has the same size a first
     *  @return  true if both arraylists are identical, element for element
     */
    public static boolean areIdentical(ArrayList<Integer> numList1, ArrayList<Integer> numList2)
    {
        for (int i = 0; i < numList1.size(); i++) {
            if (numList1.get(i) != numList2.get(i)) {
                return false;
            }
        }
        return true;
    }

    /** Removes all elements from numList that are ODD Integers.
     *
     *  DOES mutate (modify) elements in numList
     *  PRECONDITION: numList1.size() > 0
     *
     *  @param numList  arraylist of Integers
     */
    public static void removeOdds(ArrayList<Integer> numList)
    {
        for (int i=0; i<numList.size(); i++){
            if (numList.get(i)%2!=0){
                numList.remove(i);
                i--;
            }
        }
    }

    /** Removes all elements from wordList that contain an a, e, i , and/or o.
     *  All other words (i.e. those that have u and/or y as the vowel
     *  such as "ugh" or "sly", or no vowels, like "psh"), add a duplicate of
     *  that element to wordList at an adjacent index.
     *
     *  Assume all words have lowercase letters (i.e. no need to check for case)
     *
     *  DOES mutate (modify) elements in wordList
     *  PRECONDITION: wordList.size() > 0
     *
     *  @param wordList  arraylist of Strings
     */
    public static void wackyVowels(ArrayList<String> wordList) {
        for (int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i).indexOf("a") >= 0 || wordList.get(i).indexOf("e") >= 0|| wordList.get(i).indexOf("i") >=0|| wordList.get(i).indexOf("o") >= 0) {
                wordList.remove(i);
                i--;
            }
        }

        for (int i= 0; i< wordList.size(); i++) {
            wordList.add(i+1, wordList.get(i));
            i++;
        }
    }

    /** Adds an uppercase version of each string directly AFTER the string
     *  in wordList; for example, if wordList is ["hello", "my", "best", "friend"]
     *  this this method modifies wordList to be:
     *  ["hello", "HELLO", "my", "MY", "best", "BEST", "friend", "FRIEND"]
     *
     *  Assume all words have lowercase letters originally
     *
     *  DOES mutate (modify) elements in wordList
     *  PRECONDITION: wordList.size() > 0
     *
     *  @param wordList  arraylist of Strings
     */
    public static void duplicateUpperAfter(ArrayList<String> wordList) {
        for (int i = 0; i < wordList.size(); i++) {
            wordList.add(i+1, wordList.get(i).toUpperCase());
            i++;
        }
    }

    /** Appends an uppercase version of each string to the END of of wordList;
     *  the uppercase versions appear in the same order as the lowercase versions
     *  for example, if wordList is ["hello", "my", "best", "friend"]
     *  this this method modifies wordList to be:
     *  ["hello", "my", "best", "friend", "HELLO", "MY", "BEST", "FRIEND"]
     *
     *  Assume all words have lowercase letters originally
     *
     *  DOES mutate (modify) elements in wordList
     *  PRECONDITION: wordList.size() > 0
     *
     *  @param wordList  arraylist of Strings
     */
    public static void duplicateUpperEnd(ArrayList<String> wordList)
    {
        int sizeOfList = wordList.size() ;
        for (int i =0; i<sizeOfList; i++){
            wordList.add(wordList.get(i).toUpperCase());
        }
    }

    /** Returns an arraylist of Strings that represents the input sentence parsed
     *  into separate words (using a space: " " as the delimiter) and REVERSED
     *  For example, if sentence = "This is my sentence!"
     *  this method return [sentence!, my, is, This]
     *
     *  PRECONDITION: sentence does not end with a space
     *
     *  @param sentence  the input String that represents one or more words
    separated by spaces
     *  @return  new arraylist of Strings containing the words of sentence reversed
     */
    public static ArrayList<String> parseWordsAndReverse(String sentence) {
        String newSentence = sentence + " ";
        int indexOfSpace = newSentence.indexOf(" ");
        ArrayList <String> createdList = new ArrayList<String>();

        while (newSentence.length() > 0 ) {
            String word = "";
            for (int i = 0; i < indexOfSpace; i++) {
                word += newSentence.substring(i, i+1);
            }
            createdList.add(0, word);
            newSentence = newSentence.substring(indexOfSpace + 1);
            indexOfSpace = newSentence.indexOf(" ");
        }
        return createdList;
    }

    /** Removes all duplicate values from an intList, leaving only the first
     *  occurrence in the arrayList; for example, this method will modify
     *  [1, 2, 5, 4, 2, 2, 1, 6, 4, 4, 8, 1, 7, 4, 2] --> [1, 2, 5, 4, 6, 8, 7]
     *
     *  DOES mutate (modify) elements in intList
     *  PRECONDITION: intList.size() > 0
     *
     *  @param intList  intList of Integers
     */
    public static void removeDuplicates(ArrayList<Integer> intList)
    {
        for (int i = 0; i<intList.size(); i++){
            int current = intList.get(i);
            for (int j= i + 1; j<intList.size(); j++){
                if (current==intList.get(j)){
                    intList.remove(j);
                    j--;
                }
            }
        }
    }

    /** Moves all words in wordList that begin with "b" to the front of
     *  wordList; all "b" words that are moved should appear in the same order
     *  in the modified arrayList as they did before being moved
     *
     *  For example, this method will take a wordList:
     *  ["apple", "banana", "cherry", "donut", "bagel", "danish", "berry", "baguette", "soda"]
     *  and modify it to
     *  ["banana", "bagel", "berry", "baguette", "apple", "cherry", "donut", "danish", "soda"]
     *
     *  DOES mutate (modify) elements in wordList
     *  PRECONDITIONS: - wordList.size() > 0
     *                 - all strings in wordList have length >= 1
     *
     *  @param wordList  arraylist of words
     */
    public static void moveBWords(ArrayList<String> wordList)
    {
        for (int i = 0; i< wordList.size(); i++){
            if (wordList.get(i).substring(0,1).equals("b")){
                String previous = wordList.remove(i);
                wordList.add(0, previous);
            }
        }
    }

    public static ArrayList<Integer> modes(int[] numList) {
        int mode = 0;
        int count = 0;
        int pastCount = 0;
        ArrayList <Integer> currentModes = new ArrayList<>();
        ArrayList <Integer> returnMode = new ArrayList<>();

        for (int i = 0; i < numList.length; i++) {
            count = 0;
            int currentNum = numList[i];
            for (int j = i + 1; j < numList.length; j++){ //j is set = to i so it doesnt check the num again
                if (numList[j] == currentNum){
                    count++;
                }
            }
            if (count > pastCount) {
                pastCount = count;

                mode = currentNum;
                currentModes = new ArrayList<>();
                currentModes.add(mode);
                count = 0;
            } else if (count == pastCount) {
                currentModes.add(currentNum);
                count = 0;
            }
        }

        boolean allModes = true;

        for (int i = 0; i< numList.length;i++){
            boolean currentStatus = false;
            for (int j = 0; j<currentModes.size(); j++){
                if (numList[i] ==currentModes.get(j)){
                    currentStatus = true;
                }
            }
            if (!currentStatus){
                allModes = false;
            }

        }
        if (allModes){
            currentModes = new ArrayList<>();
        }
        returnMode = currentModes;
        return returnMode;
    }

    public static void sortStudents(ArrayList<Student> studentsToSort) {
        for (int i = 0; i < studentsToSort.size(); i++) {
            Student temp = studentsToSort.get(i);
            String tempLast = studentsToSort.get(i).getLastName();
            int possibleIndex = i;

            while (possibleIndex > 0 && tempLast.compareTo(studentsToSort.get(possibleIndex - 1).getLastName()) < 0) {
                studentsToSort.set(possibleIndex, studentsToSort.get(possibleIndex - 1));
                possibleIndex--;
            }

            studentsToSort.set(possibleIndex, temp);
        }

        for (int j = 1; j < studentsToSort.size(); j++) {
            if (studentsToSort.get(j).getLastName().compareTo(studentsToSort.get(j - 1).getLastName()) == 0) {
                if (studentsToSort.get(j).getFirstName().compareTo(studentsToSort.get(j-1).getFirstName()) < 0) {
                    Student temp = studentsToSort.set(j, studentsToSort.get(j - 1));
                    studentsToSort.set(j-1, temp);
                }
            }
        }

        for (int x = 1; x < studentsToSort.size(); x++) {
            if (studentsToSort.get(x).getFirstName().compareTo(studentsToSort.get(x-1).getFirstName()) == 0) {
                Student temp = studentsToSort.set(x, studentsToSort.get(x - 1));
                studentsToSort.set(x-1, temp);
            }
        }
    }
}




