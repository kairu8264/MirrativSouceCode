package j2;

import java.util.ArrayList;
import java.util.List;
import jo.p;
import y1.x;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final a f37083b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final f f37084c = new f(0);

    /* renamed from: d  reason: collision with root package name */
    public static final f f37085d = new f(1);

    /* renamed from: e  reason: collision with root package name */
    public static final f f37086e = new f(2);

    /* renamed from: a  reason: collision with root package name */
    public final int f37087a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final f a(List<f> list) {
            p.h(list, "decorations");
            Integer num = 0;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                num = Integer.valueOf(num.intValue() | list.get(i10).e());
            }
            return new f(num.intValue());
        }

        public final f b() {
            return f.f37086e;
        }

        public final f c() {
            return f.f37084c;
        }

        public final f d() {
            return f.f37085d;
        }
    }

    public f(int i10) {
        this.f37087a = i10;
    }

    public final boolean d(f fVar) {
        p.h(fVar, "other");
        int i10 = this.f37087a;
        return (fVar.f37087a | i10) == i10;
    }

    public final int e() {
        return this.f37087a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f37087a == ((f) obj).f37087a;
    }

    public int hashCode() {
        return this.f37087a;
    }

    public String toString() {
        if (this.f37087a == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.f37087a & f37085d.f37087a) != 0) {
            arrayList.add("Underline");
        }
        if ((this.f37087a & f37086e.f37087a) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + x.d(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
