package designpatterns.bstrategypattern;

/**
 * 策略模式
 * @author YatXue
 * @date 2019/7/2 8:11
 */
public class TaxRate {
    public double calCulate(TaxRate taxRate){
        return taxRate.calCulate(taxRate);
    }
}
