package lk;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public abstract class f0<K0, V0> {

    /* loaded from: classes3.dex */
    public static class a extends e<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f40302a;

        public a(int i10) {
            this.f40302a = i10;
        }

        @Override // lk.f0.e
        public <K, V> Map<K, Collection<V>> c() {
            return l0.c(this.f40302a);
        }
    }

    /* loaded from: classes3.dex */
    public static class b extends e<K0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Comparator f40303a;

        public b(Comparator comparator) {
            this.f40303a = comparator;
        }

        @Override // lk.f0.e
        public <K extends K0, V> Map<K, Collection<V>> c() {
            return new TreeMap(this.f40303a);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c<V> implements kk.n<List<V>>, Serializable {

        /* renamed from: w  reason: collision with root package name */
        public final int f40304w;

        public c(int i10) {
            this.f40304w = i.b(i10, "expectedValuesPerKey");
        }

        @Override // kk.n
        /* renamed from: a */
        public List<V> get() {
            return new ArrayList(this.f40304w);
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class d<K0, V0> extends f0<K0, V0> {
        public d() {
            super(null);
        }

        public abstract <K extends K0, V extends V0> y<K, V> e();
    }

    /* loaded from: classes3.dex */
    public static abstract class e<K0> {

        /* loaded from: classes3.dex */
        public class a extends d<K0, Object> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f40305a;

            public a(int i10) {
                this.f40305a = i10;
            }

            @Override // lk.f0.d
            public <K extends K0, V> y<K, V> e() {
                return g0.b(e.this.c(), new c(this.f40305a));
            }
        }

        public d<K0, Object> a() {
            return b(2);
        }

        public d<K0, Object> b(int i10) {
            i.b(i10, "expectedValuesPerKey");
            return new a(i10);
        }

        public abstract <K extends K0, V> Map<K, Collection<V>> c();
    }

    public /* synthetic */ f0(a aVar) {
        this();
    }

    public static e<Object> a() {
        return b(8);
    }

    public static e<Object> b(int i10) {
        i.b(i10, "expectedKeys");
        return new a(i10);
    }

    public static e<Comparable> c() {
        return d(k0.c());
    }

    public static <K0> e<K0> d(Comparator<K0> comparator) {
        kk.j.i(comparator);
        return new b(comparator);
    }

    public f0() {
    }
}
