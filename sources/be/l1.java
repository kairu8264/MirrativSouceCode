package be;

import android.app.Dialog;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.dena.mirrorman.net.glide.GlideApp;
import com.dena.mirrorman.net.glide.GlideRequest;

/* loaded from: classes2.dex */
public final class l1 extends androidx.fragment.app.e implements uo.q0 {
    public static final a R0 = new a(null);
    public static final int S0 = 8;
    public ae.x0 O0;
    public final /* synthetic */ da.j N0 = new da.j();
    public final wn.f P0 = wn.g.a(new e());
    public final b Q0 = new b();

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final l1 a(String str) {
            jo.p.h(str, "imageUrl");
            l1 l1Var = new l1();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_EMOMO_RUN_POPUP_IMAGE_URL", str);
            l1Var.V2(bundle);
            return l1Var;
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
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), de.e.b(l1.this, 12));
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {
        public c() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            l1.this.m3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.l<View, wn.v> {
        public d() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            l1.this.m3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<String> {
        public e() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            return l1.this.M2().getString("EXTRA_EMOMO_RUN_POPUP_IMAGE_URL");
        }
    }

    public final String B3() {
        return (String) this.P0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        ae.x0 x0Var = null;
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(q0()), nd.b1.dialog_emomo_run_ranking_rule, null, false);
        jo.p.g(e10, "inflate(\n            Lay…          false\n        )");
        ae.x0 x0Var2 = (ae.x0) e10;
        this.O0 = x0Var2;
        if (x0Var2 == null) {
            jo.p.v("binding");
        } else {
            x0Var = x0Var2;
        }
        View u10 = x0Var.u();
        jo.p.g(u10, "binding.root");
        return u10;
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        super.e2(view, bundle);
        ae.x0 x0Var = this.O0;
        ae.x0 x0Var2 = null;
        if (x0Var == null) {
            jo.p.v("binding");
            x0Var = null;
        }
        x0Var.M(this);
        ae.x0 x0Var3 = this.O0;
        if (x0Var3 == null) {
            jo.p.v("binding");
            x0Var3 = null;
        }
        GlideRequest<Drawable> load = GlideApp.with(x0Var3.D).load(B3());
        ae.x0 x0Var4 = this.O0;
        if (x0Var4 == null) {
            jo.p.v("binding");
            x0Var4 = null;
        }
        load.into(x0Var4.D);
        ae.x0 x0Var5 = this.O0;
        if (x0Var5 == null) {
            jo.p.v("binding");
            x0Var5 = null;
        }
        x0Var5.E.setOutlineProvider(this.Q0);
        ae.x0 x0Var6 = this.O0;
        if (x0Var6 == null) {
            jo.p.v("binding");
            x0Var6 = null;
        }
        x0Var6.E.setClipToOutline(true);
        ae.x0 x0Var7 = this.O0;
        if (x0Var7 == null) {
            jo.p.v("binding");
            x0Var7 = null;
        }
        AppCompatImageView appCompatImageView = x0Var7.B;
        jo.p.g(appCompatImageView, "binding.closeImageView");
        yd.g1.a(appCompatImageView, new c());
        ae.x0 x0Var8 = this.O0;
        if (x0Var8 == null) {
            jo.p.v("binding");
        } else {
            x0Var2 = x0Var8;
        }
        ConstraintLayout constraintLayout = x0Var2.C;
        jo.p.g(constraintLayout, "binding.rootContainer");
        yd.g1.a(constraintLayout, new d());
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void t1(Bundle bundle) {
        super.t1(bundle);
        Dialog p32 = p3();
        if (p32 != null) {
            Window window = p32.getWindow();
            if (window != null) {
                window.setLayout(-1, -1);
            }
            Window window2 = p32.getWindow();
            if (window2 != null) {
                window2.setBackgroundDrawableResource(nd.w0.Q0);
            }
        }
    }
}
