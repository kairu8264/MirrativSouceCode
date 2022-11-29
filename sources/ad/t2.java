package ad;

import android.content.Context;
import android.content.res.Resources;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryPaymentType;
import ha.a;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class t2 {

    @co.f(c = "com.dena.mirrativ.user.mypage.contract.SelectReceiveCashBonusPageKt$SelectReceiveCashBonusPage$1", f = "SelectReceiveCashBonusPage.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public final /* synthetic */ s2 A;
        public final /* synthetic */ Resources B;

        /* renamed from: w  reason: collision with root package name */
        public int f1339w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f1340x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ n2 f1341y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ u2 f1342z;

        @co.f(c = "com.dena.mirrativ.user.mypage.contract.SelectReceiveCashBonusPageKt$SelectReceiveCashBonusPage$1$1", f = "SelectReceiveCashBonusPage.kt", l = {21}, m = "invokeSuspend")
        /* renamed from: ad.t2$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0029a extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f1343w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ u2 f1344x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ s2 f1345y;

            /* renamed from: ad.t2$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0030a implements xo.d<wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ u2 f1346w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ s2 f1347x;

                public C0030a(u2 u2Var, s2 s2Var) {
                    this.f1346w = u2Var;
                    this.f1347x = s2Var;
                }

                @Override // xo.d
                /* renamed from: a */
                public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                    MRError b10;
                    ha.a value = this.f1346w.l().getValue();
                    String str = null;
                    a.C0439a c0439a = value instanceof a.C0439a ? (a.C0439a) value : null;
                    if (c0439a != null && (b10 = c0439a.b()) != null) {
                        str = b10.getMessage();
                    }
                    s2 s2Var = this.f1347x;
                    if (str == null) {
                        return wn.v.f59242a;
                    }
                    s2Var.c(str);
                    return wn.v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0029a(u2 u2Var, s2 s2Var, ao.d<? super C0029a> dVar) {
                super(2, dVar);
                this.f1344x = u2Var;
                this.f1345y = s2Var;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new C0029a(this.f1344x, this.f1345y, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((C0029a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f1343w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    xo.w<wn.v> m10 = this.f1344x.m();
                    C0030a c0030a = new C0030a(this.f1344x, this.f1345y);
                    this.f1343w = 1;
                    if (m10.a(c0030a, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        @co.f(c = "com.dena.mirrativ.user.mypage.contract.SelectReceiveCashBonusPageKt$SelectReceiveCashBonusPage$1$2", f = "SelectReceiveCashBonusPage.kt", l = {27}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f1348w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ u2 f1349x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ Resources f1350y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ s2 f1351z;

            /* renamed from: ad.t2$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0031a implements xo.d<wn.v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ u2 f1352w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ Resources f1353x;

                /* renamed from: y  reason: collision with root package name */
                public final /* synthetic */ s2 f1354y;

                /* renamed from: ad.t2$a$b$a$a  reason: collision with other inner class name */
                /* loaded from: classes2.dex */
                public /* synthetic */ class C0032a {

                    /* renamed from: a  reason: collision with root package name */
                    public static final /* synthetic */ int[] f1355a;

                    static {
                        int[] iArr = new int[ContractSummaryPaymentType.values().length];
                        iArr[ContractSummaryPaymentType.COIN.ordinal()] = 1;
                        iArr[ContractSummaryPaymentType.CASH.ordinal()] = 2;
                        f1355a = iArr;
                    }
                }

                public C0031a(u2 u2Var, Resources resources, s2 s2Var) {
                    this.f1352w = u2Var;
                    this.f1353x = resources;
                    this.f1354y = s2Var;
                }

                @Override // xo.d
                /* renamed from: a */
                public final Object emit(wn.v vVar, ao.d<? super wn.v> dVar) {
                    int i10;
                    ContractSummaryPaymentType f10 = this.f1352w.k().f();
                    if (f10 == null) {
                        return wn.v.f59242a;
                    }
                    Resources resources = this.f1353x;
                    int i11 = nc.i.text_select_payment_type_alert_message;
                    Object[] objArr = new Object[1];
                    int i12 = C0032a.f1355a[f10.ordinal()];
                    if (i12 == 1) {
                        i10 = nc.i.text_select_payment_type_coin;
                    } else if (i12 != 2) {
                        throw new NoWhenBranchMatchedException();
                    } else {
                        i10 = nc.i.text_select_payment_type_cash;
                    }
                    objArr[0] = resources.getString(i10);
                    String string = resources.getString(i11, objArr);
                    jo.p.g(string, "resources.getString(\n   …      )\n                )");
                    this.f1354y.c(string);
                    return wn.v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(u2 u2Var, Resources resources, s2 s2Var, ao.d<? super b> dVar) {
                super(2, dVar);
                this.f1349x = u2Var;
                this.f1350y = resources;
                this.f1351z = s2Var;
            }

            @Override // co.a
            public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
                return new b(this.f1349x, this.f1350y, this.f1351z, dVar);
            }

            @Override // io.p
            public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
                return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f1348w;
                if (i10 == 0) {
                    wn.m.b(obj);
                    xo.w<wn.v> n10 = this.f1349x.n();
                    C0031a c0031a = new C0031a(this.f1349x, this.f1350y, this.f1351z);
                    this.f1348w = 1;
                    if (n10.a(c0031a, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    wn.m.b(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n2 n2Var, u2 u2Var, s2 s2Var, Resources resources, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f1341y = n2Var;
            this.f1342z = u2Var;
            this.A = s2Var;
            this.B = resources;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            a aVar = new a(this.f1341y, this.f1342z, this.A, this.B, dVar);
            aVar.f1340x = obj;
            return aVar;
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f1339w == 0) {
                wn.m.b(obj);
                uo.q0 q0Var = (uo.q0) this.f1340x;
                this.f1341y.b();
                uo.l.d(q0Var, null, null, new C0029a(this.f1342z, this.A, null), 3, null);
                uo.l.d(q0Var, null, null, new b(this.f1342z, this.B, this.A, null), 3, null);
                return wn.v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements v2 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ s2 f1356a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ u2 f1357b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ n2 f1358c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ r2 f1359d;

        public b(s2 s2Var, u2 u2Var, n2 n2Var, r2 r2Var) {
            this.f1356a = s2Var;
            this.f1357b = u2Var;
            this.f1358c = n2Var;
            this.f1359d = r2Var;
        }

        @Override // ad.v2
        public void a() {
            this.f1356a.a();
        }

        @Override // ad.v2
        public void b() {
            r2 value = this.f1357b.i().getValue();
            boolean z10 = true;
            if (value == null || !value.i()) {
                z10 = false;
            }
            if (z10 || this.f1357b.l().getValue().a()) {
                return;
            }
            this.f1358c.e(ContractSummaryPaymentType.COIN);
        }

        @Override // ad.v2
        public void c() {
            r2 value = this.f1357b.i().getValue();
            boolean z10 = true;
            if (value == null || !value.h()) {
                z10 = false;
            }
            if (z10 || this.f1357b.l().getValue().a() || !this.f1359d.g()) {
                return;
            }
            this.f1358c.e(ContractSummaryPaymentType.CASH);
        }

        @Override // ad.v2
        public void d() {
            s2 s2Var = this.f1356a;
            r0 f10 = this.f1357b.j().f();
            if (f10 == null) {
                return;
            }
            s2Var.b(f10);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends jo.q implements io.p<l0.i, Integer, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ n2 f1360w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ u2 f1361x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ s2 f1362y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f1363z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(n2 n2Var, u2 u2Var, s2 s2Var, int i10) {
            super(2);
            this.f1360w = n2Var;
            this.f1361x = u2Var;
            this.f1362y = s2Var;
            this.f1363z = i10;
        }

        public final void a(l0.i iVar, int i10) {
            t2.a(this.f1360w, this.f1361x, this.f1362y, iVar, this.f1363z | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ wn.v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return wn.v.f59242a;
        }
    }

    public static final void a(n2 n2Var, u2 u2Var, s2 s2Var, l0.i iVar, int i10) {
        jo.p.h(n2Var, "actionCreator");
        jo.p.h(u2Var, "store");
        jo.p.h(s2Var, "navigation");
        l0.i h10 = iVar.h(1274531757);
        l0.c0.c(wn.v.f59242a, new a(n2Var, u2Var, s2Var, ((Context) h10.G(androidx.compose.ui.platform.z.g())).getResources(), null), h10, 64);
        r2 value = u2Var.i().getValue();
        if (value != null) {
            w2.a(value, new b(s2Var, u2Var, n2Var, value), h10, 0);
        }
        l0.l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new c(n2Var, u2Var, s2Var, i10));
    }
}
