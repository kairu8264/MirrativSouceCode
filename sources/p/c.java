package p;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;
import android.text.TextUtils;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public final ICustomTabsService f45624a;

    /* renamed from: b  reason: collision with root package name */
    public final ComponentName f45625b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f45626c;

    /* loaded from: classes.dex */
    public class a extends ICustomTabsCallback.Stub {

        /* renamed from: w  reason: collision with root package name */
        public Handler f45627w = new Handler(Looper.getMainLooper());

        public a(b bVar) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void extraCallback(String str, Bundle bundle) throws RemoteException {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public Bundle extraCallbackWithResult(String str, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onMessageChannelReady(Bundle bundle) throws RemoteException {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onNavigationEvent(int i10, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onPostMessage(String str, Bundle bundle) throws RemoteException {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) throws RemoteException {
        }
    }

    public c(ICustomTabsService iCustomTabsService, ComponentName componentName, Context context) {
        this.f45624a = iCustomTabsService;
        this.f45625b = componentName;
        this.f45626c = context;
    }

    public static boolean a(Context context, String str, e eVar) {
        eVar.b(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 33);
    }

    public final ICustomTabsCallback.Stub b(b bVar) {
        return new a(bVar);
    }

    public f c(b bVar) {
        return d(bVar, null);
    }

    public final f d(b bVar, PendingIntent pendingIntent) {
        boolean newSession;
        ICustomTabsCallback.Stub b10 = b(bVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                newSession = this.f45624a.newSessionWithExtras(b10, bundle);
            } else {
                newSession = this.f45624a.newSession(b10);
            }
            if (newSession) {
                return new f(this.f45624a, b10, this.f45625b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public boolean e(long j10) {
        try {
            return this.f45624a.warmup(j10);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
