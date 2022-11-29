package ad;

import ad.s;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import com.dena.mirrativ.mirrativapi.user.ContractLiveResultResponse;

/* loaded from: classes2.dex */
public final class u extends androidx.fragment.app.e {
    public static final a O0 = new a(null);
    public static final int P0 = 8;
    public final wn.f N0 = wn.g.a(new b());

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final u a(ContractLiveResultResponse contractLiveResultResponse) {
            jo.p.h(contractLiveResultResponse, "liveResultResponse");
            u uVar = new u();
            uVar.V2(k3.b.a(wn.q.a("EXTRA_LIVE_RESULT", contractLiveResultResponse)));
            return uVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<s> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final s invoke() {
            s.a aVar = s.f1303s;
            Parcelable parcelable = u.this.M2().getParcelable("EXTRA_LIVE_RESULT");
            if (parcelable != null) {
                Resources O0 = u.this.O0();
                jo.p.g(O0, "resources");
                return aVar.a((ContractLiveResultResponse) parcelable, O0);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* loaded from: classes2.dex */
        public static final class a extends jo.q implements io.a<wn.v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ u f1366w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(u uVar) {
                super(0);
                this.f1366w = uVar;
            }

            public final void a() {
                this.f1366w.n3();
            }

            @Override // io.a
            public /* bridge */ /* synthetic */ wn.v invoke() {
                a();
                return wn.v.f59242a;
            }
        }

        public c() {
            super(2);
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                v.a(u.this.C3(), new a(u.this), iVar, 0);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public final s C3() {
        return (s) this.N0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View E1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jo.p.h(layoutInflater, "inflater");
        Context N2 = N2();
        jo.p.g(N2, "requireContext()");
        ComposeView composeView = new ComposeView(N2, null, 0, 6, null);
        composeView.setContent(s0.c.c(-570104593, true, new c()));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        Dialog p32 = p3();
        if (p32 == null || (window = p32.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), nc.j.f41900a);
    }
}
