package be;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public final class x extends androidx.fragment.app.e {
    public static final a O0 = new a(null);
    public static final int P0 = 8;
    public final wn.f N0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final x a(String str) {
            jo.p.h(str, "titleText");
            x xVar = new x();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_TITLE_TEXT", str);
            xVar.V2(bundle);
            return xVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {
        public b() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            x.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<String> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = x.this.M2().getString("EXTRA_KEY_TITLE_TEXT");
            jo.p.e(string);
            return string;
        }
    }

    public x() {
        super(nd.b1.dialog_fragment_collab_matching_error_dialog);
        this.N0 = wn.g.a(new c());
    }

    public final String B3() {
        return (String) this.N0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(de.e.b(this, 280), -2);
        }
        ae.p1 T = ae.p1.T(view);
        T.D.setText(B3());
        RoundedButtonView roundedButtonView = T.C;
        jo.p.g(roundedButtonView, "binding.okButtonView");
        yd.g1.a(roundedButtonView, new b());
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        Dialog dialog = new Dialog(N2(), nd.g1.f42004a);
        w3(false);
        return dialog;
    }
}
