package ak;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class w0 extends a4 {

    /* renamed from: a  reason: collision with root package name */
    public final String f13699a;

    /* renamed from: b  reason: collision with root package name */
    public final long f13700b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13701c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f13702d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f13703e;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f13704f;

    public w0(String str, long j10, int i10, boolean z10, boolean z11, byte[] bArr) {
        this.f13699a = str;
        this.f13700b = j10;
        this.f13701c = i10;
        this.f13702d = z10;
        this.f13703e = z11;
        this.f13704f = bArr;
    }

    @Override // ak.a4
    public final int a() {
        return this.f13701c;
    }

    @Override // ak.a4
    public final long b() {
        return this.f13700b;
    }

    @Override // ak.a4
    public final String c() {
        return this.f13699a;
    }

    @Override // ak.a4
    public final boolean d() {
        return this.f13703e;
    }

    @Override // ak.a4
    public final boolean e() {
        return this.f13702d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a4) {
            a4 a4Var = (a4) obj;
            String str = this.f13699a;
            if (str != null ? str.equals(a4Var.c()) : a4Var.c() == null) {
                if (this.f13700b == a4Var.b() && this.f13701c == a4Var.a() && this.f13702d == a4Var.e() && this.f13703e == a4Var.d()) {
                    if (Arrays.equals(this.f13704f, a4Var instanceof w0 ? ((w0) a4Var).f13704f : a4Var.f())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // ak.a4
    public final byte[] f() {
        return this.f13704f;
    }

    public final int hashCode() {
        String str = this.f13699a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f13700b;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f13701c) * 1000003) ^ (true != this.f13702d ? 1237 : 1231)) * 1000003) ^ (true == this.f13703e ? 1231 : 1237)) * 1000003) ^ Arrays.hashCode(this.f13704f);
    }

    public final String toString() {
        String str = this.f13699a;
        long j10 = this.f13700b;
        int i10 = this.f13701c;
        boolean z10 = this.f13702d;
        boolean z11 = this.f13703e;
        String arrays = Arrays.toString(this.f13704f);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 126 + String.valueOf(arrays).length());
        sb2.append("ZipEntry{name=");
        sb2.append(str);
        sb2.append(", size=");
        sb2.append(j10);
        sb2.append(", compressionMethod=");
        sb2.append(i10);
        sb2.append(", isPartial=");
        sb2.append(z10);
        sb2.append(", isEndOfArchive=");
        sb2.append(z11);
        sb2.append(", headerBytes=");
        sb2.append(arrays);
        sb2.append("}");
        return sb2.toString();
    }
}
