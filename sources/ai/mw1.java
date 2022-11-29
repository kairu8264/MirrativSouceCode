package ai;

import com.google.android.gms.internal.ads.zzdd;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class mw1 extends lv1 {

    /* renamed from: i  reason: collision with root package name */
    public int[] f7077i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f7078j;

    @Override // ai.u71
    public final void g(ByteBuffer byteBuffer) {
        int[] iArr = this.f7078j;
        Objects.requireNonNull(iArr);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer h10 = h(((limit - position) / this.f6695b.f10151d) * this.f6696c.f10151d);
        while (position < limit) {
            for (int i10 : iArr) {
                h10.putShort(byteBuffer.getShort(i10 + i10 + position));
            }
            position += this.f6695b.f10151d;
        }
        byteBuffer.position(limit);
        h10.flip();
    }

    @Override // ai.lv1
    public final t51 j(t51 t51Var) throws zzdd {
        int[] iArr = this.f7077i;
        if (iArr == null) {
            return t51.f10147e;
        }
        if (t51Var.f10150c == 2) {
            boolean z10 = t51Var.f10149b != iArr.length;
            int i10 = 0;
            while (true) {
                int length = iArr.length;
                if (i10 >= length) {
                    return z10 ? new t51(t51Var.f10148a, length, 2) : t51.f10147e;
                }
                int i11 = iArr[i10];
                if (i11 >= t51Var.f10149b) {
                    throw new zzdd(t51Var);
                }
                z10 |= i11 != i10;
                i10++;
            }
        } else {
            throw new zzdd(t51Var);
        }
    }

    @Override // ai.lv1
    public final void l() {
        this.f7078j = this.f7077i;
    }

    @Override // ai.lv1
    public final void m() {
        this.f7078j = null;
        this.f7077i = null;
    }

    public final void n(int[] iArr) {
        this.f7077i = iArr;
    }
}
