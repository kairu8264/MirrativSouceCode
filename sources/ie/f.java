package ie;

import ae.j2;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import com.dena.mirrorman.AutoClearedValue;
import jo.f0;
import jo.p;
import jo.q;
import jo.s;
import nd.b1;
import nd.y0;
import wn.v;

/* loaded from: classes2.dex */
public final class f extends androidx.fragment.app.e {
    public b O0;
    public b P0;
    public static final /* synthetic */ qo.h<Object>[] W0 = {f0.d(new s(f.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/DialogFragmentCustomYesNoBinding;", 0))};
    public static final a V0 = new a(null);
    public static final int X0 = 8;
    public final AutoClearedValue N0 = nd.a.a(this);
    public final wn.f Q0 = wn.g.a(new C0487f());
    public final wn.f R0 = wn.g.a(new d());
    public final wn.f S0 = wn.g.a(new c());
    public final wn.f T0 = wn.g.a(new g());
    public final wn.f U0 = wn.g.a(new e());

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public static /* synthetic */ f b(a aVar, String str, String str2, String str3, String str4, boolean z10, int i10, Object obj) {
            if ((i10 & 8) != 0) {
                str4 = null;
            }
            String str5 = str4;
            if ((i10 & 16) != 0) {
                z10 = false;
            }
            return aVar.a(str, str2, str3, str5, z10);
        }

        public final f a(String str, String str2, String str3, String str4, boolean z10) {
            p.h(str, "title");
            f fVar = new f();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_TITLE", str);
            bundle.putString("EXTRA_YES_LABEL", str2);
            bundle.putString("EXTRA_NO_LABEL", str3);
            bundle.putString("EXTRA_MESSAGE", str4);
            bundle.putBoolean("EXTRA_IS_POSITIVE", z10);
            fVar.V2(bundle);
            return fVar;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {

        /* loaded from: classes2.dex */
        public static final class a {
            public static void a(b bVar, String str) {
                p.h(str, "tag");
            }
        }

        void b(String str);

        void c(String str);
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.a<Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c() {
            super(0);
            f.this = r1;
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(f.this.M2().getBoolean("EXTRA_IS_POSITIVE"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.a<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d() {
            super(0);
            f.this = r1;
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            return f.this.M2().getString("EXTRA_MESSAGE");
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.a<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e() {
            super(0);
            f.this = r1;
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            return f.this.M2().getString("EXTRA_NO_LABEL");
        }
    }

    /* renamed from: ie.f$f */
    /* loaded from: classes2.dex */
    public static final class C0487f extends q implements io.a<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0487f() {
            super(0);
            f.this = r1;
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = f.this.M2().getString("EXTRA_TITLE");
            p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends q implements io.a<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g() {
            super(0);
            f.this = r1;
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            return f.this.M2().getString("EXTRA_YES_LABEL");
        }
    }

    public static final void K3(f fVar, View view) {
        p.h(fVar, "this$0");
        b bVar = fVar.O0;
        if (bVar != null) {
            String W02 = fVar.W0();
            if (W02 == null) {
                W02 = "CustomYesNoDialog";
            }
            bVar.b(W02);
        }
        b bVar2 = fVar.P0;
        if (bVar2 != null) {
            String W03 = fVar.W0();
            bVar2.b(W03 != null ? W03 : "CustomYesNoDialog");
        }
        fVar.n3();
    }

    public static final void L3(f fVar, View view) {
        p.h(fVar, "this$0");
        b bVar = fVar.O0;
        if (bVar != null) {
            String W02 = fVar.W0();
            if (W02 == null) {
                W02 = "CustomYesNoDialog";
            }
            bVar.c(W02);
        }
        b bVar2 = fVar.P0;
        if (bVar2 != null) {
            String W03 = fVar.W0();
            bVar2.c(W03 != null ? W03 : "CustomYesNoDialog");
        }
        fVar.n3();
    }

    public static final void M3(f fVar, View view) {
        p.h(fVar, "this$0");
        fVar.n3();
    }

    public final j2 E3() {
        return (j2) this.N0.b(this, W0[0]);
    }

    public final String F3() {
        return (String) this.R0.getValue();
    }

    public final String G3() {
        return (String) this.U0.getValue();
    }

    public final String H3() {
        return (String) this.Q0.getValue();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.O0 = null;
        this.P0 = null;
        super.I1();
    }

    public final String I3() {
        return (String) this.T0.getValue();
    }

    public final boolean J3() {
        return ((Boolean) this.S0.getValue()).booleanValue();
    }

    public final void N3(j2 j2Var) {
        this.N0.a(this, W0[0], j2Var);
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        int i10;
        w3(false);
        v vVar = null;
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(q0()), b1.dialog_fragment_custom_yes_no, null, false);
        j2 j2Var = (j2) e10;
        j2Var.E.setText(H3());
        String F3 = F3();
        if (F3 != null) {
            j2Var.C.setText(F3);
            vVar = v.f59242a;
        }
        if (vVar == null) {
            j2Var.C.setVisibility(8);
        }
        AppCompatButton appCompatButton = j2Var.F;
        Context N2 = N2();
        if (J3()) {
            i10 = y0.rectangle_corner4_tealish;
        } else {
            i10 = y0.rectangle_corner4_grapefruit;
        }
        appCompatButton.setBackground(c3.a.f(N2, i10));
        String I3 = I3();
        if (I3 != null) {
            j2Var.F.setText(I3);
        }
        String G3 = G3();
        if (G3 != null) {
            j2Var.D.setText(G3);
        }
        j2Var.F.setOnClickListener(new View.OnClickListener() { // from class: ie.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.K3(f.this, view);
            }
        });
        j2Var.D.setOnClickListener(new View.OnClickListener() { // from class: ie.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.L3(f.this, view);
            }
        });
        j2Var.B.setOnClickListener(new View.OnClickListener() { // from class: ie.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.M3(f.this, view);
            }
        });
        p.g(e10, "inflate<DialogFragmentCu…)\n            }\n        }");
        N3(j2Var);
        Dialog dialog = new Dialog(N2(), 16973913);
        dialog.setContentView(E3().u());
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        p.h(context, "context");
        super.x1(context);
        this.O0 = context instanceof b ? (b) context : null;
        Fragment H0 = H0();
        this.P0 = H0 instanceof b ? (b) H0 : null;
    }
}
