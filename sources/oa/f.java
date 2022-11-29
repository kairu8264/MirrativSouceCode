package oa;

import com.dena.mirrativ.mirrativapi.livegame.LiveGameDailyRankingResponse;

/* loaded from: classes.dex */
public abstract class f {

    /* loaded from: classes.dex */
    public static final class a extends f {

        /* renamed from: a  reason: collision with root package name */
        public static final a f44339a = new a();

        public a() {
            super(null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f44340a = new b();

        public b() {
            super(null);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends f {
    }

    /* loaded from: classes.dex */
    public static final class d extends f {

        /* renamed from: a  reason: collision with root package name */
        public final LiveGameDailyRankingResponse f44341a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(LiveGameDailyRankingResponse liveGameDailyRankingResponse) {
            super(null);
            jo.p.h(liveGameDailyRankingResponse, "response");
            this.f44341a = liveGameDailyRankingResponse;
        }

        public final LiveGameDailyRankingResponse a() {
            return this.f44341a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && jo.p.c(this.f44341a, ((d) obj).f44341a);
        }

        public int hashCode() {
            return this.f44341a.hashCode();
        }

        public String toString() {
            return "LoadNextSucceed(response=" + this.f44341a + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends f {

        /* renamed from: a  reason: collision with root package name */
        public final LiveGameDailyRankingResponse f44342a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(LiveGameDailyRankingResponse liveGameDailyRankingResponse) {
            super(null);
            jo.p.h(liveGameDailyRankingResponse, "response");
            this.f44342a = liveGameDailyRankingResponse;
        }

        public final LiveGameDailyRankingResponse a() {
            return this.f44342a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && jo.p.c(this.f44342a, ((e) obj).f44342a);
        }

        public int hashCode() {
            return this.f44342a.hashCode();
        }

        public String toString() {
            return "LoadSucceed(response=" + this.f44342a + ')';
        }
    }

    public f() {
    }

    public /* synthetic */ f(jo.h hVar) {
        this();
    }
}
