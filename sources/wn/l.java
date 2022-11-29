package wn;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class l<T> implements Serializable {

    /* renamed from: w  reason: collision with root package name */
    public static final a f59224w = new a(null);

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Serializable {

        /* renamed from: w  reason: collision with root package name */
        public final Throwable f59225w;

        public b(Throwable th2) {
            jo.p.h(th2, "exception");
            this.f59225w = th2;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && jo.p.c(this.f59225w, ((b) obj).f59225w);
        }

        public int hashCode() {
            return this.f59225w.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f59225w + ')';
        }
    }

    public static <T> Object a(Object obj) {
        return obj;
    }

    public static final Throwable b(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f59225w;
        }
        return null;
    }

    public static final boolean c(Object obj) {
        return obj instanceof b;
    }

    public static final boolean d(Object obj) {
        return !(obj instanceof b);
    }
}
