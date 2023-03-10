package ikl.retireCal;

import java.time.LocalDate;

public class input_day {

    int _Birth_yyyy = 1982;
    int _Birth_MM = 07;
    int _Birth_dd = 15;

    int Retire_YY = 62; // 정년나이

    LocalDate Today_ = LocalDate.now(); // 오늘 날짜
    LocalDate YourBirth_ = LocalDate.of(_Birth_yyyy,_Birth_MM,_Birth_dd); // 당신의 생년월일
    LocalDate Retire_YYYY = LocalDate.of(Retire_YY,0,0); // 당신의 생년월일

//    return Today_, YourBirth_;

}
