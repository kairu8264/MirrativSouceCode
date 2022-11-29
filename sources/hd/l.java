package hd;

import ad.r0;
import android.content.res.Resources;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.q0;
import com.dena.mirrativ.mirrativapi.user.Reward;
import ha.a;
import hd.f;
import io.q;
import java.util.ArrayList;
import java.util.List;
import l0.c2;
import l0.s0;
import l0.z1;
import org.greenrobot.eventbus.ThreadMode;
import wn.v;
import xn.a0;
import xn.s;
import xn.t;
import xo.r;
import xo.w;
import xo.y;

/* loaded from: classes2.dex */
public final class l extends q0 {
    public String A;
    public final e0<ha.a> B;
    public final e0<ha.a> C;
    public final r<v> D;
    public final w<v> E;
    public final e0<r0> F;
    public final LiveData<r0> G;
    public final s0<id.a> H;
    public final c2<id.a> I;
    public final s0<List<gd.j>> J;
    public final c2<List<gd.j>> K;
    public final LiveData<ha.a> L;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f35419y;

    /* renamed from: z  reason: collision with root package name */
    public final Resources f35420z;

    @co.f(c = "com.dena.mirrativ.user.mypage.passbook.contract_member.ContractMemberPassBookStore$on$2", f = "ContractMemberPassBookStore.kt", l = {109}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f35421w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ f.a f35423y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f.a aVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f35423y = aVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f35423y, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f35421w;
            if (i10 == 0) {
                wn.m.b(obj);
                l.this.F.p(r0.B.b(this.f35423y.a()));
                r rVar = l.this.D;
                v vVar = v.f59242a;
                this.f35421w = 1;
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

    @co.f(c = "com.dena.mirrativ.user.mypage.passbook.contract_member.ContractMemberPassBookStore$statusState$1", f = "ContractMemberPassBookStore.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements q<ha.a, ha.a, ao.d<? super ha.a>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f35424w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f35425x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f35426y;

        public b(ao.d<? super b> dVar) {
            super(3, dVar);
        }

        @Override // io.q
        /* renamed from: a */
        public final Object s0(ha.a aVar, ha.a aVar2, ao.d<? super ha.a> dVar) {
            b bVar = new b(dVar);
            bVar.f35425x = aVar;
            bVar.f35426y = aVar2;
            return bVar.invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f35424w == 0) {
                wn.m.b(obj);
                ha.a aVar = (ha.a) this.f35425x;
                ha.a aVar2 = (ha.a) this.f35426y;
                return !(aVar2 instanceof a.d) ? aVar2 : !(aVar instanceof a.d) ? aVar : a.d.f34697b;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public l(q8.a aVar, Resources resources) {
        s0<id.a> e10;
        s0<List<gd.j>> e11;
        jo.p.h(aVar, "dispatcher");
        jo.p.h(resources, "resources");
        this.f35419y = aVar;
        this.f35420z = resources;
        aVar.b(this);
        this.A = "";
        a.d dVar = a.d.f34697b;
        e0<ha.a> e0Var = new e0<>(dVar);
        this.B = e0Var;
        e0<ha.a> e0Var2 = new e0<>(dVar);
        this.C = e0Var2;
        r<v> b10 = y.b(0, 0, null, 7, null);
        this.D = b10;
        this.E = b10;
        e0<r0> e0Var3 = new e0<>();
        this.F = e0Var3;
        this.G = e0Var3;
        e10 = z1.e(null, null, 2, null);
        this.H = e10;
        this.I = e10;
        e11 = z1.e(s.k(), null, 2, null);
        this.J = e11;
        this.K = e11;
        this.L = androidx.lifecycle.l.c(xo.e.h(androidx.lifecycle.l.a(e0Var2), androidx.lifecycle.l.a(e0Var), new b(null)), null, 0L, 3, null);
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        this.f35419y.c(this);
        super.d();
    }

    public final c2<List<gd.j>> h() {
        return this.K;
    }

    public final LiveData<r0> i() {
        return this.G;
    }

    public final c2<id.a> j() {
        return this.I;
    }

    public final String k() {
        return this.A;
    }

    public final w<v> l() {
        return this.E;
    }

    public final LiveData<ha.a> m() {
        return this.L;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.c cVar) {
        jo.p.h(cVar, "event");
        this.B.p(cVar.a().getRewards().isEmpty() ^ true ? a.d.f34697b : a.e.f34698b);
        s0<List<gd.j>> s0Var = this.J;
        List<gd.j> value = s0Var.getValue();
        List<Reward> rewards = cVar.a().getRewards();
        ArrayList arrayList = new ArrayList(t.u(rewards, 10));
        for (Reward reward : rewards) {
            arrayList.add(gd.j.f33247e.b(this.f35420z, reward));
        }
        s0Var.setValue(a0.o0(value, arrayList));
        this.A = cVar.a().getNextCursor();
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.d dVar) {
        jo.p.h(dVar, "event");
        this.C.p(a.d.f34697b);
        this.H.setValue(id.a.f36737f.a(dVar.a(), this.f35420z));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.b bVar) {
        jo.p.h(bVar, "event");
        this.B.p(new a.C0439a(bVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.g gVar) {
        jo.p.h(gVar, "event");
        this.A = "";
        this.J.setValue(s.k());
        this.B.p(a.b.f34695b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.e eVar) {
        jo.p.h(eVar, "event");
        this.B.p(a.c.f34696b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(f.a aVar) {
        jo.p.h(aVar, "event");
        uo.l.d(androidx.lifecycle.r0.a(this), null, null, new a(aVar, null), 3, null);
    }
}
