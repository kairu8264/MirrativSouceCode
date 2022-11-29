package com.google.protobuf;

import com.google.protobuf.t;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class a0<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: x  reason: collision with root package name */
    public static final a0 f28079x;

    /* renamed from: w  reason: collision with root package name */
    public boolean f28080w;

    static {
        a0 a0Var = new a0();
        f28079x = a0Var;
        a0Var.q();
    }

    public a0() {
        this.f28080w = true;
    }

    public static <K, V> int e(Map<K, V> map) {
        int i10 = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            i10 += f(entry.getValue()) ^ f(entry.getKey());
        }
        return i10;
    }

    public static int f(Object obj) {
        if (obj instanceof byte[]) {
            return t.d((byte[]) obj);
        }
        if (!(obj instanceof t.c)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public static void g(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            t.a(obj);
            t.a(map.get(obj));
        }
    }

    public static <K, V> a0<K, V> h() {
        return f28079x;
    }

    public static boolean k(Object obj, Object obj2) {
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        return obj.equals(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <K, V> boolean m(java.util.Map<K, V> r4, java.util.Map<K, V> r5) {
        /*
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            int r1 = r4.size()
            int r2 = r5.size()
            r3 = 0
            if (r1 == r2) goto L10
            return r3
        L10:
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L18:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L42
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            boolean r2 = r5.containsKey(r2)
            if (r2 != 0) goto L2f
            return r3
        L2f:
            java.lang.Object r2 = r1.getValue()
            java.lang.Object r1 = r1.getKey()
            java.lang.Object r1 = r5.get(r1)
            boolean r1 = k(r2, r1)
            if (r1 != 0) goto L18
            return r3
        L42:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.a0.m(java.util.Map, java.util.Map):boolean");
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        i();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && m(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return e(this);
    }

    public final void i() {
        if (!o()) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean o() {
        return this.f28080w;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        i();
        t.a(k10);
        t.a(v10);
        return (V) super.put(k10, v10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        i();
        g(map);
        super.putAll(map);
    }

    public void q() {
        this.f28080w = false;
    }

    public void r(a0<K, V> a0Var) {
        i();
        if (a0Var.isEmpty()) {
            return;
        }
        putAll(a0Var);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        i();
        return (V) super.remove(obj);
    }

    public a0<K, V> s() {
        return isEmpty() ? new a0<>() : new a0<>(this);
    }

    public a0(Map<K, V> map) {
        super(map);
        this.f28080w = true;
    }
}
