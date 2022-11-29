package be;

/* loaded from: classes2.dex */
public final class c3 {

    /* renamed from: a  reason: collision with root package name */
    public final jf.x f17769a;

    public c3(jf.x xVar) {
        jo.p.h(xVar, "enabledScrollRankingType");
        this.f17769a = xVar;
    }

    public final jf.x a() {
        return this.f17769a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c3) && this.f17769a == ((c3) obj).f17769a;
    }

    public int hashCode() {
        return this.f17769a.hashCode();
    }

    public String toString() {
        return "LiveGiftRankingBottomSheetDialogFragmentEvent(enabledScrollRankingType=" + this.f17769a + ')';
    }
}
