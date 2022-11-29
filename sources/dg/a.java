package dg;

import dg.f;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    public final Iterable<cg.i> f29609a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f29610b;

    /* loaded from: classes3.dex */
    public static final class b extends f.a {

        /* renamed from: a  reason: collision with root package name */
        public Iterable<cg.i> f29611a;

        /* renamed from: b  reason: collision with root package name */
        public byte[] f29612b;

        @Override // dg.f.a
        public f a() {
            String str = "";
            if (this.f29611a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new a(this.f29611a, this.f29612b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // dg.f.a
        public f.a b(Iterable<cg.i> iterable) {
            Objects.requireNonNull(iterable, "Null events");
            this.f29611a = iterable;
            return this;
        }

        @Override // dg.f.a
        public f.a c(byte[] bArr) {
            this.f29612b = bArr;
            return this;
        }
    }

    @Override // dg.f
    public Iterable<cg.i> b() {
        return this.f29609a;
    }

    @Override // dg.f
    public byte[] c() {
        return this.f29610b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f29609a.equals(fVar.b())) {
                if (Arrays.equals(this.f29610b, fVar instanceof a ? ((a) fVar).f29610b : fVar.c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f29609a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f29610b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f29609a + ", extras=" + Arrays.toString(this.f29610b) + "}";
    }

    public a(Iterable<cg.i> iterable, byte[] bArr) {
        this.f29609a = iterable;
        this.f29610b = bArr;
    }
}
