package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunEventResponse;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunGameResponse;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunOpenGiftGachaResponse;
import com.dena.mirrativ.mirrativapi.emomo.event.emomorun.EmomoRunScoreResponse;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.unity.MiniGameStateType;

/* loaded from: classes2.dex */
public abstract class k {

    /* loaded from: classes2.dex */
    public static final class a extends k {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47036a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47036a = mRError;
        }

        public final MRError a() {
            return this.f47036a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f47036a, ((a) obj).f47036a);
        }

        public int hashCode() {
            return this.f47036a.hashCode();
        }

        public String toString() {
            return "AppsErrorOccurEvent(error=" + this.f47036a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends k {

        /* renamed from: a  reason: collision with root package name */
        public final int f47037a;

        public b(int i10) {
            super(null);
            this.f47037a = i10;
        }

        public final int a() {
            return this.f47037a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f47037a == ((b) obj).f47037a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f47037a);
        }

        public String toString() {
            return "ConsumeEmomoRunGameGift(emomoRunGameGiftId=" + this.f47037a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends k {

        /* renamed from: a  reason: collision with root package name */
        public static final c f47038a = new c();

        public c() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends k {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47039a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47039a = mRError;
        }

        public final MRError a() {
            return this.f47039a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && jo.p.c(this.f47039a, ((d) obj).f47039a);
        }

        public int hashCode() {
            return this.f47039a.hashCode();
        }

        public String toString() {
            return "FetchOpenGiftGachaFailed(error=" + this.f47039a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends k {

        /* renamed from: a  reason: collision with root package name */
        public final EmomoRunOpenGiftGachaResponse f47040a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(EmomoRunOpenGiftGachaResponse emomoRunOpenGiftGachaResponse) {
            super(null);
            jo.p.h(emomoRunOpenGiftGachaResponse, "response");
            this.f47040a = emomoRunOpenGiftGachaResponse;
        }

        public final EmomoRunOpenGiftGachaResponse a() {
            return this.f47040a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && jo.p.c(this.f47040a, ((e) obj).f47040a);
        }

        public int hashCode() {
            return this.f47040a.hashCode();
        }

        public String toString() {
            return "FetchOpenGiftGachaSucceeded(response=" + this.f47040a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends k {

        /* renamed from: a  reason: collision with root package name */
        public final jf.c f47041a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(jf.c cVar) {
            super(null);
            jo.p.h(cVar, "emomoAvatar");
            this.f47041a = cVar;
        }

        public final jf.c a() {
            return this.f47041a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && jo.p.c(this.f47041a, ((f) obj).f47041a);
        }

        public int hashCode() {
            return this.f47041a.hashCode();
        }

        public String toString() {
            return "LoadAvatarModel(emomoAvatar=" + this.f47041a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends k {

        /* renamed from: a  reason: collision with root package name */
        public final EmomoRunEventResponse f47042a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(EmomoRunEventResponse emomoRunEventResponse) {
            super(null);
            jo.p.h(emomoRunEventResponse, "emomoRunEvent");
            this.f47042a = emomoRunEventResponse;
        }

        public final EmomoRunEventResponse a() {
            return this.f47042a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && jo.p.c(this.f47042a, ((g) obj).f47042a);
        }

        public int hashCode() {
            return this.f47042a.hashCode();
        }

        public String toString() {
            return "LoadEmomoRunEvent(emomoRunEvent=" + this.f47042a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends k {

        /* renamed from: a  reason: collision with root package name */
        public final EmomoRunScoreResponse f47043a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(EmomoRunScoreResponse emomoRunScoreResponse) {
            super(null);
            jo.p.h(emomoRunScoreResponse, "emomoRunScore");
            this.f47043a = emomoRunScoreResponse;
        }

        public final EmomoRunScoreResponse a() {
            return this.f47043a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && jo.p.c(this.f47043a, ((h) obj).f47043a);
        }

        public int hashCode() {
            return this.f47043a.hashCode();
        }

        public String toString() {
            return "LoadEmomoRunScore(emomoRunScore=" + this.f47043a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends k {

        /* renamed from: a  reason: collision with root package name */
        public static final i f47044a = new i();

        public i() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends k {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f47045a;

        public j(boolean z10) {
            super(null);
            this.f47045a = z10;
        }

        public final boolean a() {
            return this.f47045a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f47045a == ((j) obj).f47045a;
        }

        public int hashCode() {
            boolean z10 = this.f47045a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "RankingStateChangeEvent(isRankingExpanded=" + this.f47045a + ')';
        }
    }

    /* renamed from: pd.k$k  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0718k extends k {

        /* renamed from: a  reason: collision with root package name */
        public final EmomoRunGameResponse f47046a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0718k(EmomoRunGameResponse emomoRunGameResponse) {
            super(null);
            jo.p.h(emomoRunGameResponse, "emomoRunGame");
            this.f47046a = emomoRunGameResponse;
        }

        public final EmomoRunGameResponse a() {
            return this.f47046a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0718k) && jo.p.c(this.f47046a, ((C0718k) obj).f47046a);
        }

        public int hashCode() {
            return this.f47046a.hashCode();
        }

        public String toString() {
            return "UpdateEmomoRunGame(emomoRunGame=" + this.f47046a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends k {

        /* renamed from: a  reason: collision with root package name */
        public final MiniGameStateType f47047a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(MiniGameStateType miniGameStateType) {
            super(null);
            jo.p.h(miniGameStateType, "emomoRunGameState");
            this.f47047a = miniGameStateType;
        }

        public final MiniGameStateType a() {
            return this.f47047a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.f47047a == ((l) obj).f47047a;
        }

        public int hashCode() {
            return this.f47047a.hashCode();
        }

        public String toString() {
            return "UpdateEmomoRunGameState(emomoRunGameState=" + this.f47047a + ')';
        }
    }

    public k() {
    }

    public /* synthetic */ k(jo.h hVar) {
        this();
    }
}
