package Set7;

public class CountDigit {
    public int countDigit(int num) {
        if(num == 0) {
            return 1;
        }
        num = num > 0 ? num : -num;

        int counter = 0;
        while(num >= 1) {
            num /= 10;
            counter++;
        }
        return counter;
    }
}
