package zc;

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
import androidx.fragment.app.e;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import jo.f0;
import jo.h;
import jo.p;
import jo.q;
import nc.j;
import wn.f;
import wn.g;
import wn.i;
import wn.v;

/* loaded from: classes2.dex */
public final class a extends e {
    public static final C1091a Q0 = new C1091a(null);
    public static final int R0 = 8;
    public final f N0 = g.b(i.SYNCHRONIZED, new d(this, null, null));
    public final f O0 = g.a(new c());
    public vb.e P0;

    /* renamed from: zc.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C1091a {
        public C1091a() {
        }

        public /* synthetic */ C1091a(h hVar) {
            this();
        }

        public final a a(String str) {
            p.h(str, "referer");
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_REFERER", str);
            aVar.V2(bundle);
            return aVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.p<l0.i, Integer, v> {

        /* renamed from: zc.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C1092a extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ a f63064w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1092a(a aVar) {
                super(0);
                this.f63064w = aVar;
            }

            public final void a() {
                vb.e eVar = this.f63064w.P0;
                if (eVar != null) {
                    eVar.R1();
                }
                this.f63064w.n3();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ v invoke() {
                a();
                return v.f59242a;
            }
        }

        /* renamed from: zc.a$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C1093b extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ a f63065w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1093b(a aVar) {
                super(0);
                this.f63065w = aVar;
            }

            public final void a() {
                this.f63065w.n3();
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
                zc.b.a(new C1092a(a.this), new C1093b(a.this), iVar, 0);
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
            String string = a.this.M2().getString("EXTRA_KEY_REFERER");
            p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f63067w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f63068x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f63069y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f63067w = componentCallbacks;
            this.f63068x = aVar;
            this.f63069y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f63067w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f63068x, this.f63069y);
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
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_CHAT_HEALTH_REQUEST_IMP);
        builder.setPageId(D3());
        C3.sendLog(builder.build());
        Context N2 = N2();
        p.g(N2, "requireContext()");
        ComposeView composeView = new ComposeView(N2, null, 0, 6, null);
        composeView.setViewCompositionStrategy(d2.c.f14419b);
        composeView.setContent(s0.c.c(-2054865041, true, new b()));
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
        return new Dialog(N2(), j.f41900a);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        p.h(context, "context");
        super.x1(context);
        vb.e eVar = null;
        vb.e eVar2 = context instanceof vb.e ? (vb.e) context : null;
        if (eVar2 == null) {
            Fragment H0 = H0();
            if (H0 instanceof vb.e) {
                eVar = (vb.e) H0;
            }
        } else {
            eVar = eVar2;
        }
        this.P0 = eVar;
    }
}
