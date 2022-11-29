package ai;

import com.google.android.gms.internal.ads.zzaoa;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class rd implements bd {

    /* renamed from: b  reason: collision with root package name */
    public int f9400b;

    /* renamed from: c  reason: collision with root package name */
    public int f9401c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f9402d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9403e;

    /* renamed from: f  reason: collision with root package name */
    public int[] f9404f;

    /* renamed from: g  reason: collision with root package name */
    public ByteBuffer f9405g;

    /* renamed from: h  reason: collision with root package name */
    public ByteBuffer f9406h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f9407i;

    public rd() {
        ByteBuffer byteBuffer = bd.f2291a;
        this.f9405g = byteBuffer;
        this.f9406h = byteBuffer;
        this.f9400b = -1;
        this.f9401c = -1;
    }

    @Override // ai.bd
    public final void a() {
        this.f9407i = true;
    }

    @Override // ai.bd
    public final int b() {
        int[] iArr = this.f9404f;
        return iArr == null ? this.f9400b : iArr.length;
    }

    @Override // ai.bd
    public final void c(ByteBuffer byteBuffer) {
        int[] iArr;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = this.f9400b;
        int length = ((limit - position) / (i10 + i10)) * this.f9404f.length;
        int i11 = length + length;
        if (this.f9405g.capacity() < i11) {
            this.f9405g = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
        } else {
            this.f9405g.clear();
        }
        while (position < limit) {
            for (int i12 : this.f9404f) {
                this.f9405g.putShort(byteBuffer.getShort(i12 + i12 + position));
            }
            int i13 = this.f9400b;
            position += i13 + i13;
        }
        byteBuffer.position(limit);
        this.f9405g.flip();
        this.f9406h = this.f9405g;
    }

    @Override // ai.bd
    public final int d() {
        return 2;
    }

    @Override // ai.bd
    public final boolean e() {
        return this.f9407i && this.f9406h == bd.f2291a;
    }

    @Override // ai.bd
    public final ByteBuffer f() {
        ByteBuffer byteBuffer = this.f9406h;
        this.f9406h = bd.f2291a;
        return byteBuffer;
    }

    @Override // ai.bd
    public final void g() {
        h();
        this.f9405g = bd.f2291a;
        this.f9400b = -1;
        this.f9401c = -1;
        this.f9404f = null;
        this.f9403e = false;
    }

    @Override // ai.bd
    public final void h() {
        this.f9406h = bd.f2291a;
        this.f9407i = false;
    }

    @Override // ai.bd
    public final boolean i(int i10, int i11, int i12) throws zzaoa {
        boolean z10 = !Arrays.equals(this.f9402d, this.f9404f);
        int[] iArr = this.f9402d;
        this.f9404f = iArr;
        if (iArr == null) {
            this.f9403e = false;
            return z10;
        } else if (i12 == 2) {
            if (!z10 && this.f9401c == i10 && this.f9400b == i11) {
                return false;
            }
            this.f9401c = i10;
            this.f9400b = i11;
            this.f9403e = i11 != iArr.length;
            int i13 = 0;
            while (true) {
                int[] iArr2 = this.f9404f;
                if (i13 >= iArr2.length) {
                    return true;
                }
                int i14 = iArr2[i13];
                if (i14 < i11) {
                    this.f9403e = (i14 != i13) | this.f9403e;
                    i13++;
                } else {
                    throw new zzaoa(i10, i11, 2);
                }
            }
        } else {
            throw new zzaoa(i10, i11, i12);
        }
    }

    public final void j(int[] iArr) {
        this.f9402d = iArr;
    }

    @Override // ai.bd
    public final boolean zzb() {
        return this.f9403e;
    }
}
