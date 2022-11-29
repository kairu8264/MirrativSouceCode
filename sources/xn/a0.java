package xn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes4.dex */
public class a0 extends z {

    /* loaded from: classes4.dex */
    public static final class a implements ro.g<T> {

        /* renamed from: a */
        public final /* synthetic */ Iterable f60423a;

        public a(Iterable iterable) {
            this.f60423a = iterable;
        }

        @Override // ro.g
        public Iterator<T> iterator() {
            return this.f60423a.iterator();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends jo.q implements io.l<Integer, T> {

        /* renamed from: w */
        public final /* synthetic */ int f60424w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10) {
            super(1);
            this.f60424w = i10;
        }

        public final T a(int i10) {
            throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + this.f60424w + '.');
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends jo.q implements io.a<Iterator<? extends T>> {

        /* renamed from: w */
        public final /* synthetic */ Iterable<T> f60425w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Iterable<? extends T> iterable) {
            super(0);
            this.f60425w = iterable;
        }

        @Override // io.a
        /* renamed from: a */
        public final Iterator<T> invoke() {
            return this.f60425w.iterator();
        }
    }

    public static final int[] A0(Collection<Integer> collection) {
        jo.p.h(collection, "<this>");
        int[] iArr = new int[collection.size()];
        int i10 = 0;
        for (Integer num : collection) {
            iArr[i10] = num.intValue();
            i10++;
        }
        return iArr;
    }

    public static final <T> List<T> B0(Iterable<? extends T> iterable) {
        jo.p.h(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return D0(collection);
                }
                return r.d(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            }
            return s.k();
        }
        return s.q(C0(iterable));
    }

    public static final <T> List<T> C0(Iterable<? extends T> iterable) {
        jo.p.h(iterable, "<this>");
        if (iterable instanceof Collection) {
            return D0((Collection) iterable);
        }
        return (List) y0(iterable, new ArrayList());
    }

    public static final <T> List<T> D0(Collection<? extends T> collection) {
        jo.p.h(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final <T> Set<T> E0(Iterable<? extends T> iterable) {
        jo.p.h(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) y0(iterable, new LinkedHashSet());
    }

    public static final <T> Set<T> F0(Iterable<? extends T> iterable) {
        jo.p.h(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return (Set) y0(iterable, new LinkedHashSet(m0.b(collection.size())));
                }
                return s0.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
            }
            return t0.b();
        }
        return t0.d((Set) y0(iterable, new LinkedHashSet()));
    }

    public static final <T> List<List<T>> G0(Iterable<? extends T> iterable, int i10, int i11, boolean z10) {
        int i12;
        jo.p.h(iterable, "<this>");
        u0.a(i10, i11);
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            List list = (List) iterable;
            int size = list.size();
            ArrayList arrayList = new ArrayList((size / i11) + (size % i11 == 0 ? 0 : 1));
            int i13 = 0;
            while (true) {
                if (!(i13 >= 0 && i13 < size) || ((i12 = po.n.i(i10, size - i13)) < i10 && !z10)) {
                    break;
                }
                ArrayList arrayList2 = new ArrayList(i12);
                for (int i14 = 0; i14 < i12; i14++) {
                    arrayList2.add(list.get(i14 + i13));
                }
                arrayList.add(arrayList2);
                i13 += i11;
            }
            return arrayList;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator b10 = u0.b(iterable.iterator(), i10, i11, z10, false);
        while (b10.hasNext()) {
            arrayList3.add((List) b10.next());
        }
        return arrayList3;
    }

    public static final <T> Iterable<f0<T>> H0(Iterable<? extends T> iterable) {
        jo.p.h(iterable, "<this>");
        return new g0(new c(iterable));
    }

    public static final <T, R> List<wn.k<T, R>> I0(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        jo.p.h(iterable, "<this>");
        jo.p.h(iterable2, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(t.u(iterable, 10), t.u(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(wn.q.a(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final <T> boolean L(Iterable<? extends T> iterable) {
        jo.p.h(iterable, "<this>");
        return iterable instanceof Collection ? !((Collection) iterable).isEmpty() : iterable.iterator().hasNext();
    }

    public static final <T> ro.g<T> M(Iterable<? extends T> iterable) {
        jo.p.h(iterable, "<this>");
        return new a(iterable);
    }

    public static final <T> List<List<T>> N(Iterable<? extends T> iterable, int i10) {
        jo.p.h(iterable, "<this>");
        return G0(iterable, i10, i10, true);
    }

    public static final <T> boolean O(Iterable<? extends T> iterable, T t10) {
        jo.p.h(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t10);
        }
        return b0(iterable, t10) >= 0;
    }

    public static final <T> List<T> P(Iterable<? extends T> iterable) {
        jo.p.h(iterable, "<this>");
        return B0(E0(iterable));
    }

    public static final <T> List<T> Q(Iterable<? extends T> iterable, int i10) {
        ArrayList arrayList;
        jo.p.h(iterable, "<this>");
        int i11 = 0;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return B0(iterable);
        } else {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i10;
                if (size <= 0) {
                    return s.k();
                }
                if (size == 1) {
                    return r.d(h0(iterable));
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        int size2 = collection.size();
                        while (i10 < size2) {
                            arrayList.add(((List) iterable).get(i10));
                            i10++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i10);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            for (T t10 : iterable) {
                if (i11 >= i10) {
                    arrayList.add(t10);
                } else {
                    i11++;
                }
            }
            return s.q(arrayList);
        }
    }

    public static final <T> List<T> R(List<? extends T> list, int i10) {
        jo.p.h(list, "<this>");
        if (i10 >= 0) {
            return w0(list, po.n.d(list.size() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static final <T> T S(Iterable<? extends T> iterable, int i10) {
        jo.p.h(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) ((List) iterable).get(i10);
        }
        return (T) T(iterable, i10, new b(i10));
    }

    public static final <T> T T(Iterable<? extends T> iterable, int i10, io.l<? super Integer, ? extends T> lVar) {
        jo.p.h(iterable, "<this>");
        jo.p.h(lVar, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            return (i10 < 0 || i10 > s.l(list)) ? lVar.invoke(Integer.valueOf(i10)) : (T) list.get(i10);
        } else if (i10 < 0) {
            return lVar.invoke(Integer.valueOf(i10));
        } else {
            int i11 = 0;
            for (T t10 : iterable) {
                int i12 = i11 + 1;
                if (i10 == i11) {
                    return t10;
                }
                i11 = i12;
            }
            return lVar.invoke(Integer.valueOf(i10));
        }
    }

    public static final <T> List<T> U(Iterable<? extends T> iterable) {
        jo.p.h(iterable, "<this>");
        return (List) V(iterable, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C V(Iterable<? extends T> iterable, C c10) {
        jo.p.h(iterable, "<this>");
        jo.p.h(c10, "destination");
        for (T t10 : iterable) {
            if (t10 != null) {
                c10.add(t10);
            }
        }
        return c10;
    }

    public static final <T> T W(Iterable<? extends T> iterable) {
        jo.p.h(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) X((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T X(List<? extends T> list) {
        jo.p.h(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T Y(Iterable<? extends T> iterable) {
        jo.p.h(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static final <T> T Z(List<? extends T> list) {
        jo.p.h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final <T> T a0(List<? extends T> list, int i10) {
        jo.p.h(list, "<this>");
        if (i10 < 0 || i10 > s.l(list)) {
            return null;
        }
        return list.get(i10);
    }

    public static final <T> int b0(Iterable<? extends T> iterable, T t10) {
        jo.p.h(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t10);
        }
        int i10 = 0;
        for (T t11 : iterable) {
            if (i10 < 0) {
                s.t();
            }
            if (jo.p.c(t10, t11)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final <T> int c0(List<? extends T> list, T t10) {
        jo.p.h(list, "<this>");
        return list.indexOf(t10);
    }

    public static final <T, A extends Appendable> A d0(Iterable<? extends T> iterable, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, io.l<? super T, ? extends CharSequence> lVar) {
        jo.p.h(iterable, "<this>");
        jo.p.h(a10, "buffer");
        jo.p.h(charSequence, "separator");
        jo.p.h(charSequence2, "prefix");
        jo.p.h(charSequence3, "postfix");
        jo.p.h(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (T t10 : iterable) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            so.f.a(a10, t10, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    public static final <T> String f0(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, io.l<? super T, ? extends CharSequence> lVar) {
        jo.p.h(iterable, "<this>");
        jo.p.h(charSequence, "separator");
        jo.p.h(charSequence2, "prefix");
        jo.p.h(charSequence3, "postfix");
        jo.p.h(charSequence4, "truncated");
        String sb2 = ((StringBuilder) d0(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        jo.p.g(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static /* synthetic */ String g0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, io.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i11 & 2) != 0 ? "" : charSequence2;
        String str2 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        return f0(iterable, charSequence, str, str2, i12, charSequence5, lVar);
    }

    public static final <T> T h0(Iterable<? extends T> iterable) {
        jo.p.h(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) i0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T i0(List<? extends T> list) {
        jo.p.h(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(s.l(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T j0(List<? extends T> list) {
        jo.p.h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static final <T extends Comparable<? super T>> T k0(Iterable<? extends T> iterable) {
        jo.p.h(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) < 0) {
                    next = next2;
                }
            }
            return next;
        }
        return null;
    }

    public static final Float l0(Iterable<Float> iterable) {
        jo.p.h(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (it.hasNext()) {
            float floatValue = it.next().floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, it.next().floatValue());
            }
            return Float.valueOf(floatValue);
        }
        return null;
    }

    public static final <T extends Comparable<? super T>> T m0(Iterable<? extends T> iterable) {
        jo.p.h(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) > 0) {
                    next = next2;
                }
            }
            return next;
        }
        return null;
    }

    public static final Float n0(Iterable<Float> iterable) {
        jo.p.h(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (it.hasNext()) {
            float floatValue = it.next().floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, it.next().floatValue());
            }
            return Float.valueOf(floatValue);
        }
        return null;
    }

    public static final <T> List<T> o0(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        jo.p.h(collection, "<this>");
        jo.p.h(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        x.y(arrayList2, iterable);
        return arrayList2;
    }

    public static final <T> List<T> p0(Collection<? extends T> collection, T t10) {
        jo.p.h(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t10);
        return arrayList;
    }

    public static final <T> T q0(Collection<? extends T> collection, no.c cVar) {
        jo.p.h(collection, "<this>");
        jo.p.h(cVar, "random");
        if (!collection.isEmpty()) {
            return (T) S(collection, cVar.c(collection.size()));
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> List<T> r0(Iterable<? extends T> iterable) {
        jo.p.h(iterable, "<this>");
        if (!(iterable instanceof Collection) || ((Collection) iterable).size() > 1) {
            List<T> C0 = C0(iterable);
            z.K(C0);
            return C0;
        }
        return B0(iterable);
    }

    public static final <T> T s0(Iterable<? extends T> iterable) {
        jo.p.h(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) t0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (it.hasNext()) {
                throw new IllegalArgumentException("Collection has more than one element.");
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T t0(List<? extends T> list) {
        jo.p.h(list, "<this>");
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return list.get(0);
            }
            throw new IllegalArgumentException("List has more than one element.");
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> T u0(List<? extends T> list) {
        jo.p.h(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> v0(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        jo.p.h(iterable, "<this>");
        jo.p.h(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return B0(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            jo.p.f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            jo.p.f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.CollectionsKt___CollectionsKt.sortedWith>");
            n.y(array, comparator);
            return n.c(array);
        }
        List<T> C0 = C0(iterable);
        w.x(C0, comparator);
        return C0;
    }

    public static final <T> List<T> w0(Iterable<? extends T> iterable, int i10) {
        jo.p.h(iterable, "<this>");
        int i11 = 0;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        } else if (i10 == 0) {
            return s.k();
        } else {
            if (iterable instanceof Collection) {
                if (i10 >= ((Collection) iterable).size()) {
                    return B0(iterable);
                }
                if (i10 == 1) {
                    return r.d(W(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i10);
            for (T t10 : iterable) {
                arrayList.add(t10);
                i11++;
                if (i11 == i10) {
                    break;
                }
            }
            return s.q(arrayList);
        }
    }

    public static final byte[] x0(Collection<Byte> collection) {
        jo.p.h(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        int i10 = 0;
        for (Byte b10 : collection) {
            bArr[i10] = b10.byteValue();
            i10++;
        }
        return bArr;
    }

    public static final <T, C extends Collection<? super T>> C y0(Iterable<? extends T> iterable, C c10) {
        jo.p.h(iterable, "<this>");
        jo.p.h(c10, "destination");
        for (T t10 : iterable) {
            c10.add(t10);
        }
        return c10;
    }

    public static final float[] z0(Collection<Float> collection) {
        jo.p.h(collection, "<this>");
        float[] fArr = new float[collection.size()];
        int i10 = 0;
        for (Float f10 : collection) {
            fArr[i10] = f10.floatValue();
            i10++;
        }
        return fArr;
    }
}
