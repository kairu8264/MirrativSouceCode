package be;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import com.dena.mirrorman.AutoClearedValue;

/* loaded from: classes2.dex */
public final class u extends androidx.fragment.app.e {
    public final AutoClearedValue N0 = nd.a.a(this);
    public final wn.f O0 = wn.g.a(new b());
    public final wn.f P0 = wn.g.a(new c());
    public static final /* synthetic */ qo.h<Object>[] R0 = {jo.f0.d(new jo.s(u.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/DialogFragmentAvatarPartsPurchaseResultBinding;", 0))};
    public static final a Q0 = new a(null);
    public static final int S0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final u a(String str, String str2) {
            jo.p.h(str, "resultImageUrl");
            jo.p.h(str2, "resultMessage");
            u uVar = new u();
            Bundle bundle = new Bundle();
            bundle.putString("BUNDLE_KEY_RESULT_IMAGE_URL", str);
            bundle.putString("BUNDLE_KEY_RESULT_MESSAGE", str2);
            uVar.V2(bundle);
            return uVar;
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
            String string = u.this.M2().getString("BUNDLE_KEY_RESULT_IMAGE_URL");
            jo.p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<String> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = u.this.M2().getString("BUNDLE_KEY_RESULT_MESSAGE");
            jo.p.e(string);
            return string;
        }
    }

    public static final void F3(u uVar, View view) {
        jo.p.h(uVar, "this$0");
        uVar.m3();
    }

    public final ae.h1 C3() {
        return (ae.h1) this.N0.b(this, R0[0]);
    }

    public final String D3() {
        return (String) this.O0.getValue();
    }

    public final String E3() {
        return (String) this.P0.getValue();
    }

    public final void G3(ae.h1 h1Var) {
        this.N0.a(this, R0[0], h1Var);
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        ae.h1 T = ae.h1.T(LayoutInflater.from(N2()), null, false);
        jo.p.g(T, "inflate(\n            Lay…          false\n        )");
        G3(T);
        AppCompatImageView appCompatImageView = C3().C;
        jo.p.g(appCompatImageView, "binding.resultImageView");
        td.a.f(appCompatImageView, D3());
        C3().D.setText(E3());
        C3().B.setOnClickListener(new View.OnClickListener() { // from class: be.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u.F3(u.this, view);
            }
        });
        Dialog dialog = new Dialog(N2(), nd.g1.f42010i);
        dialog.setContentView(C3().u());
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(nd.y0.rectangle_corner12_whitethree);
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setLayout(de.e.b(this, 280), -2);
        }
        return dialog;
    }
}
