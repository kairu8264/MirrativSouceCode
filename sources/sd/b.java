package sd;

import ae.y3;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.AutoClearedValue;
import jo.f0;
import jo.p;
import jo.s;
import nd.b1;
import nd.g1;
import qo.h;

/* loaded from: classes2.dex */
public final class b extends androidx.fragment.app.e {
    public final AutoClearedValue N0 = nd.a.a(this);
    public static final /* synthetic */ h<Object>[] P0 = {f0.d(new s(b.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/DialogFragmentProgressBinding;", 0))};
    public static final a O0 = new a(null);
    public static final int Q0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final b a(boolean z10) {
            b bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putBoolean("EXTRA_CANCELABLE", z10);
            bVar.V2(bundle);
            return bVar;
        }
    }

    public final y3 B3() {
        return (y3) this.N0.b(this, P0[0]);
    }

    public final void C3(y3 y3Var) {
        this.N0.a(this, P0[0], y3Var);
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        p.h(layoutInflater, "inflater");
        return null;
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(N2()), b1.dialog_fragment_progress, null, false);
        p.g(e10, "inflate(\n            Lay…          false\n        )");
        C3((y3) e10);
        if (bundle != null) {
            n3();
        }
        w3(M2().getBoolean("EXTRA_CANCELABLE"));
        Dialog dialog = new Dialog(N2(), g1.Theme_CustomProgressDialog);
        dialog.setContentView(B3().u());
        return dialog;
    }
}
