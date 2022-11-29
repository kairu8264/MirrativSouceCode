package ie;

import ae.a6;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import io.l;
import jo.p;
import nd.b1;
import wn.q;
import wn.v;
import yd.g1;

/* loaded from: classes2.dex */
public final class i extends androidx.fragment.app.e {
    public static final a U0 = new a(null);
    public static final int V0 = 8;
    public j N0;
    public final wn.f O0;
    public final wn.f P0;
    public final wn.f Q0;
    public final wn.f R0;
    public final wn.f S0;
    public final wn.f T0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final i a(String str, String str2, int i10, String str3, int i11, String str4) {
            p.h(str, "title");
            p.h(str3, "positiveButtonLabel");
            i iVar = new i();
            iVar.V2(k3.b.a(q.a("EXTRA_TITLE", str), q.a("EXTRA_MESSAGE", str2), q.a("EXTRA_MESSAGE_COLOR", Integer.valueOf(i10)), q.a("EXTRA_POSITIVE_BUTTON_LABEL", str3), q.a("EXTRA_POSITIVE_BUTTON_COLOR", Integer.valueOf(i11)), q.a("EXTRA_NEGATIVE_BUTTON_LABEL", str4)));
            return iVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<String> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            return i.this.M2().getString("EXTRA_MESSAGE");
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<Integer> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Integer invoke() {
            return Integer.valueOf(i.this.M2().getInt("EXTRA_MESSAGE_COLOR"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<String> {
        public d() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            return i.this.M2().getString("EXTRA_NEGATIVE_BUTTON_LABEL");
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements l<View, v> {
        public e() {
            super(1);
        }

        public final void a(View view) {
            p.h(view, "it");
            j jVar = i.this.N0;
            if (jVar != null) {
                String W0 = i.this.W0();
                if (W0 == null) {
                    W0 = "SimpleYesOrNoDialog";
                }
                jVar.L1(W0);
            }
            i.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements l<View, v> {
        public f() {
            super(1);
        }

        public final void a(View view) {
            p.h(view, "it");
            j jVar = i.this.N0;
            if (jVar != null) {
                String W0 = i.this.W0();
                if (W0 == null) {
                    W0 = "SimpleYesOrNoDialog";
                }
                jVar.k(W0);
            }
            i.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<Integer> {
        public g() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Integer invoke() {
            return Integer.valueOf(i.this.M2().getInt("EXTRA_POSITIVE_BUTTON_COLOR"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<String> {
        public h() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = i.this.M2().getString("EXTRA_POSITIVE_BUTTON_LABEL");
            if (string != null) {
                p.g(string, "requireNotNull(requireAr…A_POSITIVE_BUTTON_LABEL))");
                return string;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* renamed from: ie.i$i  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0488i extends jo.q implements io.a<String> {
        public C0488i() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = i.this.M2().getString("EXTRA_TITLE");
            if (string != null) {
                p.g(string, "requireNotNull(requireAr…).getString(EXTRA_TITLE))");
                return string;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public i() {
        super(b1.dialog_simple_yes_or_no);
        this.O0 = wn.g.a(new C0488i());
        this.P0 = wn.g.a(new b());
        this.Q0 = wn.g.a(new c());
        this.R0 = wn.g.a(new h());
        this.S0 = wn.g.a(new g());
        this.T0 = wn.g.a(new d());
    }

    public final String C3() {
        return (String) this.P0.getValue();
    }

    public final int D3() {
        return ((Number) this.Q0.getValue()).intValue();
    }

    public final String E3() {
        return (String) this.T0.getValue();
    }

    public final int F3() {
        return ((Number) this.S0.getValue()).intValue();
    }

    public final String G3() {
        return (String) this.R0.getValue();
    }

    public final String H3() {
        return (String) this.O0.getValue();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.N0 = null;
        super.I1();
    }

    public final boolean I3() {
        return C3() != null;
    }

    public final boolean J3() {
        return E3() != null;
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        p.h(view, "view");
        a6 T = a6.T(view);
        AppCompatTextView appCompatTextView = T.B;
        p.g(appCompatTextView, "messageTextView");
        appCompatTextView.setVisibility(I3() ? 0 : 8);
        T.B.setTextColor(c3.a.d(N2(), D3()));
        AppCompatButton appCompatButton = T.C;
        p.g(appCompatButton, "negativeButton");
        appCompatButton.setVisibility(J3() ? 0 : 8);
        T.E.setText(H3());
        T.B.setText(C3());
        T.D.setText(G3());
        AppCompatButton appCompatButton2 = T.D;
        p.g(appCompatButton2, "positiveButton");
        td.c.b(appCompatButton2, 24, Integer.valueOf(c3.a.d(N2(), F3())));
        T.C.setText(E3());
        AppCompatButton appCompatButton3 = T.D;
        p.g(appCompatButton3, "positiveButton");
        g1.a(appCompatButton3, new e());
        AppCompatButton appCompatButton4 = T.C;
        p.g(appCompatButton4, "negativeButton");
        g1.a(appCompatButton4, new f());
        super.e2(view, bundle);
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        w3(false);
        Dialog dialog = new Dialog(N2(), 16973913);
        dialog.setContentView(b1.dialog_simple_yes_or_no);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        p.h(context, "context");
        Fragment H0 = H0();
        j jVar = null;
        j jVar2 = H0 instanceof j ? (j) H0 : null;
        if (jVar2 != null) {
            jVar = jVar2;
        } else if (context instanceof j) {
            jVar = (j) context;
        }
        this.N0 = jVar;
        super.x1(context);
    }
}
