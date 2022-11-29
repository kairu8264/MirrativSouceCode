package f9;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import com.dena.mirrorman.base.WebViewActivity;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.dena.mirrorman.net.MRUrl;
import io.l;
import jo.f0;
import jo.p;
import jo.q;
import kf.m;
import kf.x;
import vb.k;
import wn.v;
import xn.s;
import yd.g1;

/* loaded from: classes.dex */
public final class c extends androidx.fragment.app.e {
    public static final a U0 = new a(null);
    public static final int V0 = 8;
    public final wn.f N0;
    public final wn.f O0;
    public final wn.f P0;
    public final wn.f Q0;
    public final wn.f R0;
    public k S0;
    public final wn.f T0;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final c a(boolean z10) {
            c cVar = new c();
            Bundle bundle = new Bundle();
            bundle.putBoolean("EXTRA_USER_MATCHING_COLLAB_ENABLED", z10);
            cVar.V2(bundle);
            return cVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends q implements l<View, v> {

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ e9.c f31866x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e9.c cVar) {
            super(1);
            this.f31866x = cVar;
        }

        public final void a(View view) {
            p.h(view, "it");
            k kVar = c.this.S0;
            if (kVar != null) {
                kVar.v1(this.f31866x.F.isChecked());
            }
            c.this.n3();
            MRLogger J3 = c.this.J3();
            MRLog.Companion companion = MRLog.Companion;
            c cVar = c.this;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_COLLAB_MATCHING_PLAYSTYLE_NOTICE);
            builder.setPayload(s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, cVar.I3().b()), wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, cVar.L3().T4())));
            J3.sendLog(builder.build());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* renamed from: f9.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0347c extends q implements l<View, v> {
        public C0347c() {
            super(1);
        }

        public final void a(View view) {
            p.h(view, "it");
            WebViewActivity.a aVar = WebViewActivity.X;
            Context N2 = c.this.N2();
            p.g(N2, "requireContext()");
            c.this.f3(WebViewActivity.a.b(aVar, N2, MRUrl.MatchingCollabCampaign.INSTANCE.getUrl(), false, false, 12, null));
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f31868w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f31869x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f31870y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f31868w = componentCallbacks;
            this.f31869x = aVar;
            this.f31870y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f31868w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f31869x, this.f31870y);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends q implements io.a<m> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f31871w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f31872x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f31873y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f31871w = componentCallbacks;
            this.f31872x = aVar;
            this.f31873y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.m, java.lang.Object] */
        @Override // io.a
        public final m invoke() {
            ComponentCallbacks componentCallbacks = this.f31871w;
            return gq.a.a(componentCallbacks).c(f0.b(m.class), this.f31872x, this.f31873y);
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends q implements io.a<x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f31874w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f31875x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f31876y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f31874w = componentCallbacks;
            this.f31875x = aVar;
            this.f31876y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final x invoke() {
            ComponentCallbacks componentCallbacks = this.f31874w;
            return gq.a.a(componentCallbacks).c(f0.b(x.class), this.f31875x, this.f31876y);
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends q implements io.a<nf.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f31877w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f31878x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f31879y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f31877w = componentCallbacks;
            this.f31878x = aVar;
            this.f31879y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nf.c] */
        @Override // io.a
        public final nf.c invoke() {
            ComponentCallbacks componentCallbacks = this.f31877w;
            return gq.a.a(componentCallbacks).c(f0.b(nf.c.class), this.f31878x, this.f31879y);
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends q implements io.a<od.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f31880w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f31881x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f31882y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f31880w = componentCallbacks;
            this.f31881x = aVar;
            this.f31882y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.b] */
        @Override // io.a
        public final od.b invoke() {
            ComponentCallbacks componentCallbacks = this.f31880w;
            return gq.a.a(componentCallbacks).c(f0.b(od.b.class), this.f31881x, this.f31882y);
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends q implements io.a<Boolean> {
        public i() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(c.this.M2().getBoolean("EXTRA_USER_MATCHING_COLLAB_ENABLED"));
        }
    }

    public c() {
        super(d9.e.dialog_fragment_collab_matching_setting_dialog);
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.N0 = wn.g.b(iVar, new d(this, null, null));
        this.O0 = wn.g.b(iVar, new e(this, null, null));
        this.P0 = wn.g.b(iVar, new f(this, null, null));
        this.Q0 = wn.g.b(iVar, new g(this, null, null));
        this.R0 = wn.g.b(iVar, new h(this, null, null));
        this.T0 = wn.g.a(new i());
    }

    public static final void M3(e9.c cVar, String str) {
        p.g(str, "it");
        if (str.length() == 0) {
            cVar.I.setVisibility(8);
            return;
        }
        cVar.I.setVisibility(0);
        cVar.I.setText(str);
    }

    public final od.b G3() {
        return (od.b) this.R0.getValue();
    }

    public final nf.c H3() {
        return (nf.c) this.Q0.getValue();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.S0 = null;
        super.I1();
    }

    public final m I3() {
        return (m) this.O0.getValue();
    }

    public final MRLogger J3() {
        return (MRLogger) this.N0.getValue();
    }

    public final boolean K3() {
        return ((Boolean) this.T0.getValue()).booleanValue();
    }

    public final x L3() {
        return (x) this.P0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        p.h(view, "view");
        super.e2(view, bundle);
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        final e9.c T = e9.c.T(view);
        AppCompatImageView appCompatImageView = T.D;
        p.g(appCompatImageView, "binding.headerImageView");
        td.a.H(appCompatImageView, null, c3.a.f(N2(), d9.c.img_collab_matching), null, 8, null);
        RoundedButtonView roundedButtonView = T.H;
        p.g(roundedButtonView, "binding.saveButtonView");
        g1.a(roundedButtonView, new b(T));
        RoundedButtonView roundedButtonView2 = T.E;
        p.g(roundedButtonView2, "binding.helpTextView");
        g1.a(roundedButtonView2, new C0347c());
        T.F.setChecked(K3());
        H3().t0().i(a1(), new androidx.lifecycle.f0() { // from class: f9.b
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                c.M3(e9.c.this, (String) obj);
            }
        });
        G3().Q();
        MRLogger J3 = J3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_COLLAB_MATCHING_PLAYSTYLE_NOTICE_IMP);
        builder.setPayload(s.m(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, I3().b()), wn.q.a(MRLog.PAYLOAD_KEY_CAST_ID, L3().T4())));
        J3.sendLog(builder.build());
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        Dialog dialog = new Dialog(N2(), d9.f.f29326a);
        w3(false);
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        p.h(context, "context");
        super.x1(context);
        this.S0 = context instanceof k ? (k) context : null;
    }
}
