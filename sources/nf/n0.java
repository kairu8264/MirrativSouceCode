package nf;

import android.graphics.Color;
import androidx.lifecycle.LiveData;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.UniqueEmomoGiftColorConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import pd.g1;
import ud.a4;
import ud.i3;
import ud.z3;
import uo.r0;

/* loaded from: classes3.dex */
public final class n0 extends androidx.lifecycle.q0 implements uo.q0 {
    public final androidx.lifecycle.e0<List<ud.a>> A;
    public final LiveData<List<ud.a>> B;
    public final androidx.lifecycle.e0<z3> C;
    public final androidx.lifecycle.e0<z3> D;
    public final androidx.lifecycle.e0<a4> E;
    public final androidx.lifecycle.e0<a4> F;
    public final androidx.lifecycle.e0<Boolean> G;
    public final androidx.lifecycle.e0<Boolean> H;
    public final wo.f<File> I;
    public final wo.f<MRError> J;
    public final wo.f<String> K;
    public final wo.f<MRError> L;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f43070y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f43071z;

    @co.f(c = "com.dena.mirrorman.store.UniqueEmomoStampGiftCreationStore$on$6", f = "UniqueEmomoStampGiftCreationStore.kt", l = {112}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43072w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ g1.g f43074y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g1.g gVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f43074y = gVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f43074y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43072w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = n0.this.I;
                File a10 = this.f43074y.a();
                this.f43072w = 1;
                if (fVar.r(a10, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.UniqueEmomoStampGiftCreationStore$on$7", f = "UniqueEmomoStampGiftCreationStore.kt", l = {119}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43075w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ g1.f f43077y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g1.f fVar, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f43077y = fVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f43077y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43075w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = n0.this.J;
                MRError a10 = this.f43077y.a();
                this.f43075w = 1;
                if (fVar.r(a10, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.UniqueEmomoStampGiftCreationStore$on$8", f = "UniqueEmomoStampGiftCreationStore.kt", l = {133}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43078w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ g1.e f43080y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g1.e eVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f43080y = eVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f43080y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43078w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = n0.this.K;
                String a10 = this.f43080y.a();
                this.f43078w = 1;
                if (fVar.r(a10, this) == c10) {
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

    @co.f(c = "com.dena.mirrorman.store.UniqueEmomoStampGiftCreationStore$on$9", f = "UniqueEmomoStampGiftCreationStore.kt", l = {141}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class d extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f43081w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ g1.c f43083y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(g1.c cVar, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f43083y = cVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f43083y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f43081w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.f fVar = n0.this.L;
                MRError a10 = this.f43083y.a();
                this.f43081w = 1;
                if (fVar.r(a10, this) == c10) {
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

    public n0(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f43070y = aVar;
        this.f43071z = r0.b();
        aVar.b(this);
        androidx.lifecycle.e0<List<ud.a>> e0Var = new androidx.lifecycle.e0<>();
        this.A = e0Var;
        this.B = e0Var;
        androidx.lifecycle.e0<z3> e0Var2 = new androidx.lifecycle.e0<>();
        this.C = e0Var2;
        this.D = e0Var2;
        androidx.lifecycle.e0<a4> e0Var3 = new androidx.lifecycle.e0<>();
        this.E = e0Var3;
        this.F = e0Var3;
        androidx.lifecycle.e0<Boolean> e0Var4 = new androidx.lifecycle.e0<>(Boolean.FALSE);
        this.G = e0Var4;
        this.H = e0Var4;
        this.I = wo.g.a(-2);
        this.J = wo.g.a(-2);
        this.K = wo.g.a(-2);
        this.L = wo.g.a(-2);
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f43070y.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f43071z.getCoroutineContext();
    }

    public final xo.c<MRError> j() {
        return xo.e.a(this.L);
    }

    public final xo.c<String> k() {
        return xo.e.a(this.K);
    }

    public final LiveData<List<ud.a>> l() {
        return this.B;
    }

    public final xo.c<MRError> m() {
        return xo.e.a(this.J);
    }

    public final xo.c<File> n() {
        return xo.e.a(this.I);
    }

    public final androidx.lifecycle.e0<z3> o() {
        return this.D;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g1.h hVar) {
        ud.a aVar;
        Object obj;
        Object obj2;
        boolean z10;
        Object obj3;
        boolean z11;
        jo.p.h(hVar, "event");
        androidx.lifecycle.e0<List<ud.a>> e0Var = this.A;
        List m10 = xn.s.m(new a4(a4.a.TOP, true, null, 4, null), new a4(a4.a.BOTTOM, false, null, 4, null), new a4(a4.a.LEFT, false, null, 4, null), new a4(a4.a.RIGHT, false, null, 4, null), new i3(null, 1, null));
        List<UniqueEmomoGiftColorConfig> a10 = hVar.a();
        ArrayList arrayList = new ArrayList(xn.t.u(a10, 10));
        int i10 = 0;
        for (Object obj4 : a10) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                xn.s.t();
            }
            UniqueEmomoGiftColorConfig uniqueEmomoGiftColorConfig = (UniqueEmomoGiftColorConfig) obj4;
            arrayList.add(new z3(uniqueEmomoGiftColorConfig.getId(), Color.parseColor(uniqueEmomoGiftColorConfig.getTextColor()), uniqueEmomoGiftColorConfig.getOutlineColor().length() == 0 ? null : Integer.valueOf(Color.parseColor(uniqueEmomoGiftColorConfig.getOutlineColor())), i10 == 0, null, 16, null));
            i10 = i11;
        }
        e0Var.p(xn.a0.o0(m10, arrayList));
        androidx.lifecycle.e0<a4> e0Var2 = this.E;
        List<ud.a> f10 = this.A.f();
        if (f10 != null) {
            Iterator<T> it = f10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it.next();
                ud.a aVar2 = (ud.a) obj3;
                a4 a4Var = aVar2 instanceof a4 ? (a4) aVar2 : null;
                if (a4Var == null || !a4Var.c()) {
                    z11 = false;
                    continue;
                } else {
                    z11 = true;
                    continue;
                }
                if (z11) {
                    break;
                }
            }
            aVar = (ud.a) obj3;
        } else {
            aVar = null;
        }
        e0Var2.p(aVar instanceof a4 ? (a4) aVar : null);
        androidx.lifecycle.e0<z3> e0Var3 = this.C;
        List<ud.a> f11 = this.A.f();
        if (f11 != null) {
            Iterator<T> it2 = f11.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                ud.a aVar3 = (ud.a) obj2;
                z3 z3Var = aVar3 instanceof z3 ? (z3) aVar3 : null;
                if (z3Var == null || !z3Var.d()) {
                    z10 = false;
                    continue;
                } else {
                    z10 = true;
                    continue;
                }
                if (z10) {
                    break;
                }
            }
            obj = (ud.a) obj2;
        } else {
            obj = null;
        }
        e0Var3.p(obj instanceof z3 ? (z3) obj : null);
    }

    public final androidx.lifecycle.e0<a4> p() {
        return this.F;
    }

    public final androidx.lifecycle.e0<Boolean> q() {
        return this.H;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g1.b bVar) {
        List<ud.a> k10;
        jo.p.h(bVar, "event");
        this.E.p(bVar.a());
        androidx.lifecycle.e0<List<ud.a>> e0Var = this.A;
        List<ud.a> f10 = e0Var.f();
        if (f10 != null) {
            k10 = new ArrayList<>(xn.t.u(f10, 10));
            for (ud.a aVar : f10) {
                if (aVar instanceof a4) {
                    a4 a4Var = (a4) aVar;
                    aVar = a4Var.b() == bVar.a().b() ? new a4(bVar.a().b(), true, null, 4, null) : new a4(a4Var.b(), false, null, 4, null);
                }
                k10.add(aVar);
            }
        } else {
            k10 = xn.s.k();
        }
        e0Var.p(k10);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g1.a aVar) {
        List<ud.a> k10;
        jo.p.h(aVar, "event");
        this.C.p(aVar.a());
        androidx.lifecycle.e0<List<ud.a>> e0Var = this.A;
        List<ud.a> f10 = e0Var.f();
        if (f10 != null) {
            k10 = new ArrayList<>(xn.t.u(f10, 10));
            for (ud.a aVar2 : f10) {
                if (aVar2 instanceof z3) {
                    z3 z3Var = (z3) aVar2;
                    if (z3Var.b() == aVar.a().b() && jo.p.c(z3Var.c(), aVar.a().c())) {
                        aVar2 = new z3(aVar.a().a(), aVar.a().b(), aVar.a().c(), true, null, 16, null);
                    } else {
                        aVar2 = new z3(z3Var.a(), z3Var.b(), z3Var.c(), false, null, 16, null);
                    }
                }
                k10.add(aVar2);
            }
        } else {
            k10 = xn.s.k();
        }
        e0Var.p(k10);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g1.g gVar) {
        jo.p.h(gVar, "event");
        uo.l.d(this, null, null, new a(gVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g1.f fVar) {
        jo.p.h(fVar, "event");
        uo.l.d(this, null, null, new b(fVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g1.d dVar) {
        jo.p.h(dVar, "event");
        this.G.p(Boolean.TRUE);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g1.e eVar) {
        jo.p.h(eVar, "event");
        this.G.p(Boolean.FALSE);
        uo.l.d(this, null, null, new c(eVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(g1.c cVar) {
        jo.p.h(cVar, "event");
        this.G.p(Boolean.FALSE);
        uo.l.d(this, null, null, new d(cVar, null), 3, null);
    }
}
