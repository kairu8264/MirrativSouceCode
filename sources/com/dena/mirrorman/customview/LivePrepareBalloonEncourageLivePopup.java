package com.dena.mirrorman.customview;

import ae.mk;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import ao.d;
import co.f;
import co.l;
import com.dena.mirrorman.net.glide.GlideApp;
import io.p;
import nd.v0;
import uo.b0;
import uo.d2;
import uo.g1;
import uo.i2;
import uo.q0;
import uo.r0;
import wn.v;

/* loaded from: classes2.dex */
public final class LivePrepareBalloonEncourageLivePopup extends FrameLayout {

    /* renamed from: w  reason: collision with root package name */
    public Animation f25474w;

    /* renamed from: x  reason: collision with root package name */
    public b0 f25475x;

    @f(c = "com.dena.mirrorman.customview.LivePrepareBalloonEncourageLivePopup$startBoundAnimationToView$1", f = "LivePrepareBalloonEncourageLivePopup.kt", l = {50}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends l implements p<q0, d<? super v>, Object> {
        public int A;
        public final /* synthetic */ View B;
        public final /* synthetic */ LivePrepareBalloonEncourageLivePopup C;

        /* renamed from: w  reason: collision with root package name */
        public int f25476w;

        /* renamed from: x  reason: collision with root package name */
        public int f25477x;

        /* renamed from: y  reason: collision with root package name */
        public Object f25478y;

        /* renamed from: z  reason: collision with root package name */
        public Object f25479z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, LivePrepareBalloonEncourageLivePopup livePrepareBalloonEncourageLivePopup, d<? super a> dVar) {
            super(2, dVar);
            this.B = view;
            this.C = livePrepareBalloonEncourageLivePopup;
        }

        @Override // co.a
        public final d<v> create(Object obj, d<?> dVar) {
            return new a(this.B, this.C, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x004c -> B:13:0x004f). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r8.A
                r2 = 1
                if (r1 == 0) goto L24
                if (r1 != r2) goto L1c
                int r1 = r8.f25477x
                int r3 = r8.f25476w
                java.lang.Object r4 = r8.f25479z
                com.dena.mirrorman.customview.LivePrepareBalloonEncourageLivePopup r4 = (com.dena.mirrorman.customview.LivePrepareBalloonEncourageLivePopup) r4
                java.lang.Object r5 = r8.f25478y
                android.view.View r5 = (android.view.View) r5
                wn.m.b(r9)
                r9 = r8
                goto L4f
            L1c:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L24:
                wn.m.b(r9)
                r9 = 500(0x1f4, float:7.0E-43)
                android.view.View r1 = r8.B
                com.dena.mirrorman.customview.LivePrepareBalloonEncourageLivePopup r3 = r8.C
                r4 = 0
                r5 = r1
                r1 = r4
                r4 = r3
                r3 = r9
                r9 = r8
            L33:
                if (r1 >= r3) goto L51
                android.view.animation.Animation r6 = com.dena.mirrorman.customview.LivePrepareBalloonEncourageLivePopup.a(r4)
                r5.startAnimation(r6)
                r6 = 2000(0x7d0, double:9.88E-321)
                r9.f25478y = r5
                r9.f25479z = r4
                r9.f25476w = r3
                r9.f25477x = r1
                r9.A = r2
                java.lang.Object r6 = uo.b1.a(r6, r9)
                if (r6 != r0) goto L4f
                return r0
            L4f:
                int r1 = r1 + r2
                goto L33
            L51:
                wn.v r9 = wn.v.f59242a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.customview.LivePrepareBalloonEncourageLivePopup.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivePrepareBalloonEncourageLivePopup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b0 b10;
        jo.p.h(context, "context");
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), v0.live_balloon_effect);
        jo.p.g(loadAnimation, "loadAnimation(context, R.anim.live_balloon_effect)");
        this.f25474w = loadAnimation;
        b10 = i2.b(null, 1, null);
        this.f25475x = b10;
    }

    public final void b(String str) {
        jo.p.h(str, "url");
        removeAllViews();
        mk T = mk.T(LayoutInflater.from(getContext()), this, true);
        jo.p.g(T, "inflate(LayoutInflater.from(context), this, true)");
        GlideApp.with(this).load(str).into(T.B);
        View u10 = T.u();
        jo.p.g(u10, "binding.root");
        c(u10);
    }

    public final void c(View view) {
        b0 b10;
        d2.a.a(this.f25475x, null, 1, null);
        b10 = i2.b(null, 1, null);
        this.f25475x = b10;
        uo.l.d(r0.a(g1.c().plus(this.f25475x)), null, null, new a(view, this, null), 3, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f25474w.cancel();
        d2.a.a(this.f25475x, null, 1, null);
        super.onDetachedFromWindow();
    }
}
