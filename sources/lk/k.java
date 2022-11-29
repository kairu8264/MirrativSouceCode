package lk;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public class k<K, V> extends AbstractMap<K, V> implements Serializable {
    public transient float A;
    public transient int B;
    public transient int C;
    public transient int D;
    @MonotonicNonNullDecl
    public transient Set<K> E;
    @MonotonicNonNullDecl
    public transient Set<Map.Entry<K, V>> F;
    @MonotonicNonNullDecl
    public transient Collection<V> G;
    @MonotonicNonNullDecl

    /* renamed from: w  reason: collision with root package name */
    public transient int[] f40310w;
    @MonotonicNonNullDecl

    /* renamed from: x  reason: collision with root package name */
    public transient long[] f40311x;
    @MonotonicNonNullDecl

    /* renamed from: y  reason: collision with root package name */
    public transient Object[] f40312y;
    @MonotonicNonNullDecl

    /* renamed from: z  reason: collision with root package name */
    public transient Object[] f40313z;

    /* loaded from: classes3.dex */
    public class a extends k<K, V>.e<K> {
        public a() {
            super(k.this, null);
        }

        @Override // lk.k.e
        public K b(int i10) {
            return (K) k.this.f40312y[i10];
        }
    }

    /* loaded from: classes3.dex */
    public class b extends k<K, V>.e<Map.Entry<K, V>> {
        public b() {
            super(k.this, null);
        }

        @Override // lk.k.e
        /* renamed from: d */
        public Map.Entry<K, V> b(int i10) {
            return new g(i10);
        }
    }

    /* loaded from: classes3.dex */
    public class c extends k<K, V>.e<V> {
        public c() {
            super(k.this, null);
        }

        @Override // lk.k.e
        public V b(int i10) {
            return (V) k.this.f40313z[i10];
        }
    }

    /* loaded from: classes3.dex */
    public class d extends AbstractSet<Map.Entry<K, V>> {
        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int v10 = k.this.v(entry.getKey());
                return v10 != -1 && kk.i.a(k.this.f40313z[v10], entry.getValue());
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return k.this.p();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int v10 = k.this.v(entry.getKey());
                if (v10 == -1 || !kk.i.a(k.this.f40313z[v10], entry.getValue())) {
                    return false;
                }
                k.this.D(v10);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return k.this.D;
        }
    }

    /* loaded from: classes3.dex */
    public class f extends AbstractSet<K> {
        public f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return k.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return k.this.y();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
            int v10 = k.this.v(obj);
            if (v10 == -1) {
                return false;
            }
            k.this.D(v10);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return k.this.D;
        }
    }

    /* loaded from: classes3.dex */
    public final class g extends lk.e<K, V> {
        @NullableDecl

        /* renamed from: w  reason: collision with root package name */
        public final K f40320w;

        /* renamed from: x  reason: collision with root package name */
        public int f40321x;

        public g(int i10) {
            this.f40320w = (K) k.this.f40312y[i10];
            this.f40321x = i10;
        }

        public final void a() {
            int i10 = this.f40321x;
            if (i10 == -1 || i10 >= k.this.size() || !kk.i.a(this.f40320w, k.this.f40312y[this.f40321x])) {
                this.f40321x = k.this.v(this.f40320w);
            }
        }

        @Override // lk.e, java.util.Map.Entry
        public K getKey() {
            return this.f40320w;
        }

        @Override // lk.e, java.util.Map.Entry
        public V getValue() {
            a();
            int i10 = this.f40321x;
            if (i10 == -1) {
                return null;
            }
            return (V) k.this.f40313z[i10];
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            a();
            int i10 = this.f40321x;
            if (i10 == -1) {
                k.this.put(this.f40320w, v10);
                return null;
            }
            Object[] objArr = k.this.f40313z;
            V v11 = (V) objArr[i10];
            objArr[i10] = v10;
            return v11;
        }
    }

    /* loaded from: classes3.dex */
    public class h extends AbstractCollection<V> {
        public h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return k.this.I();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return k.this.D;
        }
    }

    public k() {
        w(3, 1.0f);
    }

    public static long[] A(int i10) {
        long[] jArr = new long[i10];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    public static int[] B(int i10) {
        int[] iArr = new int[i10];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public static long H(long j10, int i10) {
        return (j10 & (-4294967296L)) | (i10 & 4294967295L);
    }

    public static <K, V> k<K, V> i() {
        return new k<>();
    }

    public static <K, V> k<K, V> o(int i10) {
        return new k<>(i10);
    }

    public static int r(long j10) {
        return (int) (j10 >>> 32);
    }

    public static int s(long j10) {
        return (int) j10;
    }

    @NullableDecl
    public final V C(@NullableDecl Object obj, int i10) {
        int u10 = u() & i10;
        int i11 = this.f40310w[u10];
        if (i11 == -1) {
            return null;
        }
        int i12 = -1;
        while (true) {
            if (r(this.f40311x[i11]) == i10 && kk.i.a(obj, this.f40312y[i11])) {
                V v10 = (V) this.f40313z[i11];
                if (i12 == -1) {
                    this.f40310w[u10] = s(this.f40311x[i11]);
                } else {
                    long[] jArr = this.f40311x;
                    jArr[i12] = H(jArr[i12], s(jArr[i11]));
                }
                z(i11);
                this.D--;
                this.B++;
                return v10;
            }
            int s10 = s(this.f40311x[i11]);
            if (s10 == -1) {
                return null;
            }
            i12 = i11;
            i11 = s10;
        }
    }

    @CanIgnoreReturnValue
    public final V D(int i10) {
        return C(this.f40312y[i10], r(this.f40311x[i10]));
    }

    public void E(int i10) {
        this.f40312y = Arrays.copyOf(this.f40312y, i10);
        this.f40313z = Arrays.copyOf(this.f40313z, i10);
        long[] jArr = this.f40311x;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i10);
        if (i10 > length) {
            Arrays.fill(copyOf, length, i10, -1L);
        }
        this.f40311x = copyOf;
    }

    public final void F(int i10) {
        int length = this.f40311x.length;
        if (i10 > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = Integer.MAX_VALUE;
            }
            if (max != length) {
                E(max);
            }
        }
    }

    public final void G(int i10) {
        if (this.f40310w.length >= 1073741824) {
            this.C = Integer.MAX_VALUE;
            return;
        }
        int i11 = ((int) (i10 * this.A)) + 1;
        int[] B = B(i10);
        long[] jArr = this.f40311x;
        int length = B.length - 1;
        for (int i12 = 0; i12 < this.D; i12++) {
            int r10 = r(jArr[i12]);
            int i13 = r10 & length;
            int i14 = B[i13];
            B[i13] = i12;
            jArr[i12] = (r10 << 32) | (i14 & 4294967295L);
        }
        this.C = i11;
        this.f40310w = B;
    }

    public Iterator<V> I() {
        return new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.B++;
        Arrays.fill(this.f40312y, 0, this.D, (Object) null);
        Arrays.fill(this.f40313z, 0, this.D, (Object) null);
        Arrays.fill(this.f40310w, -1);
        Arrays.fill(this.f40311x, -1L);
        this.D = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        return v(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        for (int i10 = 0; i10 < this.D; i10++) {
            if (kk.i.a(obj, this.f40313z[i10])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.F;
        if (set == null) {
            Set<Map.Entry<K, V>> j10 = j();
            this.F = j10;
            return j10;
        }
        return set;
    }

    public void g(int i10) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(@NullableDecl Object obj) {
        int v10 = v(obj);
        g(v10);
        if (v10 == -1) {
            return null;
        }
        return (V) this.f40313z[v10];
    }

    public int h(int i10, int i11) {
        return i10 - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return this.D == 0;
    }

    public Set<Map.Entry<K, V>> j() {
        return new d();
    }

    public Set<K> k() {
        return new f();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.E;
        if (set == null) {
            Set<K> k10 = k();
            this.E = k10;
            return k10;
        }
        return set;
    }

    public Collection<V> m() {
        return new h();
    }

    public Iterator<Map.Entry<K, V>> p() {
        return new b();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @NullableDecl
    public V put(@NullableDecl K k10, @NullableDecl V v10) {
        long[] jArr = this.f40311x;
        Object[] objArr = this.f40312y;
        Object[] objArr2 = this.f40313z;
        int c10 = o.c(k10);
        int u10 = u() & c10;
        int i10 = this.D;
        int[] iArr = this.f40310w;
        int i11 = iArr[u10];
        if (i11 == -1) {
            iArr[u10] = i10;
        } else {
            while (true) {
                long j10 = jArr[i11];
                if (r(j10) == c10 && kk.i.a(k10, objArr[i11])) {
                    V v11 = (V) objArr2[i11];
                    objArr2[i11] = v10;
                    g(i11);
                    return v11;
                }
                int s10 = s(j10);
                if (s10 == -1) {
                    jArr[i11] = H(j10, i10);
                    break;
                }
                i11 = s10;
            }
        }
        if (i10 != Integer.MAX_VALUE) {
            int i12 = i10 + 1;
            F(i12);
            x(i10, k10, v10, c10);
            this.D = i12;
            if (i10 >= this.C) {
                G(this.f40310w.length * 2);
            }
            this.B++;
            return null;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    public int q() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @NullableDecl
    public V remove(@NullableDecl Object obj) {
        return C(obj, o.c(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.D;
    }

    public int t(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.D) {
            return i11;
        }
        return -1;
    }

    public final int u() {
        return this.f40310w.length - 1;
    }

    public final int v(@NullableDecl Object obj) {
        int c10 = o.c(obj);
        int i10 = this.f40310w[u() & c10];
        while (i10 != -1) {
            long j10 = this.f40311x[i10];
            if (r(j10) == c10 && kk.i.a(obj, this.f40312y[i10])) {
                return i10;
            }
            i10 = s(j10);
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.G;
        if (collection == null) {
            Collection<V> m10 = m();
            this.G = m10;
            return m10;
        }
        return collection;
    }

    public void w(int i10, float f10) {
        kk.j.e(i10 >= 0, "Initial capacity must be non-negative");
        kk.j.e(f10 > 0.0f, "Illegal load factor");
        int a10 = o.a(i10, f10);
        this.f40310w = B(a10);
        this.A = f10;
        this.f40312y = new Object[i10];
        this.f40313z = new Object[i10];
        this.f40311x = A(i10);
        this.C = Math.max(1, (int) (a10 * f10));
    }

    public void x(int i10, @NullableDecl K k10, @NullableDecl V v10, int i11) {
        this.f40311x[i10] = (i11 << 32) | 4294967295L;
        this.f40312y[i10] = k10;
        this.f40313z[i10] = v10;
    }

    public Iterator<K> y() {
        return new a();
    }

    public void z(int i10) {
        int size = size() - 1;
        if (i10 < size) {
            Object[] objArr = this.f40312y;
            objArr[i10] = objArr[size];
            Object[] objArr2 = this.f40313z;
            objArr2[i10] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            long[] jArr = this.f40311x;
            long j10 = jArr[size];
            jArr[i10] = j10;
            jArr[size] = -1;
            int r10 = r(j10) & u();
            int[] iArr = this.f40310w;
            int i11 = iArr[r10];
            if (i11 == size) {
                iArr[r10] = i10;
                return;
            }
            while (true) {
                long j11 = this.f40311x[i11];
                int s10 = s(j11);
                if (s10 == size) {
                    this.f40311x[i11] = H(j11, i10);
                    return;
                }
                i11 = s10;
            }
        } else {
            this.f40312y[i10] = null;
            this.f40313z[i10] = null;
            this.f40311x[i10] = -1;
        }
    }

    public k(int i10) {
        this(i10, 1.0f);
    }

    /* loaded from: classes3.dex */
    public abstract class e<T> implements Iterator<T> {

        /* renamed from: w  reason: collision with root package name */
        public int f40315w;

        /* renamed from: x  reason: collision with root package name */
        public int f40316x;

        /* renamed from: y  reason: collision with root package name */
        public int f40317y;

        public e() {
            this.f40315w = k.this.B;
            this.f40316x = k.this.q();
            this.f40317y = -1;
        }

        public final void a() {
            if (k.this.B != this.f40315w) {
                throw new ConcurrentModificationException();
            }
        }

        public abstract T b(int i10);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f40316x >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            if (hasNext()) {
                int i10 = this.f40316x;
                this.f40317y = i10;
                T b10 = b(i10);
                this.f40316x = k.this.t(this.f40316x);
                return b10;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            i.c(this.f40317y >= 0);
            this.f40315w++;
            k.this.D(this.f40317y);
            this.f40316x = k.this.h(this.f40316x, this.f40317y);
            this.f40317y = -1;
        }

        public /* synthetic */ e(k kVar, a aVar) {
            this();
        }
    }

    public k(int i10, float f10) {
        w(i10, f10);
    }
}
