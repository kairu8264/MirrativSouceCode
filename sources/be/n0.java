package be;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.AutoClearedValue;

/* loaded from: classes2.dex */
public final class n0 extends androidx.fragment.app.e {
    public static io.a<wn.v> R0;
    public final AutoClearedValue N0 = nd.a.a(this);
    public static final /* synthetic */ qo.h<Object>[] P0 = {jo.f0.d(new jo.s(n0.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/DialogConfirmModeratorBinding;", 0))};
    public static final a O0 = new a(null);
    public static final int Q0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public static /* synthetic */ n0 b(a aVar, String str, int i10, int i11, int i12, io.a aVar2, int i13, Object obj) {
            if ((i13 & 2) != 0) {
                i10 = nd.f1.text_confirm_exit;
            }
            int i14 = i10;
            if ((i13 & 4) != 0) {
                i11 = nd.f1.text_warning_exit_moderator;
            }
            int i15 = i11;
            if ((i13 & 8) != 0) {
                i12 = nd.f1.text_exit_streaming;
            }
            return aVar.a(str, i14, i15, i12, aVar2);
        }

        public final n0 a(String str, int i10, int i11, int i12, io.a<wn.v> aVar) {
            jo.p.h(str, "referer");
            jo.p.h(aVar, "onClickConfirmButtonListener");
            n0 n0Var = new n0();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_REFERER", str);
            bundle.putInt("EXTRA_TITLE", i10);
            bundle.putInt("EXTRA_WARNING_TEXT", i11);
            bundle.putInt("EXTRA_CONFIRM_BUTTON_TEXT", i12);
            n0Var.V2(bundle);
            a aVar2 = n0.O0;
            n0.R0 = aVar;
            return n0Var;
        }
    }

    public static final void H3(n0 n0Var, View view) {
        jo.p.h(n0Var, "this$0");
        io.a<wn.v> aVar = R0;
        if (aVar != null) {
            aVar.invoke();
        }
        n0Var.m3();
    }

    public static final void I3(n0 n0Var, View view) {
        jo.p.h(n0Var, "this$0");
        n0Var.m3();
    }

    public final ae.t0 E3() {
        return (ae.t0) this.N0.b(this, P0[0]);
    }

    public final void F3(ae.t0 t0Var) {
        this.N0.a(this, P0[0], t0Var);
    }

    public final void G3() {
        E3().C.setOnClickListener(new View.OnClickListener() { // from class: be.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n0.H3(n0.this, view);
            }
        });
        E3().B.setOnClickListener(new View.OnClickListener() { // from class: be.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n0.I3(n0.this, view);
            }
        });
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        super.I1();
        R0 = null;
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(q0()), nd.b1.dialog_confirm_moderator, null, false);
        jo.p.g(e10, "inflate(\n            Lay…          false\n        )");
        F3((ae.t0) e10);
        E3().E.setText(O0().getText(M2().getInt("EXTRA_TITLE")));
        E3().F.setText(O0().getText(M2().getInt("EXTRA_WARNING_TEXT")));
        E3().C.setText(O0().getText(M2().getInt("EXTRA_CONFIRM_BUTTON_TEXT")));
        G3();
        Dialog dialog = new Dialog(N2(), nd.g1.f42010i);
        dialog.setContentView(E3().u());
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(de.e.b(this, 280), -2);
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawableResource(nd.w0.f42232g);
        }
        return dialog;
    }
}
