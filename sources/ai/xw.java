package ai;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes3.dex */
public final class xw {

    /* renamed from: a  reason: collision with root package name */
    public final Context f12327a;

    public xw(Context context) {
        rh.p.j(context, "Context can not be null");
        this.f12327a = context;
    }

    public final boolean a() {
        return ((Boolean) yg.g1.a(this.f12327a, new ww())).booleanValue() && xh.c.a(this.f12327a).a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    @TargetApi(14)
    public final boolean b() {
        return c(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    public final boolean c(Intent intent) {
        rh.p.j(intent, "Intent can not be null");
        return !this.f12327a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }
}
