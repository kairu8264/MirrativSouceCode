package ai;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.google.android.exoplayer2.C;
import java.util.List;

/* loaded from: classes3.dex */
public final class ny {

    /* renamed from: a  reason: collision with root package name */
    public p.f f7562a;

    /* renamed from: b  reason: collision with root package name */
    public p.c f7563b;

    /* renamed from: c  reason: collision with root package name */
    public p.e f7564c;

    /* renamed from: d  reason: collision with root package name */
    public ly f7565d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (queryIntentActivities != null && resolveActivity != null) {
            for (int i10 = 0; i10 < queryIntentActivities.size(); i10++) {
                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i10).activityInfo.name)) {
                    return resolveActivity.activityInfo.packageName.equals(fo3.a(context));
                }
            }
        }
        return false;
    }

    public final void b(Activity activity) {
        p.e eVar = this.f7564c;
        if (eVar == null) {
            return;
        }
        activity.unbindService(eVar);
        this.f7563b = null;
        this.f7562a = null;
        this.f7564c = null;
    }

    public final p.f c() {
        p.c cVar = this.f7563b;
        if (cVar == null) {
            this.f7562a = null;
        } else if (this.f7562a == null) {
            this.f7562a = cVar.c(null);
        }
        return this.f7562a;
    }

    public final void d(ly lyVar) {
        this.f7565d = lyVar;
    }

    public final void e(Activity activity) {
        String a10;
        if (this.f7563b == null && (a10 = fo3.a(activity)) != null) {
            go3 go3Var = new go3(this, null);
            this.f7564c = go3Var;
            p.c.a(activity, a10, go3Var);
        }
    }

    public final void f(p.c cVar) {
        this.f7563b = cVar;
        cVar.e(0L);
        ly lyVar = this.f7565d;
        if (lyVar != null) {
            lyVar.zza();
        }
    }

    public final void g() {
        this.f7563b = null;
        this.f7562a = null;
    }
}
