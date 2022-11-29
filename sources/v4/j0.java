package v4;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class j0 implements z4.i {

    /* renamed from: w  reason: collision with root package name */
    public List<Object> f56625w = new ArrayList();

    @Override // z4.i
    public void J(int i10, double d10) {
        c(i10, Double.valueOf(d10));
    }

    @Override // z4.i
    public void S0(int i10, String str) {
        c(i10, str);
    }

    public List<Object> a() {
        return this.f56625w;
    }

    public final void c(int i10, Object obj) {
        int i11 = i10 - 1;
        if (i11 >= this.f56625w.size()) {
            for (int size = this.f56625w.size(); size <= i11; size++) {
                this.f56625w.add(null);
            }
        }
        this.f56625w.set(i11, obj);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // z4.i
    public void g1(int i10, long j10) {
        c(i10, Long.valueOf(j10));
    }

    @Override // z4.i
    public void l1(int i10, byte[] bArr) {
        c(i10, bArr);
    }

    @Override // z4.i
    public void y1(int i10) {
        c(i10, null);
    }
}
