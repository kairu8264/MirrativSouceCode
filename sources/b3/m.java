package b3;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: d  reason: collision with root package name */
    public static String f16864d;

    /* renamed from: g  reason: collision with root package name */
    public static d f16867g;

    /* renamed from: a  reason: collision with root package name */
    public final Context f16868a;

    /* renamed from: b  reason: collision with root package name */
    public final NotificationManager f16869b;

    /* renamed from: c  reason: collision with root package name */
    public static final Object f16863c = new Object();

    /* renamed from: e  reason: collision with root package name */
    public static Set<String> f16865e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public static final Object f16866f = new Object();

    /* loaded from: classes.dex */
    public static class a implements e {

        /* renamed from: a  reason: collision with root package name */
        public final String f16870a;

        /* renamed from: b  reason: collision with root package name */
        public final int f16871b;

        /* renamed from: c  reason: collision with root package name */
        public final String f16872c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f16873d = false;

        public a(String str, int i10, String str2) {
            this.f16870a = str;
            this.f16871b = i10;
            this.f16872c = str2;
        }

        @Override // b3.m.e
        public void a(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            if (this.f16873d) {
                iNotificationSideChannel.cancelAll(this.f16870a);
            } else {
                iNotificationSideChannel.cancel(this.f16870a, this.f16871b, this.f16872c);
            }
        }

        public String toString() {
            return "CancelTask[packageName:" + this.f16870a + ", id:" + this.f16871b + ", tag:" + this.f16872c + ", all:" + this.f16873d + "]";
        }
    }

    /* loaded from: classes.dex */
    public static class b implements e {

        /* renamed from: a  reason: collision with root package name */
        public final String f16874a;

        /* renamed from: b  reason: collision with root package name */
        public final int f16875b;

        /* renamed from: c  reason: collision with root package name */
        public final String f16876c;

        /* renamed from: d  reason: collision with root package name */
        public final Notification f16877d;

        public b(String str, int i10, String str2, Notification notification) {
            this.f16874a = str;
            this.f16875b = i10;
            this.f16876c = str2;
            this.f16877d = notification;
        }

        @Override // b3.m.e
        public void a(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            iNotificationSideChannel.notify(this.f16874a, this.f16875b, this.f16876c, this.f16877d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f16874a + ", id:" + this.f16875b + ", tag:" + this.f16876c + "]";
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final ComponentName f16878a;

        /* renamed from: b  reason: collision with root package name */
        public final IBinder f16879b;

        public c(ComponentName componentName, IBinder iBinder) {
            this.f16878a = componentName;
            this.f16879b = iBinder;
        }
    }

    /* loaded from: classes.dex */
    public static class d implements Handler.Callback, ServiceConnection {

        /* renamed from: w  reason: collision with root package name */
        public final Context f16880w;

        /* renamed from: x  reason: collision with root package name */
        public final HandlerThread f16881x;

        /* renamed from: y  reason: collision with root package name */
        public final Handler f16882y;

        /* renamed from: z  reason: collision with root package name */
        public final Map<ComponentName, a> f16883z = new HashMap();
        public Set<String> A = new HashSet();

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final ComponentName f16884a;

            /* renamed from: c  reason: collision with root package name */
            public INotificationSideChannel f16886c;

            /* renamed from: b  reason: collision with root package name */
            public boolean f16885b = false;

            /* renamed from: d  reason: collision with root package name */
            public ArrayDeque<e> f16887d = new ArrayDeque<>();

            /* renamed from: e  reason: collision with root package name */
            public int f16888e = 0;

            public a(ComponentName componentName) {
                this.f16884a = componentName;
            }
        }

        public d(Context context) {
            this.f16880w = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f16881x = handlerThread;
            handlerThread.start();
            this.f16882y = new Handler(handlerThread.getLooper(), this);
        }

        public final boolean a(a aVar) {
            if (aVar.f16885b) {
                return true;
            }
            boolean bindService = this.f16880w.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f16884a), this, 33);
            aVar.f16885b = bindService;
            if (bindService) {
                aVar.f16888e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f16884a);
                this.f16880w.unbindService(this);
            }
            return aVar.f16885b;
        }

        public final void b(a aVar) {
            if (aVar.f16885b) {
                this.f16880w.unbindService(this);
                aVar.f16885b = false;
            }
            aVar.f16886c = null;
        }

        public final void c(e eVar) {
            j();
            for (a aVar : this.f16883z.values()) {
                aVar.f16887d.add(eVar);
                g(aVar);
            }
        }

        public final void d(ComponentName componentName) {
            a aVar = this.f16883z.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        public final void e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.f16883z.get(componentName);
            if (aVar != null) {
                aVar.f16886c = INotificationSideChannel.Stub.asInterface(iBinder);
                aVar.f16888e = 0;
                g(aVar);
            }
        }

        public final void f(ComponentName componentName) {
            a aVar = this.f16883z.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        public final void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f16884a + ", " + aVar.f16887d.size() + " queued tasks");
            }
            if (aVar.f16887d.isEmpty()) {
                return;
            }
            if (a(aVar) && aVar.f16886c != null) {
                while (true) {
                    e peek = aVar.f16887d.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + peek);
                        }
                        peek.a(aVar.f16886c);
                        aVar.f16887d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + aVar.f16884a);
                        }
                    } catch (RemoteException e10) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f16884a, e10);
                    }
                }
                if (aVar.f16887d.isEmpty()) {
                    return;
                }
                i(aVar);
                return;
            }
            i(aVar);
        }

        public void h(e eVar) {
            this.f16882y.obtainMessage(0, eVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c((e) message.obj);
                return true;
            } else if (i10 == 1) {
                c cVar = (c) message.obj;
                e(cVar.f16878a, cVar.f16879b);
                return true;
            } else if (i10 == 2) {
                f((ComponentName) message.obj);
                return true;
            } else if (i10 != 3) {
                return false;
            } else {
                d((ComponentName) message.obj);
                return true;
            }
        }

        public final void i(a aVar) {
            if (this.f16882y.hasMessages(3, aVar.f16884a)) {
                return;
            }
            int i10 = aVar.f16888e + 1;
            aVar.f16888e = i10;
            if (i10 > 6) {
                Log.w("NotifManCompat", "Giving up on delivering " + aVar.f16887d.size() + " tasks to " + aVar.f16884a + " after " + aVar.f16888e + " retries");
                aVar.f16887d.clear();
                return;
            }
            int i11 = (1 << (i10 - 1)) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i11 + " ms");
            }
            this.f16882y.sendMessageDelayed(this.f16882y.obtainMessage(3, aVar.f16884a), i11);
        }

        public final void j() {
            Set<String> e10 = m.e(this.f16880w);
            if (e10.equals(this.A)) {
                return;
            }
            this.A = e10;
            List<ResolveInfo> queryIntentServices = this.f16880w.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (e10.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f16883z.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.f16883z.put(componentName2, new a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, a>> it = this.f16883z.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, a> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + next.getKey());
                    }
                    b(next.getValue());
                    it.remove();
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f16882y.obtainMessage(1, new c(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f16882y.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(INotificationSideChannel iNotificationSideChannel) throws RemoteException;
    }

    public m(Context context) {
        this.f16868a = context;
        this.f16869b = (NotificationManager) context.getSystemService("notification");
    }

    public static m d(Context context) {
        return new m(context);
    }

    public static Set<String> e(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f16863c) {
            if (string != null) {
                if (!string.equals(f16864d)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    f16865e = hashSet;
                    f16864d = string;
                }
            }
            set = f16865e;
        }
        return set;
    }

    public static boolean i(Notification notification) {
        Bundle a10 = j.a(notification);
        return a10 != null && a10.getBoolean("android.support.useSideChannel");
    }

    public boolean a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            return this.f16869b.areNotificationsEnabled();
        }
        if (i10 >= 19) {
            AppOpsManager appOpsManager = (AppOpsManager) this.f16868a.getSystemService("appops");
            ApplicationInfo applicationInfo = this.f16868a.getApplicationInfo();
            String packageName = this.f16868a.getApplicationContext().getPackageName();
            int i11 = applicationInfo.uid;
            try {
                Class<?> cls = Class.forName(AppOpsManager.class.getName());
                Class<?> cls2 = Integer.TYPE;
                return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i11), packageName)).intValue() == 0;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
                return true;
            }
        }
        return true;
    }

    public void b(int i10) {
        c(null, i10);
    }

    public void c(String str, int i10) {
        this.f16869b.cancel(str, i10);
        if (Build.VERSION.SDK_INT <= 19) {
            h(new a(this.f16868a.getPackageName(), i10, str));
        }
    }

    public void f(int i10, Notification notification) {
        g(null, i10, notification);
    }

    public void g(String str, int i10, Notification notification) {
        if (i(notification)) {
            h(new b(this.f16868a.getPackageName(), i10, str, notification));
            this.f16869b.cancel(str, i10);
            return;
        }
        this.f16869b.notify(str, i10, notification);
    }

    public final void h(e eVar) {
        synchronized (f16866f) {
            if (f16867g == null) {
                f16867g = new d(this.f16868a.getApplicationContext());
            }
            f16867g.h(eVar);
        }
    }
}
