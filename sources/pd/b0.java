package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;

/* loaded from: classes2.dex */
public final class b0 extends e0 {

    /* renamed from: a  reason: collision with root package name */
    public final jf.x f46605a;

    /* renamed from: b  reason: collision with root package name */
    public final MRError f46606b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(jf.x xVar, MRError mRError) {
        super(null);
        jo.p.h(xVar, "rankingType");
        jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
        this.f46605a = xVar;
        this.f46606b = mRError;
    }

    public final MRError a() {
        return this.f46606b;
    }

    public jf.x b() {
        return this.f46605a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            return b() == b0Var.b() && jo.p.c(this.f46606b, b0Var.f46606b);
        }
        return false;
    }

    public int hashCode() {
        return (b().hashCode() * 31) + this.f46606b.hashCode();
    }

    public String toString() {
        return "LoadFail(rankingType=" + b() + ", error=" + this.f46606b + ')';
    }
}
