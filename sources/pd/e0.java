package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.LiveGiftRankingResponse;

/* loaded from: classes2.dex */
public abstract class e0 {

    /* loaded from: classes2.dex */
    public static final class a extends e0 {

        /* renamed from: a  reason: collision with root package name */
        public final jf.x f46723a;

        /* renamed from: b  reason: collision with root package name */
        public final MRError f46724b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(jf.x xVar, MRError mRError) {
            super(null);
            jo.p.h(xVar, "rankingType");
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46723a = xVar;
            this.f46724b = mRError;
        }

        public final MRError a() {
            return this.f46724b;
        }

        public jf.x b() {
            return this.f46723a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return b() == aVar.b() && jo.p.c(this.f46724b, aVar.f46724b);
            }
            return false;
        }

        public int hashCode() {
            return (b().hashCode() * 31) + this.f46724b.hashCode();
        }

        public String toString() {
            return "LoadFail(rankingType=" + b() + ", error=" + this.f46724b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends e0 {

        /* renamed from: a  reason: collision with root package name */
        public final jf.x f46725a;

        /* renamed from: b  reason: collision with root package name */
        public final LiveGiftRankingResponse f46726b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(jf.x xVar, LiveGiftRankingResponse liveGiftRankingResponse) {
            super(null);
            jo.p.h(xVar, "rankingType");
            jo.p.h(liveGiftRankingResponse, "response");
            this.f46725a = xVar;
            this.f46726b = liveGiftRankingResponse;
        }

        public jf.x a() {
            return this.f46725a;
        }

        public final LiveGiftRankingResponse b() {
            return this.f46726b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return a() == bVar.a() && jo.p.c(this.f46726b, bVar.f46726b);
            }
            return false;
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.f46726b.hashCode();
        }

        public String toString() {
            return "LoadFinish(rankingType=" + a() + ", response=" + this.f46726b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends e0 {

        /* renamed from: a  reason: collision with root package name */
        public final jf.x f46727a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(jf.x xVar) {
            super(null);
            jo.p.h(xVar, "rankingType");
            this.f46727a = xVar;
        }

        public jf.x a() {
            return this.f46727a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && a() == ((c) obj).a();
        }

        public int hashCode() {
            return a().hashCode();
        }

        public String toString() {
            return "LoadNext(rankingType=" + a() + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends e0 {

        /* renamed from: a  reason: collision with root package name */
        public final jf.x f46728a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(jf.x xVar) {
            super(null);
            jo.p.h(xVar, "rankingType");
            this.f46728a = xVar;
        }

        public jf.x a() {
            return this.f46728a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && a() == ((d) obj).a();
        }

        public int hashCode() {
            return a().hashCode();
        }

        public String toString() {
            return "Reload(rankingType=" + a() + ')';
        }
    }

    public e0() {
    }

    public /* synthetic */ e0(jo.h hVar) {
        this();
    }
}
