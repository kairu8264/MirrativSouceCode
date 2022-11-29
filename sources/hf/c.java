package hf;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.App;
import com.dena.mirrorman.net.retrofit.MRRequest;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: f  reason: collision with root package name */
    public static final b f35504f = new b(null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f35505g = 8;

    /* renamed from: h  reason: collision with root package name */
    public static final HashSet<String> f35506h;

    /* renamed from: a  reason: collision with root package name */
    public final MRRequest f35507a;

    /* renamed from: b  reason: collision with root package name */
    public final jf.d0 f35508b;

    /* renamed from: c  reason: collision with root package name */
    public final C0457c f35509c;

    /* renamed from: d  reason: collision with root package name */
    public final PackageManager f35510d;

    /* renamed from: e  reason: collision with root package name */
    public final BroadcastReceiver f35511e;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: h  reason: collision with root package name */
        public static final C0456a f35512h = new C0456a(null);

        /* renamed from: i  reason: collision with root package name */
        public static final int f35513i = 8;

        /* renamed from: a  reason: collision with root package name */
        public String f35514a;

        /* renamed from: b  reason: collision with root package name */
        public String f35515b;

        /* renamed from: c  reason: collision with root package name */
        public String f35516c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f35517d;

        /* renamed from: e  reason: collision with root package name */
        public int f35518e;

        /* renamed from: f  reason: collision with root package name */
        public App.AppParams f35519f;

        /* renamed from: g  reason: collision with root package name */
        public String f35520g;

        /* renamed from: hf.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0456a {
            public C0456a() {
            }

            public /* synthetic */ C0456a(jo.h hVar) {
                this();
            }

            public final a a(App.AppParams appParams, boolean z10) {
                jo.p.h(appParams, "appParams");
                return new a(appParams.getAppId(), appParams.getTitle(), appParams.getIconUrl(), z10, 0, appParams, appParams.getShortTitle());
            }
        }

        public a(String str, String str2, String str3, boolean z10, int i10, App.AppParams appParams, String str4) {
            jo.p.h(str, MRLog.PAYLOAD_KEY_APP_ID);
            jo.p.h(str2, "title");
            jo.p.h(str3, "icon_url");
            jo.p.h(appParams, "appParams");
            jo.p.h(str4, "shortTitle");
            this.f35514a = str;
            this.f35515b = str2;
            this.f35516c = str3;
            this.f35517d = z10;
            this.f35518e = i10;
            this.f35519f = appParams;
            this.f35520g = str4;
        }

        public static /* synthetic */ a b(a aVar, String str, String str2, String str3, boolean z10, int i10, App.AppParams appParams, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = aVar.f35514a;
            }
            if ((i11 & 2) != 0) {
                str2 = aVar.f35515b;
            }
            String str5 = str2;
            if ((i11 & 4) != 0) {
                str3 = aVar.f35516c;
            }
            String str6 = str3;
            if ((i11 & 8) != 0) {
                z10 = aVar.f35517d;
            }
            boolean z11 = z10;
            if ((i11 & 16) != 0) {
                i10 = aVar.f35518e;
            }
            int i12 = i10;
            if ((i11 & 32) != 0) {
                appParams = aVar.f35519f;
            }
            App.AppParams appParams2 = appParams;
            if ((i11 & 64) != 0) {
                str4 = aVar.f35520g;
            }
            return aVar.a(str, str5, str6, z11, i12, appParams2, str4);
        }

        public final a a(String str, String str2, String str3, boolean z10, int i10, App.AppParams appParams, String str4) {
            jo.p.h(str, MRLog.PAYLOAD_KEY_APP_ID);
            jo.p.h(str2, "title");
            jo.p.h(str3, "icon_url");
            jo.p.h(appParams, "appParams");
            jo.p.h(str4, "shortTitle");
            return new a(str, str2, str3, z10, i10, appParams, str4);
        }

        public final App.AppParams c() {
            return this.f35519f;
        }

        public final String d() {
            return this.f35514a;
        }

        public final String e() {
            return this.f35516c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return jo.p.c(this.f35514a, aVar.f35514a) && jo.p.c(this.f35515b, aVar.f35515b) && jo.p.c(this.f35516c, aVar.f35516c) && this.f35517d == aVar.f35517d && this.f35518e == aVar.f35518e && jo.p.c(this.f35519f, aVar.f35519f) && jo.p.c(this.f35520g, aVar.f35520g);
            }
            return false;
        }

        public final String f() {
            return this.f35520g;
        }

        public final String g() {
            return this.f35515b;
        }

        public final boolean h() {
            return this.f35517d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((this.f35514a.hashCode() * 31) + this.f35515b.hashCode()) * 31) + this.f35516c.hashCode()) * 31;
            boolean z10 = this.f35517d;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return ((((((hashCode + i10) * 31) + Integer.hashCode(this.f35518e)) * 31) + this.f35519f.hashCode()) * 31) + this.f35520g.hashCode();
        }

        public String toString() {
            return "AppInfo(app_id=" + this.f35514a + ", title=" + this.f35515b + ", icon_url=" + this.f35516c + ", is_my_app=" + this.f35517d + ", index=" + this.f35518e + ", appParams=" + this.f35519f + ", shortTitle=" + this.f35520g + ')';
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }
    }

    /* renamed from: hf.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0457c {

        /* renamed from: a  reason: collision with root package name */
        public final ConcurrentHashMap<String, d> f35521a = new ConcurrentHashMap<>();

        public final d a(String str) {
            jo.p.h(str, "packageName");
            return this.f35521a.get(str);
        }

        public final void b(String str) {
            jo.p.h(str, "packageName");
            this.f35521a.remove(str);
        }
    }

    /* loaded from: classes2.dex */
    public static final class d {
    }

    /* loaded from: classes2.dex */
    public static final class e extends BroadcastReceiver {
        public e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            Uri data = intent.getData();
            if (action == null || data == null || !c.f35506h.contains(action)) {
                return;
            }
            String uri = data.toString();
            jo.p.g(uri, "data.toString()");
            if (jo.p.c(action, "android.intent.action.PACKAGE_REMOVED") || jo.p.c(action, "android.intent.action.PACKAGE_REPLACED")) {
                try {
                    String c10 = new so.e("^package:").c(uri, "");
                    int length = c10.length() - 1;
                    int i10 = 0;
                    boolean z10 = false;
                    while (i10 <= length) {
                        boolean z11 = jo.p.j(c10.charAt(!z10 ? i10 : length), 32) <= 0;
                        if (z10) {
                            if (!z11) {
                                break;
                            }
                            length--;
                        } else if (z11) {
                            i10++;
                        } else {
                            z10 = true;
                        }
                    }
                    c.this.f35509c.b(c10.subSequence(i10, length + 1).toString());
                } catch (Exception unused) {
                }
            }
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        f35506h = hashSet;
        hashSet.clear();
        hashSet.add("android.intent.action.PACKAGE_ADDED");
        hashSet.add("android.intent.action.PACKAGE_REMOVED");
        hashSet.add("android.intent.action.PACKAGE_REPLACED");
    }

    public c(Context context, MRRequest mRRequest, jf.d0 d0Var) {
        jo.p.h(context, "context");
        jo.p.h(mRRequest, "request");
        jo.p.h(d0Var, "myAppRepository");
        this.f35507a = mRRequest;
        this.f35508b = d0Var;
        this.f35509c = new C0457c();
        PackageManager packageManager = context.getPackageManager();
        jo.p.g(packageManager, "context.packageManager");
        this.f35510d = packageManager;
        this.f35511e = new e();
        Iterator<String> it = f35506h.iterator();
        while (it.hasNext()) {
            IntentFilter intentFilter = new IntentFilter(it.next());
            intentFilter.addDataScheme("package");
            context.registerReceiver(this.f35511e, intentFilter);
        }
    }

    public final boolean c(String str) {
        if (str == null) {
            return false;
        }
        if (this.f35509c.a(str) != null) {
            return true;
        }
        return this.f35510d.getPackageInfo(str, 0) != null;
    }

    public final boolean d(String str) {
        return (str == null || this.f35508b.e(str) == null) ? false : true;
    }
}
