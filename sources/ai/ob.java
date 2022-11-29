package ai;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ob<V> {

    /* renamed from: a  reason: collision with root package name */
    public long[] f7701a = new long[10];

    /* renamed from: b  reason: collision with root package name */
    public V[] f7702b = (V[]) new Object[10];

    /* renamed from: c  reason: collision with root package name */
    public int f7703c;

    /* renamed from: d  reason: collision with root package name */
    public int f7704d;

    public ob(int i10) {
    }

    public final synchronized void a(long j10, V v10) {
        int i10 = this.f7704d;
        if (i10 > 0) {
            if (j10 <= this.f7701a[((this.f7703c + i10) - 1) % this.f7702b.length]) {
                b();
            }
        }
        int length = this.f7702b.length;
        if (this.f7704d >= length) {
            int i11 = length + length;
            long[] jArr = new long[i11];
            V[] vArr = (V[]) new Object[i11];
            int i12 = this.f7703c;
            int i13 = length - i12;
            System.arraycopy(this.f7701a, i12, jArr, 0, i13);
            System.arraycopy(this.f7702b, this.f7703c, vArr, 0, i13);
            int i14 = this.f7703c;
            if (i14 > 0) {
                System.arraycopy(this.f7701a, 0, jArr, i13, i14);
                System.arraycopy(this.f7702b, 0, vArr, i13, this.f7703c);
            }
            this.f7701a = jArr;
            this.f7702b = vArr;
            this.f7703c = 0;
        }
        int i15 = this.f7703c;
        int i16 = this.f7704d;
        V[] vArr2 = this.f7702b;
        int length2 = (i15 + i16) % vArr2.length;
        this.f7701a[length2] = j10;
        vArr2[length2] = v10;
        this.f7704d = i16 + 1;
    }

    public final synchronized void b() {
        this.f7703c = 0;
        this.f7704d = 0;
        Arrays.fill(this.f7702b, (Object) null);
    }

    public final synchronized int c() {
        return this.f7704d;
    }

    public final synchronized V d() {
        if (this.f7704d == 0) {
            return null;
        }
        return f();
    }

    public final synchronized V e(long j10) {
        V v10;
        v10 = null;
        while (this.f7704d > 0 && j10 - this.f7701a[this.f7703c] >= 0) {
            v10 = f();
        }
        return v10;
    }

    public final V f() {
        u9.d(this.f7704d > 0);
        V[] vArr = this.f7702b;
        int i10 = this.f7703c;
        V v10 = vArr[i10];
        vArr[i10] = null;
        this.f7703c = (i10 + 1) % vArr.length;
        this.f7704d--;
        return v10;
    }
}
