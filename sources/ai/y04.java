package ai;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class y04 {

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f12385e = {0, 0, 1};

    /* renamed from: a  reason: collision with root package name */
    public boolean f12386a;

    /* renamed from: b  reason: collision with root package name */
    public int f12387b;

    /* renamed from: c  reason: collision with root package name */
    public int f12388c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f12389d = new byte[128];

    public y04(int i10) {
    }

    public final void a() {
        this.f12386a = false;
        this.f12387b = 0;
        this.f12388c = 0;
    }

    public final boolean b(int i10, int i11) {
        if (this.f12386a) {
            int i12 = this.f12387b - i11;
            this.f12387b = i12;
            if (this.f12388c != 0 || i10 != 181) {
                this.f12386a = false;
                return true;
            }
            this.f12388c = i12;
        } else if (i10 == 179) {
            this.f12386a = true;
        }
        c(f12385e, 0, 3);
        return false;
    }

    public final void c(byte[] bArr, int i10, int i11) {
        if (this.f12386a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f12389d;
            int length = bArr2.length;
            int i13 = this.f12387b + i12;
            if (length < i13) {
                this.f12389d = Arrays.copyOf(bArr2, i13 + i13);
            }
            System.arraycopy(bArr, i10, this.f12389d, this.f12387b, i12);
            this.f12387b += i12;
        }
    }
}
