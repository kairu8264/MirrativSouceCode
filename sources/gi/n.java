package gi;

import java.lang.annotation.Annotation;

/* loaded from: classes3.dex */
public final class n implements s {

    /* renamed from: a  reason: collision with root package name */
    public final int f33609a;

    /* renamed from: b  reason: collision with root package name */
    public final r f33610b;

    public n(int i10, r rVar) {
        this.f33609a = i10;
        this.f33610b = rVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return s.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            return this.f33609a == sVar.zza() && this.f33610b.equals(sVar.zzb());
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f33609a ^ 14552422) + (this.f33610b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f33609a + "intEncoding=" + this.f33610b + ')';
    }

    @Override // gi.s
    public final int zza() {
        return this.f33609a;
    }

    @Override // gi.s
    public final r zzb() {
        return this.f33610b;
    }
}
