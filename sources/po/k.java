package po;

import java.util.NoSuchElementException;
import xn.j0;

/* loaded from: classes4.dex */
public final class k extends j0 {

    /* renamed from: w  reason: collision with root package name */
    public final long f48479w;

    /* renamed from: x  reason: collision with root package name */
    public final long f48480x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f48481y;

    /* renamed from: z  reason: collision with root package name */
    public long f48482z;

    public k(long j10, long j11, long j12) {
        this.f48479w = j12;
        this.f48480x = j11;
        boolean z10 = true;
        if (j12 <= 0 ? j10 < j11 : j10 > j11) {
            z10 = false;
        }
        this.f48481y = z10;
        this.f48482z = z10 ? j10 : j11;
    }

    @Override // xn.j0
    public long b() {
        long j10 = this.f48482z;
        if (j10 == this.f48480x) {
            if (this.f48481y) {
                this.f48481y = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f48482z = this.f48479w + j10;
        }
        return j10;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f48481y;
    }
}
