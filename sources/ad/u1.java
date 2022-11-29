package ad;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;

/* loaded from: classes2.dex */
public final class u1 extends x0 {

    /* renamed from: a  reason: collision with root package name */
    public final MRError f1371a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(MRError mRError) {
        super(null);
        jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
        this.f1371a = mRError;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u1) && jo.p.c(this.f1371a, ((u1) obj).f1371a);
    }

    public int hashCode() {
        return this.f1371a.hashCode();
    }

    public String toString() {
        return "PostContractStatusFailed(error=" + this.f1371a + ')';
    }
}
