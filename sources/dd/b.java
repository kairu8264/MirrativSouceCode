package dd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryResponse;
import com.dena.mirrorman.clientlog.logs.MRLog;
import jo.p;

/* loaded from: classes2.dex */
public abstract class b {

    /* loaded from: classes2.dex */
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f29555a = new a();

        public a() {
            super(null);
        }
    }

    /* renamed from: dd.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0285b extends b {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f29556a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0285b(MRError mRError) {
            super(null);
            p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f29556a = mRError;
        }

        public final MRError a() {
            return this.f29556a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0285b) && p.c(this.f29556a, ((C0285b) obj).f29556a);
        }

        public int hashCode() {
            return this.f29556a.hashCode();
        }

        public String toString() {
            return "LoadFail(error=" + this.f29556a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends b {

        /* renamed from: a  reason: collision with root package name */
        public final ContractSummaryResponse f29557a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ContractSummaryResponse contractSummaryResponse) {
            super(null);
            p.h(contractSummaryResponse, "response");
            this.f29557a = contractSummaryResponse;
        }

        public final ContractSummaryResponse a() {
            return this.f29557a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p.c(this.f29557a, ((c) obj).f29557a);
        }

        public int hashCode() {
            return this.f29557a.hashCode();
        }

        public String toString() {
            return "LoadFinish(response=" + this.f29557a + ')';
        }
    }

    public b() {
    }

    public /* synthetic */ b(jo.h hVar) {
        this();
    }
}
