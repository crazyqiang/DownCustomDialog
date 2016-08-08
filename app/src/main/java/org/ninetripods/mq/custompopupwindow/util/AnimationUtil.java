package org.ninetripods.mq.custompopupwindow.util;

import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

/**
 * Created by MQ on 2016/8/2.
 */
public class AnimationUtil {
    /**
     * @param start          start position
     * @param end            end position
     * @param durationMillis time
     * @return
     */
    public static Animation getTranslateAnimation(int fromX, int fromY, int start, int end, int durationMillis) {
        Animation animation = new TranslateAnimation(fromX, fromY, start, end);
        animation.setDuration(durationMillis);
        animation.setFillEnabled(true);
        animation.setFillAfter(true);
        return animation;
    }
}
