package designpatterns.bstrategypattern;

/**
 * @author YatXue
 * @date 2019/7/2 7:52
 */
public class TaxTest {

    public static void main(String[] args) {
        TaxRate taxRate = new Ustax();
        System.out.println(taxRate.calCulate(taxRate));
    }

    public static class Ustax extends TaxRate{
        @Override
        public double calCulate(TaxRate taxRate) {
            return 10;
        }
    }


}
