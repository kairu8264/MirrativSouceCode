package ld;

import ad.r0;
import android.content.res.Resources;
import androidx.lifecycle.LiveData;
import com.dena.mirrativ.mirrativapi.user.KycInfo;
import ld.o0;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public final class h1 extends androidx.lifecycle.q0 {
    public final Resources A;
    public final androidx.lifecycle.e0<g1> B;
    public final LiveData<g1> C;
    public final xo.r<wn.v> D;
    public final xo.w<wn.v> E;
    public final xo.r<wn.v> F;
    public final xo.w<wn.v> G;
    public final androidx.lifecycle.e0<String> H;
    public final LiveData<String> I;
    public final androidx.lifecycle.e0<ad.u0> J;
    public final LiveData<ad.u0> K;
    public final androidx.lifecycle.e0<ad.r0> L;
    public final LiveData<ad.r0> M;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f40002y;

    /* renamed from: z  reason: collision with root package name */
    public final kf.x f40003z;

    @co.f(c = "com.dena.mirrativ.user.mypage.setting.SettingRootStore$on$1", f = "SettingRootStore.kt", l = {82}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f40004w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ o0.e f40006y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o0.e eVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f40006y = eVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f40006y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f40004w;
            if (i10 == 0) {
                wn.m.b(obj);
                androidx.lifecycle.e0 e0Var = h1.this.H;
                KycInfo a10 = this.f40006y.a();
                e0Var.p(a10 != null ? a10.getApplicationUrl() : null);
                h1.this.J.p(ad.u0.D.b(this.f40006y.a()));
                xo.r rVar = h1.this.D;
                wn.v vVar = wn.v.f59242a;
                this.f40004w = 1;
                if (rVar.emit(vVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.setting.SettingRootStore$on$2", f = "SettingRootStore.kt", l = {90}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f40007w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ o0.d f40009y;

        public b(o0.d dVar, ao.d<? super b> dVar2) {
            super(2, dVar2);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f40009y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            int i10 = this.f40007w;
            if (i10 != 0) {
                if (i10 == 1) {
                    wn.m.b(obj);
                    return wn.v.f59242a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wn.m.b(obj);
            androidx.lifecycle.e0 unused = h1.this.L;
            r0.a aVar = ad.r0.B;
            throw null;
        }
    }

    public h1(q8.a aVar, kf.x xVar, Resources resources) {
        jo.p.h(aVar, "dispatcher");
        jo.p.h(xVar, "userPreference");
        jo.p.h(resources, "resources");
        this.f40002y = aVar;
        this.f40003z = xVar;
        this.A = resources;
        aVar.b(this);
        androidx.lifecycle.e0<g1> e0Var = new androidx.lifecycle.e0<>();
        this.B = e0Var;
        this.C = e0Var;
        xo.r<wn.v> b10 = xo.y.b(0, 0, null, 7, null);
        this.D = b10;
        this.E = b10;
        xo.r<wn.v> b11 = xo.y.b(0, 0, null, 7, null);
        this.F = b11;
        this.G = b11;
        androidx.lifecycle.e0<String> e0Var2 = new androidx.lifecycle.e0<>();
        this.H = e0Var2;
        this.I = e0Var2;
        androidx.lifecycle.e0<ad.u0> e0Var3 = new androidx.lifecycle.e0<>();
        this.J = e0Var3;
        this.K = e0Var3;
        androidx.lifecycle.e0<ad.r0> e0Var4 = new androidx.lifecycle.e0<>();
        this.L = e0Var4;
        this.M = e0Var4;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        this.f40002y.c(this);
        super.d();
    }

    public final LiveData<g1> j() {
        return this.C;
    }

    public final LiveData<ad.r0> k() {
        return this.M;
    }

    public final LiveData<ad.u0> l() {
        return this.K;
    }

    public final LiveData<String> m() {
        return this.I;
    }

    public final xo.w<wn.v> n() {
        return this.G;
    }

    public final xo.w<wn.v> o() {
        return this.E;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(o0.f fVar) {
        jo.p.h(fVar, "event");
        this.B.p(g1.f39983q.a(fVar.a(), this.f40003z, this.A));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(o0.c cVar) {
        g1 g1Var;
        jo.p.h(cVar, "event");
        androidx.lifecycle.e0<g1> e0Var = this.B;
        g1 f10 = e0Var.f();
        if (f10 != null) {
            g1Var = f10.a((r34 & 1) != 0 ? f10.f39984a : false, (r34 & 2) != 0 ? f10.f39985b : false, (r34 & 4) != 0 ? f10.f39986c : false, (r34 & 8) != 0 ? f10.f39987d : 0, (r34 & 16) != 0 ? f10.f39988e : 0, (r34 & 32) != 0 ? f10.f39989f : null, (r34 & 64) != 0 ? f10.f39990g : !cVar.a(), (r34 & 128) != 0 ? f10.f39991h : false, (r34 & 256) != 0 ? f10.f39992i : false, (r34 & 512) != 0 ? f10.f39993j : null, (r34 & 1024) != 0 ? f10.f39994k : null, (r34 & 2048) != 0 ? f10.f39995l : null, (r34 & 4096) != 0 ? f10.f39996m : null, (r34 & 8192) != 0 ? f10.f39997n : false, (r34 & 16384) != 0 ? f10.f39998o : null, (r34 & 32768) != 0 ? f10.f39999p : false);
        } else {
            g1Var = null;
        }
        e0Var.p(g1Var);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(o0.b bVar) {
        g1 g1Var;
        jo.p.h(bVar, "event");
        androidx.lifecycle.e0<g1> e0Var = this.B;
        g1 f10 = e0Var.f();
        if (f10 != null) {
            g1Var = f10.a((r34 & 1) != 0 ? f10.f39984a : false, (r34 & 2) != 0 ? f10.f39985b : false, (r34 & 4) != 0 ? f10.f39986c : false, (r34 & 8) != 0 ? f10.f39987d : 0, (r34 & 16) != 0 ? f10.f39988e : 0, (r34 & 32) != 0 ? f10.f39989f : null, (r34 & 64) != 0 ? f10.f39990g : false, (r34 & 128) != 0 ? f10.f39991h : !bVar.a(), (r34 & 256) != 0 ? f10.f39992i : false, (r34 & 512) != 0 ? f10.f39993j : null, (r34 & 1024) != 0 ? f10.f39994k : null, (r34 & 2048) != 0 ? f10.f39995l : null, (r34 & 4096) != 0 ? f10.f39996m : null, (r34 & 8192) != 0 ? f10.f39997n : false, (r34 & 16384) != 0 ? f10.f39998o : null, (r34 & 32768) != 0 ? f10.f39999p : false);
        } else {
            g1Var = null;
        }
        e0Var.p(g1Var);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(o0.a aVar) {
        g1 g1Var;
        jo.p.h(aVar, "event");
        androidx.lifecycle.e0<g1> e0Var = this.B;
        g1 f10 = e0Var.f();
        if (f10 != null) {
            g1Var = f10.a((r34 & 1) != 0 ? f10.f39984a : false, (r34 & 2) != 0 ? f10.f39985b : false, (r34 & 4) != 0 ? f10.f39986c : false, (r34 & 8) != 0 ? f10.f39987d : 0, (r34 & 16) != 0 ? f10.f39988e : 0, (r34 & 32) != 0 ? f10.f39989f : null, (r34 & 64) != 0 ? f10.f39990g : false, (r34 & 128) != 0 ? f10.f39991h : false, (r34 & 256) != 0 ? f10.f39992i : !aVar.a(), (r34 & 512) != 0 ? f10.f39993j : null, (r34 & 1024) != 0 ? f10.f39994k : null, (r34 & 2048) != 0 ? f10.f39995l : null, (r34 & 4096) != 0 ? f10.f39996m : null, (r34 & 8192) != 0 ? f10.f39997n : false, (r34 & 16384) != 0 ? f10.f39998o : null, (r34 & 32768) != 0 ? f10.f39999p : false);
        } else {
            g1Var = null;
        }
        e0Var.p(g1Var);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(o0.e eVar) {
        jo.p.h(eVar, "event");
        uo.l.d(androidx.lifecycle.r0.a(this), null, null, new a(eVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(o0.d dVar) {
        jo.p.h(dVar, "event");
        uo.l.d(androidx.lifecycle.r0.a(this), null, null, new b(dVar, null), 3, null);
    }
}
