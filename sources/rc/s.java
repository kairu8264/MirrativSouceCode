package rc;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes2.dex */
public final class s extends androidx.fragment.app.e {
    public static final a O0 = new a(null);
    public static final int P0 = 8;
    public pc.y0 N0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final s a(boolean z10) {
            s sVar = new s();
            Bundle bundle = new Bundle();
            bundle.putBoolean("EXTRA_VISIBLE_NOTE", z10);
            sVar.V2(bundle);
            return sVar;
        }
    }

    public static final void D3(s sVar, View view) {
        jo.p.h(sVar, "this$0");
        sVar.m3();
    }

    public final pc.y0 C3() {
        pc.y0 y0Var = this.N0;
        if (y0Var != null) {
            return y0Var;
        }
        jo.p.v("binding");
        return null;
    }

    public final void E3(pc.y0 y0Var) {
        jo.p.h(y0Var, "<set-?>");
        this.N0 = y0Var;
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(q0()), nc.f.dialog_fragment_live_announce_setting_success, null, false);
        jo.p.g(e10, "inflate(\n            Lay…          false\n        )");
        E3((pc.y0) e10);
        if (!M2().getBoolean("EXTRA_VISIBLE_NOTE")) {
            C3().B.setVisibility(4);
        } else {
            C3().B.setVisibility(0);
        }
        C3().C.setOnClickListener(new View.OnClickListener() { // from class: rc.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                s.D3(s.this, view);
            }
        });
        Dialog dialog = new Dialog(N2(), 16973913);
        dialog.setContentView(C3().u());
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(false);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        return dialog;
    }
}
