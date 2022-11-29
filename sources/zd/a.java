package zd;

import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f63079a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f63080b;

    public a() {
        this(null, null, 3, null);
    }

    public a(String str, Integer num) {
        this.f63079a = str;
        this.f63080b = num;
    }

    public final Integer a() {
        return this.f63080b;
    }

    public final String b() {
        return this.f63079a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return p.c(this.f63079a, aVar.f63079a) && p.c(this.f63080b, aVar.f63080b);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f63079a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f63080b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "AnnouncementUrlHistory(url=" + this.f63079a + ", id=" + this.f63080b + ')';
    }

    public /* synthetic */ a(String str, Integer num, int i10, h hVar) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : num);
    }
}
