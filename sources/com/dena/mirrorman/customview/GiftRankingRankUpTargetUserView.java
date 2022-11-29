package com.dena.mirrorman.customview;

import ae.sb;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import ao.d;
import ao.g;
import bo.c;
import co.f;
import co.l;
import com.dena.mirrorman.customview.GiftRankingRankUpTargetUserView;
import da.j;
import io.p;
import jo.h;
import nd.b1;
import td.b;
import ud.g1;
import uo.q0;
import uo.r0;
import wn.m;
import wn.v;

/* loaded from: classes2.dex */
public final class GiftRankingRankUpTargetUserView extends FrameLayout implements q0 {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ j f25453w;

    /* renamed from: x  reason: collision with root package name */
    public final sb f25454x;

    @f(c = "com.dena.mirrorman.customview.GiftRankingRankUpTargetUserView$playAnimation$1", f = "GiftRankingRankUpTargetUserView.kt", l = {69}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends l implements p<q0, d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f25455w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ g1 f25456x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ long f25457y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ GiftRankingRankUpTargetUserView f25458z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g1 g1Var, long j10, GiftRankingRankUpTargetUserView giftRankingRankUpTargetUserView, d<? super a> dVar) {
            super(2, dVar);
            this.f25456x = g1Var;
            this.f25457y = j10;
            this.f25458z = giftRankingRankUpTargetUserView;
        }

        public static final void i(GiftRankingRankUpTargetUserView giftRankingRankUpTargetUserView, ValueAnimator valueAnimator) {
            giftRankingRankUpTargetUserView.f25454x.L.setText(valueAnimator.getAnimatedValue().toString());
        }

        public static final void j(GiftRankingRankUpTargetUserView giftRankingRankUpTargetUserView, ValueAnimator valueAnimator) {
            AppCompatTextView appCompatTextView = giftRankingRankUpTargetUserView.f25454x.J;
            jo.p.g(appCompatTextView, "binding.rankProfilePointTextView");
            Object animatedValue = valueAnimator.getAnimatedValue();
            jo.p.f(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            b.d(appCompatTextView, (Integer) animatedValue, Boolean.TRUE);
        }

        @Override // co.a
        public final d<v> create(Object obj, d<?> dVar) {
            return new a(this.f25456x, this.f25457y, this.f25458z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = c.c();
            int i10 = this.f25455w;
            if (i10 == 0) {
                m.b(obj);
                AnimatorSet animatorSet = new AnimatorSet();
                g1 g1Var = this.f25456x;
                long j10 = this.f25457y;
                final GiftRankingRankUpTargetUserView giftRankingRankUpTargetUserView = this.f25458z;
                ValueAnimator ofInt = ValueAnimator.ofInt(g1Var.b(), g1Var.a());
                ofInt.setInterpolator(new DecelerateInterpolator());
                ofInt.setDuration(j10);
                ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: yd.a0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        GiftRankingRankUpTargetUserView.a.i(GiftRankingRankUpTargetUserView.this, valueAnimator);
                    }
                });
                v vVar = v.f59242a;
                ValueAnimator ofInt2 = ValueAnimator.ofInt(0, g1Var.e());
                ofInt2.setInterpolator(new DecelerateInterpolator());
                ofInt2.setDuration(j10);
                ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: yd.b0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        GiftRankingRankUpTargetUserView.a.j(GiftRankingRankUpTargetUserView.this, valueAnimator);
                    }
                });
                animatorSet.playTogether(ofInt, ofInt2);
                this.f25455w = 1;
                if (de.b.a(animatorSet, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            return v.f59242a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GiftRankingRankUpTargetUserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        jo.p.h(context, "context");
    }

    public /* synthetic */ GiftRankingRankUpTargetUserView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @SuppressLint({"Recycle"})
    public final void b(g1 g1Var, long j10) {
        jo.p.h(g1Var, "bindModel");
        this.f25454x.T(g1Var);
        uo.l.d(this, null, null, new a(g1Var, j10, this, null), 3, null);
    }

    @Override // uo.q0
    public g getCoroutineContext() {
        return this.f25453w.getCoroutineContext();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        r0.d(this, null, 1, null);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftRankingRankUpTargetUserView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        jo.p.h(context, "context");
        this.f25453w = new j();
        this.f25454x = (sb) androidx.databinding.f.e(LayoutInflater.from(context), b1.view_gift_ranking_rank_up_target_user, this, true);
    }
}
