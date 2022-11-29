package fd;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.dena.mirrorman.base.WebViewActivity;
import com.dena.mirrorman.clientlog.logs.ContinuousLiveHolidayPurchasePopupLog;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import com.dena.mirrorman.net.MRUrl;
import com.dena.mirrorman.net.api.Referer;
import da.j;
import fd.a;
import jf.o0;
import jo.f0;
import jo.p;
import jo.q;
import pc.s0;
import uo.q0;
import wn.i;
import xn.r;

/* loaded from: classes2.dex */
public final class e extends androidx.fragment.app.e implements q0 {
    public static final a Q0 = new a(null);
    public static final int R0 = 8;
    public final /* synthetic */ j N0;
    public f O0;
    public final wn.f P0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final e a(o0 o0Var) {
            p.h(o0Var, "purchaseHoliday");
            e eVar = new e();
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_HOLIDAY_PURCHASE", o0Var);
            eVar.V2(bundle);
            return eVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f31963w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f31964x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f31965y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f31963w = componentCallbacks;
            this.f31964x = aVar;
            this.f31965y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f31963w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f31964x, this.f31965y);
        }
    }

    public e() {
        super(nc.f.dialog_fragment_holiday_purchase);
        this.N0 = new j();
        this.P0 = wn.g.b(i.SYNCHRONIZED, new b(this, null, null));
    }

    public static final void F3(e eVar, View view) {
        p.h(eVar, "this$0");
        eVar.m3();
    }

    public static final void G3(e eVar, View view) {
        p.h(eVar, "this$0");
        WebViewActivity.a aVar = WebViewActivity.X;
        Context N2 = eVar.N2();
        p.g(N2, "requireContext()");
        eVar.f3(WebViewActivity.a.b(aVar, N2, MRUrl.ContinuousHoliday.INSTANCE.getUrl(), false, false, 12, null));
    }

    public static final void H3(e eVar, View view) {
        p.h(eVar, "this$0");
        f fVar = eVar.O0;
        if (fVar != null) {
            fVar.B();
        }
        eVar.n3();
    }

    public final MRLogger E3() {
        return (MRLogger) this.P0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        String str;
        Window window;
        p.h(view, "view");
        super.e2(view, bundle);
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        s0 T = s0.T(view);
        T.D.setOnClickListener(new View.OnClickListener() { // from class: fd.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                e.F3(e.this, view2);
            }
        });
        T.L.setOnClickListener(new View.OnClickListener() { // from class: fd.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                e.G3(e.this, view2);
            }
        });
        Parcelable parcelable = M2().getParcelable("EXTRA_HOLIDAY_PURCHASE");
        p.e(parcelable);
        o0 o0Var = (o0) parcelable;
        a.C0351a c0351a = fd.a.f31951h;
        Context N2 = N2();
        p.g(N2, "requireContext()");
        T.V(c0351a.a(N2, o0Var));
        T.C.setOnClickListener(new View.OnClickListener() { // from class: fd.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                e.H3(e.this, view2);
            }
        });
        MRLogger E3 = E3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_CONTINUOUS_LIVE_HOLIDAY_PURCHASE_POPUP);
        builder.setPageId(Referer.MY_PAGE);
        boolean f10 = o0Var.f();
        int a10 = o0Var.a();
        int d10 = o0Var.d();
        if (!o0Var.i()) {
            str = "not_continuous_streamer";
        } else if (o0Var.b() || o0Var.c()) {
            str = "have_max";
        } else {
            str = o0Var.j() ? "purchased_in_term" : "";
        }
        builder.setPayload(r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, new ContinuousLiveHolidayPurchasePopupLog(f10 ? 1 : 0, a10, d10, str).toJson())));
        E3.sendLog(builder.build());
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        Dialog dialog = new Dialog(N2(), 16973913);
        w3(true);
        dialog.setCanceledOnTouchOutside(false);
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        p.h(context, "context");
        super.x1(context);
        Fragment H0 = H0();
        this.O0 = H0 instanceof f ? (f) H0 : null;
    }
}
