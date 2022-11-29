package of;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f45415a = new o();

    public final AnimationSet a(float f10) {
        AnimationSet animationSet = new AnimationSet(false);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(1L);
        animationSet.addAnimation(alphaAnimation);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, f10, 0.0f);
        translateAnimation.setDuration(835L);
        translateAnimation.setInterpolator(new DecelerateInterpolator());
        animationSet.addAnimation(translateAnimation);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setStartOffset(835L);
        alphaAnimation2.setDuration(167L);
        alphaAnimation2.setInterpolator(new LinearInterpolator());
        animationSet.addAnimation(alphaAnimation2);
        return animationSet;
    }

    public final AnimationSet b() {
        AnimationSet animationSet = new AnimationSet(false);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setStartOffset(233L);
        alphaAnimation.setDuration(100L);
        alphaAnimation.setInterpolator(new LinearInterpolator());
        animationSet.addAnimation(alphaAnimation);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.3f, 0.8f, 1.3f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setStartOffset(233L);
        scaleAnimation.setDuration(100L);
        scaleAnimation.setInterpolator(new DecelerateInterpolator());
        animationSet.addAnimation(scaleAnimation);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 0.7307692f, 1.0f, 0.7307692f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setStartOffset(334L);
        scaleAnimation2.setDuration(83L);
        scaleAnimation2.setInterpolator(new AccelerateDecelerateInterpolator());
        animationSet.addAnimation(scaleAnimation2);
        ScaleAnimation scaleAnimation3 = new ScaleAnimation(1.0f, 1.0526316f, 1.0f, 1.0526316f, 1, 0.5f, 1, 0.5f);
        scaleAnimation3.setStartOffset(417L);
        scaleAnimation3.setDuration(83L);
        scaleAnimation3.setInterpolator(new AccelerateInterpolator());
        animationSet.addAnimation(scaleAnimation3);
        return animationSet;
    }

    public final AlphaAnimation c() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setStartOffset(334L);
        alphaAnimation.setDuration(83L);
        alphaAnimation.setInterpolator(new LinearInterpolator());
        return alphaAnimation;
    }

    public final RotateAnimation d() {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setDuration(24000L);
        return rotateAnimation;
    }
}
