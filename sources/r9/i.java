package r9;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import com.dena.mirrorman.AutoClearedValue;

/* loaded from: classes.dex */
public final class i extends androidx.fragment.app.e {
    public final AutoClearedValue N0 = nd.a.a(this);
    public j O0;
    public static final /* synthetic */ qo.h<Object>[] Q0 = {jo.f0.d(new jo.s(i.class, "binding", "getBinding()Lcom/dena/mirrativ/emomo/databinding/DialogFragmentClosetConfirmOverrideBinding;", 0))};
    public static final a P0 = new a(null);
    public static final int R0 = 8;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final i a(String str) {
            jo.p.h(str, "message");
            i iVar = new i();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_MESSAGE", str);
            iVar.V2(bundle);
            return iVar;
        }
    }

    public static final void F3(i iVar, View view) {
        jo.p.h(iVar, "this$0");
        j jVar = iVar.O0;
        if (jVar != null) {
            jVar.k();
        }
        iVar.n3();
    }

    public static final void G3(i iVar, View view) {
        jo.p.h(iVar, "this$0");
        iVar.n3();
    }

    public final s9.q D3() {
        return (s9.q) this.N0.b(this, Q0[0]);
    }

    public final String E3() {
        return M2().getString("EXTRA_MESSAGE");
    }

    public final void H3(s9.q qVar) {
        this.N0.a(this, Q0[0], qVar);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.O0 = null;
        super.I1();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        w3(false);
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(q0()), q9.h.dialog_fragment_closet_confirm_override, null, false);
        s9.q qVar = (s9.q) e10;
        qVar.C.setText(E3());
        qVar.F.setOnClickListener(new View.OnClickListener() { // from class: r9.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i.F3(i.this, view);
            }
        });
        qVar.D.setOnClickListener(new View.OnClickListener() { // from class: r9.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i.G3(i.this, view);
            }
        });
        jo.p.g(e10, "inflate<DialogFragmentCl…)\n            }\n        }");
        H3(qVar);
        Dialog dialog = new Dialog(N2(), 16973913);
        dialog.setContentView(D3().u());
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
        Fragment H0 = H0();
        this.O0 = H0 instanceof j ? (j) H0 : null;
    }
}
