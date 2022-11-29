package com.dena.mirrorman.customview;

import ae.sa;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import ao.d;
import co.f;
import co.l;
import io.p;
import nd.b1;
import uo.b0;
import uo.d2;
import uo.g1;
import uo.i2;
import uo.q0;
import uo.r0;
import wn.v;

/* loaded from: classes2.dex */
public final class GiftGachaRare4OpenAnimationView extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public final sa f25431w;

    /* renamed from: x  reason: collision with root package name */
    public d2 f25432x;

    /* renamed from: y  reason: collision with root package name */
    public io.a<v> f25433y;

    @f(c = "com.dena.mirrorman.customview.GiftGachaRare4OpenAnimationView$start$1", f = "GiftGachaRare4OpenAnimationView.kt", l = {46, 54}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends l implements p<q0, d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f25434w;

        public a(d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final d<v> create(Object obj, d<?> dVar) {
            return new a(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r6.f25434w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                wn.m.b(r7)
                goto L66
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                wn.m.b(r7)
                goto L2c
            L1e:
                wn.m.b(r7)
                r4 = 500(0x1f4, double:2.47E-321)
                r6.f25434w = r3
                java.lang.Object r7 = uo.b1.a(r4, r6)
                if (r7 != r0) goto L2c
                return r0
            L2c:
                com.dena.mirrorman.customview.GiftGachaRare4OpenAnimationView r7 = com.dena.mirrorman.customview.GiftGachaRare4OpenAnimationView.this
                ae.sa r7 = com.dena.mirrorman.customview.GiftGachaRare4OpenAnimationView.a(r7)
                android.view.View r7 = r7.B
                r1 = 0
                r7.setVisibility(r1)
                com.dena.mirrorman.customview.GiftGachaRare4OpenAnimationView r7 = com.dena.mirrorman.customview.GiftGachaRare4OpenAnimationView.this
                ae.sa r7 = com.dena.mirrorman.customview.GiftGachaRare4OpenAnimationView.a(r7)
                android.view.View r7 = r7.B
                android.view.animation.AlphaAnimation r1 = new android.view.animation.AlphaAnimation
                r3 = 0
                r4 = 1065353216(0x3f800000, float:1.0)
                r1.<init>(r3, r4)
                r3 = 200(0xc8, double:9.9E-322)
                r1.setDuration(r3)
                r7.startAnimation(r1)
                com.dena.mirrorman.customview.GiftGachaRare4OpenAnimationView r7 = com.dena.mirrorman.customview.GiftGachaRare4OpenAnimationView.this
                ae.sa r7 = com.dena.mirrorman.customview.GiftGachaRare4OpenAnimationView.a(r7)
                com.airbnb.lottie.LottieAnimationView r7 = r7.C
                r7.r()
                r3 = 3500(0xdac, double:1.729E-320)
                r6.f25434w = r2
                java.lang.Object r7 = uo.b1.a(r3, r6)
                if (r7 != r0) goto L66
                return r0
            L66:
                com.dena.mirrorman.customview.GiftGachaRare4OpenAnimationView r7 = com.dena.mirrorman.customview.GiftGachaRare4OpenAnimationView.this
                ae.sa r7 = com.dena.mirrorman.customview.GiftGachaRare4OpenAnimationView.a(r7)
                android.view.View r7 = r7.B
                r0 = 8
                r7.setVisibility(r0)
                com.dena.mirrorman.customview.GiftGachaRare4OpenAnimationView r7 = com.dena.mirrorman.customview.GiftGachaRare4OpenAnimationView.this
                io.a r7 = r7.getAnimationEndListener()
                if (r7 == 0) goto L7e
                r7.invoke()
            L7e:
                wn.v r7 = wn.v.f59242a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.customview.GiftGachaRare4OpenAnimationView.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftGachaRare4OpenAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b0 b10;
        jo.p.h(context, "context");
        jo.p.h(attributeSet, "attrs");
        this.f25431w = (sa) androidx.databinding.f.e(LayoutInflater.from(getContext()), b1.view_gift_gacha_rare4_open_animation, this, true);
        b10 = i2.b(null, 1, null);
        this.f25432x = b10;
    }

    public final void b() {
        d2 d10;
        this.f25431w.C.h();
        this.f25431w.B.setVisibility(8);
        d2.a.a(this.f25432x, null, 1, null);
        d10 = uo.l.d(r0.a(g1.c()), null, null, new a(null), 3, null);
        this.f25432x = d10;
    }

    public final io.a<v> getAnimationEndListener() {
        return this.f25433y;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        d2.a.a(this.f25432x, null, 1, null);
        this.f25433y = null;
        super.onDetachedFromWindow();
    }

    public final void setAnimationEndListener(io.a<v> aVar) {
        this.f25433y = aVar;
    }
}
