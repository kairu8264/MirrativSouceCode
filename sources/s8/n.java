package s8;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import jo.p;
import s8.o;

/* loaded from: classes.dex */
public final class n implements o {

    /* renamed from: a  reason: collision with root package name */
    public final String f52434a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f52435b;

    /* renamed from: c  reason: collision with root package name */
    public final o.a f52436c;

    public n(String str, boolean z10, o.a aVar) {
        p.h(str, "profileImageUrl");
        p.h(aVar, TtmlNode.ATTR_ID);
        this.f52434a = str;
        this.f52435b = z10;
        this.f52436c = aVar;
    }

    public final String a() {
        return this.f52434a;
    }

    public final boolean b() {
        return this.f52435b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return p.c(this.f52434a, nVar.f52434a) && this.f52435b == nVar.f52435b && getId() == nVar.getId();
        }
        return false;
    }

    @Override // s8.o
    public o.a getId() {
        return this.f52436c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f52434a.hashCode() * 31;
        boolean z10 = this.f52435b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((hashCode + i10) * 31) + getId().hashCode();
    }

    public String toString() {
        return "PrivateLiveCatalogViewerBindModel(profileImageUrl=" + this.f52434a + ", isGrayScaleFilter=" + this.f52435b + ", id=" + getId() + ')';
    }

    public /* synthetic */ n(String str, boolean z10, o.a aVar, int i10, jo.h hVar) {
        this(str, z10, (i10 & 4) != 0 ? o.a.VIEWER : aVar);
    }
}
