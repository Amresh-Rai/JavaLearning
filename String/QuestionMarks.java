package String;

public class QuestionMarks {

    static String QuestionsMarks(String str) {

        int lastindex = -1;
        int lastDigit = -1;
        boolean foundpair = false;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {

                int currentDigit = ch - '0';

                if (lastDigit != -1) {

                    if (lastDigit + currentDigit == 7) {

                        int questionCount = 0;

                        for (int j = lastindex + 1; j < i; j++) {
                            if (str.charAt(j) == '?')
                                questionCount++;
                        }

                        if (questionCount != 3) {
                            return "false";
                        }

                        foundpair = true;
                    }
                }

                lastDigit = currentDigit;
                lastindex = i;
            }
        }

        if (!foundpair) {
            return "false";
        }

        return "true";
    }

    public static void main(String[] args) {

        System.out.println(QuestionsMarks("arrb3???4xxbl5???eee2")); 
        System.out.println(QuestionsMarks("aa6?ss??1"));            
        System.out.println(QuestionsMarks("acc?7??sss?0rr2??????5"));
    }
}