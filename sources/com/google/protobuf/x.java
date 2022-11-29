package com.google.protobuf;

import com.google.protobuf.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class x {

    /* renamed from: a  reason: collision with root package name */
    public static final x f28231a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final x f28232b = new c();

    /* loaded from: classes4.dex */
    public static final class b extends x {

        /* renamed from: c  reason: collision with root package name */
        public static final Class<?> f28233c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        public b() {
            super();
        }

        public static <E> List<E> f(Object obj, long j10) {
            return (List) fn.b0.A(obj, j10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <L> List<L> g(Object obj, long j10, int i10) {
            w wVar;
            List<L> arrayList;
            List<L> f10 = f(obj, j10);
            if (f10.isEmpty()) {
                if (f10 instanceof fn.i) {
                    arrayList = new w(i10);
                } else if ((f10 instanceof fn.r) && (f10 instanceof t.i)) {
                    arrayList = ((t.i) f10).o(i10);
                } else {
                    arrayList = new ArrayList<>(i10);
                }
                fn.b0.O(obj, j10, arrayList);
                return arrayList;
            }
            if (f28233c.isAssignableFrom(f10.getClass())) {
                ArrayList arrayList2 = new ArrayList(f10.size() + i10);
                arrayList2.addAll(f10);
                fn.b0.O(obj, j10, arrayList2);
                wVar = arrayList2;
            } else if (f10 instanceof fn.a0) {
                w wVar2 = new w(f10.size() + i10);
                wVar2.addAll((fn.a0) f10);
                fn.b0.O(obj, j10, wVar2);
                wVar = wVar2;
            } else if ((f10 instanceof fn.r) && (f10 instanceof t.i)) {
                t.i iVar = (t.i) f10;
                if (iVar.L0()) {
                    return f10;
                }
                t.i o10 = iVar.o(f10.size() + i10);
                fn.b0.O(obj, j10, o10);
                return o10;
            } else {
                return f10;
            }
            return wVar;
        }

        @Override // com.google.protobuf.x
        public void c(Object obj, long j10) {
            Object unmodifiableList;
            List list = (List) fn.b0.A(obj, j10);
            if (list instanceof fn.i) {
                unmodifiableList = ((fn.i) list).E1();
            } else if (f28233c.isAssignableFrom(list.getClass())) {
                return;
            } else {
                if ((list instanceof fn.r) && (list instanceof t.i)) {
                    t.i iVar = (t.i) list;
                    if (iVar.L0()) {
                        iVar.C();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            fn.b0.O(obj, j10, unmodifiableList);
        }

        @Override // com.google.protobuf.x
        public <E> void d(Object obj, Object obj2, long j10) {
            List f10 = f(obj2, j10);
            List g10 = g(obj, j10, f10.size());
            int size = g10.size();
            int size2 = f10.size();
            if (size > 0 && size2 > 0) {
                g10.addAll(f10);
            }
            if (size > 0) {
                f10 = g10;
            }
            fn.b0.O(obj, j10, f10);
        }

        @Override // com.google.protobuf.x
        public <L> List<L> e(Object obj, long j10) {
            return g(obj, j10, 10);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends x {
        public c() {
            super();
        }

        public static <E> t.i<E> f(Object obj, long j10) {
            return (t.i) fn.b0.A(obj, j10);
        }

        @Override // com.google.protobuf.x
        public void c(Object obj, long j10) {
            f(obj, j10).C();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
        @Override // com.google.protobuf.x
        public <E> void d(Object obj, Object obj2, long j10) {
            t.i<E> f10 = f(obj, j10);
            t.i<E> f11 = f(obj2, j10);
            int size = f10.size();
            int size2 = f11.size();
            t.i<E> iVar = f10;
            iVar = f10;
            if (size > 0 && size2 > 0) {
                boolean L0 = f10.L0();
                t.i<E> iVar2 = f10;
                if (!L0) {
                    iVar2 = f10.o(size2 + size);
                }
                iVar2.addAll(f11);
                iVar = iVar2;
            }
            if (size > 0) {
                f11 = iVar;
            }
            fn.b0.O(obj, j10, f11);
        }

        @Override // com.google.protobuf.x
        public <L> List<L> e(Object obj, long j10) {
            t.i f10 = f(obj, j10);
            if (f10.L0()) {
                return f10;
            }
            int size = f10.size();
            t.i o10 = f10.o(size == 0 ? 10 : size * 2);
            fn.b0.O(obj, j10, o10);
            return o10;
        }
    }

    public static x a() {
        return f28231a;
    }

    public static x b() {
        return f28232b;
    }

    public abstract void c(Object obj, long j10);

    public abstract <L> void d(Object obj, Object obj2, long j10);

    public abstract <L> List<L> e(Object obj, long j10);

    public x() {
    }
}
