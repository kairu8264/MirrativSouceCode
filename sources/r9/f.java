package r9;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import com.dena.mirrorman.AutoClearedValue;

/* loaded from: classes.dex */
public final class f extends androidx.fragment.app.e {
    public final AutoClearedValue N0 = nd.a.a(this);
    public vb.f O0;
    public static final /* synthetic */ qo.h<Object>[] Q0 = {jo.f0.d(new jo.s(f.class, "binding", "getBinding()Lcom/dena/mirrativ/emomo/databinding/DialogFragmentClosetConfirmDestroyBinding;", 0))};
    public static final a P0 = new a(null);
    public static final int R0 = 8;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public static /* synthetic */ f b(a aVar, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.a(z10);
        }

        public final f a(boolean z10) {
            f fVar = new f();
            Bundle bundle = new Bundle();
            bundle.putBoolean("EXTRA_IS_RESET", z10);
            fVar.V2(bundle);
            return fVar;
        }
    }

    public static final void F3(f fVar, View view) {
        jo.p.h(fVar, "this$0");
        if (fVar.E3()) {
            vb.f fVar2 = fVar.O0;
            if (fVar2 != null) {
                fVar2.T1();
            }
        } else {
            vb.f fVar3 = fVar.O0;
            if (fVar3 != null) {
                fVar3.f2();
            }
        }
        fVar.n3();
    }

    public static final void G3(f fVar, View view) {
        jo.p.h(fVar, "this$0");
        fVar.n3();
    }

    public final s9.o D3() {
        return (s9.o) this.N0.b(this, Q0[0]);
    }

    public final boolean E3() {
        return M2().getBoolean("EXTRA_IS_RESET");
    }

    public final void H3(s9.o oVar) {
        this.N0.a(this, Q0[0], oVar);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.O0 = null;
        super.I1();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        w3(false);
        CharSequence charSequence = null;
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(q0()), q9.h.dialog_fragment_closet_confirm_destroy, null, false);
        s9.o oVar = (s9.o) e10;
        AppCompatTextView appCompatTextView = oVar.B;
        Context q02 = q0();
        if (q02 != null) {
            charSequence = q02.getText(E3() ? q9.i.text_emomo_notice_discard_change : q9.i.text_emomo_notice_change_slot);
        }
        appCompatTextView.setText(charSequence);
        oVar.E.setOnClickListener(new View.OnClickListener() { // from class: r9.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.F3(f.this, view);
            }
        });
        oVar.C.setOnClickListener(new View.OnClickListener() { // from class: r9.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.G3(f.this, view);
            }
        });
        jo.p.g(e10, "inflate<DialogFragmentCl…)\n            }\n        }");
        H3(oVar);
        Dialog dialog = new Dialog(N2(), 16973913);
        dialog.setContentView(D3().u());
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        Fragment H0 = H0();
        vb.f fVar = null;
        vb.f fVar2 = H0 instanceof vb.f ? (vb.f) H0 : null;
        if (fVar2 != null) {
            fVar = fVar2;
        } else if (context instanceof vb.f) {
            fVar = (vb.f) context;
        }
        this.O0 = fVar;
    }
}
