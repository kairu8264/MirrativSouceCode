package be;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public final class y0 extends androidx.fragment.app.e {
    public static final a O0 = new a(null);
    public static final int P0 = 8;
    public z0 N0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public static /* synthetic */ y0 b(a aVar, String str, String str2, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            return aVar.a(str, str2);
        }

        public final y0 a(String str, String str2) {
            jo.p.h(str, "message");
            y0 y0Var = new y0();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_MESSAGE", str);
            bundle.putString("EXTRA_BUTTON_LABEL", str2);
            y0Var.V2(bundle);
            return y0Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {
        public b() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            z0 z0Var = y0.this.N0;
            if (z0Var != null) {
                String W0 = y0.this.W0();
                if (W0 == null) {
                    W0 = "ConfirmationPopupDialogFragment";
                }
                z0Var.z2(W0);
            }
            y0.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public y0() {
        super(nd.b1.dialog_fragment_confirmation_popup);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.N0 = null;
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        ae.f2 T = ae.f2.T(view);
        T.C.setText(M2().getString("EXTRA_KEY_MESSAGE"));
        String string = M2().getString("EXTRA_BUTTON_LABEL");
        if (string != null) {
            T.B.setTitle(string);
        }
        RoundedButtonView roundedButtonView = T.B;
        jo.p.g(roundedButtonView, "closeButton");
        yd.g1.a(roundedButtonView, new b());
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        Dialog dialog = new Dialog(N2(), nd.g1.f42004a);
        w3(false);
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.N0 = context instanceof z0 ? (z0) context : null;
    }
}
