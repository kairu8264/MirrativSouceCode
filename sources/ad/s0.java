package ad;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class s0 extends androidx.fragment.app.e {
    public static final a U0 = new a(null);
    public static final int V0 = 8;
    public t0 N0;
    public final wn.f O0;
    public final wn.f P0;
    public final wn.f Q0;
    public final wn.f R0;
    public final wn.f S0;
    public final wn.f T0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final s0 a(u0 u0Var, r0 r0Var, cd.c0 c0Var) {
            jo.p.h(c0Var, "editIdentificationType");
            s0 s0Var = new s0();
            s0Var.V2(k3.b.a(wn.q.a("EXTRA_IDENTIFICATION_BIND_MODEL", u0Var), wn.q.a("EXTRA_BANK_ACCOUNT_BIND_MODEL", r0Var), wn.q.a("EXTRA_EDIT_IDENTIFICATION_TYPE", c0Var)));
            return s0Var;
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1322a;

        static {
            int[] iArr = new int[cd.c0.values().length];
            iArr[cd.c0.REGISTER.ordinal()] = 1;
            f1322a = iArr;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<r0> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final r0 invoke() {
            return (r0) s0.this.M2().getParcelable("EXTRA_BANK_ACCOUNT_BIND_MODEL");
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
            if (s0.this.H3() == cd.c0.REGISTER) {
                return s0.this.U0(nc.i.text_contract_identification_register_confirm_pop_up_title);
            }
            return s0.this.U0(nc.i.text_contract_identification_edit_confirm_pop_up_title);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<cd.c0> {
        public e() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final cd.c0 invoke() {
            Serializable serializable = s0.this.M2().getSerializable("EXTRA_EDIT_IDENTIFICATION_TYPE");
            jo.p.f(serializable, "null cannot be cast to non-null type com.dena.mirrativ.user.mypage.contract.edit_identificatoin.EditIdentificationType");
            return (cd.c0) serializable;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<u0> {
        public f() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            return (u0) s0.this.M2().getParcelable("EXTRA_IDENTIFICATION_BIND_MODEL");
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<Boolean> {
        public g() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(s0.this.F3() != null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<Boolean> {
        public h() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(s0.this.I3() != null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.l<View, wn.v> {
        public i() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            s0.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.l<View, wn.v> {
        public j() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            t0 t0Var = s0.this.N0;
            if (t0Var != null) {
                t0Var.m(s0.this.I3(), s0.this.F3());
            }
            s0.this.m3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public s0() {
        super(nc.f.dialog_fragment_confirm_contract_edit_identification);
        this.O0 = wn.g.a(new f());
        this.P0 = wn.g.a(new c());
        this.Q0 = wn.g.a(new h());
        this.R0 = wn.g.a(new g());
        this.S0 = wn.g.a(new e());
        this.T0 = wn.g.a(new d());
    }

    public final r0 F3() {
        return (r0) this.P0.getValue();
    }

    public final String G3() {
        return (String) this.T0.getValue();
    }

    public final cd.c0 H3() {
        return (cd.c0) this.S0.getValue();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.N0 = null;
        super.I1();
    }

    public final u0 I3() {
        return (u0) this.O0.getValue();
    }

    public final boolean J3() {
        return ((Boolean) this.R0.getValue()).booleanValue();
    }

    public final boolean K3() {
        return ((Boolean) this.Q0.getValue()).booleanValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        String U02;
        Window window;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        pc.k0 T = pc.k0.T(view);
        boolean z10 = I3() != null;
        T.F.setText(G3());
        T.C.T(I3());
        T.B.T(F3());
        T.C.u().setVisibility(K3() ? 0 : 8);
        T.B.u().setVisibility(J3() ? 0 : 8);
        T.B.E.setVisibility(K3() ? 0 : 8);
        T.B.D.setVisibility(K3() ? 0 : 8);
        AppCompatButton appCompatButton = T.E;
        if (b.f1322a[H3().ordinal()] == 1) {
            if (z10) {
                U02 = U0(nc.i.text_contract_edit_identification_finish_button_title);
            } else {
                U02 = U0(nc.i.text_contract_register_bank_account_register_message);
            }
        } else if (z10) {
            U02 = U0(nc.i.text_contract_edit_identification_finish_button_title);
        } else {
            U02 = U0(nc.i.text_contract_edit_bank_account_edit_message);
        }
        appCompatButton.setText(U02);
        T.D.setText(U0(nc.i.text_contract_edit_identification_cancel_button_title));
        AppCompatButton appCompatButton2 = T.D;
        jo.p.g(appCompatButton2, "binding.noButton");
        yd.g1.a(appCompatButton2, new i());
        AppCompatButton appCompatButton3 = T.E;
        jo.p.g(appCompatButton3, "binding.okButton");
        yd.g1.a(appCompatButton3, new j());
        Dialog p32 = p3();
        if (p32 == null || (window = p32.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), 16973913);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        Fragment H0 = H0();
        this.N0 = H0 instanceof t0 ? (t0) H0 : null;
        super.x1(context);
    }
}
