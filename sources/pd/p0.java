package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.notice.NoticeYourResponse;

/* loaded from: classes2.dex */
public abstract class p0 {

    /* loaded from: classes2.dex */
    public static final class a extends p0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47106a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47106a = mRError;
        }

        public final MRError a() {
            return this.f47106a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f47106a, ((a) obj).f47106a);
        }

        public int hashCode() {
            return this.f47106a.hashCode();
        }

        public String toString() {
            return "LoadFail(error=" + this.f47106a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends p0 {

        /* renamed from: a  reason: collision with root package name */
        public final NoticeYourResponse f47107a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(NoticeYourResponse noticeYourResponse) {
            super(null);
            jo.p.h(noticeYourResponse, "response");
            this.f47107a = noticeYourResponse;
        }

        public final NoticeYourResponse a() {
            return this.f47107a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && jo.p.c(this.f47107a, ((b) obj).f47107a);
        }

        public int hashCode() {
            return this.f47107a.hashCode();
        }

        public String toString() {
            return "LoadFinish(response=" + this.f47107a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends p0 {

        /* renamed from: a  reason: collision with root package name */
        public static final c f47108a = new c();

        public c() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends p0 {

        /* renamed from: a  reason: collision with root package name */
        public final long f47109a;

        public d(long j10) {
            super(null);
            this.f47109a = j10;
        }

        public final long a() {
            return this.f47109a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f47109a == ((d) obj).f47109a;
        }

        public int hashCode() {
            return Long.hashCode(this.f47109a);
        }

        public String toString() {
            return "Reload(lastViewedTime=" + this.f47109a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends p0 {

        /* renamed from: a  reason: collision with root package name */
        public final long f47110a;

        public e(long j10) {
            super(null);
            this.f47110a = j10;
        }

        public final long a() {
            return this.f47110a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f47110a == ((e) obj).f47110a;
        }

        public int hashCode() {
            return Long.hashCode(this.f47110a);
        }

        public String toString() {
            return "ReloadFinish(noticeLatestTime=" + this.f47110a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends p0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f47111a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(null);
            jo.p.h(str, "noticeId");
            this.f47111a = str;
        }

        public final String a() {
            return this.f47111a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && jo.p.c(this.f47111a, ((f) obj).f47111a);
        }

        public int hashCode() {
            return this.f47111a.hashCode();
        }

        public String toString() {
            return "ViewNotice(noticeId=" + this.f47111a + ')';
        }
    }

    public p0() {
    }

    public /* synthetic */ p0(jo.h hVar) {
        this();
    }
}
