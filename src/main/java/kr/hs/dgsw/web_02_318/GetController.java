package kr.hs.dgsw.web_02_318;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {

    @Autowired
    private CalculatorService cs;

    @GetMapping("/calculator/{num1}/{num2}/{cal}")
    public int num(@PathVariable int num1, @PathVariable int num2, @PathVariable String cal){
        return cs.num(num1, num2, cal);
    }
}
