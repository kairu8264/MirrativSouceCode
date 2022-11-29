package pd;

import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.api.response.AppUserDetailResponse;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class z {

    /* loaded from: classes2.dex */
    public static final class a extends z {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47361a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47361a = mRError;
        }

        public final MRError a() {
            return this.f47361a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jo.p.c(this.f47361a, ((a) obj).f47361a);
        }

        public int hashCode() {
            return this.f47361a.hashCode();
        }

        public String toString() {
            return "AppsErrorOccurEvent(error=" + this.f47361a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends z {

        /* renamed from: a  reason: collision with root package name */
        public static final b f47362a = new b();

        public b() {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends z {

        /* renamed from: a  reason: collision with root package name */
        public final List<App.AppParams> f47363a;

        /* renamed from: b  reason: collision with root package name */
        public final int f47364b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<App.AppParams> list, int i10) {
            super(null);
            jo.p.h(list, "apps");
            this.f47363a = list;
            this.f47364b = i10;
        }

        public final List<App.AppParams> a() {
            return this.f47363a;
        }

        public final int b() {
            return this.f47364b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return jo.p.c(this.f47363a, cVar.f47363a) && this.f47364b == cVar.f47364b;
            }
            return false;
        }

        public int hashCode() {
            return (this.f47363a.hashCode() * 31) + Integer.hashCode(this.f47364b);
        }

        public String toString() {
            return "AppsLoadNextFinishEvent(apps=" + this.f47363a + ", nextPage=" + this.f47364b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends z {

        /* renamed from: a  reason: collision with root package name */
        public final String f47365a;

        public d(String str) {
            super(null);
            this.f47365a = str;
        }

        public final String a() {
            return this.f47365a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && jo.p.c(this.f47365a, ((d) obj).f47365a);
        }

        public int hashCode() {
            String str = this.f47365a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "AppsReloadEvent(selectedAppId=" + this.f47365a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends z {

        /* renamed from: a  reason: collision with root package name */
        public final List<App.AppParams> f47366a;

        /* renamed from: b  reason: collision with root package name */
        public final App.AppParams f47367b;

        /* renamed from: c  reason: collision with root package name */
        public final int f47368c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List<App.AppParams> list, App.AppParams appParams, int i10) {
            super(null);
            jo.p.h(list, "apps");
            this.f47366a = list;
            this.f47367b = appParams;
            this.f47368c = i10;
        }

        public final List<App.AppParams> a() {
            return this.f47366a;
        }

        public final int b() {
            return this.f47368c;
        }

        public final App.AppParams c() {
            return this.f47367b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return jo.p.c(this.f47366a, eVar.f47366a) && jo.p.c(this.f47367b, eVar.f47367b) && this.f47368c == eVar.f47368c;
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f47366a.hashCode() * 31;
            App.AppParams appParams = this.f47367b;
            return ((hashCode + (appParams == null ? 0 : appParams.hashCode())) * 31) + Integer.hashCode(this.f47368c);
        }

        public String toString() {
            return "AppsReloadFinishEvent(apps=" + this.f47366a + ", selectedApp=" + this.f47367b + ", nextPage=" + this.f47368c + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends z {

        /* renamed from: a  reason: collision with root package name */
        public final App.AppParams f47369a;

        public f(App.AppParams appParams) {
            super(null);
            this.f47369a = appParams;
        }

        public final App.AppParams a() {
            return this.f47369a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && jo.p.c(this.f47369a, ((f) obj).f47369a);
        }

        public int hashCode() {
            App.AppParams appParams = this.f47369a;
            if (appParams == null) {
                return 0;
            }
            return appParams.hashCode();
        }

        public String toString() {
            return "AppsSettingChangedEvent(app=" + this.f47369a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends z {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47370a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47370a = mRError;
        }

        public final MRError a() {
            return this.f47370a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && jo.p.c(this.f47370a, ((g) obj).f47370a);
        }

        public int hashCode() {
            return this.f47370a.hashCode();
        }

        public String toString() {
            return "DeleteAppUserDetailFailEvent(error=" + this.f47370a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends z {

        /* renamed from: a  reason: collision with root package name */
        public final String f47371a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(null);
            jo.p.h(str, "appId");
            this.f47371a = str;
        }

        public final String a() {
            return this.f47371a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && jo.p.c(this.f47371a, ((h) obj).f47371a);
        }

        public int hashCode() {
            return this.f47371a.hashCode();
        }

        public String toString() {
            return "DeleteAppUserDetailSuccessEvent(appId=" + this.f47371a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends z {
    }

    /* loaded from: classes2.dex */
    public static final class j extends z {
    }

    /* loaded from: classes2.dex */
    public static final class k extends z {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47372a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47372a = mRError;
        }

        public final MRError a() {
            return this.f47372a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && jo.p.c(this.f47372a, ((k) obj).f47372a);
        }

        public int hashCode() {
            return this.f47372a.hashCode();
        }

        public String toString() {
            return "PostAppUserDetailFailEvent(error=" + this.f47372a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class l extends z {

        /* renamed from: a  reason: collision with root package name */
        public final String f47373a;

        /* renamed from: b  reason: collision with root package name */
        public final AppUserDetailResponse f47374b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, AppUserDetailResponse appUserDetailResponse) {
            super(null);
            jo.p.h(str, "appId");
            jo.p.h(appUserDetailResponse, "response");
            this.f47373a = str;
            this.f47374b = appUserDetailResponse;
        }

        public final String a() {
            return this.f47373a;
        }

        public final AppUserDetailResponse b() {
            return this.f47374b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof l) {
                l lVar = (l) obj;
                return jo.p.c(this.f47373a, lVar.f47373a) && jo.p.c(this.f47374b, lVar.f47374b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f47373a.hashCode() * 31) + this.f47374b.hashCode();
        }

        public String toString() {
            return "PostAppUserDetailSuccessEvent(appId=" + this.f47373a + ", response=" + this.f47374b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class m extends z {

        /* renamed from: a  reason: collision with root package name */
        public final MRError f47375a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(MRError mRError) {
            super(null);
            jo.p.h(mRError, MRLog.PAYLOAD_KEY_ERROR);
            this.f47375a = mRError;
        }

        public final MRError a() {
            return this.f47375a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && jo.p.c(this.f47375a, ((m) obj).f47375a);
        }

        public int hashCode() {
            return this.f47375a.hashCode();
        }

        public String toString() {
            return "PublishAppUserDetailFailEvent(error=" + this.f47375a + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class n extends z {

        /* renamed from: a  reason: collision with root package name */
        public final String f47376a;

        /* renamed from: b  reason: collision with root package name */
        public final AppUserDetailResponse f47377b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, AppUserDetailResponse appUserDetailResponse) {
            super(null);
            jo.p.h(str, "appId");
            jo.p.h(appUserDetailResponse, "appUserDetailResponse");
            this.f47376a = str;
            this.f47377b = appUserDetailResponse;
        }

        public final String a() {
            return this.f47376a;
        }

        public final AppUserDetailResponse b() {
            return this.f47377b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof n) {
                n nVar = (n) obj;
                return jo.p.c(this.f47376a, nVar.f47376a) && jo.p.c(this.f47377b, nVar.f47377b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f47376a.hashCode() * 31) + this.f47377b.hashCode();
        }

        public String toString() {
            return "PublishAppUserDetailSuccessEvent(appId=" + this.f47376a + ", appUserDetailResponse=" + this.f47377b + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class o extends z {

        /* renamed from: a  reason: collision with root package name */
        public static final o f47378a = new o();

        public o() {
            super(null);
        }
    }

    public z() {
    }

    public /* synthetic */ z(jo.h hVar) {
        this();
    }
}
