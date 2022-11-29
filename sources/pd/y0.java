package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.event.DiarkisAuthInfoResponse;
import com.dena.mirrorman.net.api.response.event.ShooterEventResponse;
import com.dena.mirrorman.net.api.response.event.ShooterMemberAvatarsResponse;
import com.dena.mirrorman.net.api.response.event.ShooterTeamResultResponse;
import com.dena.mirrorman.net.api.response.event.ShooterUpdateMemberResponse;
import com.dena.mirrorman.net.api.response.event.ShooterUpdateTeamResponse;
import com.dena.mirrorman.unity.MiniGameStateType;

/* loaded from: classes2.dex */
public abstract class y0 {

    /* loaded from: classes2.dex */
    public static final class a extends y0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47347a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47347a = mRError;
        }

        public final MRError a() {
            return this.f47347a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f47347a, ((a) obj).f47347a);
        }

        public int hashCode() {
            return this.f47347a.hashCode();
        }

        public String toString() {
            return "FetchDiarkisAuthInfoFailed(error=" + this.f47347a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends y0 {

        /* renamed from: a  reason: collision with root package name */
        public final DiarkisAuthInfoResponse f47348a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(DiarkisAuthInfoResponse diarkisAuthInfoResponse) {
            super(null);
            jo.p.h(diarkisAuthInfoResponse, "response");
            this.f47348a = diarkisAuthInfoResponse;
        }

        public final DiarkisAuthInfoResponse a() {
            return this.f47348a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && jo.p.c(this.f47348a, ((b) obj).f47348a);
        }

        public int hashCode() {
            return this.f47348a.hashCode();
        }

        public String toString() {
            return "FetchDiarkisAuthInfoSucceeded(response=" + this.f47348a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends y0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47349a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47349a = mRError;
        }

        public final MRError a() {
            return this.f47349a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f47349a, ((c) obj).f47349a);
        }

        public int hashCode() {
            return this.f47349a.hashCode();
        }

        public String toString() {
            return "FetchEventFailed(error=" + this.f47349a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends y0 {

        /* renamed from: a  reason: collision with root package name */
        public final ShooterEventResponse f47350a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ShooterEventResponse shooterEventResponse) {
            super(null);
            jo.p.h(shooterEventResponse, "response");
            this.f47350a = shooterEventResponse;
        }

        public final ShooterEventResponse a() {
            return this.f47350a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && jo.p.c(this.f47350a, ((d) obj).f47350a);
        }

        public int hashCode() {
            return this.f47350a.hashCode();
        }

        public String toString() {
            return "FetchEventSucceeded(response=" + this.f47350a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends y0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47351a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47351a = mRError;
        }

        public final MRError a() {
            return this.f47351a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && jo.p.c(this.f47351a, ((e) obj).f47351a);
        }

        public int hashCode() {
            return this.f47351a.hashCode();
        }

        public String toString() {
            return "FetchMemberAvatarsFailed(error=" + this.f47351a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends y0 {

        /* renamed from: a  reason: collision with root package name */
        public final ShooterMemberAvatarsResponse f47352a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ShooterMemberAvatarsResponse shooterMemberAvatarsResponse) {
            super(null);
            jo.p.h(shooterMemberAvatarsResponse, "response");
            this.f47352a = shooterMemberAvatarsResponse;
        }

        public final ShooterMemberAvatarsResponse a() {
            return this.f47352a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && jo.p.c(this.f47352a, ((f) obj).f47352a);
        }

        public int hashCode() {
            return this.f47352a.hashCode();
        }

        public String toString() {
            return "FetchMemberAvatarsSucceeded(response=" + this.f47352a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends y0 {

        /* renamed from: a  reason: collision with root package name */
        public final ShooterTeamResultResponse f47353a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ShooterTeamResultResponse shooterTeamResultResponse) {
            super(null);
            jo.p.h(shooterTeamResultResponse, "response");
            this.f47353a = shooterTeamResultResponse;
        }

        public final ShooterTeamResultResponse a() {
            return this.f47353a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && jo.p.c(this.f47353a, ((g) obj).f47353a);
        }

        public int hashCode() {
            return this.f47353a.hashCode();
        }

        public String toString() {
            return "FetchTeamResultSucceeded(response=" + this.f47353a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends y0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47354a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47354a = mRError;
        }

        public final MRError a() {
            return this.f47354a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && jo.p.c(this.f47354a, ((h) obj).f47354a);
        }

        public int hashCode() {
            return this.f47354a.hashCode();
        }

        public String toString() {
            return "PostCommentFailed(error=" + this.f47354a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends y0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f47355a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str) {
            super(null);
            jo.p.h(str, "roomId");
            this.f47355a = str;
        }

        public final String a() {
            return this.f47355a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && jo.p.c(this.f47355a, ((i) obj).f47355a);
        }

        public int hashCode() {
            return this.f47355a.hashCode();
        }

        public String toString() {
            return "RoomIdNotified(roomId=" + this.f47355a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends y0 {

        /* renamed from: a  reason: collision with root package name */
        public final MiniGameStateType f47356a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(MiniGameStateType miniGameStateType) {
            super(null);
            jo.p.h(miniGameStateType, "gameState");
            this.f47356a = miniGameStateType;
        }

        public final MiniGameStateType a() {
            return this.f47356a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f47356a == ((j) obj).f47356a;
        }

        public int hashCode() {
            return this.f47356a.hashCode();
        }

        public String toString() {
            return "UpdateGameState(gameState=" + this.f47356a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends y0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47357a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47357a = mRError;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && jo.p.c(this.f47357a, ((k) obj).f47357a);
        }

        public int hashCode() {
            return this.f47357a.hashCode();
        }

        public String toString() {
            return "UpdateMemberStatusFailed(error=" + this.f47357a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends y0 {

        /* renamed from: a  reason: collision with root package name */
        public final ShooterUpdateMemberResponse f47358a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ShooterUpdateMemberResponse shooterUpdateMemberResponse) {
            super(null);
            jo.p.h(shooterUpdateMemberResponse, "updateMemberStatusResponse");
            this.f47358a = shooterUpdateMemberResponse;
        }

        public final ShooterUpdateMemberResponse a() {
            return this.f47358a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && jo.p.c(this.f47358a, ((l) obj).f47358a);
        }

        public int hashCode() {
            return this.f47358a.hashCode();
        }

        public String toString() {
            return "UpdateMemberStatusSucceeded(updateMemberStatusResponse=" + this.f47358a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends y0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47359a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47359a = mRError;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && jo.p.c(this.f47359a, ((m) obj).f47359a);
        }

        public int hashCode() {
            return this.f47359a.hashCode();
        }

        public String toString() {
            return "UpdateTeamStatusFailed(error=" + this.f47359a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends y0 {

        /* renamed from: a  reason: collision with root package name */
        public final ShooterUpdateTeamResponse f47360a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ShooterUpdateTeamResponse shooterUpdateTeamResponse) {
            super(null);
            jo.p.h(shooterUpdateTeamResponse, "updateTeamStatusResponse");
            this.f47360a = shooterUpdateTeamResponse;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && jo.p.c(this.f47360a, ((n) obj).f47360a);
        }

        public int hashCode() {
            return this.f47360a.hashCode();
        }

        public String toString() {
            return "UpdateTeamStatusSucceeded(updateTeamStatusResponse=" + this.f47360a + ')';
        }
    }

    public y0() {
    }

    public /* synthetic */ y0(jo.h hVar) {
        this();
    }
}
