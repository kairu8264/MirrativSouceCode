package be;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import com.dena.mirrorman.AutoClearedValue;

/* loaded from: classes2.dex */
public final class q0 extends androidx.fragment.app.e {
    public final AutoClearedValue N0 = nd.a.a(this);
    public static final /* synthetic */ qo.h<Object>[] P0 = {jo.f0.d(new jo.s(q0.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/DialogFragmentConfirmOverrideBinding;", 0))};
    public static final a O0 = new a(null);
    public static final int Q0 = 8;
    public static final String R0 = v0.class.getSimpleName();

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final q0 a(String str, String str2) {
            jo.p.h(str, "title");
            jo.p.h(str2, "message");
            q0 q0Var = new q0();
            Bundle bundle = new Bundle();
            bundle.putString("BUNDLE_KEY_TITLE", str);
            bundle.putString("BUNDLE_KEY_MESSAGE", str2);
            q0Var.V2(bundle);
            return q0Var;
        }

        public final String b() {
            return q0.R0;
        }
    }

    public static final void F3(q0 q0Var, View view) {
        jo.p.h(q0Var, "this$0");
        dq.c c10 = dq.c.c();
        String W0 = q0Var.W0();
        if (W0 == null) {
            W0 = R0;
        }
        jo.p.g(W0, "tag ?: DEFAULT_TAG");
        c10.l(new s0(W0));
        q0Var.m3();
    }

    public static final void G3(q0 q0Var, View view) {
        jo.p.h(q0Var, "this$0");
        dq.c c10 = dq.c.c();
        String W0 = q0Var.W0();
        if (W0 == null) {
            W0 = R0;
        }
        jo.p.g(W0, "tag ?: DEFAULT_TAG");
        c10.l(new r0(W0));
        q0Var.m3();
    }

    public final ae.b2 E3() {
        return (ae.b2) this.N0.b(this, P0[0]);
    }

    public final void H3(ae.b2 b2Var) {
        this.N0.a(this, P0[0], b2Var);
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        ae.b2 T = ae.b2.T(LayoutInflater.from(N2()), null, false);
        jo.p.g(T, "inflate(\n            Lay…          false\n        )");
        H3(T);
        E3().E.setText(M2().getString("BUNDLE_KEY_TITLE"));
        E3().C.setText(M2().getString("BUNDLE_KEY_MESSAGE"));
        E3().D.setOnClickListener(new View.OnClickListener() { // from class: be.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q0.F3(q0.this, view);
            }
        });
        E3().B.setOnClickListener(new View.OnClickListener() { // from class: be.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q0.G3(q0.this, view);
            }
        });
        Dialog dialog = new Dialog(N2(), nd.g1.f42010i);
        dialog.setContentView(E3().u());
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(nd.y0.rectangle_corner12_whitethree);
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setLayout(de.e.b(this, 280), -2);
        }
        return dialog;
    }
}
