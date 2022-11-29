package fc;

import com.dena.mirrativ.mirrativapi.RankingFocusableResponse;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import hf.c;
import java.util.List;
import jf.w;
import jo.p;

/* loaded from: classes2.dex */
public abstract class b {

    /* loaded from: classes2.dex */
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f31911a = new a();

        public a() {
            super(null);
        }
    }

    /* renamed from: fc.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0350b extends b {

        /* renamed from: a  reason: collision with root package name */
        public final RankingFocusableResponse f31912a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0350b(RankingFocusableResponse rankingFocusableResponse) {
            super(null);
            p.h(rankingFocusableResponse, "response");
            this.f31912a = rankingFocusableResponse;
        }

        public final RankingFocusableResponse a() {
            return this.f31912a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0350b) && p.c(this.f31912a, ((C0350b) obj).f31912a);
        }

        public int hashCode() {
            return this.f31912a.hashCode();
        }

        public String toString() {
            return "FetchRankingFocusableEventsSucceeded(response=" + this.f31912a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends b {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f31913a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MRError mRError) {
            super(null);
            p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f31913a = mRError;
        }

        public final MRError a() {
            return this.f31913a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p.c(this.f31913a, ((c) obj).f31913a);
        }

        public int hashCode() {
            return this.f31913a.hashCode();
        }

        public String toString() {
            return "LoadAppsFailed(error=" + this.f31913a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends b {

        /* renamed from: a  reason: collision with root package name */
        public final List<c.a> f31914a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<c.a> list) {
            super(null);
            p.h(list, "list");
            this.f31914a = list;
        }

        public final List<c.a> a() {
            return this.f31914a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && p.c(this.f31914a, ((d) obj).f31914a);
        }

        public int hashCode() {
            return this.f31914a.hashCode();
        }

        public String toString() {
            return "LoadAppsSucceeded(list=" + this.f31914a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends b {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f31915a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MRError mRError) {
            super(null);
            p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f31915a = mRError;
        }

        public final MRError a() {
            return this.f31915a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && p.c(this.f31915a, ((e) obj).f31915a);
        }

        public int hashCode() {
            return this.f31915a.hashCode();
        }

        public String toString() {
            return "SetRankingFocusEventFailed(error=" + this.f31915a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        public final Integer f31916a;

        /* renamed from: b  reason: collision with root package name */
        public final String f31917b;

        public f(Integer num, String str) {
            super(null);
            this.f31916a = num;
            this.f31917b = str;
        }

        public final String a() {
            return this.f31917b;
        }

        public final Integer b() {
            return this.f31916a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return p.c(this.f31916a, fVar.f31916a) && p.c(this.f31917b, fVar.f31917b);
            }
            return false;
        }

        public int hashCode() {
            Integer num = this.f31916a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.f31917b;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "SetRankingFocusEventSucceeded(eventType=" + this.f31916a + ", eventId=" + this.f31917b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends b {

        /* renamed from: b  reason: collision with root package name */
        public static final int f31918b = w.A;

        /* renamed from: a  reason: collision with root package name */
        public final w f31919a;

        public g(w wVar) {
            super(null);
            this.f31919a = wVar;
        }

        public final w a() {
            return this.f31919a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && p.c(this.f31919a, ((g) obj).f31919a);
        }

        public int hashCode() {
            w wVar = this.f31919a;
            if (wVar == null) {
                return 0;
            }
            return wVar.hashCode();
        }

        public String toString() {
            return "UpdateSelectedApp(item=" + this.f31919a + ')';
        }
    }

    public b() {
    }

    public /* synthetic */ b(jo.h hVar) {
        this();
    }
}
