package eb;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.livegame.LiveGameStartResponse;
import com.dena.mirrorman.clientlog.logs.MRLog;
import jo.p;

/* loaded from: classes2.dex */
public abstract class f {

    /* loaded from: classes2.dex */
    public static final class a extends f {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f30365a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f30365a = mRError;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p.c(this.f30365a, ((a) obj).f30365a);
        }

        public int hashCode() {
            return this.f30365a.hashCode();
        }

        public String toString() {
            return "ApiRequestFailed(error=" + this.f30365a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends f {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f30366a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MRError mRError) {
            super(null);
            p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f30366a = mRError;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p.c(this.f30366a, ((b) obj).f30366a);
        }

        public int hashCode() {
            return this.f30366a.hashCode();
        }

        public String toString() {
            return "FetchNuuWelcomeLiveFailed(error=" + this.f30366a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends f {

        /* renamed from: a  reason: collision with root package name */
        public final String f30367a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(null);
            p.h(str, "liveId");
            this.f30367a = str;
        }

        public final String a() {
            return this.f30367a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p.c(this.f30367a, ((c) obj).f30367a);
        }

        public int hashCode() {
            return this.f30367a.hashCode();
        }

        public String toString() {
            return "FetchNuuWelcomeLiveSucceeded(liveId=" + this.f30367a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends f {

        /* renamed from: a  reason: collision with root package name */
        public final LiveGameStartResponse f30368a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(LiveGameStartResponse liveGameStartResponse) {
            super(null);
            p.h(liveGameStartResponse, "startResponse");
            this.f30368a = liveGameStartResponse;
        }

        public final LiveGameStartResponse a() {
            return this.f30368a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && p.c(this.f30368a, ((d) obj).f30368a);
        }

        public int hashCode() {
            return this.f30368a.hashCode();
        }

        public String toString() {
            return "JoinLiveGameSucceeded(startResponse=" + this.f30368a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends f {

        /* renamed from: a  reason: collision with root package name */
        public final m f30369a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(m mVar) {
            super(null);
            p.h(mVar, "onboardingSurveyItem");
            this.f30369a = mVar;
        }

        public final m a() {
            return this.f30369a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f30369a == ((e) obj).f30369a;
        }

        public int hashCode() {
            return this.f30369a.hashCode();
        }

        public String toString() {
            return "OnboardingSurveyItemSelected(onboardingSurveyItem=" + this.f30369a + ')';
        }
    }

    public f() {
    }

    public /* synthetic */ f(jo.h hVar) {
        this();
    }
}
