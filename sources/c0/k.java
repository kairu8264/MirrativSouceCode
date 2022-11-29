package c0;

import io.p;
import q1.q;
import uo.d2;
import uo.q0;
import uo.r0;
import wn.m;
import wn.v;

/* loaded from: classes.dex */
public final class k extends c0.b implements r1.d<d>, d {
    public wn.k<b1.h, ? extends d2> A;
    public wn.k<b1.h, ? extends d2> B;

    /* renamed from: z  reason: collision with root package name */
    public i f18613z;

    @co.f(c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$bringChildIntoView$2", f = "BringIntoViewResponder.kt", l = {214, 223, 230}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements p<q0, ao.d<? super v>, Object> {
        public final /* synthetic */ q B;
        public final /* synthetic */ b1.h C;

        /* renamed from: w  reason: collision with root package name */
        public Object f18614w;

        /* renamed from: x  reason: collision with root package name */
        public Object f18615x;

        /* renamed from: y  reason: collision with root package name */
        public int f18616y;

        /* renamed from: z  reason: collision with root package name */
        public /* synthetic */ Object f18617z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q qVar, b1.h hVar, ao.d<? super a> dVar) {
            super(2, dVar);
            this.B = qVar;
            this.C = hVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            a aVar = new a(this.B, this.C, dVar);
            aVar.f18617z = obj;
            return aVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x00b0 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:13:0x002f, B:39:0x00a8, B:41:0x00b0), top: B:76:0x002f }] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00d1  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0104  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0111  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0127  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0134  */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 314
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: c0.k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @co.f(c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$dispatchRequest$2", f = "BringIntoViewResponder.kt", l = {272}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements p<q0, ao.d<? super v>, Object> {
        public final /* synthetic */ q A;
        public final /* synthetic */ b1.h B;

        /* renamed from: w  reason: collision with root package name */
        public int f18618w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f18619x;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ b1.h f18621z;

        @co.f(c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$dispatchRequest$2$1", f = "BringIntoViewResponder.kt", l = {267}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends co.l implements p<q0, ao.d<? super v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f18622w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ k f18623x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ b1.h f18624y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k kVar, b1.h hVar, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f18623x = kVar;
                this.f18624y = hVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f18623x, this.f18624y, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f18622w;
                if (i10 == 0) {
                    m.b(obj);
                    i n10 = this.f18623x.n();
                    b1.h hVar = this.f18624y;
                    this.f18622w = 1;
                    if (n10.a(hVar, this) == c10) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b1.h hVar, q qVar, b1.h hVar2, ao.d<? super b> dVar) {
            super(2, dVar);
            this.f18621z = hVar;
            this.A = qVar;
            this.B = hVar2;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            b bVar = new b(this.f18621z, this.A, this.B, dVar);
            bVar.f18619x = obj;
            return bVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f18618w;
            if (i10 == 0) {
                m.b(obj);
                uo.l.d((q0) this.f18619x, null, null, new a(k.this, this.B, null), 3, null);
                d c11 = k.this.c();
                b1.h hVar = this.f18621z;
                q qVar = this.A;
                this.f18618w = 1;
                if (c11.a(hVar, qVar, this) == c10) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(d dVar) {
        super(dVar);
        jo.p.h(dVar, "defaultParent");
    }

    @Override // c0.d
    public Object a(b1.h hVar, q qVar, ao.d<? super v> dVar) {
        Object e10 = r0.e(new a(qVar, hVar, null), dVar);
        return e10 == bo.c.c() ? e10 : v.f59242a;
    }

    @Override // r1.d
    public r1.f<d> getKey() {
        return c.a();
    }

    public final Object m(wn.k<b1.h, ? extends d2> kVar, q qVar, ao.d<? super v> dVar) {
        this.B = kVar;
        b1.h c10 = kVar.c();
        Object e10 = r0.e(new b(n().b(c10), qVar, c10, null), dVar);
        return e10 == bo.c.c() ? e10 : v.f59242a;
    }

    public final i n() {
        i iVar = this.f18613z;
        if (iVar != null) {
            return iVar;
        }
        jo.p.v("responder");
        return null;
    }

    @Override // r1.d
    /* renamed from: p */
    public d getValue() {
        return this;
    }

    public final void r(i iVar) {
        jo.p.h(iVar, "<set-?>");
        this.f18613z = iVar;
    }
}
