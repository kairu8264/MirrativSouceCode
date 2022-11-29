package be;

import ae.c6;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import com.dena.mirrorman.AutoClearedValue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kq.a;

/* loaded from: classes2.dex */
public final class d5 extends androidx.fragment.app.e {
    public final AutoClearedValue N0 = nd.a.a(this);
    public e5 O0;
    public final wn.f P0;
    public final wn.f Q0;
    public final wn.f R0;
    public static final /* synthetic */ qo.h<Object>[] T0 = {jo.f0.d(new jo.s(d5.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/DialogTwitterShareBinding;", 0))};
    public static final a S0 = new a(null);
    public static final int U0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final d5 a(int i10, String str) {
            jo.p.h(str, "shareUrl");
            d5 d5Var = new d5();
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_MAX_TEXT_LENGTH", i10);
            bundle.putString("EXTRA_SHARE_URL", str);
            d5Var.V2(bundle);
            return d5Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<Integer> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Integer invoke() {
            return Integer.valueOf(d5.this.M2().getInt("EXTRA_MAX_TEXT_LENGTH"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable == null) {
                return;
            }
            Matcher matcher = Pattern.compile("[\\s|\\n](#([^\\s]+))", 32).matcher(editable);
            while (matcher.find()) {
                editable.setSpan(new ForegroundColorSpan(c3.a.d(d5.this.N2(), nd.w0.f42238n)), matcher.start(), matcher.end(), 33);
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
            d5.this.G3().H.setText(String.valueOf(d5.this.H3() - Math.max(0, de.l.a(charSequence.toString()))));
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
            String string = d5.this.M2().getString("EXTRA_SHARE_URL");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f17788w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f17788w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            androidx.fragment.app.h L2 = this.f17788w.L2();
            jo.p.g(L2, "requireActivity()");
            return c0552a.b(L2, this.f17788w.L2());
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<androidx.lifecycle.v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17789w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(io.a aVar) {
            super(0);
            this.f17789w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.v0 invoke() {
            return ((kq.a) this.f17789w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17790w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f17791x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f17792y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f17793z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f17790w = aVar;
            this.f17791x = aVar2;
            this.f17792y = aVar3;
            this.f17793z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f17790w;
            vq.a aVar2 = this.f17791x;
            io.a aVar3 = this.f17792y;
            xq.a aVar4 = this.f17793z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(jo.f0.b(ud.v4.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<androidx.lifecycle.u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f17794w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(io.a aVar) {
            super(0);
            this.f17794w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final androidx.lifecycle.u0 invoke() {
            androidx.lifecycle.u0 U = ((androidx.lifecycle.v0) this.f17794w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    public d5() {
        e eVar = new e(this);
        xq.a a10 = gq.a.a(this);
        f fVar = new f(eVar);
        this.P0 = androidx.fragment.app.e0.a(this, jo.f0.b(ud.v4.class), new h(fVar), new g(eVar, null, null, a10));
        this.Q0 = wn.g.a(new b());
        this.R0 = wn.g.a(new d());
    }

    public static final void J3(d5 d5Var, View view) {
        String str;
        jo.p.h(d5Var, "this$0");
        String property = System.getProperty("line.separator");
        e5 e5Var = d5Var.O0;
        if (e5Var != null) {
            if (d5Var.I3().length() == 0) {
                str = d5Var.G3().G.getText().toString();
            } else {
                str = ((Object) d5Var.G3().G.getText()) + property + property + d5Var.I3();
            }
            e5Var.f(str);
        }
    }

    public static final void K3(d5 d5Var, View view) {
        jo.p.h(d5Var, "this$0");
        d5Var.m3();
    }

    public final ud.v4 F3() {
        return (ud.v4) this.P0.getValue();
    }

    public final c6 G3() {
        return (c6) this.N0.b(this, T0[0]);
    }

    public final int H3() {
        return ((Number) this.Q0.getValue()).intValue();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.O0 = null;
        super.I1();
    }

    public final String I3() {
        return (String) this.R0.getValue();
    }

    public final void L3(c6 c6Var) {
        this.N0.a(this, T0[0], c6Var);
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        c6 T = c6.T(LayoutInflater.from(q0()), null, false);
        jo.p.g(T, "inflate(\n            Lay…          false\n        )");
        L3(T);
        G3().M(this);
        G3().V(F3());
        G3().J.setOnClickListener(new View.OnClickListener() { // from class: be.b5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d5.J3(d5.this, view);
            }
        });
        G3().B.setOnClickListener(new View.OnClickListener() { // from class: be.c5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d5.K3(d5.this, view);
            }
        });
        G3().G.addTextChangedListener(new c());
        G3().G.setFilters(new sf.b[]{new sf.b(H3())});
        Dialog dialog = new Dialog(N2(), nd.g1.f42010i);
        dialog.setContentView(G3().u());
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

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.O0 = context instanceof e5 ? (e5) context : null;
    }
}
