package y1;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements CharSequence {

    /* renamed from: w  reason: collision with root package name */
    public final String f61045w;

    /* renamed from: x  reason: collision with root package name */
    public final List<b<v>> f61046x;

    /* renamed from: y  reason: collision with root package name */
    public final List<b<n>> f61047y;

    /* renamed from: z  reason: collision with root package name */
    public final List<b<? extends Object>> f61048z;

    /* JADX WARN: Multi-variable type inference failed */
    public a(String str, List<b<v>> list, List<b<n>> list2, List<? extends b<? extends Object>> list3) {
        jo.p.h(str, "text");
        jo.p.h(list, "spanStyles");
        jo.p.h(list2, "paragraphStyles");
        jo.p.h(list3, "annotations");
        this.f61045w = str;
        this.f61046x = list;
        this.f61047y = list2;
        this.f61048z = list3;
        int size = list2.size();
        int i10 = -1;
        for (int i11 = 0; i11 < size; i11++) {
            b<n> bVar = list2.get(i11);
            if (bVar.f() >= i10) {
                if (bVar.d() <= this.f61045w.length()) {
                    i10 = bVar.d();
                } else {
                    throw new IllegalArgumentException(("ParagraphStyle range [" + bVar.f() + ", " + bVar.d() + ") is out of boundary").toString());
                }
            } else {
                throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
            }
        }
    }

    public char a(int i10) {
        return this.f61045w.charAt(i10);
    }

    public final List<b<? extends Object>> b() {
        return this.f61048z;
    }

    public int c() {
        return this.f61045w.length();
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return a(i10);
    }

    public final List<b<n>> d() {
        return this.f61047y;
    }

    public final List<b<v>> e() {
        return this.f61046x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return jo.p.c(this.f61045w, aVar.f61045w) && jo.p.c(this.f61046x, aVar.f61046x) && jo.p.c(this.f61047y, aVar.f61047y) && jo.p.c(this.f61048z, aVar.f61048z);
        }
        return false;
    }

    public final List<b<String>> f(String str, int i10, int i11) {
        jo.p.h(str, "tag");
        List<b<? extends Object>> list = this.f61048z;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            b<? extends Object> bVar = list.get(i12);
            b<? extends Object> bVar2 = bVar;
            if ((bVar2.e() instanceof String) && jo.p.c(str, bVar2.g()) && y1.b.g(i10, i11, bVar2.f(), bVar2.d())) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public final String g() {
        return this.f61045w;
    }

    public final List<b<f0>> h(int i10, int i11) {
        List<b<? extends Object>> list = this.f61048z;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            b<? extends Object> bVar = list.get(i12);
            b<? extends Object> bVar2 = bVar;
            if ((bVar2.e() instanceof f0) && y1.b.g(i10, i11, bVar2.f(), bVar2.d())) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public int hashCode() {
        return (((((this.f61045w.hashCode() * 31) + this.f61046x.hashCode()) * 31) + this.f61047y.hashCode()) * 31) + this.f61048z.hashCode();
    }

    public final a i(a aVar) {
        jo.p.h(aVar, "other");
        C1037a c1037a = new C1037a(this);
        c1037a.d(aVar);
        return c1037a.h();
    }

    @Override // java.lang.CharSequence
    /* renamed from: j */
    public a subSequence(int i10, int i11) {
        if (i10 <= i11) {
            if (i10 == 0 && i11 == this.f61045w.length()) {
                return this;
            }
            String substring = this.f61045w.substring(i10, i11);
            jo.p.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return new a(substring, y1.b.a(this.f61046x, i10, i11), y1.b.a(this.f61047y, i10, i11), y1.b.a(this.f61048z, i10, i11));
        }
        throw new IllegalArgumentException(("start (" + i10 + ") should be less or equal to end (" + i11 + ')').toString());
    }

    public final a k(long j10) {
        return subSequence(b0.l(j10), b0.k(j10));
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return c();
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f61045w;
    }

    /* loaded from: classes.dex */
    public static final class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f61058a;

        /* renamed from: b  reason: collision with root package name */
        public final int f61059b;

        /* renamed from: c  reason: collision with root package name */
        public final int f61060c;

        /* renamed from: d  reason: collision with root package name */
        public final String f61061d;

        public b(T t10, int i10, int i11, String str) {
            jo.p.h(str, "tag");
            this.f61058a = t10;
            this.f61059b = i10;
            this.f61060c = i11;
            this.f61061d = str;
            if (!(i10 <= i11)) {
                throw new IllegalArgumentException("Reversed range is not supported".toString());
            }
        }

        public final T a() {
            return this.f61058a;
        }

        public final int b() {
            return this.f61059b;
        }

        public final int c() {
            return this.f61060c;
        }

        public final int d() {
            return this.f61060c;
        }

        public final T e() {
            return this.f61058a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return jo.p.c(this.f61058a, bVar.f61058a) && this.f61059b == bVar.f61059b && this.f61060c == bVar.f61060c && jo.p.c(this.f61061d, bVar.f61061d);
            }
            return false;
        }

        public final int f() {
            return this.f61059b;
        }

        public final String g() {
            return this.f61061d;
        }

        public int hashCode() {
            T t10 = this.f61058a;
            return ((((((t10 == null ? 0 : t10.hashCode()) * 31) + Integer.hashCode(this.f61059b)) * 31) + Integer.hashCode(this.f61060c)) * 31) + this.f61061d.hashCode();
        }

        public String toString() {
            return "Range(item=" + this.f61058a + ", start=" + this.f61059b + ", end=" + this.f61060c + ", tag=" + this.f61061d + ')';
        }

        public b(T t10, int i10, int i11) {
            this(t10, i10, i11, "");
        }
    }

    /* renamed from: y1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1037a {

        /* renamed from: a  reason: collision with root package name */
        public final StringBuilder f61049a;

        /* renamed from: b  reason: collision with root package name */
        public final List<C1038a<v>> f61050b;

        /* renamed from: c  reason: collision with root package name */
        public final List<C1038a<n>> f61051c;

        /* renamed from: d  reason: collision with root package name */
        public final List<C1038a<? extends Object>> f61052d;

        /* renamed from: e  reason: collision with root package name */
        public final List<C1038a<? extends Object>> f61053e;

        public C1037a(int i10) {
            this.f61049a = new StringBuilder(i10);
            this.f61050b = new ArrayList();
            this.f61051c = new ArrayList();
            this.f61052d = new ArrayList();
            this.f61053e = new ArrayList();
        }

        public final void a(n nVar, int i10, int i11) {
            jo.p.h(nVar, TtmlNode.TAG_STYLE);
            this.f61051c.add(new C1038a<>(nVar, i10, i11, null, 8, null));
        }

        public final void b(v vVar, int i10, int i11) {
            jo.p.h(vVar, TtmlNode.TAG_STYLE);
            this.f61050b.add(new C1038a<>(vVar, i10, i11, null, 8, null));
        }

        public final void c(String str) {
            jo.p.h(str, "text");
            this.f61049a.append(str);
        }

        public final void d(a aVar) {
            jo.p.h(aVar, "text");
            int length = this.f61049a.length();
            this.f61049a.append(aVar.g());
            List<b<v>> e10 = aVar.e();
            int size = e10.size();
            for (int i10 = 0; i10 < size; i10++) {
                b<v> bVar = e10.get(i10);
                b(bVar.e(), bVar.f() + length, bVar.d() + length);
            }
            List<b<n>> d10 = aVar.d();
            int size2 = d10.size();
            for (int i11 = 0; i11 < size2; i11++) {
                b<n> bVar2 = d10.get(i11);
                a(bVar2.e(), bVar2.f() + length, bVar2.d() + length);
            }
            List<b<? extends Object>> b10 = aVar.b();
            int size3 = b10.size();
            for (int i12 = 0; i12 < size3; i12++) {
                b<? extends Object> bVar3 = b10.get(i12);
                this.f61052d.add(new C1038a<>(bVar3.e(), bVar3.f() + length, bVar3.d() + length, bVar3.g()));
            }
        }

        public final void e() {
            if (!this.f61053e.isEmpty()) {
                List<C1038a<? extends Object>> list = this.f61053e;
                list.remove(list.size() - 1).a(this.f61049a.length());
                return;
            }
            throw new IllegalStateException("Nothing to pop.".toString());
        }

        public final void f(int i10) {
            if (i10 < this.f61053e.size()) {
                while (this.f61053e.size() - 1 >= i10) {
                    e();
                }
                return;
            }
            throw new IllegalStateException((i10 + " should be less than " + this.f61053e.size()).toString());
        }

        public final int g(v vVar) {
            jo.p.h(vVar, TtmlNode.TAG_STYLE);
            C1038a<v> c1038a = new C1038a<>(vVar, this.f61049a.length(), 0, null, 12, null);
            this.f61053e.add(c1038a);
            this.f61050b.add(c1038a);
            return this.f61053e.size() - 1;
        }

        public final a h() {
            String sb2 = this.f61049a.toString();
            jo.p.g(sb2, "text.toString()");
            List<C1038a<v>> list = this.f61050b;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(list.get(i10).b(this.f61049a.length()));
            }
            List<C1038a<n>> list2 = this.f61051c;
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                arrayList2.add(list2.get(i11).b(this.f61049a.length()));
            }
            List<C1038a<? extends Object>> list3 = this.f61052d;
            ArrayList arrayList3 = new ArrayList(list3.size());
            int size3 = list3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                arrayList3.add(list3.get(i12).b(this.f61049a.length()));
            }
            return new a(sb2, arrayList, arrayList2, arrayList3);
        }

        /* renamed from: y1.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1038a<T> {

            /* renamed from: a  reason: collision with root package name */
            public final T f61054a;

            /* renamed from: b  reason: collision with root package name */
            public final int f61055b;

            /* renamed from: c  reason: collision with root package name */
            public int f61056c;

            /* renamed from: d  reason: collision with root package name */
            public final String f61057d;

            public C1038a(T t10, int i10, int i11, String str) {
                jo.p.h(str, "tag");
                this.f61054a = t10;
                this.f61055b = i10;
                this.f61056c = i11;
                this.f61057d = str;
            }

            public final void a(int i10) {
                this.f61056c = i10;
            }

            public final b<T> b(int i10) {
                int i11 = this.f61056c;
                if (i11 != Integer.MIN_VALUE) {
                    i10 = i11;
                }
                if (i10 != Integer.MIN_VALUE) {
                    return new b<>(this.f61054a, this.f61055b, i10, this.f61057d);
                }
                throw new IllegalStateException("Item.end should be set first".toString());
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C1038a) {
                    C1038a c1038a = (C1038a) obj;
                    return jo.p.c(this.f61054a, c1038a.f61054a) && this.f61055b == c1038a.f61055b && this.f61056c == c1038a.f61056c && jo.p.c(this.f61057d, c1038a.f61057d);
                }
                return false;
            }

            public int hashCode() {
                T t10 = this.f61054a;
                return ((((((t10 == null ? 0 : t10.hashCode()) * 31) + Integer.hashCode(this.f61055b)) * 31) + Integer.hashCode(this.f61056c)) * 31) + this.f61057d.hashCode();
            }

            public String toString() {
                return "MutableRange(item=" + this.f61054a + ", start=" + this.f61055b + ", end=" + this.f61056c + ", tag=" + this.f61057d + ')';
            }

            public /* synthetic */ C1038a(Object obj, int i10, int i11, String str, int i12, jo.h hVar) {
                this(obj, i10, (i12 & 4) != 0 ? Integer.MIN_VALUE : i11, (i12 & 8) != 0 ? "" : str);
            }
        }

        public /* synthetic */ C1037a(int i10, int i11, jo.h hVar) {
            this((i11 & 1) != 0 ? 16 : i10);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C1037a(a aVar) {
            this(0, 1, null);
            jo.p.h(aVar, "text");
            d(aVar);
        }
    }

    public /* synthetic */ a(String str, List list, List list2, int i10, jo.h hVar) {
        this(str, (i10 & 2) != 0 ? xn.s.k() : list, (i10 & 4) != 0 ? xn.s.k() : list2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String str, List<b<v>> list, List<b<n>> list2) {
        this(str, list, list2, xn.s.k());
        jo.p.h(str, "text");
        jo.p.h(list, "spanStyles");
        jo.p.h(list2, "paragraphStyles");
    }
}
