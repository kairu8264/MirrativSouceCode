package be;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;
import com.dena.mirrorman.net.glide.GlideApp;
import com.dena.mirrorman.net.glide.GlideRequest;

/* loaded from: classes2.dex */
public final class n3 extends androidx.fragment.app.e {
    public static final a Q0 = new a(null);
    public static final int R0 = 8;
    public o3 N0;
    public final wn.f O0;
    public final wn.f P0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final n3 a(String str, String str2) {
            jo.p.h(str, "campaignName");
            jo.p.h(str2, "bannerImageUrl");
            n3 n3Var = new n3();
            n3Var.V2(k3.b.a(wn.q.a("EXTRA_CAMPAIGN_NAME", str), wn.q.a("EXTRA_BANNER_IMAGE_URL", str2)));
            return n3Var;
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
            String string = n3.this.M2().getString("EXTRA_BANNER_IMAGE_URL");
            if (string != null) {
                return string;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
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
            String string = n3.this.M2().getString("EXTRA_CAMPAIGN_NAME");
            if (string != null) {
                return string;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.l<View, wn.v> {
        public d() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            o3 o3Var = n3.this.N0;
            if (o3Var != null) {
                o3Var.E();
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.l<View, wn.v> {
        public e() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            o3 o3Var = n3.this.N0;
            if (o3Var != null) {
                o3Var.S();
            }
            n3.this.m3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    public n3() {
        super(nd.b1.dialog_fragment_request_usage_stats_permission);
        this.O0 = wn.g.a(new c());
        this.P0 = wn.g.a(new b());
    }

    public final String C3() {
        return (String) this.P0.getValue();
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
        jo.p.h(view, "view");
        ae.e4 T = ae.e4.T(view);
        GlideRequest<Drawable> load = GlideApp.with(N2()).load(C3());
        e8.h hVar = new e8.h();
        hVar.transform(new v7.y(12));
        load.apply((e8.a<?>) hVar).into(T.D);
        T.F.setText(V0(nd.f1.text_setting_join_campaign_dialog_detail, D3()));
        AppCompatButton appCompatButton = T.H;
        jo.p.g(appCompatButton, "settingsButton");
        yd.g1.a(appCompatButton, new d());
        AppCompatButton appCompatButton2 = T.E;
        jo.p.g(appCompatButton2, "cancelButton");
        yd.g1.a(appCompatButton2, new e());
        super.e2(view, bundle);
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        w3(false);
        Dialog dialog = new Dialog(N2(), nd.g1.f42010i);
        dialog.setContentView(nd.b1.dialog_fragment_request_usage_stats_permission);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(nd.w0.Q0);
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        Fragment H0 = H0();
        jo.p.f(H0, "null cannot be cast to non-null type com.dena.mirrorman.dialog.RequestUsageStatsPermissionDialogFragmentListener");
        this.N0 = (o3) H0;
        super.x1(context);
    }
}
