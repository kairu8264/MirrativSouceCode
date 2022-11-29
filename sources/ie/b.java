package ie;

import ae.h2;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.AutoClearedValue;
import jo.f0;
import jo.p;
import jo.s;
import nd.b1;
import wn.v;

/* loaded from: classes2.dex */
public final class b extends androidx.fragment.app.e {
    public final AutoClearedValue N0 = nd.a.a(this);
    public InterfaceC0486b O0;
    public static final /* synthetic */ qo.h<Object>[] Q0 = {f0.d(new s(b.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/DialogFragmentCustomMessageBinding;", 0))};
    public static final a P0 = new a(null);
    public static final int R0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public static /* synthetic */ b b(a aVar, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            if ((i10 & 4) != 0) {
                str3 = null;
            }
            return aVar.a(str, str2, str3);
        }

        public final b a(String str, String str2, String str3) {
            p.h(str, "title");
            b bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_TITLE", str);
            bundle.putString("EXTRA_MESSAGE", str2);
            bundle.putString("EXTRA_BUTTON_LABEL", str3);
            bVar.V2(bundle);
            return bVar;
        }
    }

    /* renamed from: ie.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0486b {
        void D1(String str);
    }

    public static final void D3(b bVar, View view) {
        p.h(bVar, "this$0");
        InterfaceC0486b interfaceC0486b = bVar.O0;
        if (interfaceC0486b != null) {
            String W0 = bVar.W0();
            if (W0 == null) {
                W0 = "CustomMessageDialog";
            }
            interfaceC0486b.D1(W0);
        }
        bVar.n3();
    }

    public final h2 C3() {
        return (h2) this.N0.b(this, Q0[0]);
    }

    public final void E3(h2 h2Var) {
        this.N0.a(this, Q0[0], h2Var);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.O0 = null;
        super.I1();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        w3(false);
        v vVar = null;
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(q0()), b1.dialog_fragment_custom_message, null, false);
        h2 h2Var = (h2) e10;
        h2Var.D.setText(M2().getString("EXTRA_TITLE"));
        String string = M2().getString("EXTRA_MESSAGE");
        if (string != null) {
            h2Var.C.setText(string);
            vVar = v.f59242a;
        }
        if (vVar == null) {
            h2Var.C.setVisibility(8);
        }
        String string2 = M2().getString("EXTRA_BUTTON_LABEL");
        if (string2 != null) {
            h2Var.B.setTitle(string2);
        }
        h2Var.B.setOnClickListener(new View.OnClickListener() { // from class: ie.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b.D3(b.this, view);
            }
        });
        p.g(e10, "inflate<DialogFragmentCu…)\n            }\n        }");
        E3(h2Var);
        Dialog dialog = new Dialog(N2(), 16973913);
        dialog.setContentView(C3().u());
        Window window = dialog.getWindow();
        p.e(window);
        window.setLayout(-1, -1);
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        p.h(context, "context");
        super.x1(context);
        this.O0 = context instanceof InterfaceC0486b ? (InterfaceC0486b) context : null;
    }
}
