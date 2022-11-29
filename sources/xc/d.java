package xc;

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
import com.dena.mirrativ.mirrativapi.user.ChatStatus;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import io.l;
import jo.f0;
import jo.p;
import jo.q;
import wn.v;

/* loaded from: classes2.dex */
public final class d extends androidx.fragment.app.e {
    public static final a R0 = new a(null);
    public static final int S0 = 8;
    public final wn.f N0;
    public final wn.f O0;
    public final wn.f P0;
    public vb.c Q0;

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
        public static final class a extends q implements l<String, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ d f60144w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar) {
                super(1);
                this.f60144w = dVar;
            }

            public final void a(String str) {
                p.h(str, "date");
                this.f60144w.E3().h(this.f60144w.G3(), str);
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(String str) {
                a(str);
                return v.f59242a;
            }
        }

        /* renamed from: xc.d$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C1000b extends q implements l<ChatStatus, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ d f60145w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1000b(d dVar) {
                super(1);
                this.f60145w = dVar;
            }

            public final void a(ChatStatus chatStatus) {
                p.h(chatStatus, "chatStatus");
                vb.c cVar = this.f60145w.Q0;
                if (cVar != null) {
                    cVar.U1(chatStatus.getRequireChatConfirmationAgreement());
                }
                this.f60145w.n3();
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(ChatStatus chatStatus) {
                a(chatStatus);
                return v.f59242a;
            }
        }

        /* loaded from: classes2.dex */
        public static final class c extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ d f60146w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(d dVar) {
                super(0);
                this.f60146w = dVar;
            }

            public final void a() {
                this.f60146w.n3();
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
                xc.e.a(new a(d.this), new C1000b(d.this), new c(d.this), iVar, 0);
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

    /* renamed from: xc.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C1001d extends q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f60148w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f60149x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f60150y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1001d(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f60148w = componentCallbacks;
            this.f60149x = aVar;
            this.f60150y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f60148w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f60149x, this.f60150y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.a<xc.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f60151w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f60152x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f60153y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f60151w = componentCallbacks;
            this.f60152x = aVar;
            this.f60153y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [xc.a, java.lang.Object] */
        @Override // io.a
        public final xc.a invoke() {
            ComponentCallbacks componentCallbacks = this.f60151w;
            return gq.a.a(componentCallbacks).c(f0.b(xc.a.class), this.f60152x, this.f60153y);
        }
    }

    public d() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.N0 = wn.g.b(iVar, new C1001d(this, null, null));
        this.O0 = wn.g.b(iVar, new e(this, null, null));
        this.P0 = wn.g.a(new c());
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        p.h(layoutInflater, "inflater");
        MRLogger F3 = F3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_CHAT_HEALTH_BIRTHDAY_IMP);
        builder.setPageId(G3());
        F3.sendLog(builder.build());
        Context N2 = N2();
        p.g(N2, "requireContext()");
        ComposeView composeView = new ComposeView(N2, null, 0, 6, null);
        composeView.setViewCompositionStrategy(d2.c.f14419b);
        composeView.setContent(s0.c.c(-1139569790, true, new b()));
        return composeView;
    }

    public final xc.a E3() {
        return (xc.a) this.O0.getValue();
    }

    public final MRLogger F3() {
        return (MRLogger) this.N0.getValue();
    }

    public final String G3() {
        return (String) this.P0.getValue();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.Q0 = null;
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
        return new Dialog(N2(), nc.j.f41900a);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        p.h(context, "context");
        super.x1(context);
        vb.c cVar = null;
        vb.c cVar2 = context instanceof vb.c ? (vb.c) context : null;
        if (cVar2 == null) {
            Fragment H0 = H0();
            if (H0 instanceof vb.c) {
                cVar = (vb.c) H0;
            }
        } else {
            cVar = cVar2;
        }
        this.Q0 = cVar;
    }
}
