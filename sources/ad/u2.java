package ad;

import ad.o2;
import androidx.lifecycle.LiveData;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryPaymentType;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryResponse;
import ha.a;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public final class u2 extends androidx.lifecycle.q0 {
    public final l0.s0<r2> A;
    public final l0.c2<r2> B;
    public final androidx.lifecycle.e0<ContractSummaryPaymentType> C;
    public final LiveData<ContractSummaryPaymentType> D;
    public final androidx.lifecycle.e0<r0> E;
    public final LiveData<r0> F;
    public final l0.s0<ha.a> G;
    public final l0.c2<ha.a> H;
    public final xo.r<wn.v> I;
    public final xo.w<wn.v> J;
    public final xo.r<wn.v> K;
    public final xo.w<wn.v> L;

    /* renamed from: y  reason: collision with root package name */
    public final q8.a f1372y;

    /* renamed from: z  reason: collision with root package name */
    public final androidx.lifecycle.e0<ContractSummaryResponse> f1373z;

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.SelectReceiveCashBonusStore$on$1", f = "SelectReceiveCashBonusStore.kt", l = {70}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f1374w;

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
            int i10 = this.f1374w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = u2.this.K;
                wn.v vVar = wn.v.f59242a;
                this.f1374w = 1;
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

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.SelectReceiveCashBonusStore$on$2", f = "SelectReceiveCashBonusStore.kt", l = {78}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f1376w;

        public b(ao.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f1376w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.r rVar = u2.this.I;
                wn.v vVar = wn.v.f59242a;
                this.f1376w = 1;
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

    public u2(q8.a aVar) {
        l0.s0<r2> e10;
        l0.s0<ha.a> e11;
        jo.p.h(aVar, "dispatcher");
        this.f1372y = aVar;
        aVar.b(this);
        this.f1373z = new androidx.lifecycle.e0<>();
        e10 = l0.z1.e(null, null, 2, null);
        this.A = e10;
        this.B = e10;
        androidx.lifecycle.e0<ContractSummaryPaymentType> e0Var = new androidx.lifecycle.e0<>();
        this.C = e0Var;
        this.D = e0Var;
        androidx.lifecycle.e0<r0> e0Var2 = new androidx.lifecycle.e0<>();
        this.E = e0Var2;
        this.F = e0Var2;
        e11 = l0.z1.e(a.d.f34697b, null, 2, null);
        this.G = e11;
        this.H = e11;
        xo.r<wn.v> b10 = xo.y.b(0, 0, null, 7, null);
        this.I = b10;
        this.J = b10;
        xo.r<wn.v> b11 = xo.y.b(0, 0, null, 7, null);
        this.K = b11;
        this.L = b11;
    }

    @Override // androidx.lifecycle.q0
    public void d() {
        super.d();
        this.f1372y.c(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String h() {
        /*
            r5 = this;
            r0 = 0
            wn.l$a r1 = wn.l.f59224w     // Catch: java.lang.Throwable -> L48
            androidx.lifecycle.e0<com.dena.mirrativ.mirrativapi.user.ContractSummaryResponse> r1 = r5.f1373z     // Catch: java.lang.Throwable -> L48
            java.lang.Object r1 = r1.f()     // Catch: java.lang.Throwable -> L48
            com.dena.mirrativ.mirrativapi.user.ContractSummaryResponse r1 = (com.dena.mirrativ.mirrativapi.user.ContractSummaryResponse) r1     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L42
            int r1 = r1.getPaymentStartDate()     // Catch: java.lang.Throwable -> L48
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L48
            if (r1 != 0) goto L1c
            goto L42
        L1c:
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = "yyyyMMdd"
            java.util.Locale r4 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L48
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L48
            java.util.Date r1 = r2.parse(r1)     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L42
            java.lang.String r2 = "dateFormat"
            jo.p.g(r1, r2)     // Catch: java.lang.Throwable -> L48
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = "yyyy/M/d"
            java.util.Locale r4 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L48
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = r2.format(r1)     // Catch: java.lang.Throwable -> L48
            goto L43
        L42:
            r1 = r0
        L43:
            java.lang.Object r1 = wn.l.a(r1)     // Catch: java.lang.Throwable -> L48
            goto L53
        L48:
            r1 = move-exception
            wn.l$a r2 = wn.l.f59224w
            java.lang.Object r1 = wn.m.a(r1)
            java.lang.Object r1 = wn.l.a(r1)
        L53:
            boolean r2 = wn.l.c(r1)
            if (r2 == 0) goto L5a
            goto L5b
        L5a:
            r0 = r1
        L5b:
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L61
            java.lang.String r0 = ""
        L61:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.u2.h():java.lang.String");
    }

    public final l0.c2<r2> i() {
        return this.B;
    }

    public final LiveData<r0> j() {
        return this.F;
    }

    public final LiveData<ContractSummaryPaymentType> k() {
        return this.D;
    }

    public final l0.c2<ha.a> l() {
        return this.H;
    }

    public final xo.w<wn.v> m() {
        return this.J;
    }

    public final xo.w<wn.v> n() {
        return this.L;
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(o2.b bVar) {
        jo.p.h(bVar, "event");
        this.C.p(bVar.b().getPaymentType());
        this.f1373z.p(bVar.b());
        this.E.p(r0.B.b(bVar.a().getKycInfo()));
        this.A.setValue(r2.F.a(bVar.b(), bVar.a()));
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(o2.e eVar) {
        r2 r2Var;
        jo.p.h(eVar, "event");
        this.C.p(eVar.a());
        l0.s0<r2> s0Var = this.A;
        r2 value = s0Var.getValue();
        if (value != null) {
            r2Var = value.a((r20 & 1) != 0 ? value.f1299w : h(), (r20 & 2) != 0 ? value.f1300x : eVar.a() == ContractSummaryPaymentType.COIN, (r20 & 4) != 0 ? value.f1301y : eVar.a() == ContractSummaryPaymentType.CASH, (r20 & 8) != 0 ? value.f1302z : false, (r20 & 16) != 0 ? value.A : null, (r20 & 32) != 0 ? value.B : null, (r20 & 64) != 0 ? value.C : null, (r20 & 128) != 0 ? value.D : true, (r20 & 256) != 0 ? value.E : false);
        } else {
            r2Var = null;
        }
        s0Var.setValue(r2Var);
        this.G.setValue(a.d.f34697b);
        uo.l.d(androidx.lifecycle.r0.a(this), null, null, new a(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(o2.c cVar) {
        jo.p.h(cVar, "event");
        this.G.setValue(new a.C0439a(cVar.a().getError()));
        uo.l.d(androidx.lifecycle.r0.a(this), null, null, new b(null), 3, null);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(o2.d dVar) {
        jo.p.h(dVar, "event");
        this.G.setValue(a.b.f34695b);
    }

    @dq.l(threadMode = ThreadMode.MAIN)
    public final void on(o2.a aVar) {
        jo.p.h(aVar, "event");
        this.C.p(ContractSummaryPaymentType.CASH);
        l0.s0<r2> s0Var = this.A;
        String h10 = h();
        String bankName = aVar.a().getBankName();
        String branchCode = aVar.a().getBranchCode();
        s0Var.setValue(new r2(h10, false, true, false, bankName, branchCode, "****" + so.q.T0(aVar.a().getAccountNumber(), 3), true, true));
    }
}
