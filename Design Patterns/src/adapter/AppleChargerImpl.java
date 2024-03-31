package adapter;

import static constants.Constants.YOUR_IPHONE_IS_CHARGING;

public class AppleChargerImpl implements AppleCharger{
    @Override
    public void chargePhone() {
        System.out.println(YOUR_IPHONE_IS_CHARGING);
    }
}
