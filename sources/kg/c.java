package kg;

import java.util.Map;
import java.util.Objects;
import kg.g;

/* loaded from: classes3.dex */
public final class c extends g {

    /* renamed from: a  reason: collision with root package name */
    public final ng.a f38745a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<zf.d, g.b> f38746b;

    public c(ng.a aVar, Map<zf.d, g.b> map) {
        Objects.requireNonNull(aVar, "Null clock");
        this.f38745a = aVar;
        Objects.requireNonNull(map, "Null values");
        this.f38746b = map;
    }

    @Override // kg.g
    public ng.a e() {
        return this.f38745a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return this.f38745a.equals(gVar.e()) && this.f38746b.equals(gVar.h());
        }
        return false;
    }

    @Override // kg.g
    public Map<zf.d, g.b> h() {
        return this.f38746b;
    }

    public int hashCode() {
        return ((this.f38745a.hashCode() ^ 1000003) * 1000003) ^ this.f38746b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f38745a + ", values=" + this.f38746b + "}";
    }
}
