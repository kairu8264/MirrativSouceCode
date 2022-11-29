package ai;

import com.google.android.exoplayer2.C;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class is3 {

    /* renamed from: b  reason: collision with root package name */
    public int f5341b;

    /* renamed from: c  reason: collision with root package name */
    public int f5342c;

    /* renamed from: d  reason: collision with root package name */
    public int f5343d = 0;

    /* renamed from: e  reason: collision with root package name */
    public xr3[] f5344e = new xr3[100];

    /* renamed from: a  reason: collision with root package name */
    public final xr3[] f5340a = new xr3[1];

    public is3(boolean z10, int i10) {
    }

    public final synchronized void a() {
        b(0);
    }

    public final synchronized void b(int i10) {
        int i11 = this.f5341b;
        this.f5341b = i10;
        if (i10 < i11) {
            f();
        }
    }

    public final synchronized xr3 c() {
        xr3 xr3Var;
        this.f5342c++;
        int i10 = this.f5343d;
        if (i10 > 0) {
            xr3[] xr3VarArr = this.f5344e;
            int i11 = i10 - 1;
            this.f5343d = i11;
            xr3Var = xr3VarArr[i11];
            Objects.requireNonNull(xr3Var);
            xr3VarArr[i11] = null;
        } else {
            xr3Var = new xr3(new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE], 0);
        }
        return xr3Var;
    }

    public final synchronized void d(xr3 xr3Var) {
        xr3[] xr3VarArr = this.f5340a;
        xr3VarArr[0] = xr3Var;
        e(xr3VarArr);
    }

    public final synchronized void e(xr3[] xr3VarArr) {
        int length = this.f5343d + xr3VarArr.length;
        xr3[] xr3VarArr2 = this.f5344e;
        int length2 = xr3VarArr2.length;
        if (length >= length2) {
            this.f5344e = (xr3[]) Arrays.copyOf(xr3VarArr2, Math.max(length2 + length2, length));
        }
        for (xr3 xr3Var : xr3VarArr) {
            xr3[] xr3VarArr3 = this.f5344e;
            int i10 = this.f5343d;
            this.f5343d = i10 + 1;
            xr3VarArr3[i10] = xr3Var;
        }
        this.f5342c -= xr3VarArr.length;
        notifyAll();
    }

    public final synchronized void f() {
        int max = Math.max(0, sb.b0(this.f5341b, C.DEFAULT_BUFFER_SEGMENT_SIZE) - this.f5342c);
        int i10 = this.f5343d;
        if (max >= i10) {
            return;
        }
        Arrays.fill(this.f5344e, max, i10, (Object) null);
        this.f5343d = max;
    }

    public final synchronized int g() {
        return this.f5342c * C.DEFAULT_BUFFER_SEGMENT_SIZE;
    }
}
