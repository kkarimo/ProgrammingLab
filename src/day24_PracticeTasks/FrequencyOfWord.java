package day24_PracticeTasks;

public class FrequencyOfWord {

    public static void main(String[] args) {
        String sentence = "Java java java python python";
        String word = "JaVa";

        int frequency = frequencyOfWord(sentence,word);

        System.out.println(frequency);

    }

    public static int frequencyOfWord (String sentence, String word){



        String[] arr1 = sentence.split(" ");
        int count = 0;
        for (String each : arr1) {
            if (each.equalsIgnoreCase(word)) {
                count++;
            }
        }
        return count;
    }

}

/*
1.  create a method named frequencyOfWord that passes two parameters: string sentence and String word, then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3
 */