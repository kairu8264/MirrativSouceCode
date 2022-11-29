package be;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.fragment.ChooseMyProfileFragment;

/* loaded from: classes2.dex */
public final class v extends androidx.fragment.app.e implements gf.t {
    public boolean O0;
    public w P0;
    public static final /* synthetic */ qo.h<Object>[] S0 = {jo.f0.d(new jo.s(v.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/DialogFragmentChooseMyProfileBinding;", 0))};
    public static final a R0 = new a(null);
    public static final int T0 = 8;
    public final AutoClearedValue N0 = nd.a.a(this);
    public final wn.f Q0 = wn.g.b(wn.i.SYNCHRONIZED, new b(this, null, null));

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final v a() {
            return new v();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f18250w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f18251x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f18252y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f18250w = componentCallbacks;
            this.f18251x = aVar;
            this.f18252y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f18250w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f18251x, this.f18252y);
        }
    }

    public final ae.l1 B3() {
        return (ae.l1) this.N0.b(this, S0[0]);
    }

    public final MRLogger C3() {
        return (MRLogger) this.Q0.getValue();
    }

    public final void D3(ae.l1 l1Var) {
        this.N0.a(this, S0[0], l1Var);
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        ViewDataBinding e10 = androidx.databinding.f.e(layoutInflater, nd.b1.dialog_fragment_choose_my_profile, viewGroup, false);
        jo.p.g(e10, "inflate(\n            inf…          false\n        )");
        D3((ae.l1) e10);
        View u10 = B3().u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        if (!this.O0) {
            MRLogger C3 = C3();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_DEMOGRAPHIC);
            builder.setTargetType("reg_cancel");
            C3.sendLog(builder.build());
        }
        this.P0 = null;
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        super.e2(view, bundle);
        ChooseMyProfileFragment.a aVar = ChooseMyProfileFragment.I0;
        String U0 = U0(nd.f1.text_tutorial_btn_close);
        jo.p.g(U0, "getString(R.string.text_tutorial_btn_close)");
        p0().k().r(nd.z0.f42362w5, aVar.a(U0, nd.y0.bg_tealish_vertical_gradient_round_12, true)).i();
    }

    @Override // gf.t
    public void o0() {
        this.O0 = true;
        w wVar = this.P0;
        if (wVar != null) {
            wVar.w();
        }
        m3();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        Dialog dialog = new Dialog(N2(), nd.g1.f42010i);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(nd.w0.Q0);
        }
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void t1(Bundle bundle) {
        Window window;
        super.t1(bundle);
        Dialog p32 = p3();
        if (p32 == null || (window = p32.getWindow()) == null) {
            return;
        }
        window.setLayout(Math.min(de.e.b(this, 360), O0().getDisplayMetrics().widthPixels - de.e.b(this, 40)), de.e.b(this, 620));
    }

    @Override // gf.t
    public void w1() {
        m3();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        w wVar = null;
        w wVar2 = context instanceof w ? (w) context : null;
        if (wVar2 == null) {
            Fragment H0 = H0();
            if (H0 instanceof w) {
                wVar = (w) H0;
            }
        } else {
            wVar = wVar2;
        }
        this.P0 = wVar;
    }
}
