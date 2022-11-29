package y0;

import io.l;
import java.util.List;
import jo.p;
import wn.v;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: d  reason: collision with root package name */
    public static final a f61039d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f61040e = 8;

    /* renamed from: a  reason: collision with root package name */
    public final List<j> f61041a;

    /* renamed from: b  reason: collision with root package name */
    public b1.h f61042b;

    /* renamed from: c  reason: collision with root package name */
    public final l<String, v> f61043c;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public final List<j> a() {
        return this.f61041a;
    }

    public final b1.h b() {
        return this.f61042b;
    }

    public final l<String, v> c() {
        return this.f61043c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return p.c(this.f61041a, hVar.f61041a) && p.c(this.f61042b, hVar.f61042b) && p.c(this.f61043c, hVar.f61043c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f61041a.hashCode() * 31;
        b1.h hVar = this.f61042b;
        int hashCode2 = (hashCode + (hVar != null ? hVar.hashCode() : 0)) * 31;
        l<String, v> lVar = this.f61043c;
        return hashCode2 + (lVar != null ? lVar.hashCode() : 0);
    }
}
