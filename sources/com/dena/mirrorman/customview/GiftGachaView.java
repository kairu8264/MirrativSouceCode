package com.dena.mirrorman.customview;

import ae.ka;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b0;
import ao.d;
import co.f;
import com.dena.mirrorman.customview.GaugeView;
import com.dena.mirrorman.customview.GiftGachaView;
import de.n;
import ia.a;
import io.l;
import io.p;
import java.util.List;
import jo.q;
import nd.b1;
import rd.a0;
import ud.m0;
import ud.n0;
import ud.o0;
import uo.d2;
import uo.g1;
import uo.q0;
import uo.r0;
import wn.v;
import yd.w;
import yd.x;

/* loaded from: classes2.dex */
public final class GiftGachaView extends FrameLayout {
    public int A;

    /* renamed from: w  reason: collision with root package name */
    public final ka f25436w;

    /* renamed from: x  reason: collision with root package name */
    public l<? super m0, v> f25437x;

    /* renamed from: y  reason: collision with root package name */
    public l<? super o0, v> f25438y;

    /* renamed from: z  reason: collision with root package name */
    public d2 f25439z;

    /* loaded from: classes2.dex */
    public static final class a implements ia.a {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            d2 d2Var = GiftGachaView.this.f25439z;
            if (d2Var != null) {
                d2.a.a(d2Var, null, 1, null);
            }
            GiftGachaView.this.f25436w.I.setVisibility(8);
            GiftGachaView.this.f25436w.C.setVisibility(8);
            GiftGachaView.this.f25436w.D.setVisibility(8);
            GiftGachaView.this.f25436w.E.setVisibility(8);
            GiftGachaView.this.f25436w.K.setVisibility(0);
            GiftGachaView.this.f25436w.F.setVisibility(8);
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

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.a<v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ long f25442x;

        /* loaded from: classes2.dex */
        public static final class a implements ia.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ GiftGachaView f25443a;

            public a(GiftGachaView giftGachaView) {
                this.f25443a = giftGachaView;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                this.f25443a.f25436w.K.setVisibility(8);
                this.f25443a.f25436w.H.setVisibility(8);
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
        public b(long j10) {
            super(0);
            this.f25442x = j10;
        }

        public final void a() {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(200L);
            alphaAnimation.setAnimationListener(new a(GiftGachaView.this));
            GiftGachaView.this.f25436w.K.startAnimation(alphaAnimation);
            GiftGachaView.this.f25436w.H.startAnimation(alphaAnimation);
            GiftGachaView.this.f25436w.I.setVisibility(0);
            GiftGachaView.this.f25436w.I.setVisibility(0);
            GiftGachaView.this.f25436w.C.setVisibility(0);
            GiftGachaView.this.f25436w.D.setVisibility(0);
            GiftGachaView.this.f25436w.E.setVisibility(0);
            GiftGachaView.this.f25436w.F.setVisibility(0);
            GiftGachaView.this.f25436w.I.r();
            GiftGachaView.this.f25436w.D.r();
            GiftGachaView.this.f25436w.E.r();
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation2.setDuration(200L);
            GiftGachaView.this.f25436w.I.startAnimation(alphaAnimation2);
            GiftGachaView.this.f25436w.I.startAnimation(alphaAnimation2);
            GiftGachaView.this.f25436w.C.startAnimation(alphaAnimation2);
            GiftGachaView.this.f25436w.D.startAnimation(alphaAnimation2);
            GiftGachaView.this.f25436w.E.startAnimation(alphaAnimation2);
            GiftGachaView giftGachaView = GiftGachaView.this;
            giftGachaView.k(giftGachaView.A, GiftGachaView.this.A);
            GiftGachaView.this.o(this.f25442x);
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    @f(c = "com.dena.mirrorman.customview.GiftGachaView$updateCountDownJob$1", f = "GiftGachaView.kt", l = {219, 221}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements p<q0, d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f25444w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ long f25445x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ GiftGachaView f25446y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j10, GiftGachaView giftGachaView, d<? super c> dVar) {
            super(2, dVar);
            this.f25445x = j10;
            this.f25446y = giftGachaView;
        }

        @Override // co.a
        public final d<v> create(Object obj, d<?> dVar) {
            return new c(this.f25445x, this.f25446y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00d4  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0038 -> B:17:0x003b). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                r16 = this;
                r0 = r16
                java.lang.Object r1 = bo.c.c()
                int r2 = r0.f25444w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L21
                if (r2 == r4) goto L1d
                if (r2 != r3) goto L15
                wn.m.b(r17)
                r2 = r0
                goto L3b
            L15:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L1d:
                wn.m.b(r17)
                goto L2f
            L21:
                wn.m.b(r17)
                r5 = 100
                r0.f25444w = r4
                java.lang.Object r2 = uo.b1.a(r5, r0)
                if (r2 != r1) goto L2f
                return r1
            L2f:
                r2 = r0
            L30:
                r5 = 16
                r2.f25444w = r3
                java.lang.Object r5 = uo.b1.a(r5, r2)
                if (r5 != r1) goto L3b
                return r1
            L3b:
                long r5 = r2.f25445x
                r7 = 1000(0x3e8, double:4.94E-321)
                long r5 = r5 * r7
                long r9 = java.lang.System.currentTimeMillis()
                long r5 = r5 - r9
                jo.i0 r9 = jo.i0.f38149a
                java.lang.Object[] r9 = new java.lang.Object[r4]
                long r10 = r5 / r7
                r12 = 60
                long r12 = (long) r12
                long r14 = r10 / r12
                java.lang.Long r14 = co.b.e(r14)
                r15 = 0
                r9[r15] = r14
                java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r4)
                java.lang.String r14 = "%02d"
                java.lang.String r9 = java.lang.String.format(r14, r9)
                java.lang.String r3 = "format(format, *args)"
                jo.p.g(r9, r3)
                java.lang.Object[] r7 = new java.lang.Object[r4]
                long r10 = r10 % r12
                java.lang.Long r8 = co.b.e(r10)
                r7[r15] = r8
                java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r4)
                java.lang.String r7 = java.lang.String.format(r14, r7)
                jo.p.g(r7, r3)
                java.lang.Object[] r8 = new java.lang.Object[r4]
                r10 = 1000(0x3e8, double:4.94E-321)
                long r10 = r5 % r10
                r12 = 10
                long r12 = (long) r12
                long r10 = r10 / r12
                java.lang.Long r10 = co.b.e(r10)
                r8[r15] = r10
                java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r4)
                java.lang.String r8 = java.lang.String.format(r14, r8)
                jo.p.g(r8, r3)
                com.dena.mirrorman.customview.GiftGachaView r3 = r2.f25446y
                ae.ka r3 = com.dena.mirrorman.customview.GiftGachaView.b(r3)
                androidx.appcompat.widget.AppCompatTextView r3 = r3.C
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r9)
                r9 = 58
                r10.append(r9)
                r10.append(r7)
                r10.append(r9)
                r10.append(r8)
                java.lang.String r7 = r10.toString()
                r3.setText(r7)
                r7 = 0
                int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r3 > 0) goto Ld4
                com.dena.mirrorman.customview.GiftGachaView r1 = r2.f25446y
                r1.f()
                com.dena.mirrorman.customview.GiftGachaView r1 = r2.f25446y
                uo.d2 r1 = com.dena.mirrorman.customview.GiftGachaView.c(r1)
                if (r1 == 0) goto Ld1
                r2 = 0
                uo.d2.a.a(r1, r2, r4, r2)
            Ld1:
                wn.v r1 = wn.v.f59242a
                return r1
            Ld4:
                r3 = 2
                goto L30
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.customview.GiftGachaView.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftGachaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        jo.p.h(context, "context");
        jo.p.h(attributeSet, "attrs");
        ka kaVar = (ka) androidx.databinding.f.e(LayoutInflater.from(getContext()), b1.view_gift_gacha, this, true);
        this.f25436w = kaVar;
        kaVar.L.setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView.m itemAnimator = kaVar.L.getItemAnimator();
        b0 b0Var = itemAnimator instanceof b0 ? (b0) itemAnimator : null;
        if (b0Var != null) {
            b0Var.S(false);
        }
        kaVar.L.g(new p001if.c(n.b(this, 8), 0, 0, 0, 0, 0, 32, null));
        kaVar.L.setAdapter(new a0(new w(this), new x(this)));
        GaugeView.a aVar = GaugeView.J;
        GaugeView gaugeView = kaVar.G;
        jo.p.g(gaugeView, "binding.feverGaugeView");
        GaugeView.a.b(aVar, gaugeView, new int[]{Color.parseColor("#ff7676"), Color.parseColor("#ffee00"), Color.parseColor("#96ff00"), Color.parseColor("#00abff")}, false, 2, null);
    }

    public static final void m(boolean z10, GiftGachaView giftGachaView) {
        jo.p.h(giftGachaView, "this$0");
        if (z10) {
            giftGachaView.f25436w.L.x1(0);
        }
    }

    public final void f() {
        if (g()) {
            k(0, this.A);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(200L);
            alphaAnimation.setAnimationListener(new a());
            this.f25436w.I.startAnimation(alphaAnimation);
            this.f25436w.C.startAnimation(alphaAnimation);
            this.f25436w.D.startAnimation(alphaAnimation);
            this.f25436w.E.startAnimation(alphaAnimation);
            this.f25436w.I.clearAnimation();
            this.f25436w.D.clearAnimation();
            this.f25436w.E.clearAnimation();
            this.f25436w.K.setVisibility(0);
            BorderedTextView borderedTextView = this.f25436w.K;
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation2.setDuration(200L);
            borderedTextView.startAnimation(alphaAnimation2);
        }
    }

    public final boolean g() {
        return this.f25436w.H.getVisibility() == 0 || this.f25436w.I.getVisibility() == 0;
    }

    public final l<o0, v> getOnClickGiftGachaMutualGift() {
        return this.f25438y;
    }

    public final l<m0, v> getOnClickGiftGachaStock() {
        return this.f25437x;
    }

    public final void h(boolean z10) {
        this.f25436w.J.setVisibility(z10 ? 0 : 8);
    }

    public final void i() {
        this.f25436w.I.clearAnimation();
        this.f25436w.D.clearAnimation();
        this.f25436w.E.clearAnimation();
        this.f25436w.C.setVisibility(8);
    }

    public final void j() {
        if (g()) {
            this.f25436w.I.r();
            this.f25436w.D.r();
            this.f25436w.E.r();
            this.f25436w.C.setVisibility(0);
        }
    }

    public final void k(int i10, int i11) {
        if (i11 <= 0 || i10 < 0) {
            return;
        }
        this.A = i11;
        BorderedTextView borderedTextView = this.f25436w.K;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10);
        sb2.append('/');
        sb2.append(i11);
        borderedTextView.setBorderedTextViewText(sb2.toString());
        GaugeView gaugeView = this.f25436w.G;
        jo.p.g(gaugeView, "binding.feverGaugeView");
        GaugeView.j(gaugeView, i10 / i11, true, false, 0L, 12, null);
    }

    public final void l(List<? extends n0> list, final boolean z10, boolean z11) {
        jo.p.h(list, "bindModels");
        if (z11) {
            this.f25436w.G.setVisibility(0);
        } else {
            this.f25436w.G.setVisibility(8);
        }
        RecyclerView.h adapter = this.f25436w.L.getAdapter();
        jo.p.f(adapter, "null cannot be cast to non-null type com.dena.mirrorman.adapter.GiftGachaStockAdapter");
        a0 a0Var = (a0) adapter;
        a0Var.k(z10);
        a0Var.f(list, new Runnable() { // from class: yd.v
            @Override // java.lang.Runnable
            public final void run() {
                GiftGachaView.m(z10, this);
            }
        });
    }

    public final void n(long j10) {
        if (g()) {
            o(j10);
            return;
        }
        this.f25436w.H.setVisibility(0);
        this.f25436w.H.a(new b(j10));
    }

    public final void o(long j10) {
        d2 d10;
        d2 d2Var = this.f25439z;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        d10 = uo.l.d(r0.a(g1.c()), null, null, new c(j10, this, null), 3, null);
        this.f25439z = d10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        d2 d2Var = this.f25439z;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        super.onDetachedFromWindow();
    }

    public final void setOnClickGiftGachaMutualGift(l<? super o0, v> lVar) {
        this.f25438y = lVar;
    }

    public final void setOnClickGiftGachaStock(l<? super m0, v> lVar) {
        this.f25437x = lVar;
    }
}
