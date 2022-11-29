package cl;

import cl.a0;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class f extends a0.d.b {

    /* renamed from: a  reason: collision with root package name */
    public final String f19833a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f19834b;

    /* loaded from: classes4.dex */
    public static final class b extends a0.d.b.a {

        /* renamed from: a  reason: collision with root package name */
        public String f19835a;

        /* renamed from: b  reason: collision with root package name */
        public byte[] f19836b;

        @Override // cl.a0.d.b.a
        public a0.d.b a() {
            String str = "";
            if (this.f19835a == null) {
                str = " filename";
            }
            if (this.f19836b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new f(this.f19835a, this.f19836b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // cl.a0.d.b.a
        public a0.d.b.a b(byte[] bArr) {
            Objects.requireNonNull(bArr, "Null contents");
            this.f19836b = bArr;
            return this;
        }

        @Override // cl.a0.d.b.a
        public a0.d.b.a c(String str) {
            Objects.requireNonNull(str, "Null filename");
            this.f19835a = str;
            return this;
        }
    }

    @Override // cl.a0.d.b
    public byte[] b() {
        return this.f19834b;
    }

    @Override // cl.a0.d.b
    public String c() {
        return this.f19833a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.d.b) {
            a0.d.b bVar = (a0.d.b) obj;
            if (this.f19833a.equals(bVar.c())) {
                if (Arrays.equals(this.f19834b, bVar instanceof f ? ((f) bVar).f19834b : bVar.b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f19833a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f19834b);
    }

    public String toString() {
        return "File{filename=" + this.f19833a + ", contents=" + Arrays.toString(this.f19834b) + "}";
    }

    public f(String str, byte[] bArr) {
        this.f19833a = str;
        this.f19834b = bArr;
    }
}
