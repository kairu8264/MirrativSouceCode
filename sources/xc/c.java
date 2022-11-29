package xc;

import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f60137a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f60138b;

    /* renamed from: c  reason: collision with root package name */
    public final int f60139c;

    /* renamed from: d  reason: collision with root package name */
    public final int f60140d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f60141e;

    /* renamed from: f  reason: collision with root package name */
    public final ha.a f60142f;

    public c(List<String> list, List<String> list2, int i10, int i11, boolean z10, ha.a aVar) {
        p.h(list, "monthList");
        p.h(list2, "dayList");
        p.h(aVar, "statusState");
        this.f60137a = list;
        this.f60138b = list2;
        this.f60139c = i10;
        this.f60140d = i11;
        this.f60141e = z10;
        this.f60142f = aVar;
    }

    public static /* synthetic */ c b(c cVar, List list, List list2, int i10, int i11, boolean z10, ha.a aVar, int i12, Object obj) {
        List<String> list3 = list;
        if ((i12 & 1) != 0) {
            list3 = cVar.f60137a;
        }
        List<String> list4 = list2;
        if ((i12 & 2) != 0) {
            list4 = cVar.f60138b;
        }
        List list5 = list4;
        if ((i12 & 4) != 0) {
            i10 = cVar.f60139c;
        }
        int i13 = i10;
        if ((i12 & 8) != 0) {
            i11 = cVar.f60140d;
        }
        int i14 = i11;
        if ((i12 & 16) != 0) {
            z10 = cVar.f60141e;
        }
        boolean z11 = z10;
        if ((i12 & 32) != 0) {
            aVar = cVar.f60142f;
        }
        return cVar.a(list3, list5, i13, i14, z11, aVar);
    }

    public final c a(List<String> list, List<String> list2, int i10, int i11, boolean z10, ha.a aVar) {
        p.h(list, "monthList");
        p.h(list2, "dayList");
        p.h(aVar, "statusState");
        return new c(list, list2, i10, i11, z10, aVar);
    }

    public final List<String> c() {
        return this.f60138b;
    }

    public final List<String> d() {
        return this.f60137a;
    }

    public final boolean e() {
        return this.f60141e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return p.c(this.f60137a, cVar.f60137a) && p.c(this.f60138b, cVar.f60138b) && this.f60139c == cVar.f60139c && this.f60140d == cVar.f60140d && this.f60141e == cVar.f60141e && p.c(this.f60142f, cVar.f60142f);
        }
        return false;
    }

    public final int f() {
        return this.f60140d;
    }

    public final int g() {
        return this.f60139c;
    }

    public final ha.a h() {
        return this.f60142f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f60137a.hashCode() * 31) + this.f60138b.hashCode()) * 31) + Integer.hashCode(this.f60139c)) * 31) + Integer.hashCode(this.f60140d)) * 31;
        boolean z10 = this.f60141e;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((hashCode + i10) * 31) + this.f60142f.hashCode();
    }

    public String toString() {
        return "ChatConfirmationDatePickerBindModel(monthList=" + this.f60137a + ", dayList=" + this.f60138b + ", selectedMonthIndex=" + this.f60139c + ", selectedDayIndex=" + this.f60140d + ", registerButtonEnabled=" + this.f60141e + ", statusState=" + this.f60142f + ')';
    }
}
