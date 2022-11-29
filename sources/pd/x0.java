package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.event.ShooterEventResponse;

/* loaded from: classes2.dex */
public abstract class x0 {

    /* loaded from: classes2.dex */
    public static final class a extends x0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47330a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47330a = mRError;
        }

        public final MRError a() {
            return this.f47330a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f47330a, ((a) obj).f47330a);
        }

        public int hashCode() {
            return this.f47330a.hashCode();
        }

        public String toString() {
            return "LoadFailed(error=" + this.f47330a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends x0 {

        /* renamed from: a  reason: collision with root package name */
        public final ShooterEventResponse f47331a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ShooterEventResponse shooterEventResponse) {
            super(null);
            jo.p.h(shooterEventResponse, "response");
            this.f47331a = shooterEventResponse;
        }

        public final ShooterEventResponse a() {
            return this.f47331a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && jo.p.c(this.f47331a, ((b) obj).f47331a);
        }

        public int hashCode() {
            return this.f47331a.hashCode();
        }

        public String toString() {
            return "LoadSucceeded(response=" + this.f47331a + ')';
        }
    }

    public x0() {
    }

    public /* synthetic */ x0(jo.h hVar) {
        this();
    }
}
