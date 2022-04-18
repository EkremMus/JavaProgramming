package day17_WhileDoWhile;

public class JavaJava {

    public static void main(String[] args) {
        String str = "JavaJavaJava";
        int frequency = 0;

        for (int i = 0; i < str.length()-3 ; i++) {
            String eachSub= str.substring(i,i+4);
            //System.out.println(eachSub);
            if(eachSub.equals("Java")){
                frequency++;
            }
        }
        System.out.println("frequency = " + frequency);
    }
}

/*
2. write a program that can return the frequency of the word Java from the sentence
Ex: sentence = "JavaJavaJava";
output: 3
 */