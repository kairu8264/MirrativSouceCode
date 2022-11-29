package be;

import android.app.Dialog;
import android.graphics.Outline;
import android.os.Bundle;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.widget.ImageView;
import com.dena.mirrorman.net.glide.GlideApp;

/* loaded from: classes2.dex */
public final class a5 extends androidx.fragment.app.e {
    public static final a O0 = new a(null);
    public final b N0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final a5 a(String str) {
            jo.p.h(str, "imageUrl");
            a5 a5Var = new a5();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_IMAGE_URL", str);
            a5Var.V2(bundle);
            return a5Var;
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
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), de.e.b(a5.this, 12));
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {
        public c() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            a5.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public a5() {
        super(nd.b1.dialog_fragment_shooter_rule);
        this.N0 = new b();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        ae.w4 T = ae.w4.T(view);
        GlideApp.with(T.C).load(M2().getString("EXTRA_KEY_IMAGE_URL")).into(T.C);
        T.u().setOutlineProvider(this.N0);
        T.u().setClipToOutline(true);
        ImageView imageView = T.B;
        jo.p.g(imageView, "binding.closeImageView");
        yd.g1.a(imageView, new c());
        Dialog p32 = p3();
        if (p32 == null || (window = p32.getWindow()) == null) {
            return;
        }
        window.setLayout(de.e.b(this, 320), -2);
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), nd.g1.f42004a);
    }
}
