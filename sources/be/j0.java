package be;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public final class j0 extends androidx.fragment.app.e {
    public static final a R0 = new a(null);
    public static final int S0 = 8;
    public final wn.f N0;
    public final wn.f O0;
    public final wn.f P0;
    public k0 Q0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public static /* synthetic */ j0 b(a aVar, String str, int i10, String str2, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = nd.f1.C3;
            }
            if ((i11 & 4) != 0) {
                str2 = "";
            }
            return aVar.a(str, i10, str2);
        }

        public final j0 a(String str, int i10, String str2) {
            jo.p.h(str, "message");
            jo.p.h(str2, "key");
            j0 j0Var = new j0();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_MESSAGE", str);
            bundle.putInt("EXTRA_KEY_OK_BUTTON_TEXT_RESOURCE_ID", i10);
            bundle.putString("EXTRA_KEY_KEY", str2);
            j0Var.V2(bundle);
            return j0Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<String> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = j0.this.M2().getString("EXTRA_KEY_KEY");
            jo.p.e(string);
            return string;
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
            String string = j0.this.M2().getString("EXTRA_KEY_MESSAGE");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<Integer> {
        public d() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Integer invoke() {
            return Integer.valueOf(j0.this.M2().getInt("EXTRA_KEY_OK_BUTTON_TEXT_RESOURCE_ID"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.l<View, wn.v> {
        public e() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            k0 k0Var = j0.this.Q0;
            if (k0Var != null) {
                k0Var.V(j0.this.D3());
            }
            j0.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.l<View, wn.v> {
        public f() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            j0.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public j0() {
        super(nd.b1.dialog_fragment_confirm);
        this.N0 = wn.g.a(new c());
        this.O0 = wn.g.a(new d());
        this.P0 = wn.g.a(new b());
    }

    public final String D3() {
        return (String) this.P0.getValue();
    }

    public final String E3() {
        return (String) this.N0.getValue();
    }

    public final int F3() {
        return ((Number) this.O0.getValue()).intValue();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.Q0 = null;
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        super.e2(view, bundle);
        ae.z1 T = ae.z1.T(view);
        T.C.setText(E3());
        T.D.setTitle(U0(F3()));
        RoundedButtonView roundedButtonView = T.D;
        jo.p.g(roundedButtonView, "binding.okButtonView");
        yd.g1.a(roundedButtonView, new e());
        RoundedButtonView roundedButtonView2 = T.B;
        jo.p.g(roundedButtonView2, "binding.cancelButtonView");
        yd.g1.a(roundedButtonView2, new f());
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), nd.g1.f42004a);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        k0 k0Var = null;
        k0 k0Var2 = context instanceof k0 ? (k0) context : null;
        if (k0Var2 == null) {
            Fragment H0 = H0();
            if (H0 instanceof k0) {
                k0Var = (k0) H0;
            }
        } else {
            k0Var = k0Var2;
        }
        this.Q0 = k0Var;
    }
}
