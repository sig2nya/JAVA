package programmers;

public class 숫자문자열과영단어 {
    public static void main(String[] args) {
        String num = "one4seveneight";
        String list[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < list.length; i++){
            if(num.contains(list[i])) {
                if(list[i] == "zero") num = num.replace(list[i], "0");
                if(list[i] == "one") num = num.replace(list[i], "1");
                if(list[i] == "two") num = num.replace(list[i], "2");
                if(list[i] == "three") num = num.replace(list[i], "3");
                if(list[i] == "four") num = num.replace(list[i], "4");
                if(list[i] == "five") num = num.replace(list[i], "5");
                if(list[i] == "six") num = num.replace(list[i], "6");
                if(list[i] == "seven") num = num.replace(list[i], "7");
                if(list[i] == "eight") num = num.replace(list[i], "8");
                if(list[i] == "nine") num = num.replace(list[i], "9");
            }
        }
        System.out.println(num);
    }
}
