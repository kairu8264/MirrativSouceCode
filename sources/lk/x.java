package lk;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public final class x {

    /* loaded from: classes3.dex */
    public static class a extends v0<T> {

        /* renamed from: w  reason: collision with root package name */
        public boolean f40380w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Object f40381x;

        public a(Object obj) {
            this.f40381x = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f40380w;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
        @Override // java.util.Iterator
        public T next() {
            if (!this.f40380w) {
                this.f40380w = true;
                return this.f40381x;
            }
            throw new NoSuchElementException();
        }
    }

    /* loaded from: classes3.dex */
    public static final class b<T> extends lk.a<T> {
        public static final w0<Object> A = new b(new Object[0], 0, 0, 0);

        /* renamed from: y  reason: collision with root package name */
        public final T[] f40382y;

        /* renamed from: z  reason: collision with root package name */
        public final int f40383z;

        public b(T[] tArr, int i10, int i11, int i12) {
            super(i11, i12);
            this.f40382y = tArr;
            this.f40383z = i10;
        }

        @Override // lk.a
        public T a(int i10) {
            return this.f40382y[this.f40383z + i10];
        }
    }

    /* loaded from: classes3.dex */
    public enum c implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            i.c(false);
        }
    }

    @CanIgnoreReturnValue
    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        kk.j.i(collection);
        kk.j.i(it);
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= collection.add(it.next());
        }
        return z10;
    }

    public static void b(Iterator<?> it) {
        kk.j.i(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0006  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(java.util.Iterator<?> r3, java.util.Iterator<?> r4) {
        /*
        L0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1d
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            boolean r0 = kk.i.a(r0, r2)
            if (r0 != 0) goto L0
            return r1
        L1d:
            boolean r3 = r4.hasNext()
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: lk.x.c(java.util.Iterator, java.util.Iterator):boolean");
    }

    public static <T> v0<T> d() {
        return e();
    }

    public static <T> w0<T> e() {
        return (w0<T>) b.A;
    }

    public static <T> Iterator<T> f() {
        return c.INSTANCE;
    }

    public static <T> T g(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    @NullableDecl
    public static <T> T h(Iterator<? extends T> it, @NullableDecl T t10) {
        return it.hasNext() ? it.next() : t10;
    }

    @NullableDecl
    public static <T> T i(Iterator<T> it) {
        if (it.hasNext()) {
            T next = it.next();
            it.remove();
            return next;
        }
        return null;
    }

    @CanIgnoreReturnValue
    public static boolean j(Iterator<?> it, Collection<?> collection) {
        kk.j.i(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> v0<T> k(@NullableDecl T t10) {
        return new a(t10);
    }

    public static String l(Iterator<?> it) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        boolean z10 = true;
        while (it.hasNext()) {
            if (!z10) {
                sb2.append(", ");
            }
            z10 = false;
            sb2.append(it.next());
        }
        sb2.append(']');
        return sb2.toString();
    }
}
