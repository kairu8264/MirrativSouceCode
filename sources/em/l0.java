package em;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes4.dex */
public class l0 {

    /* renamed from: e  reason: collision with root package name */
    public static l0 f30700e;

    /* renamed from: a  reason: collision with root package name */
    public String f30701a = null;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f30702b = null;

    /* renamed from: c  reason: collision with root package name */
    public Boolean f30703c = null;

    /* renamed from: d  reason: collision with root package name */
    public final Queue<Intent> f30704d = new ArrayDeque();

    public static synchronized l0 b() {
        l0 l0Var;
        synchronized (l0.class) {
            if (f30700e == null) {
                f30700e = new l0();
            }
            l0Var = f30700e;
        }
        return l0Var;
    }

    public final int a(Context context, Intent intent) {
        ComponentName startService;
        String str;
        String f10 = f(context, intent);
        if (f10 != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                if (f10.length() != 0) {
                    str = "Restricting intent to a specific service: ".concat(f10);
                } else {
                    str = new String("Restricting intent to a specific service: ");
                }
                Log.d("FirebaseMessaging", str);
            }
            intent.setClassName(context.getPackageName(), f10);
        }
        try {
            if (e(context)) {
                startService = u0.e(context, intent);
            } else {
                startService = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (startService == null) {
                Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                return 404;
            }
            return -1;
        } catch (IllegalStateException e10) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: ".concat(e10.toString()));
            return 402;
        } catch (SecurityException e11) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e11);
            return 401;
        }
    }

    public Intent c() {
        return this.f30704d.poll();
    }

    public boolean d(Context context) {
        if (this.f30703c == null) {
            this.f30703c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f30702b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f30703c.booleanValue();
    }

    public boolean e(Context context) {
        if (this.f30702b == null) {
            this.f30702b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f30702b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f30702b.booleanValue();
    }

    public final synchronized String f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        String str2 = this.f30701a;
        if (str2 != null) {
            return str2;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
            if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                if (str.startsWith(TopicConstant.SEPARATOR)) {
                    String valueOf = String.valueOf(context.getPackageName());
                    String valueOf2 = String.valueOf(serviceInfo.name);
                    this.f30701a = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                } else {
                    this.f30701a = serviceInfo.name;
                }
                return this.f30701a;
            }
            String str3 = serviceInfo.packageName;
            String str4 = serviceInfo.name;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 94 + String.valueOf(str4).length());
            sb2.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
            sb2.append(str3);
            sb2.append("/");
            sb2.append(str4);
            Log.e("FirebaseMessaging", sb2.toString());
            return null;
        }
        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    public int g(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f30704d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return a(context, intent2);
    }
}
