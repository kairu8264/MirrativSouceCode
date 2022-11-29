package cd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;

/* loaded from: classes2.dex */
public final class b extends p {

    /* renamed from: a  reason: collision with root package name */
    public final MRError f19175a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(MRError mRError) {
        super(null);
        jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
        this.f19175a = mRError;
    }

    public final MRError a() {
        return this.f19175a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && jo.p.c(this.f19175a, ((b) obj).f19175a);
    }

    public int hashCode() {
        return this.f19175a.hashCode();
    }

    public String toString() {
        return "LoadFailed(error=" + this.f19175a + ')';
    }
}
