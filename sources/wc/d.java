package wc;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.d2;
import androidx.fragment.app.Fragment;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import jo.f0;
import jo.p;
import jo.q;
import nc.j;
import wn.i;
import wn.v;

/* loaded from: classes2.dex */
public final class d extends androidx.fragment.app.e {
    public static final a Q0 = new a(null);
    public static final int R0 = 8;
    public final wn.f N0 = wn.g.b(i.SYNCHRONIZED, new C0975d(this, null, null));
    public final wn.f O0 = wn.g.a(new c());
    public vb.b P0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final d a(String str) {
            p.h(str, "referer");
            d dVar = new d();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_REFERER", str);
            dVar.V2(bundle);
            return dVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.p<l0.i, Integer, v> {

        /* loaded from: classes2.dex */
        public static final class a extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ d f58590w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar) {
                super(0);
                this.f58590w = dVar;
            }

            public final void a() {
                vb.b bVar = this.f58590w.P0;
                if (bVar != null) {
                    bVar.P();
                }
                this.f58590w.n3();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        /* renamed from: wc.d$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0974b extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ d f58591w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0974b(d dVar) {
                super(0);
                this.f58591w = dVar;
            }

            public final void a() {
                this.f58591w.n3();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        public b() {
            super(2);
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                e.a(new a(d.this), new C0974b(d.this), iVar, 0);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.a<String> {
        public c() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final String invoke() {
            String string = d.this.M2().getString("EXTRA_KEY_REFERER");
            p.e(string);
            return string;
        }
    }

    /* renamed from: wc.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0975d extends q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f58593w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f58594x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f58595y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0975d(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f58593w = componentCallbacks;
            this.f58594x = aVar;
            this.f58595y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f58593w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f58594x, this.f58595y);
        }
    }

    public final MRLogger C3() {
        return (MRLogger) this.N0.getValue();
    }

    public final String D3() {
        return (String) this.O0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        p.h(layoutInflater, "inflater");
        MRLogger C3 = C3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_CHAT_HEALTH_AGREEMENT_IMP);
        builder.setPageId(D3());
        C3.sendLog(builder.build());
        Context N2 = N2();
        p.g(N2, "requireContext()");
        ComposeView composeView = new ComposeView(N2, null, 0, 6, null);
        composeView.setViewCompositionStrategy(d2.c.f14419b);
        composeView.setContent(s0.c.c(-1669702326, true, new b()));
        return composeView;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.P0 = null;
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        p.h(view, "view");
        super.e2(view, bundle);
        Dialog p32 = p3();
        if (p32 == null || (window = p32.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        w3(false);
        return new Dialog(N2(), j.f41900a);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        p.h(context, "context");
        super.x1(context);
        vb.b bVar = null;
        vb.b bVar2 = context instanceof vb.b ? (vb.b) context : null;
        if (bVar2 == null) {
            Fragment H0 = H0();
            if (H0 instanceof vb.b) {
                bVar = (vb.b) H0;
            }
        } else {
            bVar = bVar2;
        }
        this.P0 = bVar;
    }
}
