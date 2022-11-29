package gb;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.RewardAdCompleteResponse;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public abstract class b {

    /* loaded from: classes2.dex */
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f32834a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f32834a = mRError;
        }

        public final MRError a() {
            return this.f32834a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p.c(this.f32834a, ((a) obj).f32834a);
        }

        public int hashCode() {
            return this.f32834a.hashCode();
        }

        public String toString() {
            return "PostFail(error=" + this.f32834a + ')';
        }
    }

    /* renamed from: gb.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0383b extends b {

        /* renamed from: b  reason: collision with root package name */
        public static final int f32835b = RewardAdCompleteResponse.$stable;

        /* renamed from: a  reason: collision with root package name */
        public final RewardAdCompleteResponse f32836a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0383b(RewardAdCompleteResponse rewardAdCompleteResponse) {
            super(null);
            p.h(rewardAdCompleteResponse, "response");
            this.f32836a = rewardAdCompleteResponse;
        }

        public final RewardAdCompleteResponse a() {
            return this.f32836a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0383b) && p.c(this.f32836a, ((C0383b) obj).f32836a);
        }

        public int hashCode() {
            return this.f32836a.hashCode();
        }

        public String toString() {
            return "PostFinish(response=" + this.f32836a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f32837a;

        public c(boolean z10) {
            super(null);
            this.f32837a = z10;
        }

        public final boolean a() {
            return this.f32837a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f32837a == ((c) obj).f32837a;
        }

        public int hashCode() {
            boolean z10 = this.f32837a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "ShowAdLoadingState(showAdLoadingState=" + this.f32837a + ')';
        }
    }

    public b() {
    }

    public /* synthetic */ b(h hVar) {
        this();
    }
}
