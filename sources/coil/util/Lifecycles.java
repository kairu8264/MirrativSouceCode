package coil.util;

import androidx.lifecycle.o;
import androidx.lifecycle.t;
import co.d;
import co.f;

/* renamed from: coil.util.-Lifecycles  reason: invalid class name */
/* loaded from: classes.dex */
public final class Lifecycles {

    @f(c = "coil.util.-Lifecycles", f = "Lifecycles.kt", l = {44}, m = "awaitStarted")
    /* renamed from: coil.util.-Lifecycles$a */
    /* loaded from: classes.dex */
    public static final class a extends d {

        /* renamed from: w  reason: collision with root package name */
        public Object f20029w;

        /* renamed from: x  reason: collision with root package name */
        public Object f20030x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ Object f20031y;

        /* renamed from: z  reason: collision with root package name */
        public int f20032z;

        public a(ao.d<? super a> dVar) {
            super(dVar);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            this.f20031y = obj;
            this.f20032z |= Integer.MIN_VALUE;
            return Lifecycles.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, coil.util.-Lifecycles$awaitStarted$2$1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.lifecycle.o r6, ao.d<? super wn.v> r7) {
        /*
            boolean r0 = r7 instanceof coil.util.Lifecycles.a
            if (r0 == 0) goto L13
            r0 = r7
            coil.util.-Lifecycles$a r0 = (coil.util.Lifecycles.a) r0
            int r1 = r0.f20032z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20032z = r1
            goto L18
        L13:
            coil.util.-Lifecycles$a r0 = new coil.util.-Lifecycles$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f20031y
            java.lang.Object r1 = bo.c.c()
            int r2 = r0.f20032z
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f20030x
            jo.e0 r6 = (jo.e0) r6
            java.lang.Object r0 = r0.f20029w
            androidx.lifecycle.o r0 = (androidx.lifecycle.o) r0
            wn.m.b(r7)     // Catch: java.lang.Throwable -> L31
            goto L85
        L31:
            r7 = move-exception
            goto L97
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            wn.m.b(r7)
            androidx.lifecycle.o$c r7 = r6.b()
            androidx.lifecycle.o$c r2 = androidx.lifecycle.o.c.STARTED
            boolean r7 = r7.a(r2)
            if (r7 == 0) goto L4d
            wn.v r6 = wn.v.f59242a
            return r6
        L4d:
            jo.e0 r7 = new jo.e0
            r7.<init>()
            r0.f20029w = r6     // Catch: java.lang.Throwable -> L92
            r0.f20030x = r7     // Catch: java.lang.Throwable -> L92
            r0.f20032z = r3     // Catch: java.lang.Throwable -> L92
            uo.q r2 = new uo.q     // Catch: java.lang.Throwable -> L92
            ao.d r4 = bo.b.b(r0)     // Catch: java.lang.Throwable -> L92
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L92
            r2.y()     // Catch: java.lang.Throwable -> L92
            coil.util.-Lifecycles$awaitStarted$2$1 r3 = new coil.util.-Lifecycles$awaitStarted$2$1     // Catch: java.lang.Throwable -> L92
            r3.<init>()     // Catch: java.lang.Throwable -> L92
            r7.f38136w = r3     // Catch: java.lang.Throwable -> L92
            jo.p.e(r3)     // Catch: java.lang.Throwable -> L92
            androidx.lifecycle.t r3 = (androidx.lifecycle.t) r3     // Catch: java.lang.Throwable -> L92
            r6.a(r3)     // Catch: java.lang.Throwable -> L92
            java.lang.Object r2 = r2.t()     // Catch: java.lang.Throwable -> L92
            java.lang.Object r3 = bo.c.c()     // Catch: java.lang.Throwable -> L92
            if (r2 != r3) goto L80
            co.h.c(r0)     // Catch: java.lang.Throwable -> L92
        L80:
            if (r2 != r1) goto L83
            return r1
        L83:
            r0 = r6
            r6 = r7
        L85:
            T r6 = r6.f38136w
            androidx.lifecycle.t r6 = (androidx.lifecycle.t) r6
            if (r6 != 0) goto L8c
            goto L8f
        L8c:
            r0.c(r6)
        L8f:
            wn.v r6 = wn.v.f59242a
            return r6
        L92:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L97:
            T r6 = r6.f38136w
            androidx.lifecycle.t r6 = (androidx.lifecycle.t) r6
            if (r6 != 0) goto L9e
            goto La1
        L9e:
            r0.c(r6)
        La1:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.util.Lifecycles.a(androidx.lifecycle.o, ao.d):java.lang.Object");
    }

    public static final void b(o oVar, t tVar) {
        oVar.c(tVar);
        oVar.a(tVar);
    }
}
