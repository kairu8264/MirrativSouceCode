package ya;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.dena.mirrorman.AutoClearedValue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class k0 extends androidx.fragment.app.e {
    public l0 O0;
    public static final /* synthetic */ qo.h<Object>[] R0 = {jo.f0.d(new jo.s(k0.class, "binding", "getBinding()Lcom/dena/mirrativ/otherfeature/databinding/DialogCampaignTwitterShareBinding;", 0))};
    public static final a Q0 = new a(null);
    public static final int S0 = 8;
    public final AutoClearedValue N0 = nd.a.a(this);
    public final wn.f P0 = wn.g.a(new b());

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final k0 a(h0 h0Var) {
            jo.p.h(h0Var, "bindModelTwitter");
            k0 k0Var = new k0();
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_CAMPAIGN_SHARE_BIND_MODEL", h0Var);
            k0Var.V2(bundle);
            return k0Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<h0> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final h0 invoke() {
            Parcelable parcelable = k0.this.M2().getParcelable("EXTRA_CAMPAIGN_SHARE_BIND_MODEL");
            if (parcelable != null) {
                return (h0) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable == null || editable.length() == 0) {
                k0.this.G3().J.setEnabled(false);
                k0.this.G3().J.setTextColor(c3.a.d(k0.this.N2(), wa.c.f58515g));
                return;
            }
            k0.this.G3().J.setEnabled(true);
            k0.this.G3().J.setTextColor(c3.a.d(k0.this.N2(), wa.c.f58522n));
            Matcher matcher = Pattern.compile("[\\s|\\n](#([^\\s]+))", 32).matcher(editable);
            while (matcher.find()) {
                editable.setSpan(new ForegroundColorSpan(c3.a.d(k0.this.N2(), wa.c.f58511c)), matcher.start(), matcher.end(), 33);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        @SuppressLint({"SetTextI18n"})
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            if (charSequence == null) {
                return;
            }
            int f10 = k0.this.F3().f() - Math.max(0, de.l.a(charSequence.toString()));
            k0.this.G3().H.setText(String.valueOf(f10));
            if (f10 == 0) {
                k0.this.G3().H.setTextColor(c3.a.d(k0.this.N2(), wa.c.f58513e));
            } else {
                k0.this.G3().H.setTextColor(c3.a.d(k0.this.N2(), wa.c.f58517i));
            }
        }
    }

    public static final void H3(k0 k0Var, View view) {
        jo.p.h(k0Var, "this$0");
        l0 l0Var = k0Var.O0;
        if (l0Var != null) {
            l0Var.f(k0Var.G3().G.getText().toString());
        }
        k0Var.n3();
    }

    public static final void I3(k0 k0Var, View view) {
        jo.p.h(k0Var, "this$0");
        k0Var.n3();
    }

    public final h0 F3() {
        return (h0) this.P0.getValue();
    }

    public final db.i G3() {
        return (db.i) this.N0.b(this, R0[0]);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.O0 = null;
        super.I1();
    }

    public final void J3(db.i iVar) {
        this.N0.a(this, R0[0], iVar);
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        db.i T = db.i.T(LayoutInflater.from(q0()), null, false);
        jo.p.g(T, "inflate(\n            Lay…          false\n        )");
        J3(T);
        G3().V(F3());
        G3().J.setOnClickListener(new View.OnClickListener() { // from class: ya.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k0.H3(k0.this, view);
            }
        });
        G3().B.setOnClickListener(new View.OnClickListener() { // from class: ya.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k0.I3(k0.this, view);
            }
        });
        G3().G.addTextChangedListener(new c());
        G3().G.setFilters(new sf.b[]{new sf.b(F3().f())});
        Dialog dialog = new Dialog(N2(), wa.k.f58560b);
        dialog.setContentView(G3().u());
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(de.e.b(this, 280), -2);
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawableResource(wa.c.f58521m);
        }
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        Fragment H0 = H0();
        this.O0 = H0 instanceof l0 ? (l0) H0 : null;
    }
}
