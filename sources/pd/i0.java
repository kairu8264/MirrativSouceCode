package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.user.UserMe;

/* loaded from: classes2.dex */
public abstract class i0 {

    /* loaded from: classes2.dex */
    public static final class a extends i0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46918a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46918a = mRError;
        }

        public final MRError a() {
            return this.f46918a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f46918a, ((a) obj).f46918a);
        }

        public int hashCode() {
            return this.f46918a.hashCode();
        }

        public String toString() {
            return "FetchAvatarsModeErrorOccurEvent(error=" + this.f46918a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends i0 {

        /* renamed from: a  reason: collision with root package name */
        public static final b f46919a = new b();

        public b() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends i0 {

        /* renamed from: a  reason: collision with root package name */
        public static final c f46920a = new c();

        public c() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends i0 {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f46921a;

        public d(boolean z10) {
            super(null);
            this.f46921a = z10;
        }

        public final boolean a() {
            return this.f46921a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f46921a == ((d) obj).f46921a;
        }

        public int hashCode() {
            boolean z10 = this.f46921a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "LivePrepareEvent(isClosed=" + this.f46921a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends i0 {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f46922a;

        public e(boolean z10) {
            super(null);
            this.f46922a = z10;
        }

        public final boolean a() {
            return this.f46922a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f46922a == ((e) obj).f46922a;
        }

        public int hashCode() {
            boolean z10 = this.f46922a;
            if (z10) {
                return 1;
            }
            return z10 ? 1 : 0;
        }

        public String toString() {
            return "NotRegisteredEvent(isLocaleJapan=" + this.f46922a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends i0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46923a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(null);
            jo.p.h(str, "profileImageUrl");
            this.f46923a = str;
        }

        public final String a() {
            return this.f46923a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && jo.p.c(this.f46923a, ((f) obj).f46923a);
        }

        public int hashCode() {
            return this.f46923a.hashCode();
        }

        public String toString() {
            return "SetProfileImageUrl(profileImageUrl=" + this.f46923a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends i0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f46924a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(null);
            jo.p.h(str, "message");
            this.f46924a = str;
        }

        public final String a() {
            return this.f46924a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && jo.p.c(this.f46924a, ((g) obj).f46924a);
        }

        public int hashCode() {
            return this.f46924a.hashCode();
        }

        public String toString() {
            return "SetToastMessage(message=" + this.f46924a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends i0 {

        /* renamed from: a  reason: collision with root package name */
        public static final h f46925a = new h();

        public h() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends i0 {

        /* renamed from: a  reason: collision with root package name */
        public static final i f46926a = new i();

        public i() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends i0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46927a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46927a = mRError;
        }

        public final MRError a() {
            return this.f46927a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && jo.p.c(this.f46927a, ((j) obj).f46927a);
        }

        public int hashCode() {
            return this.f46927a.hashCode();
        }

        public String toString() {
            return "UpdateUserMeErrorOccurEvent(error=" + this.f46927a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends i0 {

        /* renamed from: a  reason: collision with root package name */
        public final UserMe f46928a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(UserMe userMe) {
            super(null);
            jo.p.h(userMe, "me");
            this.f46928a = userMe;
        }

        public final UserMe a() {
            return this.f46928a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && jo.p.c(this.f46928a, ((k) obj).f46928a);
        }

        public int hashCode() {
            return this.f46928a.hashCode();
        }

        public String toString() {
            return "UpdateUserMeEvent(me=" + this.f46928a + ')';
        }
    }

    public i0() {
    }

    public /* synthetic */ i0(jo.h hVar) {
        this();
    }
}
