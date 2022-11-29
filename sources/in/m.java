package in;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import in.a;

/* loaded from: classes4.dex */
public class m<T extends a> {
    @ym.c("auth_token")

    /* renamed from: a  reason: collision with root package name */
    private final T f36919a;
    @ym.c(TtmlNode.ATTR_ID)

    /* renamed from: b  reason: collision with root package name */
    private final long f36920b;

    public m(T t10, long j10) {
        if (t10 != null) {
            this.f36919a = t10;
            this.f36920b = j10;
            return;
        }
        throw new IllegalArgumentException("AuthToken must not be null.");
    }

    public T a() {
        return this.f36919a;
    }

    public long b() {
        return this.f36920b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f36920b != mVar.f36920b) {
            return false;
        }
        T t10 = this.f36919a;
        T t11 = mVar.f36919a;
        return t10 != null ? t10.equals(t11) : t11 == null;
    }

    public int hashCode() {
        T t10 = this.f36919a;
        int hashCode = t10 != null ? t10.hashCode() : 0;
        long j10 = this.f36920b;
        return (hashCode * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }
}
