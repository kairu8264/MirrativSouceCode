package ai;

/* loaded from: classes3.dex */
public final class ag3 {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f1847a;

    public ag3(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.f1847a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i11);
    }

    public static ag3 a(byte[] bArr, int i10, int i11) {
        return new ag3(bArr, 0, i11);
    }

    public final byte[] b() {
        byte[] bArr = this.f1847a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}
