package g5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class d extends j0 {

    /* loaded from: classes.dex */
    public class a extends n {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f32677a;

        public a(View view) {
            this.f32677a = view;
        }

        @Override // g5.m.f
        public void c(m mVar) {
            c0.g(this.f32677a, 1.0f);
            c0.a(this.f32677a);
            mVar.W(this);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final View f32679a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f32680b = false;

        public b(View view) {
            this.f32679a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c0.g(this.f32679a, 1.0f);
            if (this.f32680b) {
                this.f32679a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (o3.c0.R(this.f32679a) && this.f32679a.getLayerType() == 0) {
                this.f32680b = true;
                this.f32679a.setLayerType(2, null);
            }
        }
    }

    public d(int i10) {
        q0(i10);
    }

    public static float t0(s sVar, float f10) {
        Float f11;
        return (sVar == null || (f11 = (Float) sVar.f32777a.get("android:fade:transitionAlpha")) == null) ? f10 : f11.floatValue();
    }

    @Override // g5.j0, g5.m
    public void m(s sVar) {
        super.m(sVar);
        sVar.f32777a.put("android:fade:transitionAlpha", Float.valueOf(c0.c(sVar.f32778b)));
    }

    @Override // g5.j0
    public Animator m0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        float t02 = t0(sVar, 0.0f);
        return s0(view, t02 != 1.0f ? t02 : 0.0f, 1.0f);
    }

    @Override // g5.j0
    public Animator o0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        c0.e(view);
        return s0(view, t0(sVar, 1.0f), 0.0f);
    }

    public final Animator s0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        c0.g(view, f10);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, c0.f32675b, f11);
        ofFloat.addListener(new b(view));
        b(new a(view));
        return ofFloat;
    }

    public d() {
    }
}
