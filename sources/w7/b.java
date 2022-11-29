package w7;

import i8.j;
import o7.u;

/* loaded from: classes.dex */
public class b implements u<byte[]> {

    /* renamed from: w  reason: collision with root package name */
    public final byte[] f58214w;

    public b(byte[] bArr) {
        this.f58214w = (byte[]) j.d(bArr);
    }

    @Override // o7.u
    public int a() {
        return this.f58214w.length;
    }

    @Override // o7.u
    /* renamed from: b */
    public byte[] get() {
        return this.f58214w;
    }

    @Override // o7.u
    public void c() {
    }

    @Override // o7.u
    public Class<byte[]> d() {
        return byte[].class;
    }
}
