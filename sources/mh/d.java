package mh;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.dena.mirrorman.clientlog.logs.MRLog;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: h  reason: collision with root package name */
    public static int f41137h;

    /* renamed from: i  reason: collision with root package name */
    public static PendingIntent f41138i;

    /* renamed from: j  reason: collision with root package name */
    public static final Executor f41139j = d0.f41148w;

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f41140k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b  reason: collision with root package name */
    public final Context f41142b;

    /* renamed from: c  reason: collision with root package name */
    public final x f41143c;

    /* renamed from: d  reason: collision with root package name */
    public final ScheduledExecutorService f41144d;

    /* renamed from: f  reason: collision with root package name */
    public Messenger f41146f;

    /* renamed from: g  reason: collision with root package name */
    public i f41147g;

    /* renamed from: a  reason: collision with root package name */
    public final s.g<String, vi.h<Bundle>> f41141a = new s.g<>();

    /* renamed from: e  reason: collision with root package name */
    public Messenger f41145e = new Messenger(new f(this, Looper.getMainLooper()));

    public d(Context context) {
        this.f41142b = context;
        this.f41143c = new x(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f41144d = scheduledThreadPoolExecutor;
    }

    public static /* synthetic */ vi.g b(Bundle bundle) throws Exception {
        if (j(bundle)) {
            return vi.j.e(null);
        }
        return vi.j.e(bundle);
    }

    public static /* bridge */ /* synthetic */ void d(d dVar, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new h());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof i) {
                        dVar.f41147g = (i) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        dVar.f41146f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("Rpc", 3)) {
                        String valueOf = String.valueOf(action);
                        Log.d("Rpc", valueOf.length() != 0 ? "Unexpected response action: ".concat(valueOf) : new String("Unexpected response action: "));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra == null) {
                    String stringExtra2 = intent2.getStringExtra(MRLog.PAYLOAD_KEY_ERROR);
                    if (stringExtra2 == null) {
                        String valueOf2 = String.valueOf(intent2.getExtras());
                        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 49);
                        sb2.append("Unexpected response, no error or registration id ");
                        sb2.append(valueOf2);
                        Log.w("Rpc", sb2.toString());
                        return;
                    }
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", stringExtra2.length() != 0 ? "Received InstanceID error ".concat(stringExtra2) : new String("Received InstanceID error "));
                    }
                    if (stringExtra2.startsWith("|")) {
                        String[] split = stringExtra2.split("\\|");
                        if (split.length > 2 && "ID".equals(split[1])) {
                            String str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(":")) {
                                str2 = str2.substring(1);
                            }
                            dVar.i(str, intent2.putExtra(MRLog.PAYLOAD_KEY_ERROR, str2).getExtras());
                            return;
                        }
                        Log.w("Rpc", stringExtra2.length() != 0 ? "Unexpected structured response ".concat(stringExtra2) : new String("Unexpected structured response "));
                        return;
                    }
                    synchronized (dVar.f41141a) {
                        for (int i10 = 0; i10 < dVar.f41141a.size(); i10++) {
                            dVar.i(dVar.f41141a.m(i10), intent2.getExtras());
                        }
                    }
                    return;
                }
                Matcher matcher = f41140k.matcher(stringExtra);
                if (!matcher.matches()) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", stringExtra.length() != 0 ? "Unexpected response string: ".concat(stringExtra) : new String("Unexpected response string: "));
                        return;
                    }
                    return;
                }
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                if (group != null) {
                    Bundle extras = intent2.getExtras();
                    extras.putString("registration_id", group2);
                    dVar.i(group, extras);
                    return;
                }
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    public static synchronized String g() {
        String num;
        synchronized (d.class) {
            int i10 = f41137h;
            f41137h = i10 + 1;
            num = Integer.toString(i10);
        }
        return num;
    }

    public static synchronized void h(Context context, Intent intent) {
        synchronized (d.class) {
            if (f41138i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f41138i = ei.a.a(context, 0, intent2, ei.a.f30623a);
            }
            intent.putExtra("app", f41138i);
        }
    }

    public static boolean j(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    public vi.g<Bundle> a(final Bundle bundle) {
        if (this.f41143c.a() < 12000000) {
            if (this.f41143c.b() != 0) {
                return f(bundle).l(f41139j, new vi.a() { // from class: mh.y
                    @Override // vi.a
                    public final Object a(vi.g gVar) {
                        return d.this.c(bundle, gVar);
                    }
                });
            }
            return vi.j.d(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return w.b(this.f41142b).d(1, bundle).j(f41139j, z.f41184a);
    }

    public final /* synthetic */ vi.g c(Bundle bundle, vi.g gVar) throws Exception {
        return (gVar.s() && j((Bundle) gVar.o())) ? f(bundle).t(f41139j, b0.f41134a) : gVar;
    }

    public final /* synthetic */ void e(String str, ScheduledFuture scheduledFuture, vi.g gVar) {
        synchronized (this.f41141a) {
            this.f41141a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public final vi.g<Bundle> f(Bundle bundle) {
        final String g10 = g();
        final vi.h<Bundle> hVar = new vi.h<>();
        synchronized (this.f41141a) {
            this.f41141a.put(g10, hVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f41143c.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        h(this.f41142b, intent);
        StringBuilder sb2 = new StringBuilder(String.valueOf(g10).length() + 5);
        sb2.append("|ID|");
        sb2.append(g10);
        sb2.append("|");
        intent.putExtra("kid", sb2.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb3 = new StringBuilder(valueOf.length() + 8);
            sb3.append("Sending ");
            sb3.append(valueOf);
            Log.d("Rpc", sb3.toString());
        }
        intent.putExtra("google.messenger", this.f41145e);
        if (this.f41146f != null || this.f41147g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f41146f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f41147g.b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            final ScheduledFuture<?> schedule = this.f41144d.schedule(new Runnable() { // from class: mh.c0
                @Override // java.lang.Runnable
                public final void run() {
                    if (vi.h.this.d(new IOException("TIMEOUT"))) {
                        Log.w("Rpc", "No response");
                    }
                }
            }, 30L, TimeUnit.SECONDS);
            hVar.a().b(f41139j, new vi.c() { // from class: mh.a0
                @Override // vi.c
                public final void a(vi.g gVar) {
                    d.this.e(g10, schedule, gVar);
                }
            });
            return hVar.a();
        }
        if (this.f41143c.b() == 2) {
            this.f41142b.sendBroadcast(intent);
        } else {
            this.f41142b.startService(intent);
        }
        final ScheduledFuture schedule2 = this.f41144d.schedule(new Runnable() { // from class: mh.c0
            @Override // java.lang.Runnable
            public final void run() {
                if (vi.h.this.d(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        hVar.a().b(f41139j, new vi.c() { // from class: mh.a0
            @Override // vi.c
            public final void a(vi.g gVar) {
                d.this.e(g10, schedule2, gVar);
            }
        });
        return hVar.a();
    }

    public final void i(String str, Bundle bundle) {
        synchronized (this.f41141a) {
            vi.h<Bundle> remove = this.f41141a.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                Log.w("Rpc", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
                return;
            }
            remove.c(bundle);
        }
    }
}
