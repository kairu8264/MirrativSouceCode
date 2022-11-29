package xo;

import java.util.List;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes4.dex */
public final class f0 implements c0 {

    /* renamed from: b  reason: collision with root package name */
    public final long f60493b;

    /* renamed from: c  reason: collision with root package name */
    public final long f60494c;

    @co.f(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", l = {178, 180, 182, 183, 185}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends co.l implements io.q<d<? super a0>, Integer, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f60495w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f60496x;

        /* renamed from: y  reason: collision with root package name */
        public /* synthetic */ int f60497y;

        public a(ao.d<? super a> dVar) {
            super(3, dVar);
        }

        public final Object a(d<? super a0> dVar, int i10, ao.d<? super wn.v> dVar2) {
            a aVar = new a(dVar2);
            aVar.f60496x = dVar;
            aVar.f60497y = i10;
            return aVar.invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009b A[RETURN] */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = bo.c.c()
                int r1 = r9.f60495w
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L3c
                if (r1 == r6) goto L38
                if (r1 == r5) goto L30
                if (r1 == r4) goto L28
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                goto L38
            L18:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L20:
                java.lang.Object r1 = r9.f60496x
                xo.d r1 = (xo.d) r1
                wn.m.b(r10)
                goto L8e
            L28:
                java.lang.Object r1 = r9.f60496x
                xo.d r1 = (xo.d) r1
                wn.m.b(r10)
                goto L7d
            L30:
                java.lang.Object r1 = r9.f60496x
                xo.d r1 = (xo.d) r1
                wn.m.b(r10)
                goto L64
            L38:
                wn.m.b(r10)
                goto L9c
            L3c:
                wn.m.b(r10)
                java.lang.Object r10 = r9.f60496x
                r1 = r10
                xo.d r1 = (xo.d) r1
                int r10 = r9.f60497y
                if (r10 <= 0) goto L53
                xo.a0 r10 = xo.a0.START
                r9.f60495w = r6
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L9c
                return r0
            L53:
                xo.f0 r10 = xo.f0.this
                long r6 = xo.f0.c(r10)
                r9.f60496x = r1
                r9.f60495w = r5
                java.lang.Object r10 = uo.b1.a(r6, r9)
                if (r10 != r0) goto L64
                return r0
            L64:
                xo.f0 r10 = xo.f0.this
                long r5 = xo.f0.b(r10)
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L8e
                xo.a0 r10 = xo.a0.STOP
                r9.f60496x = r1
                r9.f60495w = r4
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L7d
                return r0
            L7d:
                xo.f0 r10 = xo.f0.this
                long r4 = xo.f0.b(r10)
                r9.f60496x = r1
                r9.f60495w = r3
                java.lang.Object r10 = uo.b1.a(r4, r9)
                if (r10 != r0) goto L8e
                return r0
            L8e:
                xo.a0 r10 = xo.a0.STOP_AND_RESET_REPLAY_CACHE
                r3 = 0
                r9.f60496x = r3
                r9.f60495w = r2
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L9c
                return r0
            L9c:
                wn.v r10 = wn.v.f59242a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: xo.f0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // io.q
        public /* bridge */ /* synthetic */ Object s0(d<? super a0> dVar, Integer num, ao.d<? super wn.v> dVar2) {
            return a(dVar, num.intValue(), dVar2);
        }
    }

    @co.f(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class b extends co.l implements io.p<a0, ao.d<? super Boolean>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f60499w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f60500x;

        public b(ao.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // io.p
        /* renamed from: a */
        public final Object invoke(a0 a0Var, ao.d<? super Boolean> dVar) {
            return ((b) create(a0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f60500x = obj;
            return bVar;
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f60499w == 0) {
                wn.m.b(obj);
                return co.b.a(((a0) this.f60500x) != a0.START);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public f0(long j10, long j11) {
        this.f60493b = j10;
        this.f60494c = j11;
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("stopTimeout(" + j10 + " ms) cannot be negative").toString());
        }
        if (j11 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j11 + " ms) cannot be negative").toString());
    }

    @Override // xo.c0
    public c<a0> a(g0<Integer> g0Var) {
        return e.j(e.l(e.z(g0Var, new a(null)), new b(null)));
    }

    public boolean equals(Object obj) {
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            if (this.f60493b == f0Var.f60493b && this.f60494c == f0Var.f60494c) {
                return true;
            }
        }
        return false;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return (Long.hashCode(this.f60493b) * 31) + Long.hashCode(this.f60494c);
    }

    public String toString() {
        List c10 = xn.r.c(2);
        if (this.f60493b > 0) {
            c10.add("stopTimeout=" + this.f60493b + "ms");
        }
        if (this.f60494c < Long.MAX_VALUE) {
            c10.add("replayExpiration=" + this.f60494c + "ms");
        }
        List a10 = xn.r.a(c10);
        return "SharingStarted.WhileSubscribed(" + xn.a0.g0(a10, null, null, null, 0, null, null, 63, null) + ')';
    }
}
