package lk;

import com.google.android.exoplayer2.C;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.j2objc.annotations.Weak;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import lk.b0.h;
import lk.b0.m;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public class b0<K, V, E extends h<K, V, E>, S extends m<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
    public static final z<Object, Object, d> F = new a();
    public final kk.e<Object> A;
    public final transient i<K, V, E, S> B;
    @MonotonicNonNullDecl
    public transient Set<K> C;
    @MonotonicNonNullDecl
    public transient Collection<V> D;
    @MonotonicNonNullDecl
    public transient Set<Map.Entry<K, V>> E;

    /* renamed from: w  reason: collision with root package name */
    public final transient int f40236w;

    /* renamed from: x  reason: collision with root package name */
    public final transient int f40237x;

    /* renamed from: y  reason: collision with root package name */
    public final transient m<K, V, E, S>[] f40238y;

    /* renamed from: z  reason: collision with root package name */
    public final int f40239z;

    /* loaded from: classes3.dex */
    public static class a implements z<Object, Object, d> {
        @Override // lk.b0.z
        /* renamed from: c */
        public z<Object, Object, d> b(ReferenceQueue<Object> referenceQueue, d dVar) {
            return this;
        }

        @Override // lk.b0.z
        public void clear() {
        }

        @Override // lk.b0.z
        /* renamed from: d */
        public d a() {
            return null;
        }

        @Override // lk.b0.z
        public Object get() {
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public static final class a0<K, V, E extends h<K, V, E>> extends WeakReference<V> implements z<K, V, E> {
        @Weak

        /* renamed from: a  reason: collision with root package name */
        public final E f40240a;

        public a0(ReferenceQueue<V> referenceQueue, V v10, E e10) {
            super(v10, referenceQueue);
            this.f40240a = e10;
        }

        @Override // lk.b0.z
        public E a() {
            return this.f40240a;
        }

        @Override // lk.b0.z
        public z<K, V, E> b(ReferenceQueue<V> referenceQueue, E e10) {
            return new a0(referenceQueue, get(), e10);
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class b<K, V, E extends h<K, V, E>> implements h<K, V, E> {

        /* renamed from: a  reason: collision with root package name */
        public final K f40241a;

        /* renamed from: b  reason: collision with root package name */
        public final int f40242b;
        @NullableDecl

        /* renamed from: c  reason: collision with root package name */
        public final E f40243c;

        public b(K k10, int i10, @NullableDecl E e10) {
            this.f40241a = k10;
            this.f40242b = i10;
            this.f40243c = e10;
        }

        @Override // lk.b0.h
        public int b() {
            return this.f40242b;
        }

        @Override // lk.b0.h
        public E e() {
            return this.f40243c;
        }

        @Override // lk.b0.h
        public K getKey() {
            return this.f40241a;
        }
    }

    /* renamed from: lk.b0$b0  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public final class C0579b0 extends lk.e<K, V> {

        /* renamed from: w  reason: collision with root package name */
        public final K f40244w;

        /* renamed from: x  reason: collision with root package name */
        public V f40245x;

        public C0579b0(K k10, V v10) {
            this.f40244w = k10;
            this.f40245x = v10;
        }

        @Override // lk.e, java.util.Map.Entry
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return this.f40244w.equals(entry.getKey()) && this.f40245x.equals(entry.getValue());
            }
            return false;
        }

        @Override // lk.e, java.util.Map.Entry
        public K getKey() {
            return this.f40244w;
        }

        @Override // lk.e, java.util.Map.Entry
        public V getValue() {
            return this.f40245x;
        }

        @Override // lk.e, java.util.Map.Entry
        public int hashCode() {
            return this.f40244w.hashCode() ^ this.f40245x.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = (V) b0.this.put(this.f40244w, v10);
            this.f40245x = v10;
            return v11;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class c<K, V, E extends h<K, V, E>> extends WeakReference<K> implements h<K, V, E> {

        /* renamed from: a  reason: collision with root package name */
        public final int f40247a;
        @NullableDecl

        /* renamed from: b  reason: collision with root package name */
        public final E f40248b;

        public c(ReferenceQueue<K> referenceQueue, K k10, int i10, @NullableDecl E e10) {
            super(k10, referenceQueue);
            this.f40247a = i10;
            this.f40248b = e10;
        }

        @Override // lk.b0.h
        public int b() {
            return this.f40247a;
        }

        @Override // lk.b0.h
        public E e() {
            return this.f40248b;
        }

        @Override // lk.b0.h
        public K getKey() {
            return get();
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements h<Object, Object, d> {
        public d() {
            throw new AssertionError();
        }

        @Override // lk.b0.h
        public int b() {
            throw new AssertionError();
        }

        @Override // lk.b0.h
        /* renamed from: c */
        public d e() {
            throw new AssertionError();
        }

        @Override // lk.b0.h
        public Object getKey() {
            throw new AssertionError();
        }

        @Override // lk.b0.h
        public Object getValue() {
            throw new AssertionError();
        }
    }

    /* loaded from: classes3.dex */
    public final class e extends b0<K, V, E, S>.g<Map.Entry<K, V>> {
        public e() {
            super();
        }

        @Override // java.util.Iterator
        /* renamed from: g */
        public Map.Entry<K, V> next() {
            return d();
        }
    }

    /* loaded from: classes3.dex */
    public final class f extends l<Map.Entry<K, V>> {
        public f() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            b0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (obj2 = b0.this.get(key)) != null && b0.this.r().d(entry.getValue(), obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return b0.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && b0.this.remove(key, entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return b0.this.size();
        }
    }

    /* loaded from: classes3.dex */
    public abstract class g<T> implements Iterator<T> {
        @NullableDecl
        public E A;
        @NullableDecl
        public b0<K, V, E, S>.C0579b0 B;
        @NullableDecl
        public b0<K, V, E, S>.C0579b0 C;

        /* renamed from: w  reason: collision with root package name */
        public int f40250w;

        /* renamed from: x  reason: collision with root package name */
        public int f40251x = -1;
        @MonotonicNonNullDecl

        /* renamed from: y  reason: collision with root package name */
        public m<K, V, E, S> f40252y;
        @MonotonicNonNullDecl

        /* renamed from: z  reason: collision with root package name */
        public AtomicReferenceArray<E> f40253z;

        public g() {
            this.f40250w = b0.this.f40238y.length - 1;
            a();
        }

        public final void a() {
            this.B = null;
            if (e() || f()) {
                return;
            }
            while (true) {
                int i10 = this.f40250w;
                if (i10 < 0) {
                    return;
                }
                m<K, V, E, S>[] mVarArr = b0.this.f40238y;
                this.f40250w = i10 - 1;
                m<K, V, E, S> mVar = mVarArr[i10];
                this.f40252y = mVar;
                if (mVar.f40256x != 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f40252y.A;
                    this.f40253z = atomicReferenceArray;
                    this.f40251x = atomicReferenceArray.length() - 1;
                    if (f()) {
                        return;
                    }
                }
            }
        }

        public boolean b(E e10) {
            boolean z10;
            try {
                Object key = e10.getKey();
                Object g10 = b0.this.g(e10);
                if (g10 != null) {
                    this.B = new C0579b0(key, g10);
                    z10 = true;
                } else {
                    z10 = false;
                }
                return z10;
            } finally {
                this.f40252y.r();
            }
        }

        public b0<K, V, E, S>.C0579b0 d() {
            b0<K, V, E, S>.C0579b0 c0579b0 = this.B;
            if (c0579b0 != null) {
                this.C = c0579b0;
                a();
                return this.C;
            }
            throw new NoSuchElementException();
        }

        public boolean e() {
            E e10 = this.A;
            if (e10 == null) {
                return false;
            }
            while (true) {
                this.A = (E) e10.e();
                E e11 = this.A;
                if (e11 == null) {
                    return false;
                }
                if (b(e11)) {
                    return true;
                }
                e10 = this.A;
            }
        }

        public boolean f() {
            while (true) {
                int i10 = this.f40251x;
                if (i10 < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f40253z;
                this.f40251x = i10 - 1;
                E e10 = atomicReferenceArray.get(i10);
                this.A = e10;
                if (e10 != null && (b(e10) || e())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.B != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            lk.i.c(this.C != null);
            b0.this.remove(this.C.getKey());
            this.C = null;
        }
    }

    /* loaded from: classes3.dex */
    public interface h<K, V, E extends h<K, V, E>> {
        int b();

        E e();

        K getKey();

        V getValue();
    }

    /* loaded from: classes3.dex */
    public interface i<K, V, E extends h<K, V, E>, S extends m<K, V, E, S>> {
        n a();

        E b(S s10, E e10, @NullableDecl E e11);

        void c(S s10, E e10, V v10);

        S d(b0<K, V, E, S> b0Var, int i10, int i11);

        E e(S s10, K k10, int i10, @NullableDecl E e10);
    }

    /* loaded from: classes3.dex */
    public final class j extends b0<K, V, E, S>.g<K> {
        public j() {
            super();
        }

        @Override // java.util.Iterator
        public K next() {
            return d().getKey();
        }
    }

    /* loaded from: classes3.dex */
    public final class k extends l<K> {
        public k() {
            super(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            b0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return b0.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return b0.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return b0.this.remove(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return b0.this.size();
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class l<E> extends AbstractSet<E> {
        public l() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return b0.p(this).toArray();
        }

        public /* synthetic */ l(a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) b0.p(this).toArray(tArr);
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class m<K, V, E extends h<K, V, E>, S extends m<K, V, E, S>> extends ReentrantLock {
        @MonotonicNonNullDecl
        public volatile AtomicReferenceArray<E> A;
        public final int B;
        public final AtomicInteger C = new AtomicInteger();
        @Weak

        /* renamed from: w  reason: collision with root package name */
        public final b0<K, V, E, S> f40255w;

        /* renamed from: x  reason: collision with root package name */
        public volatile int f40256x;

        /* renamed from: y  reason: collision with root package name */
        public int f40257y;

        /* renamed from: z  reason: collision with root package name */
        public int f40258z;

        public m(b0<K, V, E, S> b0Var, int i10, int i11) {
            this.f40255w = b0Var;
            this.B = i11;
            m(q(i10));
        }

        public static <K, V, E extends h<K, V, E>> boolean n(E e10) {
            return e10.getValue() == null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean A(K k10, int i10, V v10, V v11) {
            lock();
            try {
                s();
                AtomicReferenceArray<E> atomicReferenceArray = this.A;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                for (h hVar = e10; hVar != null; hVar = hVar.e()) {
                    Object key = hVar.getKey();
                    if (hVar.b() == i10 && key != null && this.f40255w.A.d(k10, key)) {
                        Object value = hVar.getValue();
                        if (value == null) {
                            if (n(hVar)) {
                                this.f40257y++;
                                atomicReferenceArray.set(length, y(e10, hVar));
                                this.f40256x--;
                            }
                            return false;
                        } else if (this.f40255w.r().d(v10, value)) {
                            this.f40257y++;
                            E(hVar, v11);
                            return true;
                        } else {
                            return false;
                        }
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        public void B() {
            C();
        }

        public void C() {
            if (tryLock()) {
                try {
                    p();
                    this.C.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public abstract S D();

        public void E(E e10, V v10) {
            this.f40255w.B.c(D(), e10, v10);
        }

        public void F() {
            if (tryLock()) {
                try {
                    p();
                } finally {
                    unlock();
                }
            }
        }

        public void a() {
            if (this.f40256x != 0) {
                lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = this.A;
                    for (int i10 = 0; i10 < atomicReferenceArray.length(); i10++) {
                        atomicReferenceArray.set(i10, null);
                    }
                    o();
                    this.C.set(0);
                    this.f40257y++;
                    this.f40256x = 0;
                } finally {
                    unlock();
                }
            }
        }

        public <T> void b(ReferenceQueue<T> referenceQueue) {
            do {
            } while (referenceQueue.poll() != null);
        }

        public boolean c(Object obj, int i10) {
            try {
                boolean z10 = false;
                if (this.f40256x != 0) {
                    E k10 = k(obj, i10);
                    if (k10 != null) {
                        if (k10.getValue() != null) {
                            z10 = true;
                        }
                    }
                    return z10;
                }
                return false;
            } finally {
                r();
            }
        }

        public E d(E e10, E e11) {
            return this.f40255w.B.b(D(), e10, e11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @GuardedBy("this")
        public void e(ReferenceQueue<K> referenceQueue) {
            int i10 = 0;
            do {
                Reference<? extends K> poll = referenceQueue.poll();
                if (poll == null) {
                    return;
                }
                this.f40255w.j((h) poll);
                i10++;
            } while (i10 != 16);
        }

        @GuardedBy("this")
        public void f(ReferenceQueue<V> referenceQueue) {
            int i10 = 0;
            do {
                Reference<? extends V> poll = referenceQueue.poll();
                if (poll == null) {
                    return;
                }
                this.f40255w.k((z) poll);
                i10++;
            } while (i10 != 16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @GuardedBy("this")
        public void g() {
            AtomicReferenceArray<E> atomicReferenceArray = this.A;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i10 = this.f40256x;
            AtomicReferenceArray<E> atomicReferenceArray2 = (AtomicReferenceArray<E>) q(length << 1);
            this.f40258z = (atomicReferenceArray2.length() * 3) / 4;
            int length2 = atomicReferenceArray2.length() - 1;
            for (int i11 = 0; i11 < length; i11++) {
                E e10 = atomicReferenceArray.get(i11);
                if (e10 != null) {
                    h e11 = e10.e();
                    int b10 = e10.b() & length2;
                    if (e11 == null) {
                        atomicReferenceArray2.set(b10, e10);
                    } else {
                        h hVar = e10;
                        while (e11 != null) {
                            int b11 = e11.b() & length2;
                            if (b11 != b10) {
                                hVar = e11;
                                b10 = b11;
                            }
                            e11 = e11.e();
                        }
                        atomicReferenceArray2.set(b10, hVar);
                        while (e10 != hVar) {
                            int b12 = e10.b() & length2;
                            h d10 = d(e10, (h) atomicReferenceArray2.get(b12));
                            if (d10 != null) {
                                atomicReferenceArray2.set(b12, d10);
                            } else {
                                i10--;
                            }
                            e10 = e10.e();
                        }
                    }
                }
            }
            this.A = atomicReferenceArray2;
            this.f40256x = i10;
        }

        public V h(Object obj, int i10) {
            try {
                E k10 = k(obj, i10);
                if (k10 == null) {
                    return null;
                }
                V v10 = (V) k10.getValue();
                if (v10 == null) {
                    F();
                }
                return v10;
            } finally {
                r();
            }
        }

        public E i(Object obj, int i10) {
            if (this.f40256x != 0) {
                for (E j10 = j(i10); j10 != null; j10 = (E) j10.e()) {
                    if (j10.b() == i10) {
                        Object key = j10.getKey();
                        if (key == null) {
                            F();
                        } else if (this.f40255w.A.d(obj, key)) {
                            return j10;
                        }
                    }
                }
                return null;
            }
            return null;
        }

        public E j(int i10) {
            AtomicReferenceArray<E> atomicReferenceArray = this.A;
            return atomicReferenceArray.get(i10 & (atomicReferenceArray.length() - 1));
        }

        public E k(Object obj, int i10) {
            return i(obj, i10);
        }

        @NullableDecl
        public V l(E e10) {
            if (e10.getKey() == null) {
                F();
                return null;
            }
            V v10 = (V) e10.getValue();
            if (v10 == null) {
                F();
                return null;
            }
            return v10;
        }

        public void m(AtomicReferenceArray<E> atomicReferenceArray) {
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.f40258z = length;
            if (length == this.B) {
                this.f40258z = length + 1;
            }
            this.A = atomicReferenceArray;
        }

        public void o() {
        }

        @GuardedBy("this")
        public void p() {
        }

        public AtomicReferenceArray<E> q(int i10) {
            return new AtomicReferenceArray<>(i10);
        }

        public void r() {
            if ((this.C.incrementAndGet() & 63) == 0) {
                B();
            }
        }

        @GuardedBy("this")
        public void s() {
            C();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public V t(K k10, int i10, V v10, boolean z10) {
            lock();
            try {
                s();
                int i11 = this.f40256x + 1;
                if (i11 > this.f40258z) {
                    g();
                    i11 = this.f40256x + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.A;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                for (h hVar = e10; hVar != null; hVar = hVar.e()) {
                    Object key = hVar.getKey();
                    if (hVar.b() == i10 && key != null && this.f40255w.A.d(k10, key)) {
                        V v11 = (V) hVar.getValue();
                        if (v11 == null) {
                            this.f40257y++;
                            E(hVar, v10);
                            this.f40256x = this.f40256x;
                            return null;
                        } else if (z10) {
                            return v11;
                        } else {
                            this.f40257y++;
                            E(hVar, v10);
                            return v11;
                        }
                    }
                }
                this.f40257y++;
                E e11 = this.f40255w.B.e(D(), k10, i10, e10);
                E(e11, v10);
                atomicReferenceArray.set(length, e11);
                this.f40256x = i11;
                return null;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CanIgnoreReturnValue
        public boolean u(E e10, int i10) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.A;
                int length = i10 & (atomicReferenceArray.length() - 1);
                E e11 = atomicReferenceArray.get(length);
                for (h hVar = e11; hVar != null; hVar = hVar.e()) {
                    if (hVar == e10) {
                        this.f40257y++;
                        atomicReferenceArray.set(length, y(e11, hVar));
                        this.f40256x--;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CanIgnoreReturnValue
        public boolean v(K k10, int i10, z<K, V, E> zVar) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.A;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                for (h hVar = e10; hVar != null; hVar = hVar.e()) {
                    Object key = hVar.getKey();
                    if (hVar.b() == i10 && key != null && this.f40255w.A.d(k10, key)) {
                        if (((y) hVar).a() == zVar) {
                            this.f40257y++;
                            atomicReferenceArray.set(length, y(e10, hVar));
                            this.f40256x--;
                            return true;
                        }
                        return false;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CanIgnoreReturnValue
        public V w(Object obj, int i10) {
            lock();
            try {
                s();
                AtomicReferenceArray<E> atomicReferenceArray = this.A;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                for (h hVar = e10; hVar != null; hVar = hVar.e()) {
                    Object key = hVar.getKey();
                    if (hVar.b() == i10 && key != null && this.f40255w.A.d(obj, key)) {
                        V v10 = (V) hVar.getValue();
                        if (v10 == null && !n(hVar)) {
                            return null;
                        }
                        this.f40257y++;
                        atomicReferenceArray.set(length, y(e10, hVar));
                        this.f40256x--;
                        return v10;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
            if (r8.f40255w.r().d(r11, r4.getValue()) == false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
            r5 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
            if (n(r4) == false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
            r8.f40257y++;
            r0.set(r1, y(r3, r4));
            r8.f40256x--;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
            return false;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean x(java.lang.Object r9, int r10, java.lang.Object r11) {
            /*
                r8 = this;
                r8.lock()
                r8.s()     // Catch: java.lang.Throwable -> L69
                java.util.concurrent.atomic.AtomicReferenceArray<E extends lk.b0$h<K, V, E>> r0 = r8.A     // Catch: java.lang.Throwable -> L69
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L69
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r10
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L69
                lk.b0$h r3 = (lk.b0.h) r3     // Catch: java.lang.Throwable -> L69
                r4 = r3
            L16:
                r5 = 0
                if (r4 == 0) goto L65
                java.lang.Object r6 = r4.getKey()     // Catch: java.lang.Throwable -> L69
                int r7 = r4.b()     // Catch: java.lang.Throwable -> L69
                if (r7 != r10) goto L60
                if (r6 == 0) goto L60
                lk.b0<K, V, E extends lk.b0$h<K, V, E>, S extends lk.b0$m<K, V, E, S>> r7 = r8.f40255w     // Catch: java.lang.Throwable -> L69
                kk.e<java.lang.Object> r7 = r7.A     // Catch: java.lang.Throwable -> L69
                boolean r6 = r7.d(r9, r6)     // Catch: java.lang.Throwable -> L69
                if (r6 == 0) goto L60
                java.lang.Object r9 = r4.getValue()     // Catch: java.lang.Throwable -> L69
                lk.b0<K, V, E extends lk.b0$h<K, V, E>, S extends lk.b0$m<K, V, E, S>> r10 = r8.f40255w     // Catch: java.lang.Throwable -> L69
                kk.e r10 = r10.r()     // Catch: java.lang.Throwable -> L69
                boolean r9 = r10.d(r11, r9)     // Catch: java.lang.Throwable -> L69
                if (r9 == 0) goto L41
                r5 = r2
                goto L47
            L41:
                boolean r9 = n(r4)     // Catch: java.lang.Throwable -> L69
                if (r9 == 0) goto L5c
            L47:
                int r9 = r8.f40257y     // Catch: java.lang.Throwable -> L69
                int r9 = r9 + r2
                r8.f40257y = r9     // Catch: java.lang.Throwable -> L69
                lk.b0$h r9 = r8.y(r3, r4)     // Catch: java.lang.Throwable -> L69
                int r10 = r8.f40256x     // Catch: java.lang.Throwable -> L69
                int r10 = r10 - r2
                r0.set(r1, r9)     // Catch: java.lang.Throwable -> L69
                r8.f40256x = r10     // Catch: java.lang.Throwable -> L69
                r8.unlock()
                return r5
            L5c:
                r8.unlock()
                return r5
            L60:
                lk.b0$h r4 = r4.e()     // Catch: java.lang.Throwable -> L69
                goto L16
            L65:
                r8.unlock()
                return r5
            L69:
                r9 = move-exception
                r8.unlock()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: lk.b0.m.x(java.lang.Object, int, java.lang.Object):boolean");
        }

        @GuardedBy("this")
        public E y(E e10, E e11) {
            int i10 = this.f40256x;
            E e12 = (E) e11.e();
            while (e10 != e11) {
                E d10 = d(e10, e12);
                if (d10 != null) {
                    e12 = d10;
                } else {
                    i10--;
                }
                e10 = (E) e10.e();
            }
            this.f40256x = i10;
            return e12;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public V z(K k10, int i10, V v10) {
            lock();
            try {
                s();
                AtomicReferenceArray<E> atomicReferenceArray = this.A;
                int length = (atomicReferenceArray.length() - 1) & i10;
                E e10 = atomicReferenceArray.get(length);
                for (h hVar = e10; hVar != null; hVar = hVar.e()) {
                    Object key = hVar.getKey();
                    if (hVar.b() == i10 && key != null && this.f40255w.A.d(k10, key)) {
                        V v11 = (V) hVar.getValue();
                        if (v11 == null) {
                            if (n(hVar)) {
                                this.f40257y++;
                                atomicReferenceArray.set(length, y(e10, hVar));
                                this.f40256x--;
                            }
                            return null;
                        }
                        this.f40257y++;
                        E(hVar, v10);
                        return v11;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static abstract class n {
        private static final /* synthetic */ n[] $VALUES;
        public static final n STRONG;
        public static final n WEAK;

        /* loaded from: classes3.dex */
        public enum a extends n {
            public a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // lk.b0.n
            public kk.e<Object> a() {
                return kk.e.c();
            }
        }

        /* loaded from: classes3.dex */
        public enum b extends n {
            public b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // lk.b0.n
            public kk.e<Object> a() {
                return kk.e.f();
            }
        }

        static {
            a aVar = new a("STRONG", 0);
            STRONG = aVar;
            b bVar = new b("WEAK", 1);
            WEAK = bVar;
            $VALUES = new n[]{aVar, bVar};
        }

        public n(String str, int i10) {
        }

        public static n valueOf(String str) {
            return (n) Enum.valueOf(n.class, str);
        }

        public static n[] values() {
            return (n[]) $VALUES.clone();
        }

        public abstract kk.e<Object> a();

        public /* synthetic */ n(String str, int i10, a aVar) {
            this(str, i10);
        }
    }

    /* loaded from: classes3.dex */
    public static final class o<K, V> extends b<K, V, o<K, V>> {
        @NullableDecl

        /* renamed from: d  reason: collision with root package name */
        public volatile V f40259d;

        /* loaded from: classes3.dex */
        public static final class a<K, V> implements i<K, V, o<K, V>, p<K, V>> {

            /* renamed from: a  reason: collision with root package name */
            public static final a<?, ?> f40260a = new a<>();

            public static <K, V> a<K, V> g() {
                return (a<K, V>) f40260a;
            }

            @Override // lk.b0.i
            public n a() {
                return n.STRONG;
            }

            @Override // lk.b0.i
            /* renamed from: f */
            public o<K, V> b(p<K, V> pVar, o<K, V> oVar, @NullableDecl o<K, V> oVar2) {
                return oVar.c(oVar2);
            }

            @Override // lk.b0.i
            /* renamed from: h */
            public o<K, V> e(p<K, V> pVar, K k10, int i10, @NullableDecl o<K, V> oVar) {
                return new o<>(k10, i10, oVar);
            }

            @Override // lk.b0.i
            /* renamed from: i */
            public p<K, V> d(b0<K, V, o<K, V>, p<K, V>> b0Var, int i10, int i11) {
                return new p<>(b0Var, i10, i11);
            }

            @Override // lk.b0.i
            /* renamed from: j */
            public void c(p<K, V> pVar, o<K, V> oVar, V v10) {
                oVar.d(v10);
            }
        }

        public o(K k10, int i10, @NullableDecl o<K, V> oVar) {
            super(k10, i10, oVar);
            this.f40259d = null;
        }

        public o<K, V> c(o<K, V> oVar) {
            o<K, V> oVar2 = new o<>(this.f40241a, this.f40242b, oVar);
            oVar2.f40259d = this.f40259d;
            return oVar2;
        }

        public void d(V v10) {
            this.f40259d = v10;
        }

        @Override // lk.b0.h
        @NullableDecl
        public V getValue() {
            return this.f40259d;
        }
    }

    /* loaded from: classes3.dex */
    public static final class p<K, V> extends m<K, V, o<K, V>, p<K, V>> {
        public p(b0<K, V, o<K, V>, p<K, V>> b0Var, int i10, int i11) {
            super(b0Var, i10, i11);
        }

        @Override // lk.b0.m
        /* renamed from: G */
        public p<K, V> D() {
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static final class q<K, V> extends b<K, V, q<K, V>> implements y<K, V, q<K, V>> {

        /* renamed from: d  reason: collision with root package name */
        public volatile z<K, V, q<K, V>> f40261d;

        /* loaded from: classes3.dex */
        public static final class a<K, V> implements i<K, V, q<K, V>, r<K, V>> {

            /* renamed from: a  reason: collision with root package name */
            public static final a<?, ?> f40262a = new a<>();

            public static <K, V> a<K, V> g() {
                return (a<K, V>) f40262a;
            }

            @Override // lk.b0.i
            public n a() {
                return n.WEAK;
            }

            @Override // lk.b0.i
            /* renamed from: f */
            public q<K, V> b(r<K, V> rVar, q<K, V> qVar, @NullableDecl q<K, V> qVar2) {
                if (m.n(qVar)) {
                    return null;
                }
                return qVar.c(rVar.D, qVar2);
            }

            @Override // lk.b0.i
            /* renamed from: h */
            public q<K, V> e(r<K, V> rVar, K k10, int i10, @NullableDecl q<K, V> qVar) {
                return new q<>(k10, i10, qVar);
            }

            @Override // lk.b0.i
            /* renamed from: i */
            public r<K, V> d(b0<K, V, q<K, V>, r<K, V>> b0Var, int i10, int i11) {
                return new r<>(b0Var, i10, i11);
            }

            @Override // lk.b0.i
            /* renamed from: j */
            public void c(r<K, V> rVar, q<K, V> qVar, V v10) {
                qVar.d(v10, rVar.D);
            }
        }

        public q(K k10, int i10, @NullableDecl q<K, V> qVar) {
            super(k10, i10, qVar);
            this.f40261d = b0.q();
        }

        @Override // lk.b0.y
        public z<K, V, q<K, V>> a() {
            return this.f40261d;
        }

        public q<K, V> c(ReferenceQueue<V> referenceQueue, q<K, V> qVar) {
            q<K, V> qVar2 = new q<>(this.f40241a, this.f40242b, qVar);
            qVar2.f40261d = this.f40261d.b(referenceQueue, qVar2);
            return qVar2;
        }

        public void d(V v10, ReferenceQueue<V> referenceQueue) {
            z<K, V, q<K, V>> zVar = this.f40261d;
            this.f40261d = new a0(referenceQueue, v10, this);
            zVar.clear();
        }

        @Override // lk.b0.h
        public V getValue() {
            return this.f40261d.get();
        }
    }

    /* loaded from: classes3.dex */
    public static final class r<K, V> extends m<K, V, q<K, V>, r<K, V>> {
        public final ReferenceQueue<V> D;

        public r(b0<K, V, q<K, V>, r<K, V>> b0Var, int i10, int i11) {
            super(b0Var, i10, i11);
            this.D = new ReferenceQueue<>();
        }

        @Override // lk.b0.m
        /* renamed from: H */
        public r<K, V> D() {
            return this;
        }

        @Override // lk.b0.m
        public void o() {
            b((ReferenceQueue<V>) this.D);
        }

        @Override // lk.b0.m
        public void p() {
            f(this.D);
        }
    }

    /* loaded from: classes3.dex */
    public final class s extends b0<K, V, E, S>.g<V> {
        public s() {
            super();
        }

        @Override // java.util.Iterator
        public V next() {
            return d().getValue();
        }
    }

    /* loaded from: classes3.dex */
    public final class t extends AbstractCollection<V> {
        public t() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            b0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return b0.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return b0.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new s();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return b0.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return b0.p(this).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) b0.p(this).toArray(tArr);
        }
    }

    /* loaded from: classes3.dex */
    public static final class u<K, V> extends c<K, V, u<K, V>> {
        @NullableDecl

        /* renamed from: c  reason: collision with root package name */
        public volatile V f40264c;

        /* loaded from: classes3.dex */
        public static final class a<K, V> implements i<K, V, u<K, V>, v<K, V>> {

            /* renamed from: a  reason: collision with root package name */
            public static final a<?, ?> f40265a = new a<>();

            public static <K, V> a<K, V> g() {
                return (a<K, V>) f40265a;
            }

            @Override // lk.b0.i
            public n a() {
                return n.STRONG;
            }

            @Override // lk.b0.i
            /* renamed from: f */
            public u<K, V> b(v<K, V> vVar, u<K, V> uVar, @NullableDecl u<K, V> uVar2) {
                if (uVar.getKey() == null) {
                    return null;
                }
                return uVar.c(vVar.D, uVar2);
            }

            @Override // lk.b0.i
            /* renamed from: h */
            public u<K, V> e(v<K, V> vVar, K k10, int i10, @NullableDecl u<K, V> uVar) {
                return new u<>(vVar.D, k10, i10, uVar);
            }

            @Override // lk.b0.i
            /* renamed from: i */
            public v<K, V> d(b0<K, V, u<K, V>, v<K, V>> b0Var, int i10, int i11) {
                return new v<>(b0Var, i10, i11);
            }

            @Override // lk.b0.i
            /* renamed from: j */
            public void c(v<K, V> vVar, u<K, V> uVar, V v10) {
                uVar.d(v10);
            }
        }

        public u(ReferenceQueue<K> referenceQueue, K k10, int i10, @NullableDecl u<K, V> uVar) {
            super(referenceQueue, k10, i10, uVar);
            this.f40264c = null;
        }

        public u<K, V> c(ReferenceQueue<K> referenceQueue, u<K, V> uVar) {
            u<K, V> uVar2 = new u<>(referenceQueue, getKey(), this.f40247a, uVar);
            uVar2.d(this.f40264c);
            return uVar2;
        }

        public void d(V v10) {
            this.f40264c = v10;
        }

        @Override // lk.b0.h
        @NullableDecl
        public V getValue() {
            return this.f40264c;
        }
    }

    /* loaded from: classes3.dex */
    public static final class v<K, V> extends m<K, V, u<K, V>, v<K, V>> {
        public final ReferenceQueue<K> D;

        public v(b0<K, V, u<K, V>, v<K, V>> b0Var, int i10, int i11) {
            super(b0Var, i10, i11);
            this.D = new ReferenceQueue<>();
        }

        @Override // lk.b0.m
        /* renamed from: H */
        public v<K, V> D() {
            return this;
        }

        @Override // lk.b0.m
        public void o() {
            b((ReferenceQueue<K>) this.D);
        }

        @Override // lk.b0.m
        public void p() {
            e(this.D);
        }
    }

    /* loaded from: classes3.dex */
    public static final class w<K, V> extends c<K, V, w<K, V>> implements y<K, V, w<K, V>> {

        /* renamed from: c  reason: collision with root package name */
        public volatile z<K, V, w<K, V>> f40266c;

        /* loaded from: classes3.dex */
        public static final class a<K, V> implements i<K, V, w<K, V>, x<K, V>> {

            /* renamed from: a  reason: collision with root package name */
            public static final a<?, ?> f40267a = new a<>();

            public static <K, V> a<K, V> g() {
                return (a<K, V>) f40267a;
            }

            @Override // lk.b0.i
            public n a() {
                return n.WEAK;
            }

            @Override // lk.b0.i
            /* renamed from: f */
            public w<K, V> b(x<K, V> xVar, w<K, V> wVar, @NullableDecl w<K, V> wVar2) {
                if (wVar.getKey() == null || m.n(wVar)) {
                    return null;
                }
                return wVar.c(xVar.D, xVar.E, wVar2);
            }

            @Override // lk.b0.i
            /* renamed from: h */
            public w<K, V> e(x<K, V> xVar, K k10, int i10, @NullableDecl w<K, V> wVar) {
                return new w<>(xVar.D, k10, i10, wVar);
            }

            @Override // lk.b0.i
            /* renamed from: i */
            public x<K, V> d(b0<K, V, w<K, V>, x<K, V>> b0Var, int i10, int i11) {
                return new x<>(b0Var, i10, i11);
            }

            @Override // lk.b0.i
            /* renamed from: j */
            public void c(x<K, V> xVar, w<K, V> wVar, V v10) {
                wVar.d(v10, xVar.E);
            }
        }

        public w(ReferenceQueue<K> referenceQueue, K k10, int i10, @NullableDecl w<K, V> wVar) {
            super(referenceQueue, k10, i10, wVar);
            this.f40266c = b0.q();
        }

        @Override // lk.b0.y
        public z<K, V, w<K, V>> a() {
            return this.f40266c;
        }

        public w<K, V> c(ReferenceQueue<K> referenceQueue, ReferenceQueue<V> referenceQueue2, w<K, V> wVar) {
            w<K, V> wVar2 = new w<>(referenceQueue, getKey(), this.f40247a, wVar);
            wVar2.f40266c = this.f40266c.b(referenceQueue2, wVar2);
            return wVar2;
        }

        public void d(V v10, ReferenceQueue<V> referenceQueue) {
            z<K, V, w<K, V>> zVar = this.f40266c;
            this.f40266c = new a0(referenceQueue, v10, this);
            zVar.clear();
        }

        @Override // lk.b0.h
        public V getValue() {
            return this.f40266c.get();
        }
    }

    /* loaded from: classes3.dex */
    public static final class x<K, V> extends m<K, V, w<K, V>, x<K, V>> {
        public final ReferenceQueue<K> D;
        public final ReferenceQueue<V> E;

        public x(b0<K, V, w<K, V>, x<K, V>> b0Var, int i10, int i11) {
            super(b0Var, i10, i11);
            this.D = new ReferenceQueue<>();
            this.E = new ReferenceQueue<>();
        }

        @Override // lk.b0.m
        /* renamed from: I */
        public x<K, V> D() {
            return this;
        }

        @Override // lk.b0.m
        public void o() {
            b((ReferenceQueue<K>) this.D);
        }

        @Override // lk.b0.m
        public void p() {
            e(this.D);
            f(this.E);
        }
    }

    /* loaded from: classes3.dex */
    public interface y<K, V, E extends h<K, V, E>> extends h<K, V, E> {
        z<K, V, E> a();
    }

    /* loaded from: classes3.dex */
    public interface z<K, V, E extends h<K, V, E>> {
        E a();

        z<K, V, E> b(ReferenceQueue<V> referenceQueue, E e10);

        void clear();

        @NullableDecl
        V get();
    }

    public b0(lk.a0 a0Var, i<K, V, E, S> iVar) {
        this.f40239z = Math.min(a0Var.a(), (int) C.DEFAULT_BUFFER_SEGMENT_SIZE);
        this.A = a0Var.c();
        this.B = iVar;
        int min = Math.min(a0Var.b(), 1073741824);
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        int i13 = 1;
        while (i13 < this.f40239z) {
            i12++;
            i13 <<= 1;
        }
        this.f40237x = 32 - i12;
        this.f40236w = i13 - 1;
        this.f40238y = i(i13);
        int i14 = min / i13;
        while (i11 < (i13 * i14 < min ? i14 + 1 : i14)) {
            i11 <<= 1;
        }
        while (true) {
            m<K, V, E, S>[] mVarArr = this.f40238y;
            if (i10 >= mVarArr.length) {
                return;
            }
            mVarArr[i10] = f(i11, -1);
            i10++;
        }
    }

    public static <K, V> b0<K, V, ? extends h<K, V, ?>, ?> e(lk.a0 a0Var) {
        n d10 = a0Var.d();
        n nVar = n.STRONG;
        if (d10 == nVar && a0Var.e() == nVar) {
            return new b0<>(a0Var, o.a.g());
        }
        if (a0Var.d() == nVar && a0Var.e() == n.WEAK) {
            return new b0<>(a0Var, q.a.g());
        }
        n d11 = a0Var.d();
        n nVar2 = n.WEAK;
        if (d11 == nVar2 && a0Var.e() == nVar) {
            return new b0<>(a0Var, u.a.g());
        }
        if (a0Var.d() == nVar2 && a0Var.e() == nVar2) {
            return new b0<>(a0Var, w.a.g());
        }
        throw new AssertionError();
    }

    public static int m(int i10) {
        int i11 = i10 + ((i10 << 15) ^ (-12931));
        int i12 = i11 ^ (i11 >>> 10);
        int i13 = i12 + (i12 << 3);
        int i14 = i13 ^ (i13 >>> 6);
        int i15 = i14 + (i14 << 2) + (i14 << 14);
        return i15 ^ (i15 >>> 16);
    }

    public static <E> ArrayList<E> p(Collection<E> collection) {
        ArrayList<E> arrayList = new ArrayList<>(collection.size());
        lk.x.a(arrayList, collection.iterator());
        return arrayList;
    }

    public static <K, V, E extends h<K, V, E>> z<K, V, E> q() {
        return (z<K, V, E>) F;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (m<K, V, E, S> mVar : this.f40238y) {
            mVar.a();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        if (obj == null) {
            return false;
        }
        int h10 = h(obj);
        return o(h10).c(obj, h10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v0, types: [lk.b0$m] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0, types: [lk.b0$m<K, V, E extends lk.b0$h<K, V, E>, S extends lk.b0$m<K, V, E, S>>[]] */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        boolean z10 = false;
        if (obj == null) {
            return false;
        }
        m<K, V, E, S>[] mVarArr = this.f40238y;
        long j10 = -1;
        int i10 = 0;
        while (i10 < 3) {
            long j11 = 0;
            int length = mVarArr.length;
            for (int i11 = z10; i11 < length; i11++) {
                ?? r11 = mVarArr[i11];
                int i12 = r11.f40256x;
                AtomicReferenceArray<E> atomicReferenceArray = r11.A;
                for (int i13 = z10; i13 < atomicReferenceArray.length(); i13++) {
                    for (E e10 = atomicReferenceArray.get(i13); e10 != null; e10 = e10.e()) {
                        Object l10 = r11.l(e10);
                        if (l10 != null && r().d(obj, l10)) {
                            return true;
                        }
                    }
                }
                j11 += r11.f40257y;
                z10 = false;
            }
            if (j11 == j10) {
                return false;
            }
            i10++;
            j10 = j11;
            z10 = false;
        }
        return z10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.E;
        if (set != null) {
            return set;
        }
        f fVar = new f();
        this.E = fVar;
        return fVar;
    }

    public m<K, V, E, S> f(int i10, int i11) {
        return (S) this.B.d(this, i10, i11);
    }

    public V g(E e10) {
        V v10;
        if (e10.getKey() == null || (v10 = (V) e10.getValue()) == null) {
            return null;
        }
        return v10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(@NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        int h10 = h(obj);
        return o(h10).h(obj, h10);
    }

    public int h(Object obj) {
        return m(this.A.e(obj));
    }

    public final m<K, V, E, S>[] i(int i10) {
        return new m[i10];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        m<K, V, E, S>[] mVarArr = this.f40238y;
        long j10 = 0;
        for (int i10 = 0; i10 < mVarArr.length; i10++) {
            if (mVarArr[i10].f40256x != 0) {
                return false;
            }
            j10 += mVarArr[i10].f40257y;
        }
        if (j10 != 0) {
            for (int i11 = 0; i11 < mVarArr.length; i11++) {
                if (mVarArr[i11].f40256x != 0) {
                    return false;
                }
                j10 -= mVarArr[i11].f40257y;
            }
            return j10 == 0;
        }
        return true;
    }

    public void j(E e10) {
        int b10 = e10.b();
        o(b10).u(e10, b10);
    }

    public void k(z<K, V, E> zVar) {
        E a10 = zVar.a();
        int b10 = a10.b();
        o(b10).v((K) a10.getKey(), b10, zVar);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.C;
        if (set != null) {
            return set;
        }
        k kVar = new k();
        this.C = kVar;
        return kVar;
    }

    public m<K, V, E, S> o(int i10) {
        return this.f40238y[(i10 >>> this.f40237x) & this.f40236w];
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V put(K k10, V v10) {
        kk.j.i(k10);
        kk.j.i(v10);
        int h10 = h(k10);
        return o(h10).t(k10, h10, v10, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public V putIfAbsent(K k10, V v10) {
        kk.j.i(k10);
        kk.j.i(v10);
        int h10 = h(k10);
        return o(h10).t(k10, h10, v10, true);
    }

    public kk.e<Object> r() {
        return this.B.a().a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V remove(@NullableDecl Object obj) {
        if (obj == null) {
            return null;
        }
        int h10 = h(obj);
        return o(h10).w(obj, h10);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public boolean replace(K k10, @NullableDecl V v10, V v11) {
        kk.j.i(k10);
        kk.j.i(v11);
        if (v10 == null) {
            return false;
        }
        int h10 = h(k10);
        return o(h10).A(k10, h10, v10, v11);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j10 = 0;
        for (m<K, V, E, S> mVar : this.f40238y) {
            j10 += mVar.f40256x;
        }
        return mk.c.i(j10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.D;
        if (collection != null) {
            return collection;
        }
        t tVar = new t();
        this.D = tVar;
        return tVar;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        if (obj == null || obj2 == null) {
            return false;
        }
        int h10 = h(obj);
        return o(h10).x(obj, h10, obj2);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CanIgnoreReturnValue
    public V replace(K k10, V v10) {
        kk.j.i(k10);
        kk.j.i(v10);
        int h10 = h(k10);
        return o(h10).z(k10, h10, v10);
    }
}
