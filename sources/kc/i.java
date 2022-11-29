package kc;

import ac.y;
import android.app.Dialog;
import android.app.NotificationManager;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.clientlog.logs.MRLogger;
import jc.c;
import jo.f0;
import kq.a;
import yd.g1;

/* loaded from: classes2.dex */
public final class i extends androidx.fragment.app.e implements jc.d {
    public jc.f N0;
    public int O0;
    public vb.n P0;
    public final AutoClearedValue Q0;
    public final wn.f R0;
    public final wn.f S0;
    public final wn.f T0;
    public static final /* synthetic */ qo.h<Object>[] V0 = {f0.d(new jo.s(i.class, "binding", "getBinding()Lcom/dena/mirrativ/streaming/databinding/DialogFragmentConfirmNotificationGuardBinding;", 0))};
    public static final a U0 = new a(null);
    public static final int W0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final i a(String str, boolean z10, int i10) {
            jo.p.h(str, "topTitle");
            i iVar = new i();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_TOP_TITLE", str);
            bundle.putBoolean("EXTRA_IS_LIVE_PERMISSION", z10);
            bundle.putInt("EXTRA_NOTIFICATION_GUARD_MODE", i10);
            iVar.V2(bundle);
            return iVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends jo.q implements io.a<Boolean> {
        public b() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Boolean invoke() {
            return Boolean.valueOf(i.this.M2().getBoolean("EXTRA_IS_LIVE_PERMISSION"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f38576w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f38576w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            Fragment fragment = this.f38576w;
            return c0552a.b(fragment, fragment instanceof y4.e ? fragment : null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f38577w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(io.a aVar) {
            super(0);
            this.f38577w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final v0 invoke() {
            return ((kq.a) this.f38577w.invoke()).b();
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f38578w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f38579x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f38580y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f38581z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f38578w = aVar;
            this.f38579x = aVar2;
            this.f38580y = aVar3;
            this.f38581z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f38578w;
            vq.a aVar2 = this.f38579x;
            io.a aVar3 = this.f38580y;
            xq.a aVar4 = this.f38581z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(jc.f.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f38582w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(io.a aVar) {
            super(0);
            this.f38582w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = ((v0) this.f38582w.invoke()).U();
            jo.p.g(U, "ownerProducer().viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.l<View, wn.v> {
        public g() {
            super(1);
        }

        public final void a(View view) {
            vb.n nVar;
            jo.p.h(view, "it");
            i.this.J3().I.setImageResource(xb.n.ic_selected_radio_button);
            AppCompatImageView appCompatImageView = i.this.J3().P;
            int i10 = xb.n.ic_nonselect_radio_button;
            appCompatImageView.setImageResource(i10);
            i.this.J3().G.setImageResource(i10);
            i.this.O0 = 2;
            jc.f fVar = i.this.N0;
            if (fVar == null) {
                jo.p.v("actionCreator");
                fVar = null;
            }
            fVar.z(i.this.O0);
            if (!i.this.M3() && (nVar = i.this.P0) != null) {
                nVar.w0();
            }
            Object systemService = i.this.N2().getSystemService("notification");
            jo.p.f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            if (((NotificationManager) systemService).isNotificationPolicyAccessGranted()) {
                return;
            }
            c.a aVar = jc.c.T0;
            String U0 = i.this.U0(xb.r.text_confim_access_notification_on);
            jo.p.g(U0, "getString(R.string.text_…m_access_notification_on)");
            String U02 = i.this.U0(xb.r.text_moderator_appointment);
            jo.p.g(U02, "getString(R.string.text_moderator_appointment)");
            aVar.a(U0, "", U02).z3(i.this.p0(), "ConfirmAccessSettingNotificationDialog");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.l<View, wn.v> {
        public h() {
            super(1);
        }

        public final void a(View view) {
            vb.n nVar;
            jo.p.h(view, "it");
            AppCompatImageView appCompatImageView = i.this.J3().I;
            int i10 = xb.n.ic_nonselect_radio_button;
            appCompatImageView.setImageResource(i10);
            i.this.J3().P.setImageResource(xb.n.ic_selected_radio_button);
            i.this.J3().G.setImageResource(i10);
            i.this.O0 = 1;
            jc.f fVar = i.this.N0;
            if (fVar == null) {
                jo.p.v("actionCreator");
                fVar = null;
            }
            fVar.z(i.this.O0);
            if (!i.this.M3() && (nVar = i.this.P0) != null) {
                nVar.w0();
            }
            Object systemService = i.this.N2().getSystemService("notification");
            jo.p.f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            if (((NotificationManager) systemService).isNotificationPolicyAccessGranted()) {
                return;
            }
            c.a aVar = jc.c.T0;
            String U0 = i.this.U0(xb.r.text_confirm_access_notificaiton_stop_broadcast);
            jo.p.g(U0, "getString(R.string.text_…ificaiton_stop_broadcast)");
            String U02 = i.this.U0(xb.r.text_moderator_appointment);
            jo.p.g(U02, "getString(R.string.text_moderator_appointment)");
            aVar.a(U0, "", U02).z3(i.this.p0(), "ConfirmAccessSettingNotificationDialog");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* renamed from: kc.i$i  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0541i extends jo.q implements io.l<View, wn.v> {
        public C0541i() {
            super(1);
        }

        public final void a(View view) {
            vb.n nVar;
            jo.p.h(view, "it");
            AppCompatImageView appCompatImageView = i.this.J3().I;
            int i10 = xb.n.ic_nonselect_radio_button;
            appCompatImageView.setImageResource(i10);
            i.this.J3().P.setImageResource(i10);
            i.this.J3().G.setImageResource(xb.n.ic_selected_radio_button);
            i.this.O0 = 0;
            i.this.L3().E3(System.currentTimeMillis());
            jc.f fVar = i.this.N0;
            if (fVar == null) {
                jo.p.v("actionCreator");
                fVar = null;
            }
            fVar.z(i.this.O0);
            if (i.this.M3() || (nVar = i.this.P0) == null) {
                return;
            }
            nVar.w0();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends jo.q implements io.a<kf.t> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f38586w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f38587x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f38588y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f38586w = componentCallbacks;
            this.f38587x = aVar;
            this.f38588y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.t, java.lang.Object] */
        @Override // io.a
        public final kf.t invoke() {
            ComponentCallbacks componentCallbacks = this.f38586w;
            return gq.a.a(componentCallbacks).c(f0.b(kf.t.class), this.f38587x, this.f38588y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends jo.q implements io.a<MRLogger> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f38589w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f38590x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f38591y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f38589w = componentCallbacks;
            this.f38590x = aVar;
            this.f38591y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.clientlog.logs.MRLogger, java.lang.Object] */
        @Override // io.a
        public final MRLogger invoke() {
            ComponentCallbacks componentCallbacks = this.f38589w;
            return gq.a.a(componentCallbacks).c(f0.b(MRLogger.class), this.f38590x, this.f38591y);
        }
    }

    public i() {
        super(xb.p.dialog_fragment_confirm_notification_guard);
        this.O0 = -1;
        this.Q0 = nd.a.a(this);
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.R0 = wn.g.b(iVar, new j(this, null, null));
        this.S0 = wn.g.b(iVar, new k(this, null, null));
        this.T0 = wn.g.a(new b());
    }

    public static final void N3(i iVar, View view) {
        jo.p.h(iVar, "this$0");
        if (iVar.M3()) {
            MRLogger K3 = iVar.K3();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_SETTING_HIDE_NOTIFICATION_ALERT);
            int i10 = iVar.O0;
            builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, i10 == -1 ? "0" : String.valueOf(i10))));
            K3.sendLog(builder.build());
        }
        vb.n nVar = iVar.P0;
        if (nVar != null) {
            nVar.w0();
        }
        iVar.n3();
    }

    @Override // jc.d
    public void D() {
        if (M3()) {
            MRLogger K3 = K3();
            MRLog.Companion companion = MRLog.Companion;
            MRLog.Builder builder = new MRLog.Builder(MRLog.ACTION_TYPE_LIVE_SETTING_HIDE_NOTIFICATION_ALERT);
            int i10 = this.O0;
            builder.setPayload(xn.r.d(wn.q.a(MRLog.PAYLOAD_KEY_TARGET_DETAIL, i10 == -1 ? "0" : String.valueOf(i10))));
            K3.sendLog(builder.build());
        }
        vb.n nVar = this.P0;
        if (nVar != null) {
            nVar.w0();
        }
        n3();
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.P0 = null;
        super.I1();
    }

    public final y J3() {
        return (y) this.Q0.b(this, V0[0]);
    }

    public final MRLogger K3() {
        return (MRLogger) this.S0.getValue();
    }

    public final kf.t L3() {
        return (kf.t) this.R0.getValue();
    }

    public final boolean M3() {
        return ((Boolean) this.T0.getValue()).booleanValue();
    }

    public final void O3(y yVar) {
        this.Q0.a(this, V0[0], yVar);
    }

    @Override // jc.d
    public void b0() {
        jc.f fVar = this.N0;
        if (fVar == null) {
            jo.p.v("actionCreator");
            fVar = null;
        }
        fVar.z(M2().getInt("EXTRA_NOTIFICATION_GUARD_MODE"));
        AppCompatImageView appCompatImageView = J3().I;
        int i10 = xb.n.ic_nonselect_radio_button;
        appCompatImageView.setImageResource(i10);
        J3().P.setImageResource(i10);
        J3().G.setImageResource(i10);
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(de.e.b(this, 300), -2);
        }
        y T = y.T(view);
        jo.p.g(T, "bind(view)");
        O3(T);
        c cVar = new c(this);
        xq.a a10 = gq.a.a(this);
        this.N0 = (jc.f) ((q0) e0.a(this, f0.b(jc.f.class), new f(new d(cVar)), new e(cVar, null, null, a10)).getValue());
        this.O0 = M2().getInt("EXTRA_NOTIFICATION_GUARD_MODE");
        J3().R.setText(M2().getString("EXTRA_TOP_TITLE"));
        int i10 = this.O0;
        if (i10 == 0) {
            J3().G.setImageResource(xb.n.ic_selected_radio_button);
        } else if (i10 == 1) {
            J3().P.setImageResource(xb.n.ic_selected_radio_button);
        } else if (i10 == 2) {
            J3().I.setImageResource(xb.n.ic_selected_radio_button);
        }
        ConstraintLayout constraintLayout = J3().J;
        jo.p.g(constraintLayout, "binding.notificationNotDisplayContainer");
        g1.a(constraintLayout, new g());
        ConstraintLayout constraintLayout2 = J3().N;
        jo.p.g(constraintLayout2, "binding.notificationStopBroadcastContainer");
        g1.a(constraintLayout2, new h());
        ConstraintLayout constraintLayout3 = J3().F;
        jo.p.g(constraintLayout3, "binding.notSettingNotificationContainer");
        g1.a(constraintLayout3, new C0541i());
        J3().B.setOnClickListener(new View.OnClickListener() { // from class: kc.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                i.N3(i.this, view2);
            }
        });
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        Dialog dialog = new Dialog(N2(), xb.s.f60094a);
        w3(false);
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        vb.n nVar = null;
        vb.n nVar2 = context instanceof vb.n ? (vb.n) context : null;
        if (nVar2 == null) {
            Fragment H0 = H0();
            if (H0 instanceof vb.n) {
                nVar = (vb.n) H0;
            }
        } else {
            nVar = nVar2;
        }
        this.P0 = nVar;
    }
}
