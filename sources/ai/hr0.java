package ai;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

/* loaded from: classes3.dex */
public final class hr0 extends MutableContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public Activity f4946a;

    /* renamed from: b  reason: collision with root package name */
    public Context f4947b;

    /* renamed from: c  reason: collision with root package name */
    public Context f4948c;

    public hr0(Context context) {
        super(context);
        setBaseContext(context);
    }

    public final Activity a() {
        return this.f4946a;
    }

    public final Context b() {
        return this.f4948c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return this.f4948c.getSystemService(str);
    }

    @Override // android.content.MutableContextWrapper
    public final void setBaseContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f4947b = applicationContext;
        this.f4946a = context instanceof Activity ? (Activity) context : null;
        this.f4948c = context;
        super.setBaseContext(applicationContext);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.f4946a;
        if (activity != null) {
            activity.startActivity(intent);
            return;
        }
        intent.setFlags(268435456);
        this.f4947b.startActivity(intent);
    }
}
