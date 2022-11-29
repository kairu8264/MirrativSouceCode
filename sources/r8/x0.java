package r8;

import android.content.Context;
import androidx.lifecycle.LiveData;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.DashboardCatalogItem;
import com.dena.mirrorman.net.api.response.DashboardCatalogItemType;
import ha.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import pd.a0;
import uo.i2;
import uo.o2;

/* loaded from: classes.dex */
public final class x0 extends androidx.lifecycle.q0 implements uo.q0 {
    public final q8.a A;
    public final hf.s B;
    public final ao.g C;
    public final androidx.lifecycle.e0<ha.a> D;
    public final LiveData<ha.a> E;
    public final androidx.lifecycle.e0<String> F;
    public final LiveData<String> G;
    public String H;
    public final wo.q<List<s8.a>> I;
    public final wo.q<MRError> J;

    /* renamed from: y  reason: collision with root package name */
    public final String f50104y;

    /* renamed from: z  reason: collision with root package name */
    public final Context f50105z;

    @co.f(c = "com.dena.mirrativ.catalog.LiveCatalogStore$on$1", f = "LiveCatalogStore.kt", l = {80, 81}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50106w;

        public a(ao.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new a(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50106w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.q qVar = x0.this.I;
                List k10 = xn.s.k();
                this.f50106w = 1;
                if (qVar.r(k10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wn.m.b(obj);
                return wn.v.f59242a;
            } else {
                wn.m.b(obj);
            }
            wo.q qVar2 = x0.this.J;
            this.f50106w = 2;
            if (qVar2.r(null, this) == c10) {
                return c10;
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.LiveCatalogStore$on$2", f = "LiveCatalogStore.kt", l = {118}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50108w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ a0.d f50109x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ x0 f50110y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a0.d dVar, x0 x0Var, ao.d<? super b> dVar2) {
            super(2, dVar2);
            this.f50109x = dVar;
            this.f50110y = x0Var;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f50109x, this.f50110y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            int i10;
            int i11;
            Object c10 = bo.c.c();
            int i12 = this.f50108w;
            if (i12 == 0) {
                wn.m.b(obj);
                List<DashboardCatalogItem> list = this.f50109x.c().getList();
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if ((((DashboardCatalogItem) next).getType() != DashboardCatalogItemType.UNKNOWN ? 1 : 0) != 0) {
                        arrayList.add(next);
                    }
                }
                int size = this.f50110y.j().size();
                jo.c0 c0Var = new jo.c0();
                List<s8.a> j10 = this.f50110y.j();
                if ((j10 instanceof Collection) && j10.isEmpty()) {
                    i11 = 0;
                } else {
                    i11 = 0;
                    for (s8.a aVar : j10) {
                        if ((aVar instanceof s8.e) && (i11 = i11 + 1) < 0) {
                            xn.s.s();
                        }
                    }
                }
                c0Var.f38129w = i11;
                ArrayList arrayList2 = new ArrayList();
                x0 x0Var = this.f50110y;
                a0.d dVar = this.f50109x;
                for (Object obj2 : arrayList) {
                    int i13 = i10 + 1;
                    if (i10 < 0) {
                        xn.s.t();
                    }
                    s8.a a10 = s8.a.f52304a.a(x0Var.f50105z, size + i10, c0Var.f38129w, (DashboardCatalogItem) obj2, dVar.b(), x0Var.B.d());
                    arrayList2.add(a10);
                    if (a10 instanceof s8.e) {
                        c0Var.f38129w++;
                    }
                    i10 = i13;
                }
                wo.q qVar = this.f50110y.I;
                List o02 = xn.a0.o0(this.f50110y.j(), arrayList2);
                this.f50108w = 1;
                if (qVar.r(o02, this) == c10) {
                    return c10;
                }
            } else if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return wn.v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.LiveCatalogStore$on$3", f = "LiveCatalogStore.kt", l = {127}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f50111w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ a0.c f50113y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a0.c cVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f50113y = cVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f50113y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f50111w;
            if (i10 == 0) {
                wn.m.b(obj);
                wo.q qVar = x0.this.J;
                MRError b10 = this.f50113y.b();
                this.f50111w = 1;
                if (qVar.r(b10, this) == c10) {
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

    public x0(String str, Context context, q8.a aVar, hf.s sVar) {
        uo.b0 b10;
        jo.p.h(str, "actionId");
        jo.p.h(context, "context");
        jo.p.h(aVar, "dispatcher");
        jo.p.h(sVar, "getCurrentTimeMillis");
        this.f50104y = str;
        this.f50105z = context;
        this.A = aVar;
        this.B = sVar;
        aVar.b(this);
        o2 c10 = uo.g1.c();
        b10 = i2.b(null, 1, null);
        this.C = c10.plus(b10);
        androidx.lifecycle.e0<ha.a> e0Var = new androidx.lifecycle.e0<>(a.d.f34697b);
        this.D = e0Var;
        this.E = e0Var;
        androidx.lifecycle.e0<String> e0Var2 = new androidx.lifecycle.e0<>("");
        this.F = e0Var2;
        this.G = e0Var2;
        this.H = "";
        this.I = new wo.q<>(xn.s.k());
        this.J = new wo.q<>();
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        uo.r0.d(this, null, 1, null);
        this.A.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.C;
    }

    public final List<s8.a> j() {
        List<s8.a> e10 = this.I.e();
        return e10 == null ? xn.s.k() : e10;
    }

    public final wo.x<List<s8.a>> k() {
        return this.I.g();
    }

    public final int l() {
        int i10 = 0;
        for (s8.a aVar : j()) {
            if ((aVar instanceof s8.e) && jo.p.c(((s8.e) aVar).b(), this.H)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final wo.x<MRError> m() {
        return this.J.g();
    }

    public final LiveData<String> n() {
        return this.G;
    }

    public final LiveData<ha.a> o() {
        return this.E;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a0.f fVar) {
        jo.p.h(fVar, "event");
        if (jo.p.c(this.f50104y, fVar.a())) {
            this.D.p(a.b.f34695b);
            this.F.p("");
            this.H = "";
            uo.l.d(this, null, null, new a(null), 3, null);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a0.e eVar) {
        jo.p.h(eVar, "event");
        if (jo.p.c(this.f50104y, eVar.a())) {
            this.D.p(a.b.f34695b);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a0.d dVar) {
        jo.p.h(dVar, "event");
        if (jo.p.c(this.f50104y, dVar.a())) {
            this.D.p(a.d.f34697b);
            this.F.p(dVar.c().getNextCursor());
            uo.l.d(this, null, null, new b(dVar, this, null), 3, null);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a0.c cVar) {
        jo.p.h(cVar, "event");
        if (jo.p.c(this.f50104y, cVar.a())) {
            this.D.p(new a.C0439a(cVar.b()));
            uo.l.d(this, null, null, new c(cVar, null), 3, null);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a0.a aVar) {
        jo.p.h(aVar, "event");
        if (jo.p.c(this.f50104y, aVar.a())) {
            List<s8.a> j10 = j();
            ArrayList<s8.a> arrayList = new ArrayList();
            Iterator<T> it = j10.iterator();
            while (true) {
                boolean z10 = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                s8.a aVar2 = (s8.a) next;
                if (((aVar2 instanceof s8.i) || (aVar2 instanceof s8.c)) ? true : true) {
                    arrayList.add(next);
                }
            }
            for (s8.a aVar3 : arrayList) {
                if (aVar3 instanceof s8.i) {
                    ((s8.i) aVar3).g().p(Boolean.TRUE);
                } else if (aVar3 instanceof s8.c) {
                    List<s8.a> a10 = ((s8.c) aVar3).a();
                    ArrayList<s8.a> arrayList2 = new ArrayList();
                    for (Object obj : a10) {
                        s8.a aVar4 = (s8.a) obj;
                        if ((aVar4 instanceof s8.i) && jo.p.c(((s8.i) aVar4).f(), aVar.b())) {
                            arrayList2.add(obj);
                        }
                    }
                    for (s8.a aVar5 : arrayList2) {
                        jo.p.f(aVar5, "null cannot be cast to non-null type com.dena.mirrativ.catalog.bindmodel.CatalogMirrativQBindModel");
                        ((s8.i) aVar5).g().p(Boolean.TRUE);
                    }
                }
            }
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a0.i iVar) {
        jo.p.h(iVar, "event");
        if (jo.p.c(this.f50104y, iVar.a())) {
            List<s8.a> j10 = j();
            ArrayList<s8.a> arrayList = new ArrayList();
            Iterator<T> it = j10.iterator();
            while (true) {
                boolean z10 = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                s8.a aVar = (s8.a) next;
                if (((aVar instanceof s8.i) || (aVar instanceof s8.c)) ? true : true) {
                    arrayList.add(next);
                }
            }
            for (s8.a aVar2 : arrayList) {
                if (aVar2 instanceof s8.i) {
                    ((s8.i) aVar2).g().p(Boolean.FALSE);
                } else if (aVar2 instanceof s8.c) {
                    List<s8.a> a10 = ((s8.c) aVar2).a();
                    ArrayList<s8.a> arrayList2 = new ArrayList();
                    for (Object obj : a10) {
                        s8.a aVar3 = (s8.a) obj;
                        if ((aVar3 instanceof s8.i) && jo.p.c(((s8.i) aVar3).f(), iVar.b())) {
                            arrayList2.add(obj);
                        }
                    }
                    for (s8.a aVar4 : arrayList2) {
                        jo.p.f(aVar4, "null cannot be cast to non-null type com.dena.mirrativ.catalog.bindmodel.CatalogMirrativQBindModel");
                        ((s8.i) aVar4).g().p(Boolean.FALSE);
                    }
                }
            }
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a0.k kVar) {
        Object obj;
        boolean z10;
        jo.p.h(kVar, "event");
        if (jo.p.c(this.f50104y, kVar.a())) {
            Iterator<T> it = j().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                s8.a aVar = (s8.a) obj;
                if ((aVar instanceof s8.h) && jo.p.c(((s8.h) aVar).b(), kVar.b())) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    break;
                }
            }
            s8.h hVar = obj instanceof s8.h ? (s8.h) obj : null;
            androidx.lifecycle.e0<Boolean> I = hVar != null ? hVar.I() : null;
            if (I == null) {
                return;
            }
            I.p(Boolean.FALSE);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a0.g gVar) {
        Object obj;
        boolean z10;
        jo.p.h(gVar, "event");
        if (jo.p.c(this.f50104y, gVar.a())) {
            this.H = gVar.b();
            Iterator<T> it = j().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                s8.a aVar = (s8.a) obj;
                if ((aVar instanceof s8.e) && jo.p.c(((s8.e) aVar).b(), gVar.b())) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    break;
                }
            }
            s8.e eVar = obj instanceof s8.e ? (s8.e) obj : null;
            androidx.lifecycle.e0<Boolean> isPlaying = eVar != null ? eVar.isPlaying() : null;
            if (isPlaying == null) {
                return;
            }
            isPlaying.p(Boolean.TRUE);
        }
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(a0.h hVar) {
        Object obj;
        boolean z10;
        jo.p.h(hVar, "event");
        if (jo.p.c(this.f50104y, hVar.a())) {
            this.H = "";
            Iterator<T> it = j().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                s8.a aVar = (s8.a) obj;
                if ((aVar instanceof s8.e) && jo.p.c(((s8.e) aVar).b(), hVar.b())) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    break;
                }
            }
            s8.e eVar = obj instanceof s8.e ? (s8.e) obj : null;
            androidx.lifecycle.e0<Boolean> isPlaying = eVar != null ? eVar.isPlaying() : null;
            if (isPlaying == null) {
                return;
            }
            isPlaying.p(Boolean.FALSE);
        }
    }
}
