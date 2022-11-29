package ro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import jo.p;
import jo.q;
import xn.s;

/* loaded from: classes4.dex */
public class n extends m {

    /* loaded from: classes4.dex */
    public static final class a implements Iterable<T>, ko.a {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ g f51631w;

        public a(g gVar) {
            this.f51631w = gVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.f51631w.iterator();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends q implements io.l<Integer, T> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f51632w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10) {
            super(1);
            this.f51632w = i10;
        }

        public final T a(int i10) {
            throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + this.f51632w + '.');
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends q implements io.l<T, Boolean> {

        /* renamed from: w  reason: collision with root package name */
        public static final c f51633w = new c();

        public c() {
            super(1);
        }

        @Override // io.l
        /* renamed from: a */
        public final Boolean invoke(T t10) {
            return Boolean.valueOf(t10 == 0);
        }
    }

    public static final <T> Iterable<T> f(g<? extends T> gVar) {
        p.h(gVar, "<this>");
        return new a(gVar);
    }

    public static final <T> int g(g<? extends T> gVar) {
        p.h(gVar, "<this>");
        Iterator<? extends T> it = gVar.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                s.s();
            }
        }
        return i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> g<T> h(g<? extends T> gVar, int i10) {
        p.h(gVar, "<this>");
        if (i10 >= 0) {
            return i10 == 0 ? gVar : gVar instanceof ro.c ? ((ro.c) gVar).a(i10) : new ro.b(gVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
    }

    public static final <T> T i(g<? extends T> gVar, int i10) {
        p.h(gVar, "<this>");
        return (T) j(gVar, i10, new b(i10));
    }

    public static final <T> T j(g<? extends T> gVar, int i10, io.l<? super Integer, ? extends T> lVar) {
        p.h(gVar, "<this>");
        p.h(lVar, "defaultValue");
        if (i10 < 0) {
            return lVar.invoke(Integer.valueOf(i10));
        }
        int i11 = 0;
        for (T t10 : gVar) {
            int i12 = i11 + 1;
            if (i10 == i11) {
                return t10;
            }
            i11 = i12;
        }
        return lVar.invoke(Integer.valueOf(i10));
    }

    public static final <T> g<T> k(g<? extends T> gVar, io.l<? super T, Boolean> lVar) {
        p.h(gVar, "<this>");
        p.h(lVar, "predicate");
        return new e(gVar, false, lVar);
    }

    public static final <T> g<T> l(g<? extends T> gVar) {
        p.h(gVar, "<this>");
        g<T> k10 = k(gVar, c.f51633w);
        p.f(k10, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return k10;
    }

    public static final <T> T m(g<? extends T> gVar) {
        p.h(gVar, "<this>");
        Iterator<? extends T> it = gVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static final <T, A extends Appendable> A n(g<? extends T> gVar, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, io.l<? super T, ? extends CharSequence> lVar) {
        p.h(gVar, "<this>");
        p.h(a10, "buffer");
        p.h(charSequence, "separator");
        p.h(charSequence2, "prefix");
        p.h(charSequence3, "postfix");
        p.h(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (T t10 : gVar) {
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

    public static final <T> String o(g<? extends T> gVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, io.l<? super T, ? extends CharSequence> lVar) {
        p.h(gVar, "<this>");
        p.h(charSequence, "separator");
        p.h(charSequence2, "prefix");
        p.h(charSequence3, "postfix");
        p.h(charSequence4, "truncated");
        String sb2 = ((StringBuilder) n(gVar, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, lVar)).toString();
        p.g(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    public static /* synthetic */ String p(g gVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, io.l lVar, int i11, Object obj) {
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
        return o(gVar, charSequence, str, str2, i12, charSequence5, lVar);
    }

    public static final <T> T q(g<? extends T> gVar) {
        p.h(gVar, "<this>");
        Iterator<? extends T> it = gVar.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public static final <T, R> g<R> r(g<? extends T> gVar, io.l<? super T, ? extends R> lVar) {
        p.h(gVar, "<this>");
        p.h(lVar, "transform");
        return new o(gVar, lVar);
    }

    public static final <T, R> g<R> s(g<? extends T> gVar, io.l<? super T, ? extends R> lVar) {
        p.h(gVar, "<this>");
        p.h(lVar, "transform");
        return l(new o(gVar, lVar));
    }

    public static final <T extends Comparable<? super T>> T t(g<? extends T> gVar) {
        p.h(gVar, "<this>");
        Iterator<? extends T> it = gVar.iterator();
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

    public static final <T, C extends Collection<? super T>> C u(g<? extends T> gVar, C c10) {
        p.h(gVar, "<this>");
        p.h(c10, "destination");
        for (T t10 : gVar) {
            c10.add(t10);
        }
        return c10;
    }

    public static final <T> List<T> v(g<? extends T> gVar) {
        p.h(gVar, "<this>");
        return s.q(w(gVar));
    }

    public static final <T> List<T> w(g<? extends T> gVar) {
        p.h(gVar, "<this>");
        return (List) u(gVar, new ArrayList());
    }
}
