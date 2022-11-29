package androidx.compose.ui.platform;

import android.os.Handler;
import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import uo.d2;

/* loaded from: classes.dex */
public final class r2 {

    /* renamed from: a  reason: collision with root package name */
    public static final r2 f14594a = new r2();

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReference<q2> f14595b = new AtomicReference<>(q2.f14588a.a());

    /* renamed from: c  reason: collision with root package name */
    public static final int f14596c = 8;

    /* loaded from: classes.dex */
    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ uo.d2 f14597w;

        public a(uo.d2 d2Var) {
            this.f14597w = d2Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            jo.p.h(view, "v");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            jo.p.h(view, "v");
            view.removeOnAttachStateChangeListener(this);
            d2.a.a(this.f14597w, null, 1, null);
        }
    }

    @co.f(c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", f = "WindowRecomposer.android.kt", l = {233}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f14598w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l0.g1 f14599x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ View f14600y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l0.g1 g1Var, View view, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f14599x = g1Var;
            this.f14600y = view;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f14599x, this.f14600y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            View view;
            Object c10 = bo.c.c();
            int i10 = this.f14598w;
            try {
                if (i10 == 0) {
                    wn.m.b(obj);
                    l0.g1 g1Var = this.f14599x;
                    this.f14598w = 1;
                    if (g1Var.b0(this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                if (WindowRecomposer_androidKt.f(view) == this.f14599x) {
                    WindowRecomposer_androidKt.i(this.f14600y, null);
                }
                return wn.v.f59242a;
            } finally {
                if (WindowRecomposer_androidKt.f(this.f14600y) == this.f14599x) {
                    WindowRecomposer_androidKt.i(this.f14600y, null);
                }
            }
        }
    }

    public final l0.g1 a(View view) {
        uo.d2 d10;
        jo.p.h(view, "rootView");
        l0.g1 a10 = f14595b.get().a(view);
        WindowRecomposer_androidKt.i(view, a10);
        uo.v1 v1Var = uo.v1.f56093w;
        Handler handler = view.getHandler();
        jo.p.g(handler, "rootView.handler");
        d10 = uo.l.d(v1Var, vo.d.b(handler, "windowRecomposer cleanup").k0(), null, new b(a10, view, null), 2, null);
        view.addOnAttachStateChangeListener(new a(d10));
        return a10;
    }
}
