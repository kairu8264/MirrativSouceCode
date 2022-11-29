package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.notice.NoticePresentBoxResponse;

/* loaded from: classes2.dex */
public abstract class o0 {

    /* loaded from: classes2.dex */
    public static final class a extends o0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47095a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47095a = mRError;
        }

        public final MRError a() {
            return this.f47095a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f47095a, ((a) obj).f47095a);
        }

        public int hashCode() {
            return this.f47095a.hashCode();
        }

        public String toString() {
            return "LoadFail(error=" + this.f47095a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends o0 {

        /* renamed from: a  reason: collision with root package name */
        public final NoticePresentBoxResponse f47096a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(NoticePresentBoxResponse noticePresentBoxResponse) {
            super(null);
            jo.p.h(noticePresentBoxResponse, "response");
            this.f47096a = noticePresentBoxResponse;
        }

        public final NoticePresentBoxResponse a() {
            return this.f47096a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && jo.p.c(this.f47096a, ((b) obj).f47096a);
        }

        public int hashCode() {
            return this.f47096a.hashCode();
        }

        public String toString() {
            return "LoadFinish(response=" + this.f47096a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends o0 {

        /* renamed from: a  reason: collision with root package name */
        public static final c f47097a = new c();

        public c() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends o0 {

        /* renamed from: a  reason: collision with root package name */
        public final long f47098a;

        public d(long j10) {
            super(null);
            this.f47098a = j10;
        }

        public final long a() {
            return this.f47098a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f47098a == ((d) obj).f47098a;
        }

        public int hashCode() {
            return Long.hashCode(this.f47098a);
        }

        public String toString() {
            return "Reload(lastViewedTime=" + this.f47098a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends o0 {

        /* renamed from: a  reason: collision with root package name */
        public final long f47099a;

        public e(long j10) {
            super(null);
            this.f47099a = j10;
        }

        public final long a() {
            return this.f47099a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f47099a == ((e) obj).f47099a;
        }

        public int hashCode() {
            return Long.hashCode(this.f47099a);
        }

        public String toString() {
            return "ReloadFinish(noticeLatestTime=" + this.f47099a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends o0 {

        /* renamed from: a  reason: collision with root package name */
        public final int f47100a;

        public f(int i10) {
            super(null);
            this.f47100a = i10;
        }

        public final int a() {
            return this.f47100a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f47100a == ((f) obj).f47100a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f47100a);
        }

        public String toString() {
            return "ViewNotice(userPresentId=" + this.f47100a + ')';
        }
    }

    public o0() {
    }

    public /* synthetic */ o0(jo.h hVar) {
        this();
    }
}
