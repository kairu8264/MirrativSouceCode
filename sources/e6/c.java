package e6;

import co.d;
import co.f;
import e6.b;
import j6.i;
import j6.k;
import java.util.List;
import k6.h;

/* loaded from: classes.dex */
public final class c implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final i f30292a;

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f30293b;

    /* renamed from: c  reason: collision with root package name */
    public final int f30294c;

    /* renamed from: d  reason: collision with root package name */
    public final i f30295d;

    /* renamed from: e  reason: collision with root package name */
    public final h f30296e;

    /* renamed from: f  reason: collision with root package name */
    public final x5.c f30297f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f30298g;

    @f(c = "coil.intercept.RealInterceptorChain", f = "RealInterceptorChain.kt", l = {25}, m = "proceed")
    /* loaded from: classes.dex */
    public static final class a extends d {
        public int A;

        /* renamed from: w  reason: collision with root package name */
        public Object f30299w;

        /* renamed from: x  reason: collision with root package name */
        public Object f30300x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f30301y;

        public a(ao.d<? super a> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f30301y = obj;
            this.A |= Integer.MIN_VALUE;
            return c.this.j(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(i iVar, List<? extends b> list, int i10, i iVar2, h hVar, x5.c cVar, boolean z10) {
        this.f30292a = iVar;
        this.f30293b = list;
        this.f30294c = i10;
        this.f30295d = iVar2;
        this.f30296e = hVar;
        this.f30297f = cVar;
        this.f30298g = z10;
    }

    public static /* synthetic */ c e(c cVar, int i10, i iVar, h hVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = cVar.f30294c;
        }
        if ((i11 & 2) != 0) {
            iVar = cVar.b();
        }
        if ((i11 & 4) != 0) {
            hVar = cVar.a();
        }
        return cVar.d(i10, iVar, hVar);
    }

    @Override // e6.b.a
    public h a() {
        return this.f30296e;
    }

    @Override // e6.b.a
    public i b() {
        return this.f30295d;
    }

    public final void c(i iVar, b bVar) {
        if (iVar.l() == this.f30292a.l()) {
            if (iVar.m() != k.f37203a) {
                if (iVar.M() == this.f30292a.M()) {
                    if (iVar.z() == this.f30292a.z()) {
                        if (iVar.K() == this.f30292a.K()) {
                            return;
                        }
                        throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
                    }
                    throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's lifecycle.").toString());
                }
                throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's target.").toString());
            }
            throw new IllegalStateException(("Interceptor '" + bVar + "' cannot set the request's data to null.").toString());
        }
        throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's context.").toString());
    }

    public final c d(int i10, i iVar, h hVar) {
        return new c(this.f30292a, this.f30293b, i10, iVar, hVar, this.f30297f, this.f30298g);
    }

    public final x5.c f() {
        return this.f30297f;
    }

    public final int g() {
        return this.f30294c;
    }

    public final List<b> h() {
        return this.f30293b;
    }

    public final boolean i() {
        return this.f30298g;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object j(j6.i r12, ao.d<? super j6.j> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof e6.c.a
            if (r0 == 0) goto L13
            r0 = r13
            e6.c$a r0 = (e6.c.a) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            e6.c$a r0 = new e6.c$a
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f30301y
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.A
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r12 = r0.f30300x
            e6.b r12 = (e6.b) r12
            java.lang.Object r0 = r0.f30299w
            e6.c r0 = (e6.c) r0
            wn.m.b(r13)
            goto L82
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            wn.m.b(r13)
            int r13 = r11.g()
            if (r13 <= 0) goto L54
            java.util.List r13 = r11.h()
            int r2 = r11.g()
            int r2 = r2 - r3
            java.lang.Object r13 = r13.get(r2)
            e6.b r13 = (e6.b) r13
            r11.c(r12, r13)
        L54:
            java.util.List r13 = r11.h()
            int r2 = r11.g()
            java.lang.Object r13 = r13.get(r2)
            e6.b r13 = (e6.b) r13
            int r2 = r11.g()
            int r5 = r2 + 1
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r11
            r6 = r12
            e6.c r12 = e(r4, r5, r6, r7, r8, r9)
            r0.f30299w = r11
            r0.f30300x = r13
            r0.A = r3
            java.lang.Object r12 = r13.a(r12, r0)
            if (r12 != r1) goto L7e
            return r1
        L7e:
            r0 = r11
            r10 = r13
            r13 = r12
            r12 = r10
        L82:
            j6.j r13 = (j6.j) r13
            j6.i r1 = r13.b()
            r0.c(r1, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.c.j(j6.i, ao.d):java.lang.Object");
    }
}
