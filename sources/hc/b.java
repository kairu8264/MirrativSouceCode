package hc;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.user.UserMe;

/* loaded from: classes2.dex */
public abstract class b {

    /* loaded from: classes2.dex */
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final String f35060a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(null);
            jo.p.h(str, "comment");
            this.f35060a = str;
        }

        public final String a() {
            return this.f35060a;
        }
    }

    /* renamed from: hc.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0444b extends b {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f35061a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0444b(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f35061a = mRError;
        }

        public final MRError a() {
            return this.f35061a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0444b) && jo.p.c(this.f35061a, ((C0444b) obj).f35061a);
        }

        public int hashCode() {
            return this.f35061a.hashCode();
        }

        public String toString() {
            return "FetchUserMeFailed(error=" + this.f35061a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends b {

        /* renamed from: b  reason: collision with root package name */
        public static final int f35062b = UserMe.$stable;

        /* renamed from: a  reason: collision with root package name */
        public final UserMe f35063a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(UserMe userMe) {
            super(null);
            jo.p.h(userMe, "userMeResponse");
            this.f35063a = userMe;
        }

        public final UserMe a() {
            return this.f35063a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f35063a, ((c) obj).f35063a);
        }

        public int hashCode() {
            return this.f35063a.hashCode();
        }

        public String toString() {
            return "FetchUserMeSucceeded(userMeResponse=" + this.f35063a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends b {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f35064a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f35064a = mRError;
        }

        public final MRError a() {
            return this.f35064a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && jo.p.c(this.f35064a, ((d) obj).f35064a);
        }

        public int hashCode() {
            return this.f35064a.hashCode();
        }

        public String toString() {
            return "PostGroupShotFailed(error=" + this.f35064a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final e f35065a = new e();

        public e() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final f f35066a = new f();

        public f() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final g f35067a = new g();

        public g() {
            super(null);
        }
    }

    public b() {
    }

    public /* synthetic */ b(jo.h hVar) {
        this();
    }
}
