package p;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import java.util.ArrayList;
import p.a;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f45629a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f45630b;

    public d(Intent intent, Bundle bundle) {
        this.f45629a = intent;
        this.f45630b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f45629a.setData(uri);
        c3.a.m(context, this.f45629a, this.f45630b);
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: c  reason: collision with root package name */
        public ArrayList<Bundle> f45633c;

        /* renamed from: d  reason: collision with root package name */
        public Bundle f45634d;

        /* renamed from: e  reason: collision with root package name */
        public ArrayList<Bundle> f45635e;

        /* renamed from: f  reason: collision with root package name */
        public SparseArray<Bundle> f45636f;

        /* renamed from: g  reason: collision with root package name */
        public Bundle f45637g;

        /* renamed from: a  reason: collision with root package name */
        public final Intent f45631a = new Intent("android.intent.action.VIEW");

        /* renamed from: b  reason: collision with root package name */
        public final a.C0689a f45632b = new a.C0689a();

        /* renamed from: h  reason: collision with root package name */
        public int f45638h = 0;

        /* renamed from: i  reason: collision with root package name */
        public boolean f45639i = true;

        public a() {
        }

        public d a() {
            if (!this.f45631a.hasExtra("android.support.customtabs.extra.SESSION")) {
                c(null, null);
            }
            ArrayList<Bundle> arrayList = this.f45633c;
            if (arrayList != null) {
                this.f45631a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f45635e;
            if (arrayList2 != null) {
                this.f45631a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f45631a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f45639i);
            this.f45631a.putExtras(this.f45632b.a().a());
            Bundle bundle = this.f45637g;
            if (bundle != null) {
                this.f45631a.putExtras(bundle);
            }
            if (this.f45636f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f45636f);
                this.f45631a.putExtras(bundle2);
            }
            this.f45631a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f45638h);
            return new d(this.f45631a, this.f45634d);
        }

        public a b(f fVar) {
            this.f45631a.setPackage(fVar.b().getPackageName());
            c(fVar.a(), fVar.c());
            return this;
        }

        public final void c(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            b3.e.b(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f45631a.putExtras(bundle);
        }

        public a(f fVar) {
            if (fVar != null) {
                b(fVar);
            }
        }
    }
}
