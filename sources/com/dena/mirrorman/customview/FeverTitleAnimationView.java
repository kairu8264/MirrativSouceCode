package com.dena.mirrorman.customview;

import ae.w9;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.widget.FrameLayout;
import androidx.databinding.f;
import ia.a;
import jo.p;
import nd.b1;
import wn.v;

/* loaded from: classes2.dex */
public final class FeverTitleAnimationView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final w9 f25337w;

    /* loaded from: classes2.dex */
    public static final class a implements ia.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f25338a;

        public a(io.a<v> aVar) {
            this.f25338a = aVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f25338a.invoke();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            a.C0469a.b(this, animation);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            a.C0469a.c(this, animation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeverTitleAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        this.f25337w = (w9) f.e(LayoutInflater.from(getContext()), b1.view_fever_title_animation, this, true);
    }

    public final void a(io.a<v> aVar) {
        p.h(aVar, "onCompleteTitleAnimation");
        this.f25337w.C.r();
        View view = this.f25337w.B;
        AnimationSet animationSet = new AnimationSet(false);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(200L);
        animationSet.addAnimation(alphaAnimation);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setStartOffset(1750L);
        alphaAnimation2.setDuration(200L);
        animationSet.addAnimation(alphaAnimation2);
        animationSet.setAnimationListener(new a(aVar));
        view.startAnimation(animationSet);
    }
}
