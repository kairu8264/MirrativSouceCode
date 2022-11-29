package be;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.LiveData;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.dena.mirrorman.net.api.response.event.ShooterMemberStatus;
import com.dena.mirrorman.net.bcsvr.response.ShooterMemberStateChangedBcsvrResponse;

/* loaded from: classes2.dex */
public final class u3 extends androidx.fragment.app.e {
    public static final a S0 = new a(null);
    public static final int T0 = 8;
    public final wn.f N0;
    public final wn.f O0;
    public final wn.f P0;
    public final wn.f Q0;
    public final wn.f R0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final u3 a(int i10, int i11) {
            u3 u3Var = new u3();
            Bundle bundle = new Bundle();
            bundle.putInt("EXTRA_SEASON_ID", i10);
            bundle.putInt("EXTRA_TEAM_ID", i11);
            u3Var.V2(bundle);
            return u3Var;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<T> implements androidx.lifecycle.f0 {
        public b() {
        }

        @Override // androidx.lifecycle.f0
        public final void d(T t10) {
            ShooterMemberStateChangedBcsvrResponse shooterMemberStateChangedBcsvrResponse = (ShooterMemberStateChangedBcsvrResponse) t10;
            if (xn.a0.O(xn.s.m(ShooterMemberStatus.CANCELING, ShooterMemberStatus.CANCELED), shooterMemberStateChangedBcsvrResponse != null ? shooterMemberStateChangedBcsvrResponse.getInviteStatus() : null)) {
                u3.this.n3();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.l<View, wn.v> {
        public c() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            u3.this.F3().i(u3.this.H3(), u3.this.I3(), u3.this.J3().T4(), ShooterMemberStatus.APPROVED);
            u3.this.n3();
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
            u3.this.F3().i(u3.this.H3(), u3.this.I3(), u3.this.J3().T4(), ShooterMemberStatus.REJECTED);
            u3.this.n3();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(View view) {
            a(view);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<Integer> {
        public e() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Integer invoke() {
            return Integer.valueOf(u3.this.M2().getInt("EXTRA_SEASON_ID"));
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<kf.x> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f18204w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f18205x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f18206y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f18204w = componentCallbacks;
            this.f18205x = aVar;
            this.f18206y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [kf.x, java.lang.Object] */
        @Override // io.a
        public final kf.x invoke() {
            ComponentCallbacks componentCallbacks = this.f18204w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(kf.x.class), this.f18205x, this.f18206y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends jo.q implements io.a<nf.z> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f18207w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f18208x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f18209y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f18207w = componentCallbacks;
            this.f18208x = aVar;
            this.f18209y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [nf.z, java.lang.Object] */
        @Override // io.a
        public final nf.z invoke() {
            ComponentCallbacks componentCallbacks = this.f18207w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(nf.z.class), this.f18208x, this.f18209y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends jo.q implements io.a<od.l0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f18210w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f18211x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f18212y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f18210w = componentCallbacks;
            this.f18211x = aVar;
            this.f18212y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [od.l0, java.lang.Object] */
        @Override // io.a
        public final od.l0 invoke() {
            ComponentCallbacks componentCallbacks = this.f18210w;
            return gq.a.a(componentCallbacks).c(jo.f0.b(od.l0.class), this.f18211x, this.f18212y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends jo.q implements io.a<Integer> {
        public i() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Integer invoke() {
            return Integer.valueOf(u3.this.M2().getInt("EXTRA_TEAM_ID"));
        }
    }

    public u3() {
        super(nd.b1.dialog_fragment_shooter_invitation);
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.N0 = wn.g.b(iVar, new f(this, null, null));
        this.O0 = wn.g.b(iVar, new g(this, null, null));
        this.P0 = wn.g.b(iVar, new h(this, null, null));
        this.Q0 = wn.g.a(new e());
        this.R0 = wn.g.a(new i());
    }

    public final od.l0 F3() {
        return (od.l0) this.P0.getValue();
    }

    public final nf.z G3() {
        return (nf.z) this.O0.getValue();
    }

    public final int H3() {
        return ((Number) this.Q0.getValue()).intValue();
    }

    public final int I3() {
        return ((Number) this.R0.getValue()).intValue();
    }

    public final kf.x J3() {
        return (kf.x) this.N0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        jo.p.h(view, "view");
        super.e2(view, bundle);
        ae.m4 T = ae.m4.T(view);
        te.c f10 = G3().j1().f();
        if (f10 == null) {
            n3();
            return;
        }
        T.D.setText(V0(nd.f1.text_shooter_member_invited_title, f10.e()));
        RoundedButtonView roundedButtonView = T.E;
        jo.p.g(roundedButtonView, "binding.okButtonView");
        yd.g1.a(roundedButtonView, new c());
        AppCompatTextView appCompatTextView = T.F;
        jo.p.g(appCompatTextView, "binding.rejectButtonView");
        yd.g1.a(appCompatTextView, new d());
        LiveData<ShooterMemberStateChangedBcsvrResponse> n12 = G3().n1();
        androidx.lifecycle.u a12 = a1();
        jo.p.g(a12, "viewLifecycleOwner");
        n12.i(a12, new b());
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        return new Dialog(N2(), nd.g1.f42004a);
    }
}
