package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsService;

/* loaded from: classes.dex */
public abstract class e implements ServiceConnection {

    /* renamed from: w  reason: collision with root package name */
    public Context f45640w;

    /* loaded from: classes.dex */
    public class a extends c {
        public a(ICustomTabsService iCustomTabsService, ComponentName componentName, Context context) {
            super(iCustomTabsService, componentName, context);
        }
    }

    public abstract void a(ComponentName componentName, c cVar);

    public void b(Context context) {
        this.f45640w = context;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f45640w != null) {
            a(componentName, new a(ICustomTabsService.Stub.asInterface(iBinder), componentName, this.f45640w));
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }
}
