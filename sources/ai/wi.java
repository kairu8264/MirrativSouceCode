package ai;

import com.google.android.exoplayer2.C;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class wi {

    /* renamed from: b  reason: collision with root package name */
    public int f11631b;

    /* renamed from: c  reason: collision with root package name */
    public int f11632c;

    /* renamed from: d  reason: collision with root package name */
    public int f11633d = 0;

    /* renamed from: e  reason: collision with root package name */
    public ri[] f11634e = new ri[100];

    /* renamed from: a  reason: collision with root package name */
    public final ri[] f11630a = new ri[1];

    public wi(boolean z10, int i10) {
    }

    public final synchronized void a() {
        b(0);
    }

    public final synchronized void b(int i10) {
        int i11 = this.f11631b;
        this.f11631b = i10;
        if (i10 < i11) {
            f();
        }
    }

    public final synchronized ri c() {
        ri riVar;
        this.f11632c++;
        int i10 = this.f11633d;
        if (i10 > 0) {
            ri[] riVarArr = this.f11634e;
            int i11 = i10 - 1;
            this.f11633d = i11;
            riVar = riVarArr[i11];
            riVarArr[i11] = null;
        } else {
            riVar = new ri(new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE], 0);
        }
        return riVar;
    }

    public final synchronized void d(ri riVar) {
        ri[] riVarArr = this.f11630a;
        riVarArr[0] = riVar;
        e(riVarArr);
    }

    public final synchronized void e(ri[] riVarArr) {
        int length = this.f11633d + riVarArr.length;
        ri[] riVarArr2 = this.f11634e;
        int length2 = riVarArr2.length;
        if (length >= length2) {
            this.f11634e = (ri[]) Arrays.copyOf(riVarArr2, Math.max(length2 + length2, length));
        }
        for (ri riVar : riVarArr) {
            byte[] bArr = riVar.f9448a;
            ri[] riVarArr3 = this.f11634e;
            int i10 = this.f11633d;
            this.f11633d = i10 + 1;
            riVarArr3[i10] = riVar;
        }
        this.f11632c -= riVarArr.length;
        notifyAll();
    }

    public final synchronized void f() {
        int max = Math.max(0, vj.e(this.f11631b, C.DEFAULT_BUFFER_SEGMENT_SIZE) - this.f11632c);
        int i10 = this.f11633d;
        if (max >= i10) {
            return;
        }
        Arrays.fill(this.f11634e, max, i10, (Object) null);
        this.f11633d = max;
    }

    public final synchronized int g() {
        return this.f11632c * C.DEFAULT_BUFFER_SEGMENT_SIZE;
    }
}
