package ai;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class pa {

    /* renamed from: a  reason: collision with root package name */
    public int f8360a;

    /* renamed from: b  reason: collision with root package name */
    public long[] f8361b = new long[32];

    public pa(int i10) {
    }

    public final void a(long j10) {
        int i10 = this.f8360a;
        long[] jArr = this.f8361b;
        if (i10 == jArr.length) {
            this.f8361b = Arrays.copyOf(jArr, i10 + i10);
        }
        long[] jArr2 = this.f8361b;
        int i11 = this.f8360a;
        this.f8360a = i11 + 1;
        jArr2[i11] = j10;
    }

    public final long b(int i10) {
        if (i10 >= 0 && i10 < this.f8360a) {
            return this.f8361b[i10];
        }
        int i11 = this.f8360a;
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append("Invalid index ");
        sb2.append(i10);
        sb2.append(", size is ");
        sb2.append(i11);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public final int c() {
        return this.f8360a;
    }
}
