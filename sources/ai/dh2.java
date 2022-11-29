package ai;

import com.google.android.gms.internal.ads.zzdd;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class dh2 extends lv1 {

    /* renamed from: i  reason: collision with root package name */
    public int f3291i;

    /* renamed from: j  reason: collision with root package name */
    public int f3292j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3293k;

    /* renamed from: l  reason: collision with root package name */
    public int f3294l;

    /* renamed from: m  reason: collision with root package name */
    public byte[] f3295m = sb.f9783f;

    /* renamed from: n  reason: collision with root package name */
    public int f3296n;

    /* renamed from: o  reason: collision with root package name */
    public long f3297o;

    @Override // ai.lv1, ai.u71
    public final boolean a() {
        return super.a() && this.f3296n == 0;
    }

    @Override // ai.lv1, ai.u71
    public final ByteBuffer c() {
        int i10;
        if (super.a() && (i10 = this.f3296n) > 0) {
            h(i10).put(this.f3295m, 0, this.f3296n).flip();
            this.f3296n = 0;
        }
        return super.c();
    }

    @Override // ai.u71
    public final void g(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 == 0) {
            return;
        }
        int min = Math.min(i10, this.f3294l);
        this.f3297o += min / this.f6695b.f10151d;
        this.f3294l -= min;
        byteBuffer.position(position + min);
        if (this.f3294l > 0) {
            return;
        }
        int i11 = i10 - min;
        int length = (this.f3296n + i11) - this.f3295m.length;
        ByteBuffer h10 = h(length);
        int c02 = sb.c0(length, 0, this.f3296n);
        h10.put(this.f3295m, 0, c02);
        int c03 = sb.c0(length - c02, 0, i11);
        byteBuffer.limit(byteBuffer.position() + c03);
        h10.put(byteBuffer);
        byteBuffer.limit(limit);
        int i12 = i11 - c03;
        int i13 = this.f3296n - c02;
        this.f3296n = i13;
        byte[] bArr = this.f3295m;
        System.arraycopy(bArr, c02, bArr, 0, i13);
        byteBuffer.get(this.f3295m, this.f3296n, i12);
        this.f3296n += i12;
        h10.flip();
    }

    @Override // ai.lv1
    public final t51 j(t51 t51Var) throws zzdd {
        if (t51Var.f10150c == 2) {
            this.f3293k = true;
            return (this.f3291i == 0 && this.f3292j == 0) ? t51.f10147e : t51Var;
        }
        throw new zzdd(t51Var);
    }

    @Override // ai.lv1
    public final void k() {
        int i10;
        if (this.f3293k) {
            if (this.f3296n > 0) {
                this.f3297o += i10 / this.f6695b.f10151d;
            }
            this.f3296n = 0;
        }
    }

    @Override // ai.lv1
    public final void l() {
        if (this.f3293k) {
            this.f3293k = false;
            int i10 = this.f3292j;
            int i11 = this.f6695b.f10151d;
            this.f3295m = new byte[i10 * i11];
            this.f3294l = this.f3291i * i11;
        }
        this.f3296n = 0;
    }

    @Override // ai.lv1
    public final void m() {
        this.f3295m = sb.f9783f;
    }

    public final void n(int i10, int i11) {
        this.f3291i = i10;
        this.f3292j = i11;
    }

    public final void o() {
        this.f3297o = 0L;
    }

    public final long p() {
        return this.f3297o;
    }
}
