package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.notice.NoticeNewsResponse;

/* loaded from: classes2.dex */
public abstract class n0 {

    /* loaded from: classes2.dex */
    public static final class a extends n0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47080a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47080a = mRError;
        }

        public final MRError a() {
            return this.f47080a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f47080a, ((a) obj).f47080a);
        }

        public int hashCode() {
            return this.f47080a.hashCode();
        }

        public String toString() {
            return "LoadFail(error=" + this.f47080a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends n0 {

        /* renamed from: a  reason: collision with root package name */
        public final NoticeNewsResponse f47081a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(NoticeNewsResponse noticeNewsResponse) {
            super(null);
            jo.p.h(noticeNewsResponse, "response");
            this.f47081a = noticeNewsResponse;
        }

        public final NoticeNewsResponse a() {
            return this.f47081a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && jo.p.c(this.f47081a, ((b) obj).f47081a);
        }

        public int hashCode() {
            return this.f47081a.hashCode();
        }

        public String toString() {
            return "LoadFinish(response=" + this.f47081a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends n0 {

        /* renamed from: a  reason: collision with root package name */
        public static final c f47082a = new c();

        public c() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends n0 {

        /* renamed from: a  reason: collision with root package name */
        public final long f47083a;

        public d(long j10) {
            super(null);
            this.f47083a = j10;
        }

        public final long a() {
            return this.f47083a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f47083a == ((d) obj).f47083a;
        }

        public int hashCode() {
            return Long.hashCode(this.f47083a);
        }

        public String toString() {
            return "Reload(lastViewedTime=" + this.f47083a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends n0 {

        /* renamed from: a  reason: collision with root package name */
        public final long f47084a;

        public e(long j10) {
            super(null);
            this.f47084a = j10;
        }

        public final long a() {
            return this.f47084a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f47084a == ((e) obj).f47084a;
        }

        public int hashCode() {
            return Long.hashCode(this.f47084a);
        }

        public String toString() {
            return "ReloadFinish(noticeLatestTime=" + this.f47084a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends n0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f47085a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(null);
            jo.p.h(str, "noticeId");
            this.f47085a = str;
        }

        public final String a() {
            return this.f47085a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && jo.p.c(this.f47085a, ((f) obj).f47085a);
        }

        public int hashCode() {
            return this.f47085a.hashCode();
        }

        public String toString() {
            return "ViewNotice(noticeId=" + this.f47085a + ')';
        }
    }

    public n0() {
    }

    public /* synthetic */ n0(jo.h hVar) {
        this();
    }
}
