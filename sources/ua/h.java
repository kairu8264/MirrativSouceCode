package ua;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.q0;
import co.l;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.net.api.response.notice.PresentBox;
import ha.a;
import io.p;
import java.util.Iterator;
import java.util.List;
import nd.s0;
import org.greenrobot.eventbus.ThreadMode;
import pd.o0;
import uo.r0;
import wn.m;
import wn.v;
import wo.x;
import xn.a0;
import xn.s;

/* loaded from: classes2.dex */
public final class h extends q0 implements uo.q0 {
    public final e0<ha.a> A;
    public final LiveData<ha.a> B;
    public final e0<String> C;
    public final LiveData<String> D;
    public final e0<Long> E;
    public final LiveData<Long> F;
    public final e0<Long> G;
    public final LiveData<Long> H;
    public final s0<List<PresentBox>> I;
    public final wo.f<MRError> J;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f54696y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ uo.q0 f54697z;

    @co.f(c = "com.dena.mirrativ.notification.present.NoticePresentBoxStore$on$1", f = "NoticePresentBoxStore.kt", l = {59}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f54698w;

        public a(ao.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new a(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f54698w;
            if (i10 == 0) {
                m.b(obj);
                s0 s0Var = h.this.I;
                List k10 = s.k();
                this.f54698w = 1;
                if (s0Var.d(k10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.notification.present.NoticePresentBoxStore$on$2", f = "NoticePresentBoxStore.kt", l = {75}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f54700w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ List<PresentBox> f54702y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<PresentBox> list, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f54702y = list;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(this.f54702y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f54700w;
            if (i10 == 0) {
                m.b(obj);
                s0 s0Var = h.this.I;
                List<PresentBox> list = this.f54702y;
                this.f54700w = 1;
                if (s0Var.d(list, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.notification.present.NoticePresentBoxStore$on$3", f = "NoticePresentBoxStore.kt", l = {83}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f54703w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ o0.a f54705y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(o0.a aVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f54705y = aVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new c(this.f54705y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f54703w;
            if (i10 == 0) {
                m.b(obj);
                wo.f fVar = h.this.J;
                MRError a10 = this.f54705y.a();
                this.f54703w = 1;
                if (fVar.r(a10, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.notification.present.NoticePresentBoxStore$on$4", f = "NoticePresentBoxStore.kt", l = {91}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends l implements p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f54706w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ o0.f f54708y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(o0.f fVar, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f54708y = fVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f54708y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            boolean z10;
            Object c10 = bo.c.c();
            int i10 = this.f54706w;
            if (i10 == 0) {
                m.b(obj);
                List<PresentBox> l10 = h.this.l();
                o0.f fVar = this.f54708y;
                Iterator<T> it = l10.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (((PresentBox) obj2).getUserPresentId() == fVar.a()) {
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
                PresentBox presentBox = (PresentBox) obj2;
                if (presentBox != null) {
                    presentBox.setNew(false);
                }
                s0 s0Var = h.this.I;
                List<PresentBox> l11 = h.this.l();
                this.f54706w = 1;
                if (s0Var.d(l11, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            return v.f59242a;
        }
    }

    public h(q8.a aVar) {
        jo.p.h(aVar, "dispatcher");
        this.f54696y = aVar;
        this.f54697z = r0.b();
        aVar.b(this);
        e0<ha.a> e0Var = new e0<>(a.d.f34697b);
        this.A = e0Var;
        this.B = e0Var;
        e0<String> e0Var2 = new e0<>("");
        this.C = e0Var2;
        this.D = e0Var2;
        e0<Long> e0Var3 = new e0<>(0L);
        this.E = e0Var3;
        this.F = e0Var3;
        e0<Long> e0Var4 = new e0<>(0L);
        this.G = e0Var4;
        this.H = e0Var4;
        this.I = new s0<>();
        this.J = wo.g.a(-2);
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        r0.d(this, null, 1, null);
        this.f54696y.c(this);
        super.d();
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.f54697z.getCoroutineContext();
    }

    public final x<MRError> h() {
        return this.J.g();
    }

    public final LiveData<Long> i() {
        return this.F;
    }

    public final LiveData<String> j() {
        return this.D;
    }

    public final LiveData<Long> k() {
        return this.H;
    }

    public final List<PresentBox> l() {
        List<PresentBox> b10 = this.I.b();
        return b10 == null ? s.k() : b10;
    }

    public final x<List<PresentBox>> m() {
        return this.I.c();
    }

    public final LiveData<ha.a> n() {
        return this.B;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(o0.d dVar) {
        jo.p.h(dVar, "event");
        this.A.p(a.b.f34695b);
        this.C.p("");
        this.E.p(Long.valueOf(dVar.a()));
        uo.l.d(this, null, null, new a(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(o0.c cVar) {
        jo.p.h(cVar, "event");
        this.A.p(a.c.f34696b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(o0.b bVar) {
        jo.p.h(bVar, "event");
        this.C.p(bVar.a().getNextCursor());
        List o02 = a0.o0(l(), bVar.a().getPresentBoxes());
        this.A.p(o02.isEmpty() ? a.e.f34698b : a.d.f34697b);
        uo.l.d(this, null, null, new b(o02, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(o0.a aVar) {
        jo.p.h(aVar, "event");
        this.A.p(new a.C0439a(aVar.a()));
        uo.l.d(this, null, null, new c(aVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(o0.f fVar) {
        jo.p.h(fVar, "event");
        uo.l.d(this, null, null, new d(fVar, null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(o0.e eVar) {
        jo.p.h(eVar, "event");
        this.G.p(Long.valueOf(eVar.a()));
    }
}
