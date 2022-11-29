package ld;

import ae.q5;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.AutoClearedValue;

/* loaded from: classes2.dex */
public final class b extends androidx.fragment.app.e {
    public final AutoClearedValue N0 = nd.a.a(this);
    public static final /* synthetic */ qo.h<Object>[] P0 = {jo.f0.d(new jo.s(b.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/DialogHandoverCodeCompleteBinding;", 0))};
    public static final a O0 = new a(null);
    public static final int Q0 = AutoClearedValue.f25045c;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final b a(String str) {
            jo.p.h(str, "handoverCode");
            b bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_HANDOVER_CODE", str);
            bVar.V2(bundle);
            return bVar;
        }
    }

    public static final void D3(b bVar, View view) {
        jo.p.h(bVar, "this$0");
        bVar.m3();
    }

    public final q5 C3() {
        return (q5) this.N0.b(this, P0[0]);
    }

    public final void E3(q5 q5Var) {
        this.N0.a(this, P0[0], q5Var);
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(q0()), nc.f.K, null, false);
        jo.p.g(e10, "inflate(\n            Lay…          false\n        )");
        E3((q5) e10);
        AppCompatTextView appCompatTextView = C3().B;
        String string = M2().getString("EXTRA_HANDOVER_CODE");
        jo.p.e(string);
        appCompatTextView.setText(string);
        C3().D.setOnClickListener(new View.OnClickListener() { // from class: ld.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b.D3(b.this, view);
            }
        });
        Dialog dialog = new Dialog(N2(), nc.j.f41904g);
        dialog.setContentView(C3().u());
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(de.e.b(this, 280), -2);
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawableResource(nc.b.B);
        }
        return dialog;
    }
}
