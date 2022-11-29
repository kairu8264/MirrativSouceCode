package pd;

import com.dena.mirrativ.mirrativapi.user.ContractSummaryResponse;

/* loaded from: classes2.dex */
public abstract class j {

    /* loaded from: classes2.dex */
    public static final class a extends j {
    }

    /* loaded from: classes2.dex */
    public static final class b extends j {

        /* renamed from: a  reason: collision with root package name */
        public static final b f46989a = new b();

        public b() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends j {

        /* renamed from: a  reason: collision with root package name */
        public final ContractSummaryResponse f46990a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ContractSummaryResponse contractSummaryResponse) {
            super(null);
            jo.p.h(contractSummaryResponse, "response");
            this.f46990a = contractSummaryResponse;
        }

        public final ContractSummaryResponse a() {
            return this.f46990a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f46990a, ((c) obj).f46990a);
        }

        public int hashCode() {
            return this.f46990a.hashCode();
        }

        public String toString() {
            return "LoadSucceeded(response=" + this.f46990a + ')';
        }
    }

    public j() {
    }

    public /* synthetic */ j(jo.h hVar) {
        this();
    }
}
