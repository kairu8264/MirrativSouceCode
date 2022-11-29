package tl;

import java.lang.annotation.Annotation;
import tl.d;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f53791a;

    /* renamed from: b  reason: collision with root package name */
    public d.a f53792b = d.a.DEFAULT;

    /* renamed from: tl.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0837a implements d {

        /* renamed from: a  reason: collision with root package name */
        public final int f53793a;

        /* renamed from: b  reason: collision with root package name */
        public final d.a f53794b;

        public C0837a(int i10, d.a aVar) {
            this.f53793a = i10;
            this.f53794b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return this.f53793a == dVar.tag() && this.f53794b.equals(dVar.intEncoding());
            }
            return false;
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (this.f53793a ^ 14552422) + (this.f53794b.hashCode() ^ 2041407134);
        }

        @Override // tl.d
        public d.a intEncoding() {
            return this.f53794b;
        }

        @Override // tl.d
        public int tag() {
            return this.f53793a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f53793a + "intEncoding=" + this.f53794b + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C0837a(this.f53791a, this.f53792b);
    }

    public a c(int i10) {
        this.f53791a = i10;
        return this;
    }
}
