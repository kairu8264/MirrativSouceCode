package z8;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.MissionInfoResponse;
import com.dena.mirrorman.net.api.response.MissionReceiveRewardResponse;

/* loaded from: classes.dex */
public abstract class m {

    /* loaded from: classes.dex */
    public static final class a extends m {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f62705a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f62705a = mRError;
        }

        public final MRError a() {
            return this.f62705a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f62705a, ((a) obj).f62705a);
        }

        public int hashCode() {
            return this.f62705a.hashCode();
        }

        public String toString() {
            return "LoadFail(error=" + this.f62705a + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends m {

        /* renamed from: b  reason: collision with root package name */
        public static final int f62706b = MissionInfoResponse.$stable;

        /* renamed from: a  reason: collision with root package name */
        public final MissionInfoResponse f62707a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MissionInfoResponse missionInfoResponse) {
            super(null);
            jo.p.h(missionInfoResponse, "response");
            this.f62707a = missionInfoResponse;
        }

        public final MissionInfoResponse a() {
            return this.f62707a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && jo.p.c(this.f62707a, ((b) obj).f62707a);
        }

        public int hashCode() {
            return this.f62707a.hashCode();
        }

        public String toString() {
            return "LoadFinish(response=" + this.f62707a + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends m {

        /* renamed from: a  reason: collision with root package name */
        public static final c f62708a = new c();

        public c() {
            super(null);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends m {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f62709a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f62709a = mRError;
        }

        public final MRError a() {
            return this.f62709a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && jo.p.c(this.f62709a, ((d) obj).f62709a);
        }

        public int hashCode() {
            return this.f62709a.hashCode();
        }

        public String toString() {
            return "ReceiveRewardFailed(error=" + this.f62709a + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends m {

        /* renamed from: a  reason: collision with root package name */
        public static final e f62710a = new e();

        public e() {
            super(null);
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends m {

        /* renamed from: d  reason: collision with root package name */
        public static final int f62711d = MissionReceiveRewardResponse.$stable;

        /* renamed from: a  reason: collision with root package name */
        public final MissionReceiveRewardResponse f62712a;

        /* renamed from: b  reason: collision with root package name */
        public final int f62713b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f62714c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(MissionReceiveRewardResponse missionReceiveRewardResponse, int i10, boolean z10) {
            super(null);
            jo.p.h(missionReceiveRewardResponse, "response");
            this.f62712a = missionReceiveRewardResponse;
            this.f62713b = i10;
            this.f62714c = z10;
        }

        public final int a() {
            return this.f62713b;
        }

        public final MissionReceiveRewardResponse b() {
            return this.f62712a;
        }

        public final boolean c() {
            return this.f62714c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return jo.p.c(this.f62712a, fVar.f62712a) && this.f62713b == fVar.f62713b && this.f62714c == fVar.f62714c;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((this.f62712a.hashCode() * 31) + Integer.hashCode(this.f62713b)) * 31;
            boolean z10 = this.f62714c;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return hashCode + i10;
        }

        public String toString() {
            return "ReceiveRewardSucceeded(response=" + this.f62712a + ", missionId=" + this.f62713b + ", isSpecialMissionReward=" + this.f62714c + ')';
        }
    }

    public m() {
    }

    public /* synthetic */ m(jo.h hVar) {
        this();
    }
}
