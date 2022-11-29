package be;

import ae.u5;
import android.app.Dialog;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.AutoClearedValue;

/* loaded from: classes2.dex */
public final class f2 extends androidx.fragment.app.e {
    public final AutoClearedValue N0 = nd.a.a(this);
    public static final /* synthetic */ qo.h<Object>[] P0 = {jo.f0.d(new jo.s(f2.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/DialogKaundumeInfoBinding;", 0))};
    public static final a O0 = new a(null);
    public static final int Q0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final f2 a() {
            return new f2();
        }
    }

    public static final void D3(f2 f2Var, View view) {
        jo.p.h(f2Var, "this$0");
        f2Var.m3();
    }

    public final u5 C3() {
        return (u5) this.N0.b(this, P0[0]);
    }

    public final void E3(u5 u5Var) {
        this.N0.a(this, P0[0], u5Var);
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(q0()), nd.b1.dialog_kaundume_info, null, false);
        jo.p.g(e10, "inflate(\n            Lay…          false\n        )");
        E3((u5) e10);
        C3().B.setOnClickListener(new View.OnClickListener() { // from class: be.e2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f2.D3(f2.this, view);
            }
        });
        AppCompatImageView appCompatImageView = C3().C;
        jo.p.g(appCompatImageView, "binding.headerImageView");
        td.a.H(appCompatImageView, null, c3.a.f(N2(), nd.y0.kandume_header), null, 8, null);
        String U0 = U0(nd.f1.text_kandume_how_to_get);
        jo.p.g(U0, "getString(R.string.text_kandume_how_to_get)");
        String U02 = U0(nd.f1.text_kandume_how_to_get_highlight);
        jo.p.g(U02, "getString(R.string.text_…ume_how_to_get_highlight)");
        int U = so.o.U(U0, U02, 0, false, 6, null);
        AppCompatTextView appCompatTextView = C3().D;
        SpannableString spannableString = new SpannableString(U0);
        spannableString.setSpan(new ForegroundColorSpan(c3.a.d(N2(), nd.w0.S)), U, U02.length() + U, 33);
        appCompatTextView.setText(spannableString);
        Dialog dialog = new Dialog(N2(), nd.g1.f42010i);
        dialog.setContentView(C3().u());
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(de.e.b(this, 320), -2);
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawableResource(nd.w0.Q0);
        }
        return dialog;
    }
}
