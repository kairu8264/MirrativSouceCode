package bg;

import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class d extends j {

    /* renamed from: a  reason: collision with root package name */
    public final List<m> f18421a;

    public d(List<m> list) {
        Objects.requireNonNull(list, "Null logRequests");
        this.f18421a = list;
    }

    @Override // bg.j
    public List<m> c() {
        return this.f18421a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f18421a.equals(((j) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f18421a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f18421a + "}";
    }
}
