package be;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import com.dena.mirrorman.net.glide.GlideApp;

/* loaded from: classes2.dex */
public final class a1 extends androidx.fragment.app.e {
    public static final a N0 = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final a1 a(String str) {
            jo.p.h(str, "helpImageUrl");
            a1 a1Var = new a1();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_HELP_IMAGE_URL", str);
            a1Var.V2(bundle);
            return a1Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.l<View, wn.v> {
        public b() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            a1.this.m3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public a1() {
        super(nd.b1.dialog_fragment_emomo_dress_up_help_image);
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(-1, -2);
        }
        ae.n2 T = ae.n2.T(view);
        String string = M2().getString("EXTRA_HELP_IMAGE_URL");
        jo.p.e(string);
        GlideApp.with(T.C).load(string).fitCenter().into(T.C);
        AppCompatImageView appCompatImageView = T.B;
        jo.p.g(appCompatImageView, "binding.closeImageView");
        yd.g1.a(appCompatImageView, new b());
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), nd.g1.f42004a);
    }
}
