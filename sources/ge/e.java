package ge;

import ae.j1;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.AutoClearedValue;
import jo.f0;
import jo.p;
import jo.s;
import nd.b1;
import nd.w0;

/* loaded from: classes2.dex */
public final class e extends androidx.fragment.app.e {
    public boolean Q0;
    public boolean T0;
    public Runnable U0;
    public Runnable V0;
    public static final /* synthetic */ qo.h<Object>[] X0 = {f0.d(new s(e.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/DialogFragmentChatConfirmationBinding;", 0))};
    public static final b W0 = new b(null);
    public static final int Y0 = 8;
    public final AutoClearedValue N0 = nd.a.a(this);
    public String O0 = "";
    public String P0 = "";
    public String R0 = "";
    public String S0 = "";

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: c  reason: collision with root package name */
        public boolean f33259c;

        /* renamed from: f  reason: collision with root package name */
        public boolean f33262f;

        /* renamed from: a  reason: collision with root package name */
        public String f33257a = "";

        /* renamed from: b  reason: collision with root package name */
        public String f33258b = "";

        /* renamed from: d  reason: collision with root package name */
        public String f33260d = "";

        /* renamed from: e  reason: collision with root package name */
        public String f33261e = "";

        public final e a() {
            e eVar = new e();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_TITLE", this.f33257a);
            bundle.putString("EXTRA_MESSAGE", this.f33258b);
            bundle.putBoolean("EXTRA_IS_WARNING_MESSAGE", this.f33259c);
            bundle.putString("EXTRA_OK", this.f33260d);
            bundle.putString("EXTRA_CANCEL", this.f33261e);
            bundle.putBoolean("EXTRA_DISABLE_CANCELABLE", this.f33262f);
            eVar.V2(bundle);
            return eVar;
        }

        public final a b(String str) {
            p.h(str, "cancel");
            this.f33261e = str;
            return this;
        }

        public final a c(boolean z10) {
            this.f33262f = z10;
            return this;
        }

        public final a d(boolean z10) {
            this.f33259c = z10;
            return this;
        }

        public final a e(String str) {
            p.h(str, "message");
            this.f33258b = str;
            return this;
        }

        public final a f(String str) {
            p.h(str, "ok");
            this.f33260d = str;
            return this;
        }

        public final a g(String str) {
            p.h(str, "title");
            this.f33257a = str;
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }
    }

    public static final void I3(e eVar, View view) {
        p.h(eVar, "this$0");
        eVar.G3();
    }

    public static final void J3(e eVar, View view) {
        p.h(eVar, "this$0");
        eVar.F3();
    }

    public static final void K3(e eVar, View view) {
        p.h(eVar, "this$0");
        eVar.H3();
    }

    public final j1 E3() {
        return (j1) this.N0.b(this, X0[0]);
    }

    public final void F3() {
        Runnable runnable = this.V0;
        if (runnable != null) {
            runnable.run();
        }
        n3();
    }

    public final void G3() {
        Runnable runnable = this.U0;
        if (runnable != null) {
            runnable.run();
        }
        n3();
    }

    public final void H3() {
        if (this.T0) {
            return;
        }
        n3();
    }

    public final void L3(j1 j1Var) {
        this.N0.a(this, X0[0], j1Var);
    }

    public final void M3(Runnable runnable) {
        this.V0 = runnable;
    }

    public final void N3(Runnable runnable) {
        this.U0 = runnable;
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        this.O0 = M2().getString("EXTRA_TITLE");
        this.P0 = M2().getString("EXTRA_MESSAGE");
        this.Q0 = M2().getBoolean("EXTRA_IS_WARNING_MESSAGE");
        this.R0 = M2().getString("EXTRA_OK");
        this.S0 = M2().getString("EXTRA_CANCEL");
        this.T0 = M2().getBoolean("EXTRA_DISABLE_CANCELABLE");
        boolean z10 = false;
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(q0()), b1.dialog_fragment_chat_confirmation, null, false);
        p.g(e10, "inflate(\n            Lay…          false\n        )");
        L3((j1) e10);
        E3().G.setText(this.O0);
        E3().D.setText(this.P0);
        E3().D.setTextColor(c3.a.d(N2(), this.Q0 ? w0.K0 : w0.N0));
        String str = this.R0;
        if (str == null || str.length() == 0) {
            E3().E.setVisibility(8);
        } else {
            E3().E.setVisibility(0);
            E3().E.setText(this.R0);
            E3().E.setOnClickListener(new View.OnClickListener() { // from class: ge.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    e.I3(e.this, view);
                }
            });
        }
        String str2 = this.S0;
        if (str2 == null || str2.length() == 0) {
            z10 = true;
        }
        if (!z10) {
            E3().C.setText(this.S0);
        }
        E3().C.setOnClickListener(new View.OnClickListener() { // from class: ge.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.J3(e.this, view);
            }
        });
        E3().F.setOnClickListener(new View.OnClickListener() { // from class: ge.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.K3(e.this, view);
            }
        });
        w3(!this.T0);
        Dialog dialog = new Dialog(N2(), 16973913);
        dialog.setContentView(E3().u());
        dialog.setCancelable(!this.T0);
        dialog.setCanceledOnTouchOutside(true ^ this.T0);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        return dialog;
    }
}
