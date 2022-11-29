package be;

import ae.y5;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.base.WebViewActivity;
import com.dena.mirrorman.net.MRUrl;
import com.dena.mirrorman.net.glide.GlideApp;

/* loaded from: classes2.dex */
public final class k3 extends androidx.fragment.app.e {
    public final AutoClearedValue N0 = nd.a.a(this);
    public static final /* synthetic */ qo.h<Object>[] P0 = {jo.f0.d(new jo.s(k3.class, "binding", "getBinding()Lcom/dena/mirrorman/databinding/DialogNominatedToModeratorBinding;", 0))};
    public static final a O0 = new a(null);
    public static final int Q0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final k3 a(String str) {
            jo.p.h(str, "profileImageUrl");
            k3 k3Var = new k3();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_IMAGE_URL", str);
            k3Var.V2(bundle);
            return k3Var;
        }
    }

    public static final void E3(k3 k3Var, View view) {
        jo.p.h(k3Var, "this$0");
        k3Var.m3();
    }

    public static final void F3(k3 k3Var, View view) {
        jo.p.h(k3Var, "this$0");
        Context q02 = k3Var.q0();
        if (q02 != null) {
            k3Var.f3(WebViewActivity.a.b(WebViewActivity.X, q02, MRUrl.Moderator.INSTANCE.getUrl(), false, false, 12, null));
        }
    }

    public final y5 D3() {
        return (y5) this.N0.b(this, P0[0]);
    }

    public final void G3(y5 y5Var) {
        this.N0.a(this, P0[0], y5Var);
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(q0()), nd.b1.dialog_nominated_to_moderator, null, false);
        jo.p.g(e10, "inflate(\n            Lay…          false\n        )");
        G3((y5) e10);
        GlideApp.with(D3().u()).load(M2().getString("EXTRA_IMAGE_URL")).placeholder(nd.y0.X1).apply((e8.a<?>) new e8.h().circleCrop()).into(D3().E);
        D3().C.setPaintFlags(D3().C.getPaintFlags() | 8);
        D3().G.setOnClickListener(new View.OnClickListener() { // from class: be.i3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k3.E3(k3.this, view);
            }
        });
        D3().C.setOnClickListener(new View.OnClickListener() { // from class: be.j3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k3.F3(k3.this, view);
            }
        });
        Dialog dialog = new Dialog(N2(), nd.g1.f42010i);
        dialog.setContentView(D3().u());
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(de.e.b(this, 280), -2);
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawableResource(nd.w0.f42232g);
        }
        return dialog;
    }
}
