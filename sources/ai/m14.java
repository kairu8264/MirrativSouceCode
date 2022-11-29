package ai;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class m14 {

    /* renamed from: a  reason: collision with root package name */
    public final int f6769a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6770b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6771c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f6772d;

    /* renamed from: e  reason: collision with root package name */
    public int f6773e;

    public m14(int i10, int i11) {
        this.f6769a = i10;
        byte[] bArr = new byte[131];
        this.f6772d = bArr;
        bArr[2] = 1;
    }

    public final void a() {
        this.f6770b = false;
        this.f6771c = false;
    }

    public final boolean b() {
        return this.f6771c;
    }

    public final void c(int i10) {
        u9.d(!this.f6770b);
        boolean z10 = i10 == this.f6769a;
        this.f6770b = z10;
        if (z10) {
            this.f6773e = 3;
            this.f6771c = false;
        }
    }

    public final void d(byte[] bArr, int i10, int i11) {
        if (this.f6770b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f6772d;
            int length = bArr2.length;
            int i13 = this.f6773e + i12;
            if (length < i13) {
                this.f6772d = Arrays.copyOf(bArr2, i13 + i13);
            }
            System.arraycopy(bArr, i10, this.f6772d, this.f6773e, i12);
            this.f6773e += i12;
        }
    }

    public final boolean e(int i10) {
        if (this.f6770b) {
            this.f6773e -= i10;
            this.f6770b = false;
            this.f6771c = true;
            return true;
        }
        return false;
    }
}
