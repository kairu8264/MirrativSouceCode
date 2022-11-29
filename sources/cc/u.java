package cc;

import ac.e1;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class u extends androidx.fragment.app.e {
    public vb.w N0;
    public final wn.f O0;
    public final wn.f P0;
    public final wn.f Q0;
    public final AutoClearedValue R0;
    public static final /* synthetic */ qo.h<Object>[] T0 = {jo.f0.d(new jo.s(u.class, "binding", "getBinding()Lcom/dena/mirrativ/streaming/databinding/DialogFragmentStopScreenShareBinding;", 0))};
    public static final a S0 = new a(null);
    public static final int U0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final u a(String str) {
            u uVar = new u();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_KEY_TITLE", str);
            uVar.V2(bundle);
            return uVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f19140w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f19141x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f19142y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f19140w = componentCallbacks;
            this.f19141x = aVar;
            this.f19142y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f19140w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(MRLogger.class), this.f19141x, this.f19142y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<kf.m> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f19143w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f19144x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f19145y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f19143w = componentCallbacks;
            this.f19144x = aVar;
            this.f19145y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.m, java.lang.Object] */
        @Override // io.a
        public final kf.m invoke() {
            ComponentCallbacks componentCallbacks = this.f19143w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.m.class), this.f19144x, this.f19145y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<od.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f19146w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f19147x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f19148y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f19146w = componentCallbacks;
            this.f19147x = aVar;
            this.f19148y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.b] */
        @Override // io.a
        public final od.b invoke() {
            ComponentCallbacks componentCallbacks = this.f19146w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.b.class), this.f19147x, this.f19148y);
        }
    }

    public u() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.O0 = wn.g.b(iVar, new b(this, null, null));
        this.P0 = wn.g.b(iVar, new c(this, null, null));
        this.Q0 = wn.g.b(iVar, new d(this, null, null));
        this.R0 = nd.a.a(this);
    }

    public static final void J3(u uVar, View view) {
        jo.p.h(uVar, "this$0");
        uVar.m3();
    }

    public static final void K3(u uVar, View view) {
        jo.p.h(uVar, "this$0");
        uVar.F3().V();
        vb.w wVar = uVar.N0;
        if (wVar != null) {
            wVar.t0();
        }
        MRLogger H3 = uVar.H3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_EMOMO_SHARE_STOP_SHARE_SCREEN);
        builder.setTargetId("continue_with_stop");
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, uVar.G3().b())));
        H3.sendLog(builder.build());
        uVar.m3();
    }

    public static final void L3(u uVar, View view) {
        jo.p.h(uVar, "this$0");
        vb.w wVar = uVar.N0;
        if (wVar != null) {
            wVar.t0();
        }
        MRLogger H3 = uVar.H3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_EMOMO_SHARE_STOP_SHARE_SCREEN);
        builder.setTargetId("continue_with_not_stop");
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, uVar.G3().b())));
        H3.sendLog(builder.build());
        uVar.m3();
    }

    public final e1 E3() {
        return (e1) this.R0.b(this, T0[0]);
    }

    public final od.b F3() {
        return (od.b) this.Q0.getValue();
    }

    public final kf.m G3() {
        return (kf.m) this.P0.getValue();
    }

    public final MRLogger H3() {
        return (MRLogger) this.O0.getValue();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.N0 = null;
        super.I1();
    }

    public final SpannableStringBuilder I3() {
        String string = O0().getString(xb.r.text_groupshot_personal_info);
        jo.p.g(string, "resources.getString(R.st…_groupshot_personal_info)");
        String string2 = O0().getString(xb.r.text_groupshot_stop_recording);
        jo.p.g(string2, "resources.getString(R.st…groupshot_stop_recording)");
        jo.i0 i0Var = jo.i0.f38149a;
        String string3 = O0().getString(xb.r.text_groupshot_cameraroll_suggestion);
        jo.p.g(string3, "resources.getString(R.st…ot_cameraroll_suggestion)");
        String format = String.format(string3, Arrays.copyOf(new Object[]{string, string2}, 2));
        jo.p.g(format, "format(format, *args)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
        int d10 = c3.a.d(N2(), xb.l.f59937f);
        N3(spannableStringBuilder, format, string, d10);
        N3(spannableStringBuilder, format, string2, d10);
        return spannableStringBuilder;
    }

    public final void M3(e1 e1Var) {
        this.R0.a(this, T0[0], e1Var);
    }

    public final void N3(SpannableStringBuilder spannableStringBuilder, String str, String str2, int i10) {
        SpannableString spannableString = new SpannableString(str2);
        spannableString.setSpan(new ForegroundColorSpan(i10), 0, str2.length(), 33);
        int U = so.o.U(str, str2, 0, false, 6, null);
        spannableStringBuilder.replace(U, str2.length() + U, (CharSequence) spannableString);
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        jo.p.h(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        vb.w wVar = this.N0;
        if (wVar != null) {
            wVar.A2();
        }
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        String string;
        e1 T = e1.T(LayoutInflater.from(q0()), null, false);
        jo.p.g(T, "inflate(\n            Lay…          false\n        )");
        M3(T);
        Bundle n02 = n0();
        if (n02 != null && (string = n02.getString("EXTRA_KEY_TITLE")) != null) {
            E3().I.setText(string);
        }
        E3().C.setOnClickListener(new View.OnClickListener() { // from class: cc.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u.J3(u.this, view);
            }
        });
        E3().B.setOnClickListener(new View.OnClickListener() { // from class: cc.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u.K3(u.this, view);
            }
        });
        E3().E.setOnClickListener(new View.OnClickListener() { // from class: cc.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u.L3(u.this, view);
            }
        });
        E3().F.setText(I3());
        MRLogger H3 = H3();
        MRLog.Companion companion = MRLog.Companion;
        MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_EMOMO_SHARE_STOP_SHARE_SCREEN);
        builder.setTargetId(MRLog.TARGET_ID_IMP);
        builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_LIVE_ID, G3().b())));
        H3.sendLog(builder.build());
        Dialog dialog = new Dialog(N2(), 16973913);
        dialog.setContentView(E3().u());
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        vb.w wVar = null;
        vb.w wVar2 = context instanceof vb.w ? (vb.w) context : null;
        if (wVar2 == null) {
            Fragment H0 = H0();
            if (H0 instanceof vb.w) {
                wVar = (vb.w) H0;
            }
        } else {
            wVar = wVar2;
        }
        this.N0 = wVar;
        super.x1(context);
    }
}
