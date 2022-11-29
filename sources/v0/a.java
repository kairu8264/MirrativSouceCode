package v0;

import java.util.List;
import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public final class a extends v0.c {

    /* renamed from: v0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0900a extends jo.q implements io.l<Object, wn.v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ List<io.l<Object, wn.v>> f56446w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0900a(List<io.l<Object, wn.v>> list) {
            super(1);
            this.f56446w = list;
        }

        public final void a(Object obj) {
            jo.p.h(obj, "state");
            List<io.l<Object, wn.v>> list = this.f56446w;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                list.get(i10).invoke(obj);
            }
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ wn.v invoke(Object obj) {
            a(obj);
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends jo.q implements io.l<k, v0.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<Object, wn.v> f56447w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.l<Object, wn.v> f56448x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(io.l<Object, wn.v> lVar, io.l<Object, wn.v> lVar2) {
            super(1);
            this.f56447w = lVar;
            this.f56448x = lVar2;
        }

        @Override // io.l
        /* renamed from: a */
        public final v0.c invoke(k kVar) {
            int h10;
            jo.p.h(kVar, "invalid");
            synchronized (m.C()) {
                h10 = m.h();
                m.q(h10 + 1);
            }
            return new v0.c(h10, kVar, this.f56447w, this.f56448x);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends jo.q implements io.l<k, g> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<Object, wn.v> f56449w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(io.l<Object, wn.v> lVar) {
            super(1);
            this.f56449w = lVar;
        }

        @Override // io.l
        /* renamed from: a */
        public final g invoke(k kVar) {
            int h10;
            jo.p.h(kVar, "invalid");
            synchronized (m.C()) {
                h10 = m.h();
                m.q(h10 + 1);
            }
            return new g(h10, kVar, this.f56449w);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(int r5, v0.k r6) {
        /*
            r4 = this;
            java.lang.String r0 = "invalid"
            jo.p.h(r6, r0)
            java.lang.Object r0 = v0.m.C()
            monitor-enter(r0)
            java.util.List r1 = v0.m.g()     // Catch: java.lang.Throwable -> L37
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L37
            r1 = r1 ^ 1
            r2 = 0
            if (r1 == 0) goto L20
            java.util.List r1 = v0.m.g()     // Catch: java.lang.Throwable -> L37
            java.util.List r1 = xn.a0.D0(r1)     // Catch: java.lang.Throwable -> L37
            goto L21
        L20:
            r1 = r2
        L21:
            if (r1 == 0) goto L31
            java.lang.Object r3 = xn.a0.u0(r1)     // Catch: java.lang.Throwable -> L37
            io.l r3 = (io.l) r3     // Catch: java.lang.Throwable -> L37
            if (r3 != 0) goto L32
            v0.a$a r3 = new v0.a$a     // Catch: java.lang.Throwable -> L37
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L37
            goto L32
        L31:
            r3 = r2
        L32:
            monitor-exit(r0)
            r4.<init>(r5, r6, r2, r3)
            return
        L37:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.a.<init>(int, v0.k):void");
    }

    @Override // v0.c
    public i A() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }

    @Override // v0.c
    public v0.c N(io.l<Object, wn.v> lVar, io.l<Object, wn.v> lVar2) {
        return (v0.c) m.t(new b(lVar, lVar2));
    }

    @Override // v0.c, v0.h
    /* renamed from: Q */
    public Void l(h hVar) {
        jo.p.h(hVar, "snapshot");
        v.b();
        throw new KotlinNothingValueException();
    }

    @Override // v0.c, v0.h
    /* renamed from: R */
    public Void m(h hVar) {
        jo.p.h(hVar, "snapshot");
        v.b();
        throw new KotlinNothingValueException();
    }

    @Override // v0.c, v0.h
    public void d() {
        synchronized (m.C()) {
            p();
            wn.v vVar = wn.v.f59242a;
        }
    }

    @Override // v0.c, v0.h
    public void n() {
        m.b();
    }

    @Override // v0.c, v0.h
    public h v(io.l<Object, wn.v> lVar) {
        return m.t(new c(lVar));
    }
}
