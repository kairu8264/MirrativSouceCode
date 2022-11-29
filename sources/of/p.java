package of;

import android.content.res.Resources;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final p f45416a = new p();

    public final AnimationSet a(Resources resources) {
        jo.p.h(resources, "resources");
        float f10 = resources.getDisplayMetrics().density;
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new AccelerateDecelerateInterpolator());
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (-5.0f) * f10);
        translateAnimation.setStartOffset(62L);
        translateAnimation.setDuration(62L);
        animationSet.addAnimation(translateAnimation);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, 0.0f, f10 * 5.0f);
        translateAnimation2.setStartOffset(125L);
        translateAnimation2.setDuration(62L);
        animationSet.addAnimation(translateAnimation2);
        return animationSet;
    }

    public final AnimationSet b(Resources resources) {
        jo.p.h(resources, "resources");
        float f10 = resources.getDisplayMetrics().density;
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new AccelerateDecelerateInterpolator());
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(62L);
        animationSet.addAnimation(alphaAnimation);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 60.0f * f10, 0.0f);
        translateAnimation.setDuration(62L);
        animationSet.addAnimation(translateAnimation);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, 0.0f, (-5.0f) * f10);
        translateAnimation2.setStartOffset(62L);
        translateAnimation2.setDuration(62L);
        animationSet.addAnimation(translateAnimation2);
        TranslateAnimation translateAnimation3 = new TranslateAnimation(0.0f, 0.0f, 0.0f, f10 * 5.0f);
        translateAnimation3.setStartOffset(125L);
        translateAnimation3.setDuration(62L);
        animationSet.addAnimation(translateAnimation3);
        return animationSet;
    }

    public final AnimationSet c() {
        AnimationSet animationSet = new AnimationSet(true);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(250L);
        animationSet.addAnimation(alphaAnimation);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setStartOffset(3250L);
        alphaAnimation2.setDuration(300L);
        animationSet.addAnimation(alphaAnimation2);
        return animationSet;
    }
}
