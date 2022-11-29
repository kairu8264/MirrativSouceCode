package ai;

import android.net.Uri;
import com.google.android.exoplayer2.C;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ad0 {

    /* renamed from: h  reason: collision with root package name */
    public static final x2<ad0> f1817h = po.f8485a;

    /* renamed from: a  reason: collision with root package name */
    public final long f1818a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1819b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri[] f1820c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f1821d;

    /* renamed from: e  reason: collision with root package name */
    public final long[] f1822e;

    /* renamed from: f  reason: collision with root package name */
    public final long f1823f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f1824g;

    public ad0(long j10) {
        this(0L, -1, new int[0], new Uri[0], new long[0], 0L, false);
    }

    public final int a(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.f1821d;
            if (i12 >= iArr.length || (i11 = iArr[i12]) == 0 || i11 == 1) {
                break;
            }
            i12++;
        }
        return i12;
    }

    public final ad0 b(int i10) {
        int[] iArr = this.f1821d;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = this.f1822e;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, (long) C.TIME_UNSET);
        return new ad0(0L, 0, copyOf, (Uri[]) Arrays.copyOf(this.f1820c, 0), copyOf2, 0L, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ad0.class == obj.getClass()) {
            ad0 ad0Var = (ad0) obj;
            if (this.f1819b == ad0Var.f1819b && Arrays.equals(this.f1820c, ad0Var.f1820c) && Arrays.equals(this.f1821d, ad0Var.f1821d) && Arrays.equals(this.f1822e, ad0Var.f1822e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f1819b * 961) + Arrays.hashCode(this.f1820c)) * 31) + Arrays.hashCode(this.f1821d)) * 31) + Arrays.hashCode(this.f1822e)) * 961;
    }

    public ad0(long j10, int i10, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
        u9.a(iArr.length == uriArr.length);
        this.f1818a = 0L;
        this.f1819b = i10;
        this.f1821d = iArr;
        this.f1820c = uriArr;
        this.f1822e = jArr;
        this.f1823f = 0L;
        this.f1824g = false;
    }
}
