package v4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import v4.q0;

/* loaded from: classes.dex */
public final class m0 implements z4.k {
    public final Executor A;

    /* renamed from: w  reason: collision with root package name */
    public final z4.k f56640w;

    /* renamed from: x  reason: collision with root package name */
    public final q0.f f56641x;

    /* renamed from: y  reason: collision with root package name */
    public final String f56642y;

    /* renamed from: z  reason: collision with root package name */
    public final List<Object> f56643z = new ArrayList();

    public m0(z4.k kVar, q0.f fVar, String str, Executor executor) {
        this.f56640w = kVar;
        this.f56641x = fVar;
        this.f56642y = str;
        this.A = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f56641x.a(this.f56642y, this.f56643z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f56641x.a(this.f56642y, this.f56643z);
    }

    @Override // z4.k
    public int D() {
        this.A.execute(new Runnable() { // from class: v4.l0
            @Override // java.lang.Runnable
            public final void run() {
                m0.this.e();
            }
        });
        return this.f56640w.D();
    }

    @Override // z4.i
    public void J(int i10, double d10) {
        h(i10, Double.valueOf(d10));
        this.f56640w.J(i10, d10);
    }

    @Override // z4.k
    public long K0() {
        this.A.execute(new Runnable() { // from class: v4.k0
            @Override // java.lang.Runnable
            public final void run() {
                m0.this.d();
            }
        });
        return this.f56640w.K0();
    }

    @Override // z4.i
    public void S0(int i10, String str) {
        h(i10, str);
        this.f56640w.S0(i10, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f56640w.close();
    }

    @Override // z4.i
    public void g1(int i10, long j10) {
        h(i10, Long.valueOf(j10));
        this.f56640w.g1(i10, j10);
    }

    public final void h(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 >= this.f56643z.size()) {
            for (int size = this.f56643z.size(); size <= i11; size++) {
                this.f56643z.add(null);
            }
        }
        this.f56643z.set(i11, obj);
    }

    @Override // z4.i
    public void l1(int i10, byte[] bArr) {
        h(i10, bArr);
        this.f56640w.l1(i10, bArr);
    }

    @Override // z4.i
    public void y1(int i10) {
        h(i10, this.f56643z.toArray());
        this.f56640w.y1(i10);
    }
}
