package kr.hs.dgsw.web_02_318;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImp1 implements CalculatorService {

    @Override
    public int num(int num1, int num2, String cal) {
        int sum = 0;
        if(cal.equals("add")){
            sum = num1 + num2;
        }else if(cal.equals("sub")) {
            sum = num1 - num2;
        }else if(cal.equals("mul")){
            sum = num1 * num2;
        }else if(cal.equals("div")){
            sum = num1 / num2;
        }

        return sum;
    }
}
