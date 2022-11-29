package com.dena.mirrorman.customview;

import ae.qk;
import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import androidx.databinding.f;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.customview.LiveRequestClapView;
import java.util.List;
import jo.p;
import nd.b1;
import sf.i;
import wn.k;
import wn.q;
import xn.s;
import yd.n0;

/* loaded from: classes2.dex */
public final class LiveRequestClapView extends FrameLayout {
    public final qk A;

    /* renamed from: w  reason: collision with root package name */
    public int f25490w;

    /* renamed from: x  reason: collision with root package name */
    public final float f25491x;

    /* renamed from: y  reason: collision with root package name */
    public final List<k<Integer, Integer>> f25492y;

    /* renamed from: z  reason: collision with root package name */
    public final List<k<Float, Float>> f25493z;

    /* loaded from: classes2.dex */
    public static final class a implements i {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LottieAnimationView f25495b;

        public a(LottieAnimationView lottieAnimationView) {
            this.f25495b = lottieAnimationView;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            i.a.a(this, animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LiveRequestClapView.this.A.F.removeView(this.f25495b);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            i.a.c(this, animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            i.a.d(this, animator);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveRequestClapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        p.h(attributeSet, "attrs");
        this.f25491x = 62.5f;
        this.f25492y = s.m(q.a(Integer.valueOf(Color.parseColor("#29ccb1")), Integer.valueOf(Color.parseColor("#1e72dd"))), q.a(Integer.valueOf(Color.parseColor("#1e72dd")), Integer.valueOf(Color.parseColor("#5829cc"))), q.a(Integer.valueOf(Color.parseColor("#5829cc")), Integer.valueOf(Color.parseColor("#d424ac"))), q.a(Integer.valueOf(Color.parseColor("#d424ac")), Integer.valueOf(Color.parseColor("#de2222"))), q.a(Integer.valueOf(Color.parseColor("#de2222")), Integer.valueOf(Color.parseColor("#ff8026"))), q.a(Integer.valueOf(Color.parseColor("#ff8026")), Integer.valueOf(Color.parseColor("#ffc915"))), q.a(Integer.valueOf(Color.parseColor("#ffc915")), Integer.valueOf(Color.parseColor("#73d327"))), q.a(Integer.valueOf(Color.parseColor("#73d327")), Integer.valueOf(Color.parseColor("#29ccb1"))));
        Float valueOf = Float.valueOf(100.0f);
        Float valueOf2 = Float.valueOf(80.0f);
        Float valueOf3 = Float.valueOf(120.0f);
        Float valueOf4 = Float.valueOf(95.0f);
        Float valueOf5 = Float.valueOf(105.0f);
        this.f25493z = s.m(q.a(valueOf, valueOf2), q.a(valueOf2, valueOf3), q.a(valueOf3, valueOf4), q.a(valueOf4, valueOf5), q.a(valueOf5, valueOf));
        qk qkVar = (qk) f.e(LayoutInflater.from(getContext()), b1.view_live_request_clap, this, true);
        this.A = qkVar;
        qkVar.D.getViewTreeObserver().addOnGlobalLayoutListener(new n0(this));
    }

    public static final void d(ArgbEvaluator argbEvaluator, k kVar, LiveRequestClapView liveRequestClapView, ValueAnimator valueAnimator) {
        p.h(argbEvaluator, "$argbEvaluator");
        p.h(kVar, "$color");
        p.h(liveRequestClapView, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        p.f(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        Object evaluate = argbEvaluator.evaluate(floatValue, kVar.c(), kVar.d());
        p.f(evaluate, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) evaluate).intValue();
        if (floatValue <= 0.2f) {
            liveRequestClapView.A.C.setBackgroundTintList(ColorStateList.valueOf(f3.a.c(intValue, -16777216, floatValue)));
        } else if (floatValue < 0.4f) {
            liveRequestClapView.A.C.setBackgroundTintList(ColorStateList.valueOf(f3.a.c(intValue, -16777216, 0.4f - floatValue)));
        } else {
            liveRequestClapView.A.C.setBackgroundTintList(ColorStateList.valueOf(intValue));
        }
    }

    public final void c() {
        LottieAnimationView lottieAnimationView = new LottieAnimationView(getContext());
        this.A.F.addView(lottieAnimationView, new FrameLayout.LayoutParams(-1, -1));
        lottieAnimationView.e(new a(lottieAnimationView));
        lottieAnimationView.setAnimation("live_request_lottie/effect0" + (this.f25490w + 1) + ".json");
        lottieAnimationView.r();
        final k<Integer, Integer> kVar = this.f25492y.get(this.f25490w);
        int i10 = 0;
        this.f25490w = this.f25490w == this.f25492y.size() - 1 ? 0 : this.f25490w + 1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        final ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        ofFloat.setDuration(this.f25491x * 5);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: yd.m0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LiveRequestClapView.d(argbEvaluator, kVar, this, valueAnimator);
            }
        });
        ofFloat.start();
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new AccelerateDecelerateInterpolator());
        for (Object obj : this.f25493z) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                s.t();
            }
            k kVar2 = (k) obj;
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, ((Number) kVar2.d()).floatValue() / ((Number) kVar2.c()).floatValue(), 1.0f, ((Number) kVar2.d()).floatValue() / ((Number) kVar2.c()).floatValue(), 1, 0.5f, 1, 0.5f);
            scaleAnimation.setStartOffset(this.f25491x * i10);
            scaleAnimation.setDuration(this.f25491x);
            animationSet.addAnimation(scaleAnimation);
            i10 = i11;
        }
        this.A.C.startAnimation(animationSet);
    }
}
