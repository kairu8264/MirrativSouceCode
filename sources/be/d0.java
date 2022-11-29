package be;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import com.dena.mirrorman.customview.RoundedButtonView;
import uo.d2;

/* loaded from: classes2.dex */
public final class d0 extends androidx.fragment.app.e implements uo.q0 {
    public static final a Q0 = new a(null);
    public static final int R0 = 8;
    public final /* synthetic */ da.j N0;
    public uo.d2 O0;
    public final wn.f P0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final d0 a(jf.p0 p0Var) {
            jo.p.h(p0Var, "reconnectCollabInfo");
            d0 d0Var = new d0();
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_RECONNECT_COLLAB_INFO", p0Var);
            d0Var.V2(bundle);
            return d0Var;
        }
    }

    @co.f(c = "com.dena.mirrorman.dialog.CollabReconnectingDialog$createReconnectJob$1", f = "CollabReconnectingDialog.kt", l = {73}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f17774w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ ae.n1 f17775x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ d0 f17776y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f17777z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ae.n1 n1Var, d0 d0Var, String str, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f17775x = n1Var;
            this.f17776y = d0Var;
            this.f17777z = str;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f17775x, this.f17776y, this.f17777z, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f17774w;
            if (i10 == 0) {
                wn.m.b(obj);
                this.f17774w = 1;
                if (uo.b1.a(30000L, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            this.f17775x.C.setVisibility(0);
            this.f17775x.D.setText(this.f17776y.V0(nd.f1.f41976i1, this.f17777z));
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ae.n1 f17778w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ d0 f17779x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ jf.p0 f17780y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ae.n1 n1Var, d0 d0Var, jf.p0 p0Var) {
            super(1);
            this.f17778w = n1Var;
            this.f17779x = d0Var;
            this.f17780y = p0Var;
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            this.f17778w.C.setVisibility(8);
            this.f17778w.D.setText(this.f17779x.V0(nd.f1.text_collab_waiting_reconnect_title, this.f17780y.b()));
            this.f17779x.E3().n(this.f17780y.a());
            d0 d0Var = this.f17779x;
            ae.n1 n1Var = this.f17778w;
            jo.p.g(n1Var, "binding");
            d0Var.D3(n1Var, this.f17780y.b());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<od.f> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f17781w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17782x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17783y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f17781w = componentCallbacks;
            this.f17782x = aVar;
            this.f17783y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.f] */
        @Override // io.a
        public final od.f invoke() {
            ComponentCallbacks componentCallbacks = this.f17781w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.f.class), this.f17782x, this.f17783y);
        }
    }

    public d0() {
        super(nd.b1.dialog_fragment_collab_loading_dialog);
        this.N0 = new da.j();
        this.P0 = wn.g.b(wn.i.SYNCHRONIZED, new d(this, null, null));
    }

    public final void D3(ae.n1 n1Var, String str) {
        uo.d2 d10;
        uo.d2 d2Var = this.O0;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        d10 = uo.l.d(this, null, null, new b(n1Var, this, str, null), 3, null);
        this.O0 = d10;
    }

    public final od.f E3() {
        return (od.f) this.P0.getValue();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        uo.d2 d2Var = this.O0;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        uo.r0.d(this, null, 1, null);
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        jo.p.h(view, "view");
        ae.n1 T = ae.n1.T(view);
        Drawable background = T.B.getBackground();
        jo.p.f(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
        ((AnimationDrawable) background).start();
        w3(false);
        Parcelable parcelable = M2().getParcelable("EXTRA_RECONNECT_COLLAB_INFO");
        jo.p.e(parcelable);
        jf.p0 p0Var = (jf.p0) parcelable;
        if (p0Var.c()) {
            T.C.setVisibility(8);
            T.D.setText(V0(nd.f1.text_collab_waiting_reconnect_title, p0Var.b()));
        } else {
            T.C.setVisibility(0);
            T.D.setText(V0(nd.f1.f41976i1, p0Var.b()));
        }
        jo.p.g(T, "binding");
        D3(T, p0Var.b());
        RoundedButtonView roundedButtonView = T.C;
        jo.p.g(roundedButtonView, "binding.reconnectButtonView");
        yd.g1.a(roundedButtonView, new c(T, this, p0Var));
        Dialog p32 = p3();
        if (p32 == null || (window = p32.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), nd.g1.f42004a);
    }
}
