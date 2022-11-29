package oa;

import com.dena.mirrativ.mirrativapi.livegame.LiveGameDailyRankingYesterdayResponse;

/* loaded from: classes.dex */
public abstract class s {

    /* loaded from: classes.dex */
    public static final class a extends s {

        /* renamed from: a  reason: collision with root package name */
        public static final a f44503a = new a();

        public a() {
            super(null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends s {

        /* renamed from: a  reason: collision with root package name */
        public static final b f44504a = new b();

        public b() {
            super(null);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends s {

        /* renamed from: a  reason: collision with root package name */
        public static final c f44505a = new c();

        public c() {
            super(null);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends s {

        /* renamed from: a  reason: collision with root package name */
        public final LiveGameDailyRankingYesterdayResponse f44506a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(LiveGameDailyRankingYesterdayResponse liveGameDailyRankingYesterdayResponse) {
            super(null);
            jo.p.h(liveGameDailyRankingYesterdayResponse, "response");
            this.f44506a = liveGameDailyRankingYesterdayResponse;
        }

        public final LiveGameDailyRankingYesterdayResponse a() {
            return this.f44506a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && jo.p.c(this.f44506a, ((d) obj).f44506a);
        }

        public int hashCode() {
            return this.f44506a.hashCode();
        }

        public String toString() {
            return "LoadNextSucceed(response=" + this.f44506a + ')';
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends s {

        /* renamed from: a  reason: collision with root package name */
        public final LiveGameDailyRankingYesterdayResponse f44507a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(LiveGameDailyRankingYesterdayResponse liveGameDailyRankingYesterdayResponse) {
            super(null);
            jo.p.h(liveGameDailyRankingYesterdayResponse, "response");
            this.f44507a = liveGameDailyRankingYesterdayResponse;
        }

        public final LiveGameDailyRankingYesterdayResponse a() {
            return this.f44507a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && jo.p.c(this.f44507a, ((e) obj).f44507a);
        }

        public int hashCode() {
            return this.f44507a.hashCode();
        }

        public String toString() {
            return "LoadSucceed(response=" + this.f44507a + ')';
        }
    }

    public s() {
    }

    public /* synthetic */ s(jo.h hVar) {
        this();
    }
}
