package jd;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.l0;
import androidx.lifecycle.q0;
import com.dena.mirrativ.mirrativapi.core.MRError;
import hf.v0;
import java.util.Comparator;
import java.util.Iterator;
import kf.x;
import l0.c2;
import l0.s0;
import l0.z1;
import org.greenrobot.eventbus.ThreadMode;
import pd.r0;
import ud.h3;
import wn.v;
import xo.w;
import xo.y;

/* loaded from: classes2.dex */
public final class r extends q0 implements uo.q0 {
    public static final a L = new a(null);
    public static final int M = 8;
    public final v0 A;
    public final l0 B;
    public final /* synthetic */ uo.q0 C;
    public final s0<o> D;
    public final c2<o> E;
    public final e0<p> F;
    public final LiveData<p> G;
    public final xo.r<v> H;
    public final w<v> I;
    public final xo.r<MRError> J;
    public final w<MRError> K;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f37648y;

    /* renamed from: z  reason: collision with root package name */
    public final x f37649z;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return zn.a.c(Boolean.valueOf(((h3) t10).d()), Boolean.valueOf(((h3) t11).d()));
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.profile.ProfileEditStore$on$10", f = "ProfileEditStore.kt", l = {168}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f37650w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ r0.f f37652y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(r0.f fVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f37652y = fVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f37652y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f37650w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = r.this.J;
                MRError a10 = this.f37652y.a();
                this.f37650w = 1;
                if (rVar.emit(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.profile.ProfileEditStore$on$9", f = "ProfileEditStore.kt", l = {160}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f37653w;

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new d(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f37653w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = r.this.H;
                v vVar = v.f59242a;
                this.f37653w = 1;
                if (rVar.emit(vVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return v.f59242a;
        }
    }

    public r(q8.a aVar, x xVar, v0 v0Var, l0 l0Var) {
        s0<o> e10;
        jo.p.h(aVar, "dispatcher");
        jo.p.h(xVar, "userPreference");
        jo.p.h(v0Var, "userHelper");
        jo.p.h(l0Var, "savedStateHandle");
        this.f37648y = aVar;
        this.f37649z = xVar;
        this.A = v0Var;
        this.B = l0Var;
        this.C = uo.r0.b();
        aVar.b(this);
        e10 = z1.e(new o(false, null, 3, null), null, 2, null);
        this.D = e10;
        this.E = e10;
        e0<p> b10 = l0Var.b("STATE_EDIT_MODEL");
        jo.p.g(b10, "savedStateHandle.getLive…tModel>(STATE_EDIT_MODEL)");
        this.F = b10;
        this.G = b10;
        xo.r<v> b11 = y.b(0, 0, null, 7, null);
        this.H = b11;
        this.I = b11;
        xo.r<MRError> b12 = y.b(0, 0, null, 7, null);
        this.J = b12;
        this.K = b12;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        uo.r0.d(this, null, 1, null);
        this.f37648y.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.C.getCoroutineContext();
    }

    public final c2<o> h() {
        return this.E;
    }

    public final LiveData<p> i() {
        return this.G;
    }

    public final w<MRError> j() {
        return this.K;
    }

    public final w<v> k() {
        return this.I;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cb A[SYNTHETIC] */
    @dq.l(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void on(pd.r0.d r15) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jd.r.on(pd.r0$d):void");
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(r0.i iVar) {
        p pVar;
        jo.p.h(iVar, "event");
        e0<p> e0Var = this.F;
        p f10 = e0Var.f();
        if (f10 != null) {
            pVar = f10.a((r20 & 1) != 0 ? f10.f37633w : true, (r20 & 2) != 0 ? f10.f37634x : iVar.a(), (r20 & 4) != 0 ? f10.f37635y : null, (r20 & 8) != 0 ? f10.f37636z : null, (r20 & 16) != 0 ? f10.A : null, (r20 & 32) != 0 ? f10.B : null, (r20 & 64) != 0 ? f10.C : false, (r20 & 128) != 0 ? f10.D : false, (r20 & 256) != 0 ? f10.E : null);
        } else {
            pVar = null;
        }
        e0Var.p(pVar);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(r0.e eVar) {
        p pVar;
        String a10;
        jo.p.h(eVar, "event");
        e0<p> e0Var = this.F;
        p f10 = e0Var.f();
        if (f10 != null) {
            if (f10.i().m() < de.l.a(eVar.a())) {
                a10 = f10.h();
            } else {
                a10 = eVar.a();
            }
            pVar = f10.a((r20 & 1) != 0 ? f10.f37633w : true, (r20 & 2) != 0 ? f10.f37634x : null, (r20 & 4) != 0 ? f10.f37635y : a10, (r20 & 8) != 0 ? f10.f37636z : null, (r20 & 16) != 0 ? f10.A : null, (r20 & 32) != 0 ? f10.B : null, (r20 & 64) != 0 ? f10.C : false, (r20 & 128) != 0 ? f10.D : false, (r20 & 256) != 0 ? f10.E : null);
        } else {
            pVar = null;
        }
        e0Var.p(pVar);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(r0.c cVar) {
        p pVar;
        jo.p.h(cVar, "event");
        e0<p> e0Var = this.F;
        p f10 = e0Var.f();
        if (f10 != null) {
            pVar = f10.a((r20 & 1) != 0 ? f10.f37633w : true, (r20 & 2) != 0 ? f10.f37634x : null, (r20 & 4) != 0 ? f10.f37635y : null, (r20 & 8) != 0 ? f10.f37636z : cVar.a(), (r20 & 16) != 0 ? f10.A : null, (r20 & 32) != 0 ? f10.B : null, (r20 & 64) != 0 ? f10.C : false, (r20 & 128) != 0 ? f10.D : false, (r20 & 256) != 0 ? f10.E : null);
        } else {
            pVar = null;
        }
        e0Var.p(pVar);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(r0.k kVar) {
        p pVar;
        jo.p.h(kVar, "event");
        e0<p> e0Var = this.F;
        p f10 = e0Var.f();
        if (f10 != null) {
            pVar = f10.a((r20 & 1) != 0 ? f10.f37633w : true, (r20 & 2) != 0 ? f10.f37634x : null, (r20 & 4) != 0 ? f10.f37635y : null, (r20 & 8) != 0 ? f10.f37636z : null, (r20 & 16) != 0 ? f10.A : kVar.a(), (r20 & 32) != 0 ? f10.B : null, (r20 & 64) != 0 ? f10.C : false, (r20 & 128) != 0 ? f10.D : false, (r20 & 256) != 0 ? f10.E : null);
        } else {
            pVar = null;
        }
        e0Var.p(pVar);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(r0.a aVar) {
        p pVar;
        jo.p.h(aVar, "event");
        e0<p> e0Var = this.F;
        p f10 = e0Var.f();
        if (f10 != null) {
            pVar = f10.a((r20 & 1) != 0 ? f10.f37633w : true, (r20 & 2) != 0 ? f10.f37634x : null, (r20 & 4) != 0 ? f10.f37635y : null, (r20 & 8) != 0 ? f10.f37636z : null, (r20 & 16) != 0 ? f10.A : null, (r20 & 32) != 0 ? f10.B : aVar.a(), (r20 & 64) != 0 ? f10.C : false, (r20 & 128) != 0 ? f10.D : false, (r20 & 256) != 0 ? f10.E : null);
        } else {
            pVar = null;
        }
        e0Var.p(pVar);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(r0.b bVar) {
        p pVar;
        jo.p.h(bVar, "event");
        e0<p> e0Var = this.F;
        p f10 = e0Var.f();
        if (f10 != null) {
            pVar = f10.a((r20 & 1) != 0 ? f10.f37633w : true, (r20 & 2) != 0 ? f10.f37634x : null, (r20 & 4) != 0 ? f10.f37635y : null, (r20 & 8) != 0 ? f10.f37636z : null, (r20 & 16) != 0 ? f10.A : null, (r20 & 32) != 0 ? f10.B : null, (r20 & 64) != 0 ? f10.C : bVar.a(), (r20 & 128) != 0 ? f10.D : false, (r20 & 256) != 0 ? f10.E : null);
        } else {
            pVar = null;
        }
        e0Var.p(pVar);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(r0.j jVar) {
        Integer valueOf;
        Integer num;
        Object obj;
        jo.p.h(jVar, "event");
        e0<p> e0Var = this.F;
        p f10 = e0Var.f();
        p pVar = null;
        if (f10 != null) {
            p f11 = this.F.f();
            boolean z10 = false;
            if (f11 != null) {
                Integer k10 = f11.k();
                int a10 = jVar.a();
                if (k10 != null && k10.intValue() == a10) {
                    z10 = true;
                }
            }
            if (z10) {
                Iterator<T> it = this.D.getValue().d().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((h3) obj).d()) {
                        break;
                    }
                }
                h3 h3Var = (h3) obj;
                if (h3Var != null) {
                    valueOf = Integer.valueOf(h3Var.b());
                } else {
                    num = null;
                    pVar = f10.a((r20 & 1) != 0 ? f10.f37633w : true, (r20 & 2) != 0 ? f10.f37634x : null, (r20 & 4) != 0 ? f10.f37635y : null, (r20 & 8) != 0 ? f10.f37636z : null, (r20 & 16) != 0 ? f10.A : null, (r20 & 32) != 0 ? f10.B : null, (r20 & 64) != 0 ? f10.C : false, (r20 & 128) != 0 ? f10.D : false, (r20 & 256) != 0 ? f10.E : num);
                }
            } else {
                valueOf = Integer.valueOf(jVar.a());
            }
            num = valueOf;
            pVar = f10.a((r20 & 1) != 0 ? f10.f37633w : true, (r20 & 2) != 0 ? f10.f37634x : null, (r20 & 4) != 0 ? f10.f37635y : null, (r20 & 8) != 0 ? f10.f37636z : null, (r20 & 16) != 0 ? f10.A : null, (r20 & 32) != 0 ? f10.B : null, (r20 & 64) != 0 ? f10.C : false, (r20 & 128) != 0 ? f10.D : false, (r20 & 256) != 0 ? f10.E : num);
        }
        e0Var.p(pVar);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(r0.g gVar) {
        jo.p.h(gVar, "event");
        s0<o> s0Var = this.D;
        s0Var.setValue(o.b(s0Var.getValue(), true, null, 2, null));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(r0.h hVar) {
        jo.p.h(hVar, "event");
        uo.l.d(this, null, null, new d(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(r0.f fVar) {
        jo.p.h(fVar, "event");
        s0<o> s0Var = this.D;
        s0Var.setValue(o.b(s0Var.getValue(), false, null, 2, null));
        uo.l.d(this, null, null, new c(fVar, null), 3, null);
    }
}
