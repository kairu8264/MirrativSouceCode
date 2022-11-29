package be;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatTextView;
import com.dena.mirrorman.customview.RoundedButtonView;

/* loaded from: classes2.dex */
public final class z extends androidx.fragment.app.e {
    public static final a P0 = new a(null);
    public static final int Q0 = 8;
    public a0 N0;
    public final wn.f O0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final z a(String str) {
            jo.p.h(str, "titleText");
            z zVar = new z();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_TITLE_TEXT", str);
            zVar.V2(bundle);
            return zVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {
        public b() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            a0 a0Var = z.this.N0;
            if (a0Var != null) {
                a0Var.y1();
            }
            z.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {
        public c() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            a0 a0Var = z.this.N0;
            if (a0Var != null) {
                a0Var.x1();
            }
            z.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
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
            String string = z.this.M2().getString("EXTRA_KEY_TITLE_TEXT");
            jo.p.e(string);
            return string;
        }
    }

    public z() {
        super(nd.b1.dialog_fragment_collab_matching_retry_dialog);
        this.O0 = wn.g.a(new d());
    }

    public static final boolean E3(z zVar, DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        jo.p.h(zVar, "this$0");
        if (keyEvent.getAction() == 1 && i10 == 4) {
            a0 a0Var = zVar.N0;
            if (a0Var != null) {
                a0Var.x1();
            }
            zVar.n3();
            return true;
        }
        return false;
    }

    public final String D3() {
        return (String) this.O0.getValue();
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
            window.setLayout(de.e.b(this, 280), -2);
        }
        ae.r1 T = ae.r1.T(view);
        T.E.setText(D3());
        RoundedButtonView roundedButtonView = T.D;
        jo.p.g(roundedButtonView, "binding.restartButtonView");
        yd.g1.a(roundedButtonView, new b());
        AppCompatTextView appCompatTextView = T.C;
        jo.p.g(appCompatTextView, "binding.laterTextView");
        yd.g1.a(appCompatTextView, new c());
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        Dialog dialog = new Dialog(N2(), nd.g1.f42004a);
        w3(false);
        dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: be.y
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                boolean E3;
                E3 = z.E3(z.this, dialogInterface, i10, keyEvent);
                return E3;
            }
        });
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.N0 = context instanceof a0 ? (a0) context : null;
    }
}
