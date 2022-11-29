package ad;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.user.ContractBanksResponse;
import com.dena.mirrorman.clientlog.logs.MRLog;

/* loaded from: classes2.dex */
public abstract class l {

    /* loaded from: classes2.dex */
    public static final class a extends l {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f1188a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f1188a = mRError;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f1188a, ((a) obj).f1188a);
        }

        public int hashCode() {
            return this.f1188a.hashCode();
        }

        public String toString() {
            return "LoadFailed(error=" + this.f1188a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f1189a = new b();

        public b() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends l {

        /* renamed from: a  reason: collision with root package name */
        public final ContractBanksResponse f1190a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ContractBanksResponse contractBanksResponse) {
            super(null);
            jo.p.h(contractBanksResponse, "response");
            this.f1190a = contractBanksResponse;
        }

        public final ContractBanksResponse a() {
            return this.f1190a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f1190a, ((c) obj).f1190a);
        }

        public int hashCode() {
            return this.f1190a.hashCode();
        }

        public String toString() {
            return "LoadSucceeded(response=" + this.f1190a + ')';
        }
    }

    public l() {
    }

    public /* synthetic */ l(jo.h hVar) {
        this();
    }
}
