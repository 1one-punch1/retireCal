package ikl.retireCal;


import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;


public class Wdate {

    public static void main(String[] args) {
        LocalDate Today_ = LocalDate.now(); // 오늘 날짜
        LocalDate YourBirth_ = LocalDate.of(1982,07,15); // 당신의 생년월일
        int RetireY = 62; // 정년나이

//      당신의 생년월일에 정년나이 더하기 : 정년 년월일
        LocalDate Retire_Day = YourBirth_.plusYears(RetireY);
//      오늘 날짜와 정년날짜 계산
        Period D_Day_ = Period.between(Today_, Retire_Day);
        long D_day_Remain = ChronoUnit.DAYS.between(Today_, Retire_Day);

//        LocalDate로 형변환(이 아니라 다시 설정)
        LocalDate L_D_day_  = LocalDate.of(D_Day_.getYears(), D_Day_.getMonths(), D_Day_.getDays());

//      년/월/일 분류(int 값)
        int D_dayY = D_Day_.getYears();
        int D_dayM = D_Day_.getMonths();
        int D_dayD = D_Day_.getDays();

        System.out.println("오늘 날짜는 : " + Today_);
        System.out.println("당신의 정년은 : " + Retire_Day);
        System.out.printf("당신의 정년까지 %d년 %d개월 %d일 남았습니다.\n", D_dayY, D_dayM, D_dayD);
        System.out.println("당신의 정년 :" + L_D_day_);
        System.out.printf("이를 날짜로 환산하면 %d일입니다.", D_day_Remain);


    }

    static class staticDay {

    }
}
