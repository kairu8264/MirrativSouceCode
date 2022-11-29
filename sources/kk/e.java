package kk;

import com.google.errorprone.annotations.ForOverride;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public abstract class e<T> {

    /* loaded from: classes3.dex */
    public static final class a extends e<Object> implements Serializable {

        /* renamed from: w  reason: collision with root package name */
        public static final a f38843w = new a();

        @Override // kk.e
        public boolean a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // kk.e
        public int b(Object obj) {
            return obj.hashCode();
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends e<Object> implements Serializable {

        /* renamed from: w  reason: collision with root package name */
        public static final b f38844w = new b();

        @Override // kk.e
        public boolean a(Object obj, Object obj2) {
            return false;
        }

        @Override // kk.e
        public int b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    public static e<Object> c() {
        return a.f38843w;
    }

    public static e<Object> f() {
        return b.f38844w;
    }

    @ForOverride
    public abstract boolean a(T t10, T t11);

    @ForOverride
    public abstract int b(T t10);

    public final boolean d(@NullableDecl T t10, @NullableDecl T t11) {
        if (t10 == t11) {
            return true;
        }
        if (t10 == null || t11 == null) {
            return false;
        }
        return a(t10, t11);
    }

    public final int e(@NullableDecl T t10) {
        if (t10 == null) {
            return 0;
        }
        return b(t10);
    }
}
