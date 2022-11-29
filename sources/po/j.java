package po;

import xn.j0;

/* loaded from: classes4.dex */
public class j implements Iterable<Long>, ko.a {

    /* renamed from: z  reason: collision with root package name */
    public static final a f48475z = new a(null);

    /* renamed from: w  reason: collision with root package name */
    public final long f48476w;

    /* renamed from: x  reason: collision with root package name */
    public final long f48477x;

    /* renamed from: y  reason: collision with root package name */
    public final long f48478y;

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public j(long j10, long j11, long j12) {
        if (j12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j12 != Long.MIN_VALUE) {
            this.f48476w = j10;
            this.f48477x = p000do.c.d(j10, j11, j12);
            this.f48478y = j12;
            return;
        }
        throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
    }

    public final long k() {
        return this.f48476w;
    }

    public final long m() {
        return this.f48477x;
    }

    @Override // java.lang.Iterable
    /* renamed from: p */
    public j0 iterator() {
        return new k(this.f48476w, this.f48477x, this.f48478y);
    }
}
