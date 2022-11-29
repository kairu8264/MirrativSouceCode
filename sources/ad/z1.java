package ad;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import pc.y2;

/* loaded from: classes2.dex */
public final class z1 extends Fragment {

    /* renamed from: y0  reason: collision with root package name */
    public static final a f1426y0 = new a(null);

    /* renamed from: z0  reason: collision with root package name */
    public static final int f1427z0 = 8;

    /* renamed from: x0  reason: collision with root package name */
    public final wn.f f1428x0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final z1 a(String str, boolean z10) {
            jo.p.h(str, "url");
            z1 z1Var = new z1();
            z1Var.V2(k3.b.a(wn.q.a("EXTRA_URL", str), wn.q.a("EXTRA_IS_EDIT", Boolean.valueOf(z10))));
            return z1Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<Boolean> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(z1.this.M2().getBoolean("EXTRA_IS_EDIT"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends androidx.activity.e {
        public c() {
            super(true);
        }

        @Override // androidx.activity.e
        public void b() {
            z1.this.L2().finish();
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.l<View, wn.v> {
        public d() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            z1 z1Var = z1.this;
            String string = z1.this.M2().getString("EXTRA_URL");
            if (string == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            z1Var.f3(new Intent("android.intent.action.VIEW", Uri.parse(string)));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.l<View, wn.v> {
        public e() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            z1.this.L2().finish();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public z1() {
        super(nc.f.fragment_contract_submit_identification_document);
        this.f1428x0 = wn.g.a(new b());
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        super.e2(view, bundle);
        pc.y1 T = pc.y1.T(view);
        L2().c1().a(a1(), new c());
        AppCompatButton appCompatButton = T.D;
        jo.p.g(appCompatButton, "binding.submitButton");
        yd.g1.a(appCompatButton, new d());
        AppCompatButton appCompatButton2 = T.B;
        jo.p.g(appCompatButton2, "binding.closeButton");
        yd.g1.a(appCompatButton2, new e());
        jo.p.g(T, "binding");
        l3(T);
        k3(T);
    }

    public final boolean j3() {
        return ((Boolean) this.f1428x0.getValue()).booleanValue();
    }

    public final void k3(pc.y1 y1Var) {
        y2 y2Var = y1Var.C;
        y2Var.P.setVisibility(8);
        y2Var.F.setVisibility(8);
        y2Var.I.setVisibility(8);
        y2Var.J.setVisibility(8);
        AppCompatTextView appCompatTextView = y2Var.N;
        Context N2 = N2();
        int i10 = nc.b.f41804x;
        appCompatTextView.setTextColor(c3.a.d(N2, i10));
        y2Var.M.setTextColor(c3.a.d(N2(), i10));
        y2Var.M.setTextSize(2, 14.0f);
    }

    public final void l3(pc.y1 y1Var) {
        Toolbar toolbar = y1Var.E.B;
        TextView textView = (TextView) toolbar.findViewById(nc.e.B6);
        if (textView == null) {
            return;
        }
        jo.p.g(textView, "findViewById<TextView>(R….toolbar_title) ?: return");
        toolbar.setBackgroundResource(nc.h.f41869c);
        textView.setVisibility(0);
        textView.setText(U0(j3() ? nc.i.text_menu_edit_identification_title : nc.i.text_menu_register_identification_title));
    }
}
