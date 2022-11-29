package ai;

/* loaded from: classes3.dex */
public final class vg3 {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f11082a = new byte[256];

    /* renamed from: b  reason: collision with root package name */
    public int f11083b;

    /* renamed from: c  reason: collision with root package name */
    public int f11084c;

    public vg3(byte[] bArr) {
        for (int i10 = 0; i10 < 256; i10++) {
            this.f11082a[i10] = (byte) i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 256; i12++) {
            byte[] bArr2 = this.f11082a;
            byte b10 = bArr2[i12];
            i11 = (i11 + b10 + bArr[i12 % bArr.length]) & 255;
            bArr2[i12] = bArr2[i11];
            bArr2[i11] = b10;
        }
        this.f11083b = 0;
        this.f11084c = 0;
    }

    public final void a(byte[] bArr) {
        int i10 = this.f11083b;
        int i11 = this.f11084c;
        for (int i12 = 0; i12 < 256; i12++) {
            i10 = (i10 + 1) & 255;
            byte[] bArr2 = this.f11082a;
            byte b10 = bArr2[i10];
            i11 = (i11 + b10) & 255;
            bArr2[i10] = bArr2[i11];
            bArr2[i11] = b10;
            bArr[i12] = (byte) (bArr2[(bArr2[i10] + b10) & 255] ^ bArr[i12]);
        }
        this.f11083b = i10;
        this.f11084c = i11;
    }
}
