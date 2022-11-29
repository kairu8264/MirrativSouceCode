package ad;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.user.ContractLiveResultResponse;
import com.dena.mirrorman.clientlog.logs.MRLog;

/* loaded from: classes2.dex */
public abstract class x {

    /* loaded from: classes2.dex */
    public static final class a extends x {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f1408a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f1408a = mRError;
        }

        public final MRError a() {
            return this.f1408a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f1408a, ((a) obj).f1408a);
        }

        public int hashCode() {
            return this.f1408a.hashCode();
        }

        public String toString() {
            return "LoadFailed(error=" + this.f1408a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends x {

        /* renamed from: a  reason: collision with root package name */
        public static final b f1409a = new b();

        public b() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends x {

        /* renamed from: a  reason: collision with root package name */
        public final ContractLiveResultResponse f1410a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ContractLiveResultResponse contractLiveResultResponse) {
            super(null);
            jo.p.h(contractLiveResultResponse, "response");
            this.f1410a = contractLiveResultResponse;
        }

        public final ContractLiveResultResponse a() {
            return this.f1410a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f1410a, ((c) obj).f1410a);
        }

        public int hashCode() {
            return this.f1410a.hashCode();
        }

        public String toString() {
            return "LoadSucceeded(response=" + this.f1410a + ')';
        }
    }

    public x() {
    }

    public /* synthetic */ x(jo.h hVar) {
        this();
    }
}
