package ce;

import com.dena.mirrorman.clientlog.logs.LogBase;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.live.LivePolling;

/* loaded from: classes2.dex */
public abstract class y {

    /* loaded from: classes2.dex */
    public static final class a extends y {
    }

    /* loaded from: classes2.dex */
    public static final class b extends y {

        /* renamed from: a  reason: collision with root package name */
        public static final b f19499a = new b();

        public b() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends y {

        /* renamed from: a  reason: collision with root package name */
        public final String f19500a;

        /* renamed from: b  reason: collision with root package name */
        public final String f19501b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2) {
            super(null);
            jo.p.h(str, LogBase.USER_ID);
            jo.p.h(str2, "referer");
            this.f19500a = str;
            this.f19501b = str2;
        }

        public final String a() {
            return this.f19501b;
        }

        public final String b() {
            return this.f19500a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return jo.p.c(this.f19500a, cVar.f19500a) && jo.p.c(this.f19501b, cVar.f19501b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f19500a.hashCode() * 31) + this.f19501b.hashCode();
        }

        public String toString() {
            return "EventPlayerReport(user_id=" + this.f19500a + ", referer=" + this.f19501b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends y {

        /* renamed from: a  reason: collision with root package name */
        public final String f19502a;

        /* renamed from: b  reason: collision with root package name */
        public final String f19503b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2) {
            super(null);
            jo.p.h(str, LogBase.USER_ID);
            jo.p.h(str2, "referer");
            this.f19502a = str;
            this.f19503b = str2;
        }

        public final String a() {
            return this.f19503b;
        }

        public final String b() {
            return this.f19502a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return jo.p.c(this.f19502a, dVar.f19502a) && jo.p.c(this.f19503b, dVar.f19503b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f19502a.hashCode() * 31) + this.f19503b.hashCode();
        }

        public String toString() {
            return "EventPlayerReportFromFloat(user_id=" + this.f19502a + ", referer=" + this.f19503b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends y {
    }

    /* loaded from: classes2.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final String f19504a;

        public f(String str) {
            jo.p.h(str, "liveID");
            this.f19504a = str;
        }

        public final String a() {
            return this.f19504a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final String f19505a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19506b;

        /* renamed from: c  reason: collision with root package name */
        public final int f19507c;

        public g(String str, int i10, int i11) {
            jo.p.h(str, MRLog.PAYLOAD_KEY_LIVE_ID);
            this.f19505a = str;
            this.f19506b = i10;
            this.f19507c = i11;
        }

        public final int a() {
            return this.f19507c;
        }

        public final int b() {
            return this.f19506b;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h {

        /* renamed from: a  reason: collision with root package name */
        public final LivePolling f19508a;

        public h(LivePolling livePolling) {
            jo.p.h(livePolling, "response");
            this.f19508a = livePolling;
        }

        public final LivePolling a() {
            return this.f19508a;
        }
    }

    public y() {
    }

    public /* synthetic */ y(jo.h hVar) {
        this();
    }
}
