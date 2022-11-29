package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public class u extends v {

    /* renamed from: f  reason: collision with root package name */
    public final d0 f28220f;

    /* loaded from: classes4.dex */
    public static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: w  reason: collision with root package name */
        public Map.Entry<K, u> f28221w;

        public u a() {
            return this.f28221w.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f28221w.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            u value = this.f28221w.getValue();
            if (value == null) {
                return null;
            }
            return value.f();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof d0) {
                return this.f28221w.getValue().d((d0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        public b(Map.Entry<K, u> entry) {
            this.f28221w = entry;
        }
    }

    /* loaded from: classes4.dex */
    public static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: w  reason: collision with root package name */
        public Iterator<Map.Entry<K, Object>> f28222w;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f28222w = it;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f28222w.next();
            return next.getValue() instanceof u ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f28222w.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f28222w.remove();
        }
    }

    @Override // com.google.protobuf.v
    public boolean equals(Object obj) {
        return f().equals(obj);
    }

    public d0 f() {
        return c(this.f28220f);
    }

    @Override // com.google.protobuf.v
    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return f().toString();
    }
}
