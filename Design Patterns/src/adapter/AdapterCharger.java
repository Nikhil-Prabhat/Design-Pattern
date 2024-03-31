package adapter;

import static constants.Constants.ADAPTER_CHARGING;

public class AdapterCharger implements AppleCharger{

    private AndroidCharger androidCharger;

    public AdapterCharger(AndroidCharger androidCharger) {
        this.androidCharger = androidCharger;
    }

    @Override
    public void chargePhone() {
        this.androidCharger.chargePhone();
        System.out.println(ADAPTER_CHARGING);
    }
}
