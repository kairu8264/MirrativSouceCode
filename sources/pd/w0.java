package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;

/* loaded from: classes2.dex */
public abstract class w0 {

    /* loaded from: classes2.dex */
    public static final class a extends w0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f47305a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f47306b;

        public a(String str, boolean z10) {
            super(null);
            this.f47305a = str;
            this.f47306b = z10;
        }

        public final String a() {
            return this.f47305a;
        }

        public final boolean b() {
            return this.f47306b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return jo.p.c(this.f47305a, aVar.f47305a) && this.f47306b == aVar.f47306b;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            String str = this.f47305a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            boolean z10 = this.f47306b;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return hashCode + i10;
        }

        public String toString() {
            return "ConfirmHandoverCodeErrorEvent(message=" + this.f47305a + ", isLocked=" + this.f47306b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends w0 {
    }

    /* loaded from: classes2.dex */
    public static final class c extends w0 {

        /* renamed from: a  reason: collision with root package name */
        public static final c f47307a = new c();

        public c() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends w0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47308a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47308a = mRError;
        }

        public final MRError a() {
            return this.f47308a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && jo.p.c(this.f47308a, ((d) obj).f47308a);
        }

        public int hashCode() {
            return this.f47308a.hashCode();
        }

        public String toString() {
            return "ConfirmHandoverCodeStatusErrorEvent(error=" + this.f47308a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends w0 {

        /* renamed from: a  reason: collision with root package name */
        public static final e f47309a = new e();

        public e() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends w0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f47310a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(null);
            jo.p.h(str, "handoverCode");
            this.f47310a = str;
        }

        public final String a() {
            return this.f47310a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && jo.p.c(this.f47310a, ((f) obj).f47310a);
        }

        public int hashCode() {
            return this.f47310a.hashCode();
        }

        public String toString() {
            return "EditHandoverCodeEvent(handoverCode=" + this.f47310a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends w0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47311a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47311a = mRError;
        }

        public final MRError a() {
            return this.f47311a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && jo.p.c(this.f47311a, ((g) obj).f47311a);
        }

        public int hashCode() {
            return this.f47311a.hashCode();
        }

        public String toString() {
            return "SaveHandoverCodeErrorEvent(error=" + this.f47311a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends w0 {

        /* renamed from: a  reason: collision with root package name */
        public static final h f47312a = new h();

        public h() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends w0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47313a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47313a = mRError;
        }

        public final MRError a() {
            return this.f47313a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && jo.p.c(this.f47313a, ((i) obj).f47313a);
        }

        public int hashCode() {
            return this.f47313a.hashCode();
        }

        public String toString() {
            return "UpdateChatOnlyFollowingsErrorEvent(error=" + this.f47313a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends w0 {

        /* renamed from: a  reason: collision with root package name */
        public static final j f47314a = new j();

        public j() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends w0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47315a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47315a = mRError;
        }

        public final MRError a() {
            return this.f47315a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && jo.p.c(this.f47315a, ((k) obj).f47315a);
        }

        public int hashCode() {
            return this.f47315a.hashCode();
        }

        public String toString() {
            return "UpdateRecordSettingsErrorEvent(error=" + this.f47315a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends w0 {

        /* renamed from: a  reason: collision with root package name */
        public static final l f47316a = new l();

        public l() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends w0 {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47317a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47317a = mRError;
        }

        public final MRError a() {
            return this.f47317a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && jo.p.c(this.f47317a, ((m) obj).f47317a);
        }

        public int hashCode() {
            return this.f47317a.hashCode();
        }

        public String toString() {
            return "WithdrawUserFailed(error=" + this.f47317a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends w0 {

        /* renamed from: a  reason: collision with root package name */
        public static final n f47318a = new n();

        public n() {
            super(null);
        }
    }

    public w0() {
    }

    public /* synthetic */ w0(jo.h hVar) {
        this();
    }
}
