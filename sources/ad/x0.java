package ad;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.user.ContractSummaryResponse;
import com.dena.mirrorman.clientlog.logs.MRLog;

/* loaded from: classes2.dex */
public abstract class x0 {

    /* loaded from: classes2.dex */
    public static final class a extends x0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f1411a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f1411a = mRError;
        }

        public final MRError a() {
            return this.f1411a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f1411a, ((a) obj).f1411a);
        }

        public int hashCode() {
            return this.f1411a.hashCode();
        }

        public String toString() {
            return "LoadFailSummary(error=" + this.f1411a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends x0 {

        /* renamed from: a  reason: collision with root package name */
        public final ContractSummaryResponse f1412a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ContractSummaryResponse contractSummaryResponse) {
            super(null);
            jo.p.h(contractSummaryResponse, "response");
            this.f1412a = contractSummaryResponse;
        }

        public final ContractSummaryResponse a() {
            return this.f1412a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && jo.p.c(this.f1412a, ((b) obj).f1412a);
        }

        public int hashCode() {
            return this.f1412a.hashCode();
        }

        public String toString() {
            return "LoadFinishSummary(response=" + this.f1412a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends x0 {

        /* renamed from: a  reason: collision with root package name */
        public static final c f1413a = new c();

        public c() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends x0 {

        /* renamed from: a  reason: collision with root package name */
        public static final d f1414a = new d();

        public d() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends x0 {

        /* renamed from: a  reason: collision with root package name */
        public static final e f1415a = new e();

        public e() {
            super(null);
        }
    }

    public x0() {
    }

    public /* synthetic */ x0(jo.h hVar) {
        this();
    }
}
