package ak;

import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes3.dex */
public final class k3 {

    /* renamed from: c  reason: collision with root package name */
    public static final dk.f f13509c = new dk.f("PackageStateCache");

    /* renamed from: a  reason: collision with root package name */
    public final Context f13510a;

    /* renamed from: b  reason: collision with root package name */
    public int f13511b = -1;

    public k3(Context context) {
        this.f13510a = context;
    }

    public final synchronized int a() {
        if (this.f13511b == -1) {
            try {
                this.f13511b = this.f13510a.getPackageManager().getPackageInfo(this.f13510a.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                f13509c.b("The current version of the app could not be retrieved", new Object[0]);
            }
        }
        return this.f13511b;
    }
}
