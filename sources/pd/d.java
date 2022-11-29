package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.App;

/* loaded from: classes2.dex */
public abstract class d {

    /* loaded from: classes2.dex */
    public static final class a extends d {

        /* renamed from: a  reason: collision with root package name */
        public final String f46695a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(null);
            jo.p.h(str, "appId");
            this.f46695a = str;
        }

        public final String a() {
            return this.f46695a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f46695a, ((a) obj).f46695a);
        }

        public int hashCode() {
            return this.f46695a.hashCode();
        }

        public String toString() {
            return "CheckApp(appId=" + this.f46695a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends d {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46696a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46696a = mRError;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && jo.p.c(this.f46696a, ((b) obj).f46696a);
        }

        public int hashCode() {
            return this.f46696a.hashCode();
        }

        public String toString() {
            return "LoadMoreAppsFail(error=" + this.f46696a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends d {

        /* renamed from: a  reason: collision with root package name */
        public final App.Apps f46697a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(App.Apps apps) {
            super(null);
            jo.p.h(apps, "apps");
            this.f46697a = apps;
        }

        public final App.Apps a() {
            return this.f46697a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jo.p.c(this.f46697a, ((c) obj).f46697a);
        }

        public int hashCode() {
            return this.f46697a.hashCode();
        }

        public String toString() {
            return "LoadMoreAppsFinish(apps=" + this.f46697a + ')';
        }
    }

    /* renamed from: pd.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0713d extends d {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46698a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0713d(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46698a = mRError;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0713d) && jo.p.c(this.f46698a, ((C0713d) obj).f46698a);
        }

        public int hashCode() {
            return this.f46698a.hashCode();
        }

        public String toString() {
            return "LoadRecommendAppsFail(error=" + this.f46698a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends d {

        /* renamed from: a  reason: collision with root package name */
        public final App.Apps f46699a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(App.Apps apps) {
            super(null);
            jo.p.h(apps, "apps");
            this.f46699a = apps;
        }

        public final App.Apps a() {
            return this.f46699a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && jo.p.c(this.f46699a, ((e) obj).f46699a);
        }

        public int hashCode() {
            return this.f46699a.hashCode();
        }

        public String toString() {
            return "LoadRecommendAppsFinish(apps=" + this.f46699a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends d {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46700a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46700a = mRError;
        }

        public final MRError a() {
            return this.f46700a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && jo.p.c(this.f46700a, ((f) obj).f46700a);
        }

        public int hashCode() {
            return this.f46700a.hashCode();
        }

        public String toString() {
            return "RegisterMyAppFail(error=" + this.f46700a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends d {

        /* renamed from: a  reason: collision with root package name */
        public static final g f46701a = new g();

        public g() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends d {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f46702a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f46702a = mRError;
        }

        public final MRError a() {
            return this.f46702a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && jo.p.c(this.f46702a, ((h) obj).f46702a);
        }

        public int hashCode() {
            return this.f46702a.hashCode();
        }

        public String toString() {
            return "SearchAppsFail(error=" + this.f46702a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends d {

        /* renamed from: a  reason: collision with root package name */
        public final App.Apps f46703a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(App.Apps apps) {
            super(null);
            jo.p.h(apps, "apps");
            this.f46703a = apps;
        }

        public final App.Apps a() {
            return this.f46703a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && jo.p.c(this.f46703a, ((i) obj).f46703a);
        }

        public int hashCode() {
            return this.f46703a.hashCode();
        }

        public String toString() {
            return "SearchAppsFinish(apps=" + this.f46703a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends d {

        /* renamed from: a  reason: collision with root package name */
        public static final j f46704a = new j();

        public j() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class k extends d {

        /* renamed from: a  reason: collision with root package name */
        public static final k f46705a = new k();

        public k() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends d {

        /* renamed from: a  reason: collision with root package name */
        public static final l f46706a = new l();

        public l() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends d {

        /* renamed from: a  reason: collision with root package name */
        public final String f46707a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str) {
            super(null);
            jo.p.h(str, "queryWord");
            this.f46707a = str;
        }

        public final String a() {
            return this.f46707a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && jo.p.c(this.f46707a, ((m) obj).f46707a);
        }

        public int hashCode() {
            return this.f46707a.hashCode();
        }

        public String toString() {
            return "TrySearch(queryWord=" + this.f46707a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends d {

        /* renamed from: a  reason: collision with root package name */
        public final String f46708a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str) {
            super(null);
            jo.p.h(str, "appId");
            this.f46708a = str;
        }

        public final String a() {
            return this.f46708a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && jo.p.c(this.f46708a, ((n) obj).f46708a);
        }

        public int hashCode() {
            return this.f46708a.hashCode();
        }

        public String toString() {
            return "UncheckApp(appId=" + this.f46708a + ')';
        }
    }

    public d() {
    }

    public /* synthetic */ d(jo.h hVar) {
        this();
    }
}
