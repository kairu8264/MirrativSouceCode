package rc;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import com.dena.mirrativ.mirrativapi.core.ApiUtil;
import com.dena.mirrativ.mirrativapi.core.ServerConfig;
import com.dena.mirrorman.net.MRUrl;

/* loaded from: classes2.dex */
public final class z1 extends androidx.fragment.app.e {
    public static final a Q0 = new a(null);
    public static final int R0 = 8;
    public vb.s N0;
    public final wn.f O0;
    public final wn.f P0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final z1 a(ub.b bVar) {
            jo.p.h(bVar, "data");
            z1 z1Var = new z1();
            z1Var.V2(k3.b.a(wn.q.a("EXTRA_DATA", bVar)));
            return z1Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<ub.b> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final ub.b invoke() {
            Parcelable parcelable = z1.this.M2().getParcelable("EXTRA_DATA");
            if (parcelable != null) {
                return (ub.b) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {
        public c() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            vb.s sVar = z1.this.N0;
            if (sVar != null) {
                String U0 = z1.this.U0(nc.i.text_contract_step_1_terms);
                jo.p.g(U0, "getString(R.string.text_contract_step_1_terms)");
                sVar.i(U0, ApiUtil.INSTANCE.urlTerms(z1.this.F3()));
            }
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
            vb.s sVar = z1.this.N0;
            if (sVar != null) {
                String U0 = z1.this.U0(nc.i.S5);
                jo.p.g(U0, "getString(R.string.text_streamer_terms_of_use)");
                sVar.i(U0, MRUrl.TermsForStreamer.INSTANCE.getUrl());
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
            vb.s sVar = z1.this.N0;
            if (sVar != null) {
                sVar.R(z1.this.E3().b());
            }
            z1.this.m3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<ServerConfig> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f51080w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f51081x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f51082y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f51080w = componentCallbacks;
            this.f51081x = aVar;
            this.f51082y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrativ.mirrativapi.core.ServerConfig, java.lang.Object] */
        @Override // io.a
        public final ServerConfig invoke() {
            ComponentCallbacks componentCallbacks = this.f51080w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(ServerConfig.class), this.f51081x, this.f51082y);
        }
    }

    public z1() {
        super(nc.f.dialog_fragment_new_terms_of_service);
        this.O0 = wn.g.a(new b());
        this.P0 = wn.g.b(wn.i.SYNCHRONIZED, new f(this, null, null));
    }

    public final ub.b E3() {
        return (ub.b) this.O0.getValue();
    }

    public final ServerConfig F3() {
        return (ServerConfig) this.P0.getValue();
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
        pc.a1 T = pc.a1.T(view);
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        Dialog p33 = p3();
        if (p33 != null) {
            p33.setCancelable(false);
        }
        AppCompatButton appCompatButton = T.C;
        jo.p.g(appCompatButton, "binding.confirmButton");
        yd.g1.a(appCompatButton, new c());
        AppCompatButton appCompatButton2 = T.H;
        jo.p.g(appCompatButton2, "binding.streamerTermsConfirmButton");
        yd.g1.a(appCompatButton2, new d());
        AppCompatButton appCompatButton3 = T.B;
        jo.p.g(appCompatButton3, "binding.agreeButton");
        yd.g1.a(appCompatButton3, new e());
        AppCompatImageView appCompatImageView = T.G;
        jo.p.g(appCompatImageView, "binding.image");
        td.a.f(appCompatImageView, E3().a());
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), 16973913);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        Fragment H0 = H0();
        this.N0 = H0 instanceof vb.s ? (vb.s) H0 : null;
        super.x1(context);
    }
}
