package md;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import yd.g1;

/* loaded from: classes2.dex */
public final class b extends com.google.android.material.bottomsheet.b {
    public static final a R0 = new a(null);
    public static final int S0 = 8;
    public final wn.f O0 = wn.g.a(new c());
    public final wn.f P0 = wn.g.a(new d());
    public pc.c0 Q0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final b a(String str, String str2) {
            jo.p.h(str, "referer");
            jo.p.h(str2, "userId");
            b bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_REFERER", str);
            bundle.putString("EXTRA_KEY_USER_ID", str2);
            bVar.V2(bundle);
            return bVar;
        }
    }

    /* renamed from: md.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0602b extends jo.q implements io.l<View, wn.v> {
        public C0602b() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            b.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<String> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = b.this.M2().getString("EXTRA_KEY_REFERER");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<String> {
        public d() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = b.this.M2().getString("EXTRA_KEY_USER_ID");
            jo.p.e(string);
            return string;
        }
    }

    public static final void I3(b bVar, DialogInterface dialogInterface) {
        jo.p.h(bVar, "this$0");
        pc.c0 c0Var = bVar.Q0;
        if (c0Var == null) {
            return;
        }
        bVar.J3(c0Var);
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AppCompatImageView appCompatImageView;
        jo.p.h(layoutInflater, "inflater");
        this.Q0 = pc.c0.T(layoutInflater);
        Dialog p32 = p3();
        if (p32 != null) {
            p32.setOnShowListener(new DialogInterface.OnShowListener() { // from class: md.a
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    b.I3(b.this, dialogInterface);
                }
            });
        }
        pc.c0 c0Var = this.Q0;
        if (c0Var != null && (appCompatImageView = c0Var.B) != null) {
            g1.a(appCompatImageView, new C0602b());
        }
        p0().k().r(nc.e.fragment_container_view, gf.n0.G0.a(G3(), null, H3())).i();
        pc.c0 c0Var2 = this.Q0;
        jo.p.e(c0Var2);
        View u10 = c0Var2.u();
        jo.p.g(u10, "binding!!.root");
        return u10;
    }

    public final String G3() {
        return (String) this.O0.getValue();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void H1() {
        super.H1();
        this.Q0 = null;
    }

    public final String H3() {
        return (String) this.P0.getValue();
    }

    public final void J3(pc.c0 c0Var) {
        int b10 = O0().getDisplayMetrics().heightPixels - de.e.b(this, 20);
        int b11 = b10 - de.e.b(this, 72);
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.g(c0Var.C);
        cVar.l(c0Var.D.getId(), b11);
        cVar.c(c0Var.C);
        Dialog p32 = p3();
        jo.p.f(p32, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        View findViewById = ((com.google.android.material.bottomsheet.a) p32).findViewById(nc.e.F1);
        if (findViewById != null) {
            BottomSheetBehavior c02 = BottomSheetBehavior.c0(findViewById);
            jo.p.g(c02, "from(bottomSheet)");
            c02.z0(3);
            c02.v0(b10);
            findViewById.setBackgroundColor(c3.a.d(N2(), 17170445));
        }
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void c2() {
        Window window;
        FrameLayout frameLayout;
        super.c2();
        Dialog p32 = p3();
        if (p32 == null || (window = p32.getWindow()) == null || (frameLayout = (FrameLayout) window.findViewById(nc.e.F1)) == null) {
            return;
        }
        BottomSheetBehavior.c0(frameLayout).u0(-1);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        jo.p.h(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        pc.c0 c0Var = this.Q0;
        if (c0Var != null) {
            J3(c0Var);
        }
    }
}
