package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.event.ShooterMatchingResponse;

/* loaded from: classes2.dex */
public abstract class a1 {

    /* loaded from: classes2.dex */
    public static final class a extends a1 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46578a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46578a = mRError;
        }

        public final MRError a() {
            return this.f46578a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f46578a, ((a) obj).f46578a);
        }

        public int hashCode() {
            return this.f46578a.hashCode();
        }

        public String toString() {
            return "AcceptMatchingFailed(error=" + this.f46578a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends a1 {

        /* renamed from: a  reason: collision with root package name */
        public static final b f46579a = new b();

        public b() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends a1 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46580a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(null);
            jo.p.h(str, "liveId");
            this.f46580a = str;
        }

        public final String a() {
            return this.f46580a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f46580a, ((c) obj).f46580a);
        }

        public int hashCode() {
            return this.f46580a.hashCode();
        }

        public String toString() {
            return "AcceptMatchingSucceeded(liveId=" + this.f46580a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends a1 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46581a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46581a = mRError;
        }

        public final MRError a() {
            return this.f46581a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && jo.p.c(this.f46581a, ((d) obj).f46581a);
        }

        public int hashCode() {
            return this.f46581a.hashCode();
        }

        public String toString() {
            return "CancelMatchingFailed(error=" + this.f46581a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends a1 {

        /* renamed from: a  reason: collision with root package name */
        public static final e f46582a = new e();

        public e() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends a1 {

        /* renamed from: a  reason: collision with root package name */
        public static final f f46583a = new f();

        public f() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends a1 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46584a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46584a = mRError;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && jo.p.c(this.f46584a, ((g) obj).f46584a);
        }

        public int hashCode() {
            return this.f46584a.hashCode();
        }

        public String toString() {
            return "FetchMatchingFailed(error=" + this.f46584a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends a1 {

        /* renamed from: a  reason: collision with root package name */
        public static final h f46585a = new h();

        public h() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends a1 {

        /* renamed from: a  reason: collision with root package name */
        public final ShooterMatchingResponse f46586a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ShooterMatchingResponse shooterMatchingResponse) {
            super(null);
            jo.p.h(shooterMatchingResponse, "response");
            this.f46586a = shooterMatchingResponse;
        }

        public final ShooterMatchingResponse a() {
            return this.f46586a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && jo.p.c(this.f46586a, ((i) obj).f46586a);
        }

        public int hashCode() {
            return this.f46586a.hashCode();
        }

        public String toString() {
            return "FetchMatchingSucceeded(response=" + this.f46586a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends a1 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46587a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46587a = mRError;
        }

        public final MRError a() {
            return this.f46587a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && jo.p.c(this.f46587a, ((j) obj).f46587a);
        }

        public int hashCode() {
            return this.f46587a.hashCode();
        }

        public String toString() {
            return "RequestMatchingFailed(error=" + this.f46587a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends a1 {

        /* renamed from: a  reason: collision with root package name */
        public static final k f46588a = new k();

        public k() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends a1 {

        /* renamed from: a  reason: collision with root package name */
        public static final l f46589a = new l();

        public l() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends a1 {

        /* renamed from: a  reason: collision with root package name */
        public static final m f46590a = new m();

        public m() {
            super(null);
        }
    }

    public a1() {
    }

    public /* synthetic */ a1(jo.h hVar) {
        this();
    }
}
