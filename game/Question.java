package game;

public class Question {
    private String question;
    private String answerA, answerB,answerC;
    private String correctAnswer;
    public Question(String question, String A, String B, String C, String cA){
        setQuestion(question);
        setAnswerA(A);
        setAnswerB(B);
        setAnswerC(C);
        setCorrectAnswer(cA);
    }
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswerA() {
        return answerA;
    }

    public void setAnswerA(String answerA) {
        this.answerA = answerA;
    }

    public String getAnswerB() {
        return answerB;
    }

    public void setAnswerB(String answerB) {
        this.answerB = answerB;
    }

    public String getAnswerC() {
        return answerC;
    }

    public void setAnswerC(String answerC) {
        this.answerC = answerC;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
    public String toString(){
        return String.format("The correct Answer is "
                + getCorrectAnswer() + "\n");
    }
}