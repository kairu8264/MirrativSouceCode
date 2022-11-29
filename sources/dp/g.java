package dp;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import io.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jo.p;
import jo.q;
import uo.s;
import wn.v;

/* loaded from: classes4.dex */
public final class g implements f {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29762c = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, TtmlNode.TAG_HEAD);

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f29763d = AtomicLongFieldUpdater.newUpdater(g.class, "deqIdx");

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29764e = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "tail");

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f29765f = AtomicLongFieldUpdater.newUpdater(g.class, "enqIdx");

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f29766g = AtomicIntegerFieldUpdater.newUpdater(g.class, "_availablePermits");
    public volatile /* synthetic */ int _availablePermits;

    /* renamed from: a  reason: collision with root package name */
    public final int f29767a;

    /* renamed from: b  reason: collision with root package name */
    public final l<Throwable, v> f29768b;
    private volatile /* synthetic */ long deqIdx = 0;
    private volatile /* synthetic */ long enqIdx = 0;
    private volatile /* synthetic */ Object head;
    private volatile /* synthetic */ Object tail;

    /* loaded from: classes4.dex */
    public static final class a extends q implements l<Throwable, v> {
        public a() {
            super(1);
        }

        public final void a(Throwable th2) {
            g.this.release();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(Throwable th2) {
            a(th2);
            return v.f59242a;
        }
    }

    public g(int i10, int i11) {
        this.f29767a = i10;
        boolean z10 = true;
        if (!(i10 > 0)) {
            throw new IllegalArgumentException(p.o("Semaphore should have at least 1 permit, but had ", Integer.valueOf(i10)).toString());
        }
        if ((i11 < 0 || i11 > i10) ? false : z10) {
            i iVar = new i(0L, null, 2);
            this.head = iVar;
            this.tail = iVar;
            this._availablePermits = i10 - i11;
            this.f29768b = new a();
            return;
        }
        throw new IllegalArgumentException(p.o("The number of acquired permits should be in 0..", Integer.valueOf(i10)).toString());
    }

    @Override // dp.f
    public Object a(ao.d<? super v> dVar) {
        if (f29766g.getAndDecrement(this) > 0) {
            return v.f59242a;
        }
        Object d10 = d(dVar);
        return d10 == bo.c.c() ? d10 : v.f59242a;
    }

    public final Object d(ao.d<? super v> dVar) {
        uo.q b10 = s.b(bo.b.b(dVar));
        while (true) {
            if (!e(b10)) {
                if (f29766g.getAndDecrement(this) > 0) {
                    b10.R(v.f59242a, this.f29768b);
                    break;
                }
            } else {
                break;
            }
        }
        Object t10 = b10.t();
        if (t10 == bo.c.c()) {
            co.h.c(dVar);
        }
        return t10 == bo.c.c() ? t10 : v.f59242a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0070, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(uo.p<? super wn.v> r15) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dp.g.e(uo.p):boolean");
    }

    public final boolean f(uo.p<? super v> pVar) {
        Object h10 = pVar.h(v.f59242a, null, this.f29768b);
        if (h10 == null) {
            return false;
        }
        pVar.T(h10);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0070, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g() {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dp.g.g():boolean");
    }

    @Override // dp.f
    public void release() {
        while (true) {
            int i10 = this._availablePermits;
            int i11 = this.f29767a;
            if (i10 < i11) {
                if (f29766g.compareAndSet(this, i10, i10 + 1) && (i10 >= 0 || g())) {
                    return;
                }
            } else {
                throw new IllegalStateException(p.o("The number of released permits cannot be greater than ", Integer.valueOf(i11)).toString());
            }
        }
    }
}
