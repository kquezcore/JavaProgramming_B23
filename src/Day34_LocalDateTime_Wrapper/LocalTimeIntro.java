package Day34_LocalDateTime_Wrapper;

import java.time.LocalTime;

public class LocalTimeIntro {
    public static void main(String[] args) {
        LocalTime now= LocalTime.now();

        System.out.println(now);

        LocalTime BreakTime=now.plusMinutes(15);
        System.out.println(BreakTime);

        LocalTime quizDue= BreakTime.plusMinutes(20);

        System.out.println(quizDue);

        LocalTime comeBackAt= LocalTime.of(11,40);

        System.out.println("Come back at: "+comeBackAt);

    }
}
