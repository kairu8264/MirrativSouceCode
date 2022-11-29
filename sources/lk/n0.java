package lk;

import java.util.AbstractMap;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public final class n0<K, V> extends t<K, V> {
    public static final t<Object, Object> D = new n0(null, new Object[0], 0);
    public final transient int[] A;
    public final transient Object[] B;
    public final transient int C;

    /* loaded from: classes3.dex */
    public static class a<K, V> extends v<Map.Entry<K, V>> {
        public final transient int A;
        public final transient int B;

        /* renamed from: y  reason: collision with root package name */
        public final transient t<K, V> f40331y;

        /* renamed from: z  reason: collision with root package name */
        public final transient Object[] f40332z;

        /* renamed from: lk.n0$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0582a extends r<Map.Entry<K, V>> {
            public C0582a() {
            }

            @Override // java.util.List
            /* renamed from: M */
            public Map.Entry<K, V> get(int i10) {
                kk.j.g(i10, a.this.B);
                int i11 = i10 * 2;
                return new AbstractMap.SimpleImmutableEntry(a.this.f40332z[a.this.A + i11], a.this.f40332z[i11 + (a.this.A ^ 1)]);
            }

            @Override // lk.p
            public boolean l() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.B;
            }
        }

        public a(t<K, V> tVar, Object[] objArr, int i10, int i11) {
            this.f40331y = tVar;
            this.f40332z = objArr;
            this.A = i10;
            this.B = i11;
        }

        @Override // lk.p, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                return value != null && value.equals(this.f40331y.get(key));
            }
            return false;
        }

        @Override // lk.p
        public int f(Object[] objArr, int i10) {
            return d().f(objArr, i10);
        }

        @Override // lk.p
        public boolean l() {
            return true;
        }

        @Override // lk.v, lk.p, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: m */
        public v0<Map.Entry<K, V>> iterator() {
            return d().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.B;
        }

        @Override // lk.v
        public r<Map.Entry<K, V>> u() {
            return new C0582a();
        }
    }

    /* loaded from: classes3.dex */
    public static final class b<K> extends v<K> {

        /* renamed from: y  reason: collision with root package name */
        public final transient t<K, ?> f40334y;

        /* renamed from: z  reason: collision with root package name */
        public final transient r<K> f40335z;

        public b(t<K, ?> tVar, r<K> rVar) {
            this.f40334y = tVar;
            this.f40335z = rVar;
        }

        @Override // lk.p, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            return this.f40334y.get(obj) != null;
        }

        @Override // lk.v, lk.p
        public r<K> d() {
            return this.f40335z;
        }

        @Override // lk.p
        public int f(Object[] objArr, int i10) {
            return d().f(objArr, i10);
        }

        @Override // lk.p
        public boolean l() {
            return true;
        }

        @Override // lk.v, lk.p, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: m */
        public v0<K> iterator() {
            return d().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f40334y.size();
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends r<Object> {
        public final transient int A;

        /* renamed from: y  reason: collision with root package name */
        public final transient Object[] f40336y;

        /* renamed from: z  reason: collision with root package name */
        public final transient int f40337z;

        public c(Object[] objArr, int i10, int i11) {
            this.f40336y = objArr;
            this.f40337z = i10;
            this.A = i11;
        }

        @Override // java.util.List
        public Object get(int i10) {
            kk.j.g(i10, this.A);
            return this.f40336y[(i10 * 2) + this.f40337z];
        }

        @Override // lk.p
        public boolean l() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.A;
        }
    }

    public n0(int[] iArr, Object[] objArr, int i10) {
        this.A = iArr;
        this.B = objArr;
        this.C = i10;
    }

    public static <K, V> n0<K, V> q(int i10, Object[] objArr) {
        if (i10 == 0) {
            return (n0) D;
        }
        if (i10 == 1) {
            i.a(objArr[0], objArr[1]);
            return new n0<>(null, objArr, 1);
        }
        kk.j.k(i10, objArr.length >> 1);
        return new n0<>(r(objArr, i10, v.p(i10), 0), objArr, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
        r12[r7] = r5;
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] r(java.lang.Object[] r10, int r11, int r12, int r13) {
        /*
            r0 = 1
            if (r11 != r0) goto Le
            r11 = r10[r13]
            r12 = r13 ^ 1
            r10 = r10[r12]
            lk.i.a(r11, r10)
            r10 = 0
            return r10
        Le:
            int r1 = r12 + (-1)
            int[] r12 = new int[r12]
            r2 = -1
            java.util.Arrays.fill(r12, r2)
            r3 = 0
        L17:
            if (r3 >= r11) goto L77
            int r4 = r3 * 2
            int r5 = r4 + r13
            r6 = r10[r5]
            r7 = r13 ^ 1
            int r4 = r4 + r7
            r4 = r10[r4]
            lk.i.a(r6, r4)
            int r7 = r6.hashCode()
            int r7 = lk.o.b(r7)
        L2f:
            r7 = r7 & r1
            r8 = r12[r7]
            if (r8 != r2) goto L39
            r12[r7] = r5
            int r3 = r3 + 1
            goto L17
        L39:
            r9 = r10[r8]
            boolean r9 = r9.equals(r6)
            if (r9 != 0) goto L44
            int r7 = r7 + 1
            goto L2f
        L44:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Multiple entries with same key: "
            r12.append(r13)
            r12.append(r6)
            java.lang.String r13 = "="
            r12.append(r13)
            r12.append(r4)
            java.lang.String r1 = " and "
            r12.append(r1)
            r1 = r10[r8]
            r12.append(r1)
            r12.append(r13)
            r13 = r8 ^ 1
            r10 = r10[r13]
            r12.append(r10)
            java.lang.String r10 = r12.toString()
            r11.<init>(r10)
            throw r11
        L77:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: lk.n0.r(java.lang.Object[], int, int, int):int[]");
    }

    public static Object s(@NullableDecl int[] iArr, @NullableDecl Object[] objArr, int i10, int i11, @NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        if (i10 == 1) {
            if (objArr[i11].equals(obj)) {
                return objArr[i11 ^ 1];
            }
            return null;
        } else if (iArr == null) {
            return null;
        } else {
            int length = iArr.length - 1;
            int b10 = o.b(obj.hashCode());
            while (true) {
                int i12 = b10 & length;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    return null;
                }
                if (objArr[i13].equals(obj)) {
                    return objArr[i13 ^ 1];
                }
                b10 = i12 + 1;
            }
        }
    }

    @Override // lk.t
    public v<Map.Entry<K, V>> g() {
        return new a(this, this.B, 0, this.C);
    }

    @Override // lk.t, java.util.Map
    @NullableDecl
    public V get(@NullableDecl Object obj) {
        return (V) s(this.A, this.B, this.C, 0, obj);
    }

    @Override // lk.t
    public v<K> h() {
        return new b(this, new c(this.B, 0, this.C));
    }

    @Override // lk.t
    public p<V> i() {
        return new c(this.B, 1, this.C);
    }

    @Override // lk.t
    public boolean k() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.C;
    }
}
