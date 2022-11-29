package yc;

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
import nc.j;
import wn.v;

/* loaded from: classes2.dex */
public final class e extends androidx.fragment.app.e {
    public static final a Q0 = new a(null);
    public static final int R0 = 8;
    public final wn.f N0 = wn.g.b(wn.i.SYNCHRONIZED, new d(this, null, null));
    public final wn.f O0 = wn.g.a(new c());
    public vb.d P0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final e a(String str) {
            p.h(str, "referer");
            e eVar = new e();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_REFERER", str);
            eVar.V2(bundle);
            return eVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.p<l0.i, Integer, v> {

        /* loaded from: classes2.dex */
        public static final class a extends q implements l<ChatStatus, v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ e f61635w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar) {
                super(1);
                this.f61635w = eVar;
            }

            public final void a(ChatStatus chatStatus) {
                p.h(chatStatus, "chatStatus");
                vb.d dVar = this.f61635w.P0;
                if (dVar != null) {
                    dVar.X(chatStatus.getRequireBirthday(), chatStatus.getRequireChatConfirmationAgreement());
                }
                this.f61635w.n3();
            }

            @Override // io.l
            public /* bridge */ /* synthetic */ v invoke(ChatStatus chatStatus) {
                a(chatStatus);
                return v.f59242a;
            }
        }

        /* renamed from: yc.e$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C1054b extends q implements io.a<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ e f61636w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1054b(e eVar) {
                super(0);
                this.f61636w = eVar;
            }

            public final void a() {
                this.f61636w.n3();
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
                f.a(new a(e.this), new C1054b(e.this), iVar, 0);
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
            String string = e.this.M2().getString("EXTRA_KEY_REFERER");
            p.e(string);
            return string;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f61638w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f61639x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f61640y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f61638w = componentCallbacks;
            this.f61639x = aVar;
            this.f61640y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f61638w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f61639x, this.f61640y);
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
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_CHAT_HEALTH_GENERATION_IMP);
        builder.setPageId(D3());
        C3.sendLog(builder.build());
        Context N2 = N2();
        p.g(N2, "requireContext()");
        ComposeView composeView = new ComposeView(N2, null, 0, 6, null);
        composeView.setViewCompositionStrategy(d2.c.f14419b);
        composeView.setContent(s0.c.c(601896408, true, new b()));
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
        vb.d dVar = null;
        vb.d dVar2 = context instanceof vb.d ? (vb.d) context : null;
        if (dVar2 == null) {
            Fragment H0 = H0();
            if (H0 instanceof vb.d) {
                dVar = (vb.d) H0;
            }
        } else {
            dVar = dVar2;
        }
        this.P0 = dVar;
    }
}
