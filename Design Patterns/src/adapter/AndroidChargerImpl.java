package adapter;

import static constants.Constants.YOUR_ANDROID_PHONE_IS_CHARGING;

public class AndroidChargerImpl implements AndroidCharger{
    @Override
    public void chargePhone() {
        System.out.println(YOUR_ANDROID_PHONE_IS_CHARGING);
    }
}
