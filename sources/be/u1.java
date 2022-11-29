package be;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.AutoClearedValue;

/* loaded from: classes2.dex */
public final class u1 extends androidx.fragment.app.e implements gf.f0, uo.q0 {
    public final /* synthetic */ da.j N0 = new da.j();
    public final AutoClearedValue O0 = nd.a.a(this);
    public static final /* synthetic */ qo.h<Object>[] Q0 = {jo.f0.d(new jo.s(u1.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/DialogFragmentGiftGachaOpenNormalBinding;", 0))};
    public static final a P0 = new a(null);
    public static final int R0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final u1 a() {
            return new u1();
        }
    }

    public final ae.b3 B3() {
        return (ae.b3) this.O0.b(this, Q0[0]);
    }

    public final void C3(ae.b3 b3Var) {
        this.O0.a(this, Q0[0], b3Var);
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(N2()), nd.b1.dialog_fragment_gift_gacha_open_normal, null, false);
        jo.p.g(e10, "inflate(\n            Lay…          false\n        )");
        C3((ae.b3) e10);
        View u10 = B3().u();
        jo.p.g(u10, "binding.root");
        return u10;
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
        jo.p.h(view, "view");
        p0().k().r(B3().B.getId(), gf.e0.A0.a()).i();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), 16973913);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void t1(Bundle bundle) {
        Window window;
        super.t1(bundle);
        w3(false);
        Dialog p32 = p3();
        if (p32 == null || (window = p32.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
    }
}
