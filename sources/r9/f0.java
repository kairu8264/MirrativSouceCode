package r9;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import com.dena.mirrorman.AutoClearedValue;

/* loaded from: classes.dex */
public final class f0 extends androidx.fragment.app.e {
    public vb.o N0;
    public final AutoClearedValue O0 = nd.a.a(this);
    public static final /* synthetic */ qo.h<Object>[] Q0 = {jo.f0.d(new jo.s(f0.class, "binding", "getBinding()Lcom/dena/mirrativ/emomo/databinding/DialogFragmentEmomoDressUpCompleteBinding;", 0))};
    public static final a P0 = new a(null);
    public static final int R0 = 8;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final f0 a(boolean z10) {
            f0 f0Var = new f0();
            Bundle bundle = new Bundle();
            bundle.putBoolean("EXTRA_IS_FROM_ONBOARDING", z10);
            f0Var.V2(bundle);
            return f0Var;
        }
    }

    public static final void D3(f0 f0Var, View view) {
        jo.p.h(f0Var, "this$0");
        vb.o oVar = f0Var.N0;
        if (oVar != null) {
            oVar.o2();
        }
        f0Var.m3();
    }

    public final s9.a0 C3() {
        return (s9.a0) this.O0.b(this, Q0[0]);
    }

    public final void E3(s9.a0 a0Var) {
        this.O0.a(this, Q0[0], a0Var);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.N0 = null;
        super.I1();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        w3(false);
        s9.a0 T = s9.a0.T(LayoutInflater.from(q0()), null, false);
        jo.p.g(T, "inflate(\n            Lay…          false\n        )");
        T.E.setOnClickListener(new View.OnClickListener() { // from class: r9.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f0.D3(f0.this, view);
            }
        });
        E3(T);
        if (M2().getBoolean("EXTRA_IS_FROM_ONBOARDING")) {
            C3().F.setText(U0(q9.i.text_onboarding_emomo_created_title));
            C3().F.setTextSize(16.0f);
            C3().C.setText(U0(q9.i.text_onboarding_emomo_created_message));
            C3().C.setTextSize(14.0f);
            C3().C.setLineSpacing(0.0f, 1.0f);
            C3().B.setBackground(null);
        }
        Dialog dialog = new Dialog(N2(), 16973913);
        dialog.setContentView(C3().u());
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.N0 = context instanceof vb.o ? (vb.o) context : null;
    }
}
