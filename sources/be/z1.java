package be;

import android.app.Dialog;
import android.content.res.Configuration;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import com.dena.mirrorman.net.glide.GlideApp;
import com.dena.mirrorman.net.glide.GlideRequest;

/* loaded from: classes2.dex */
public final class z1 extends androidx.fragment.app.e {
    public static final a P0 = new a(null);
    public static final int Q0 = 8;
    public ae.j3 N0;
    public final b O0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final z1 a(String str) {
            jo.p.h(str, "imageUrl");
            z1 z1Var = new z1();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_IMAGE_URL", str);
            z1Var.V2(bundle);
            return z1Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            jo.p.h(view, "view");
            jo.p.h(outline, "outline");
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), de.e.b(z1.this, 12));
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {
        public c() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            z1.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public z1() {
        super(nd.b1.dialog_fragment_help_image_popup);
        this.O0 = new b();
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
        ae.j3 T = ae.j3.T(view);
        jo.p.g(T, "bind(view)");
        this.N0 = T;
        ae.j3 j3Var = null;
        if (T == null) {
            jo.p.v("binding");
            T = null;
        }
        GlideRequest<Drawable> load = GlideApp.with(T.D).load(M2().getString("EXTRA_KEY_IMAGE_URL"));
        ae.j3 j3Var2 = this.N0;
        if (j3Var2 == null) {
            jo.p.v("binding");
            j3Var2 = null;
        }
        load.into(j3Var2.D);
        ae.j3 j3Var3 = this.N0;
        if (j3Var3 == null) {
            jo.p.v("binding");
            j3Var3 = null;
        }
        j3Var3.u().setOutlineProvider(this.O0);
        ae.j3 j3Var4 = this.N0;
        if (j3Var4 == null) {
            jo.p.v("binding");
            j3Var4 = null;
        }
        j3Var4.u().setClipToOutline(true);
        ae.j3 j3Var5 = this.N0;
        if (j3Var5 == null) {
            jo.p.v("binding");
        } else {
            j3Var = j3Var5;
        }
        AppCompatImageView appCompatImageView = j3Var.B;
        jo.p.g(appCompatImageView, "binding.closeImageView");
        yd.g1.a(appCompatImageView, new c());
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        int b10;
        jo.p.h(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        ae.j3 j3Var = this.N0;
        ae.j3 j3Var2 = null;
        if (j3Var == null) {
            jo.p.v("binding");
            j3Var = null;
        }
        cVar.g(j3Var.E);
        if (O0().getConfiguration().orientation == 2) {
            b10 = de.e.b(this, 280);
        } else {
            b10 = de.e.b(this, 380);
        }
        ae.j3 j3Var3 = this.N0;
        if (j3Var3 == null) {
            jo.p.v("binding");
            j3Var3 = null;
        }
        cVar.l(j3Var3.C.getId(), b10);
        ae.j3 j3Var4 = this.N0;
        if (j3Var4 == null) {
            jo.p.v("binding");
        } else {
            j3Var2 = j3Var4;
        }
        cVar.c(j3Var2.E);
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), nd.g1.f42004a);
    }
}
