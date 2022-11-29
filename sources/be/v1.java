package be;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

/* loaded from: classes2.dex */
public final class v1 extends androidx.fragment.app.e implements gf.f0, uo.q0 {
    public static final a O0 = new a(null);
    public static final int P0 = da.j.f29340x;
    public final /* synthetic */ da.j N0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final v1 a() {
            return new v1();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ae.d3 f18253w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ae.d3 d3Var) {
            super(0);
            this.f18253w = d3Var;
        }

        public final void a() {
            this.f18253w.E.setBackgroundResource(nd.w0.blackThree85);
            this.f18253w.B.setVisibility(0);
            this.f18253w.C.setVisibility(0);
            this.f18253w.C.r();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ wn.v invoke() {
            a();
            return wn.v.f59242a;
        }
    }

    public v1() {
        super(nd.b1.dialog_fragment_gift_gacha_open_rare);
        this.N0 = new da.j();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        uo.r0.d(this, null, 1, null);
        super.I1();
    }

    @Override // gf.f0
    public void close() {
        m3();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        ae.d3 T = ae.d3.T(view);
        p0().k().r(T.B.getId(), gf.e0.A0.a()).i();
        T.D.setAnimationEndListener(new b(T));
        T.D.b();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        Dialog dialog = new Dialog(N2(), 16973913);
        w3(false);
        return dialog;
    }
}
