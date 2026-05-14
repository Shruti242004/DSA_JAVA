package sttringBasics;

public class Numberofvowels {
    static void main(String[] args) {
        String s = "dfygjevyysgjsbddlqwipeuredddhkjcc";
        int count = 0;
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch=='o' || ch =='i' || ch == 'o' || ch=='u'  )
            count++;
        }
        System.out.println(count);
    }
}
