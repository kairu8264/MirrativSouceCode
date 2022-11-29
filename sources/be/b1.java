package be;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.net.glide.GlideApp;

/* loaded from: classes2.dex */
public final class b1 extends androidx.fragment.app.e {
    public final AutoClearedValue N0 = nd.a.a(this);
    public static final /* synthetic */ qo.h<Object>[] P0 = {jo.f0.d(new jo.s(b1.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/DialogFragmentEmomoMotionIntroductionBinding;", 0))};
    public static final a O0 = new a(null);
    public static final int Q0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final b1 a() {
            return new b1();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {
        public b() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            b1.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public final ae.p2 B3() {
        return (ae.p2) this.N0.b(this, P0[0]);
    }

    public final void C3(ae.p2 p2Var) {
        this.N0.a(this, P0[0], p2Var);
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        w3(false);
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(q0()), nd.b1.dialog_fragment_emomo_motion_introduction, null, false);
        jo.p.g(e10, "inflate(\n            Lay…          false\n        )");
        C3((ae.p2) e10);
        AppCompatImageView appCompatImageView = B3().B;
        jo.p.g(appCompatImageView, "binding.closeButton");
        yd.g1.a(appCompatImageView, new b());
        GlideApp.with(B3().C).load(Integer.valueOf(nd.y0.img_emomo_motion_introduction)).apply((e8.a<?>) new e8.h().transform(new v7.i(), new v7.y(de.e.b(this, 12)))).into(B3().C);
        Dialog dialog = new Dialog(N2(), 16973913);
        dialog.setContentView(B3().u());
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        return dialog;
    }
}
