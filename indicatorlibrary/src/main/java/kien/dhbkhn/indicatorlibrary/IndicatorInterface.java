package kien.dhbkhn.indicatorlibrary;

import android.support.v4.view.ViewPager;

/**
 * Created by KienDepTrai on 21/01/2018.
 */

public interface IndicatorInterface {

    void setViewPager(ViewPager viewPager) throws PageLessException;

    void setAnimationDuration(long duration);

    /**
     *
     * @param radius: radius in pixel
     */
    void setRadiusSelected(int radius);

    /**
     * @param radius: radius in pixel
     */
    void setRadiusUnselected(int radius);

    /**
     * @param distance: distance in pixel
     */
    void setDistanceDot(int distance);
}
