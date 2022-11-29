package c2;

import g2.k;
import g2.l;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Objects;
import wn.v;

/* loaded from: classes.dex */
public class b<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final l f18795a = k.a();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<K, V> f18796b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashSet<K> f18797c;

    /* renamed from: d  reason: collision with root package name */
    public int f18798d;

    /* renamed from: e  reason: collision with root package name */
    public int f18799e;

    /* renamed from: f  reason: collision with root package name */
    public int f18800f;

    /* renamed from: g  reason: collision with root package name */
    public int f18801g;

    /* renamed from: h  reason: collision with root package name */
    public int f18802h;

    /* renamed from: i  reason: collision with root package name */
    public int f18803i;

    /* renamed from: j  reason: collision with root package name */
    public int f18804j;

    public b(int i10) {
        if (i10 > 0) {
            this.f18799e = i10;
            this.f18796b = new HashMap<>(0, 0.75f);
            this.f18797c = new LinkedHashSet<>();
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    public V b(K k10) {
        return null;
    }

    public void c(boolean z10, K k10, V v10, V v11) {
    }

    public final V d(K k10) {
        synchronized (this.f18795a) {
            V v10 = this.f18796b.get(k10);
            if (v10 != null) {
                this.f18797c.remove(k10);
                this.f18797c.add(k10);
                this.f18803i++;
                return v10;
            }
            this.f18804j++;
            V b10 = b(k10);
            if (b10 == null) {
                return null;
            }
            synchronized (this.f18795a) {
                this.f18801g++;
                V put = this.f18796b.put(k10, b10);
                this.f18797c.remove(k10);
                this.f18797c.add(k10);
                if (put != null) {
                    this.f18796b.put(k10, put);
                    v10 = put;
                } else {
                    this.f18798d = h() + g(k10, b10);
                }
                v vVar = v.f59242a;
            }
            if (v10 != null) {
                c(false, k10, b10, v10);
                return v10;
            }
            j(this.f18799e);
            return b10;
        }
    }

    public final V e(K k10, V v10) {
        V put;
        if (k10 != null && v10 != null) {
            synchronized (this.f18795a) {
                this.f18800f++;
                this.f18798d = h() + g(k10, v10);
                put = this.f18796b.put(k10, v10);
                if (put != null) {
                    this.f18798d = h() - g(k10, put);
                }
                if (this.f18797c.contains(k10)) {
                    this.f18797c.remove(k10);
                }
                this.f18797c.add(k10);
            }
            if (put != null) {
                c(false, k10, put, v10);
            }
            j(this.f18799e);
            return put;
        }
        throw null;
    }

    public final V f(K k10) {
        V remove;
        Objects.requireNonNull(k10);
        synchronized (this.f18795a) {
            remove = this.f18796b.remove(k10);
            this.f18797c.remove(k10);
            if (remove != null) {
                this.f18798d = h() - g(k10, remove);
            }
            v vVar = v.f59242a;
        }
        if (remove != null) {
            c(false, k10, remove, null);
        }
        return remove;
    }

    public final int g(K k10, V v10) {
        int i10 = i(k10, v10);
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalStateException(("Negative size: " + k10 + '=' + v10).toString());
    }

    public final int h() {
        int i10;
        synchronized (this.f18795a) {
            i10 = this.f18798d;
        }
        return i10;
    }

    public int i(K k10, V v10) {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(int r8) {
        /*
            r7 = this;
        L0:
            g2.l r0 = r7.f18795a
            monitor-enter(r0)
            int r1 = r7.h()     // Catch: java.lang.Throwable -> L91
            if (r1 < 0) goto L89
            java.util.HashMap<K, V> r1 = r7.f18796b     // Catch: java.lang.Throwable -> L91
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L91
            if (r1 == 0) goto L17
            int r1 = r7.h()     // Catch: java.lang.Throwable -> L91
            if (r1 != 0) goto L89
        L17:
            java.util.HashMap<K, V> r1 = r7.f18796b     // Catch: java.lang.Throwable -> L91
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L91
            java.util.LinkedHashSet<K> r2 = r7.f18797c     // Catch: java.lang.Throwable -> L91
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L91
            if (r1 != r2) goto L89
            int r1 = r7.h()     // Catch: java.lang.Throwable -> L91
            r2 = 1
            r3 = 0
            if (r1 <= r8) goto L74
            java.util.HashMap<K, V> r1 = r7.f18796b     // Catch: java.lang.Throwable -> L91
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L91
            if (r1 != 0) goto L74
            java.util.LinkedHashSet<K> r1 = r7.f18797c     // Catch: java.lang.Throwable -> L91
            java.lang.Object r1 = xn.a0.W(r1)     // Catch: java.lang.Throwable -> L91
            java.util.HashMap<K, V> r4 = r7.f18796b     // Catch: java.lang.Throwable -> L91
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L91
            if (r4 == 0) goto L6c
            java.util.HashMap<K, V> r5 = r7.f18796b     // Catch: java.lang.Throwable -> L91
            java.util.Map r5 = jo.j0.d(r5)     // Catch: java.lang.Throwable -> L91
            r5.remove(r1)     // Catch: java.lang.Throwable -> L91
            java.util.LinkedHashSet<K> r5 = r7.f18797c     // Catch: java.lang.Throwable -> L91
            java.util.Collection r5 = jo.j0.a(r5)     // Catch: java.lang.Throwable -> L91
            r5.remove(r1)     // Catch: java.lang.Throwable -> L91
            int r5 = r7.h()     // Catch: java.lang.Throwable -> L91
            jo.p.e(r1)     // Catch: java.lang.Throwable -> L91
            jo.p.e(r4)     // Catch: java.lang.Throwable -> L91
            int r6 = r7.g(r1, r4)     // Catch: java.lang.Throwable -> L91
            int r5 = r5 - r6
            r7.f18798d = r5     // Catch: java.lang.Throwable -> L91
            int r5 = r7.f18802h     // Catch: java.lang.Throwable -> L91
            int r5 = r5 + r2
            r7.f18802h = r5     // Catch: java.lang.Throwable -> L91
            goto L76
        L6c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L91
            java.lang.String r1 = "inconsistent state"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L91
            throw r8     // Catch: java.lang.Throwable -> L91
        L74:
            r1 = r3
            r4 = r1
        L76:
            wn.v r5 = wn.v.f59242a     // Catch: java.lang.Throwable -> L91
            monitor-exit(r0)
            if (r1 != 0) goto L7e
            if (r4 != 0) goto L7e
            return
        L7e:
            jo.p.e(r1)
            jo.p.e(r4)
            r7.c(r2, r1, r4, r3)
            goto L0
        L89:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L91
            java.lang.String r1 = "map/keySet size inconsistency"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L91
            throw r8     // Catch: java.lang.Throwable -> L91
        L91:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.b.j(int):void");
    }

    public String toString() {
        String str;
        synchronized (this.f18795a) {
            int i10 = this.f18803i;
            int i11 = this.f18804j + i10;
            str = "LruCache[maxSize=" + this.f18799e + ",hits=" + this.f18803i + ",misses=" + this.f18804j + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
        }
        return str;
    }
}
