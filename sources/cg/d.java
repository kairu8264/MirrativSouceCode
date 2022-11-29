package cg;

import cg.o;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class d extends o {

    /* renamed from: a  reason: collision with root package name */
    public final String f19604a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f19605b;

    /* renamed from: c  reason: collision with root package name */
    public final zf.d f19606c;

    /* loaded from: classes3.dex */
    public static final class b extends o.a {

        /* renamed from: a  reason: collision with root package name */
        public String f19607a;

        /* renamed from: b  reason: collision with root package name */
        public byte[] f19608b;

        /* renamed from: c  reason: collision with root package name */
        public zf.d f19609c;

        @Override // cg.o.a
        public o a() {
            String str = "";
            if (this.f19607a == null) {
                str = " backendName";
            }
            if (this.f19609c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f19607a, this.f19608b, this.f19609c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // cg.o.a
        public o.a b(String str) {
            Objects.requireNonNull(str, "Null backendName");
            this.f19607a = str;
            return this;
        }

        @Override // cg.o.a
        public o.a c(byte[] bArr) {
            this.f19608b = bArr;
            return this;
        }

        @Override // cg.o.a
        public o.a d(zf.d dVar) {
            Objects.requireNonNull(dVar, "Null priority");
            this.f19609c = dVar;
            return this;
        }
    }

    @Override // cg.o
    public String b() {
        return this.f19604a;
    }

    @Override // cg.o
    public byte[] c() {
        return this.f19605b;
    }

    @Override // cg.o
    public zf.d d() {
        return this.f19606c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f19604a.equals(oVar.b())) {
                if (Arrays.equals(this.f19605b, oVar instanceof d ? ((d) oVar).f19605b : oVar.c()) && this.f19606c.equals(oVar.d())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f19604a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f19605b)) * 1000003) ^ this.f19606c.hashCode();
    }

    public d(String str, byte[] bArr, zf.d dVar) {
        this.f19604a = str;
        this.f19605b = bArr;
        this.f19606c = dVar;
    }
}
