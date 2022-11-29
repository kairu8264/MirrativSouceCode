package qc;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import com.cookpad.puree.Puree;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.clientlog.logs.Avatar;
import jo.f0;
import jo.p;
import jo.s;
import pc.q0;

/* loaded from: classes2.dex */
public final class b extends androidx.fragment.app.e {
    public c N0;
    public final AutoClearedValue O0 = nd.a.a(this);
    public static final /* synthetic */ qo.h<Object>[] Q0 = {f0.d(new s(b.class, "binding", "getBinding()Lcom/dena/mirrativ/user/databinding/DialogFragmentEmomoPermissionBinding;", 0))};
    public static final a P0 = new a(null);
    public static final int R0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final b a() {
            return new b();
        }
    }

    public static final void D3(b bVar, View view) {
        p.h(bVar, "this$0");
        bVar.m3();
    }

    public final q0 C3() {
        return (q0) this.O0.b(this, Q0[0]);
    }

    public final void E3(q0 q0Var) {
        this.O0.a(this, Q0[0], q0Var);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        super.I1();
        this.N0 = null;
    }

    @Override // androidx.fragment.app.e
    public void m3() {
        c cVar = this.N0;
        if (cVar != null) {
            cVar.S0();
        }
        super.m3();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        q0 T = q0.T(LayoutInflater.from(q0()), null, false);
        p.g(T, "inflate(\n            Lay…          false\n        )");
        T.C.setOnClickListener(new View.OnClickListener() { // from class: qc.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b.D3(b.this, view);
            }
        });
        E3(T);
        Puree.d(new Avatar.EmomoTabTutorial("", "mic"));
        Dialog dialog = new Dialog(N2(), 16973913);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setContentView(C3().u());
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(17170445);
        }
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        p.h(context, "context");
        super.x1(context);
        this.N0 = context instanceof c ? (c) context : null;
    }
}
