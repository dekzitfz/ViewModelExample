package id.dekz.viewmodelexample;

import android.arch.lifecycle.ViewModel;

/**
 * Created by DEKZ on 5/26/2017.
 */

public class TimerViewModel extends ViewModel {

    private Long start;

    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }
}
