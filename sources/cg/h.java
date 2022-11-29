package cg;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final zf.b f19615a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f19616b;

    public h(zf.b bVar, byte[] bArr) {
        Objects.requireNonNull(bVar, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.f19615a = bVar;
        this.f19616b = bArr;
    }

    public byte[] a() {
        return this.f19616b;
    }

    public zf.b b() {
        return this.f19615a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f19615a.equals(hVar.f19615a)) {
                return Arrays.equals(this.f19616b, hVar.f19616b);
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f19615a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f19616b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f19615a + ", bytes=[...]}";
    }
}
