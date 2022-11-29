package cd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.user.ContractKycResponse;
import com.dena.mirrorman.clientlog.logs.MRLog;

/* loaded from: classes2.dex */
public abstract class p {

    /* loaded from: classes2.dex */
    public static final class a extends p {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f19263a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f19263a = mRError;
        }

        public final MRError a() {
            return this.f19263a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f19263a, ((a) obj).f19263a);
        }

        public int hashCode() {
            return this.f19263a.hashCode();
        }

        public String toString() {
            return "LoadFailed(error=" + this.f19263a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends p {

        /* renamed from: a  reason: collision with root package name */
        public static final b f19264a = new b();

        public b() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends p {

        /* renamed from: a  reason: collision with root package name */
        public final ContractKycResponse f19265a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ContractKycResponse contractKycResponse) {
            super(null);
            jo.p.h(contractKycResponse, "response");
            this.f19265a = contractKycResponse;
        }

        public final ContractKycResponse a() {
            return this.f19265a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f19265a, ((c) obj).f19265a);
        }

        public int hashCode() {
            return this.f19265a.hashCode();
        }

        public String toString() {
            return "LoadSucceeded(response=" + this.f19265a + ')';
        }
    }

    public p() {
    }

    public /* synthetic */ p(jo.h hVar) {
        this();
    }
}
