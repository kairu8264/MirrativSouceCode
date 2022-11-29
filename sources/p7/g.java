package p7;

/* loaded from: classes.dex */
public final class g implements a<byte[]> {
    @Override // p7.a
    public int a() {
        return 1;
    }

    @Override // p7.a
    /* renamed from: c */
    public int b(byte[] bArr) {
        return bArr.length;
    }

    @Override // p7.a
    /* renamed from: d */
    public byte[] newArray(int i10) {
        return new byte[i10];
    }

    @Override // p7.a
    public String getTag() {
        return "ByteArrayPool";
    }
}
