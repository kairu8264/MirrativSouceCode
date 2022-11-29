package ie;

import ae.l2;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.dena.mirrorman.customview.RoundedButtonView;
import io.l;
import jo.p;
import jo.q;
import nd.b1;
import wn.v;
import yd.g1;

/* loaded from: classes2.dex */
public final class g extends androidx.fragment.app.e {
    public static final a P0 = new a(null);
    public static final int Q0 = 8;
    public h N0;
    public h O0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final g a(String str, String str2, int i10, int i11, String str3, int i12, String str4) {
            p.h(str, "message");
            g gVar = new g();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_MESSAGE", str);
            bundle.putString("EXTRA_KEY_NOTICE", str2);
            bundle.putInt("EXTRA_KEY_NOTICE_TEXT_COLOR", i10);
            bundle.putInt("EXTRA_KEY_NOTICE_TEXT_GRAVITY", i11);
            bundle.putString("EXTRA_POSITIVE_BUTTON_LABEL", str3);
            bundle.putInt("EXTRA_POSITIVE_BUTTON_BACKGROUND_COLOR", i12);
            bundle.putString("EXTRA_NEGATIVE_BUTTON_LABEL", str4);
            gVar.V2(bundle);
            return gVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements l<View, v> {
        public b() {
            super(1);
        }

        public final void a(View view) {
            p.h(view, "it");
            h hVar = g.this.N0;
            if (hVar != null) {
                String W0 = g.this.W0();
                if (W0 == null) {
                    W0 = "CustomYesNoVerticalDialog";
                }
                hVar.p(W0);
            }
            h hVar2 = g.this.O0;
            if (hVar2 != null) {
                String W02 = g.this.W0();
                hVar2.p(W02 != null ? W02 : "CustomYesNoVerticalDialog");
            }
            g.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements l<View, v> {
        public c() {
            super(1);
        }

        public final void a(View view) {
            p.h(view, "it");
            h hVar = g.this.N0;
            if (hVar != null) {
                String W0 = g.this.W0();
                if (W0 == null) {
                    W0 = "CustomYesNoVerticalDialog";
                }
                hVar.D2(W0);
            }
            h hVar2 = g.this.O0;
            if (hVar2 != null) {
                String W02 = g.this.W0();
                hVar2.D2(W02 != null ? W02 : "CustomYesNoVerticalDialog");
            }
            g.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    public g() {
        super(b1.dialog_fragment_custom_yes_no_vertical);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.N0 = null;
        this.O0 = null;
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        p.h(view, "view");
        super.e2(view, bundle);
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        l2 T = l2.T(view);
        T.B.setText(M2().getString("EXTRA_KEY_MESSAGE"));
        String string = M2().getString("EXTRA_POSITIVE_BUTTON_LABEL");
        if (string != null) {
            T.E.setTitle(string);
        }
        int i10 = M2().getInt("EXTRA_POSITIVE_BUTTON_BACKGROUND_COLOR");
        if (i10 > 0) {
            T.E.setRoundedButtonViewBackgroundColor(i10);
        }
        String string2 = M2().getString("EXTRA_NEGATIVE_BUTTON_LABEL");
        if (string2 != null) {
            T.C.setTitle(string2);
        }
        String string3 = M2().getString("EXTRA_KEY_NOTICE");
        if (string3 == null) {
            T.D.setVisibility(8);
        } else {
            T.D.setText(string3);
        }
        int i11 = M2().getInt("EXTRA_KEY_NOTICE_TEXT_COLOR");
        if (i11 > 0) {
            T.D.setTextColor(c3.a.d(N2(), i11));
        }
        T.D.setGravity(M2().getInt("EXTRA_KEY_NOTICE_TEXT_GRAVITY"));
        RoundedButtonView roundedButtonView = T.E;
        p.g(roundedButtonView, "positiveButton");
        g1.a(roundedButtonView, new b());
        RoundedButtonView roundedButtonView2 = T.C;
        p.g(roundedButtonView2, "negativeButton");
        g1.a(roundedButtonView2, new c());
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), nd.g1.f42004a);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        p.h(context, "context");
        super.x1(context);
        this.N0 = context instanceof h ? (h) context : null;
        Fragment H0 = H0();
        this.O0 = H0 instanceof h ? (h) H0 : null;
    }
}
