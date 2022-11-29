package s8;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import jo.p;
import s8.o;

/* loaded from: classes.dex */
public final class m implements o {

    /* renamed from: a  reason: collision with root package name */
    public final o.a f52433a;

    public m() {
        this(null, 1, null);
    }

    public m(o.a aVar) {
        p.h(aVar, TtmlNode.ATTR_ID);
        this.f52433a = aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && getId() == ((m) obj).getId();
    }

    @Override // s8.o
    public o.a getId() {
        return this.f52433a;
    }

    public int hashCode() {
        return getId().hashCode();
    }

    public String toString() {
        return "PrivateLiveCatalogMoreUsersBindModel(id=" + getId() + ')';
    }

    public /* synthetic */ m(o.a aVar, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? o.a.MORE_USERS : aVar);
    }
}
