package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import bi.f;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import nh.e;
import nh.g;
import rh.p;

/* loaded from: classes3.dex */
public class AdvertisingIdClient {

    /* renamed from: a  reason: collision with root package name */
    public nh.a f27140a;

    /* renamed from: b  reason: collision with root package name */
    public f f27141b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f27142c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f27143d;

    /* renamed from: e  reason: collision with root package name */
    public ug.a f27144e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f27145f;

    /* renamed from: g  reason: collision with root package name */
    public final long f27146g;

    /* loaded from: classes3.dex */
    public static final class Info {

        /* renamed from: a  reason: collision with root package name */
        public final String f27147a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f27148b;

        @Deprecated
        public Info(String str, boolean z10) {
            this.f27147a = str;
            this.f27148b = z10;
        }

        public String getId() {
            return this.f27147a;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.f27148b;
        }

        public String toString() {
            String str = this.f27147a;
            boolean z10 = this.f27148b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
            sb2.append("{");
            sb2.append(str);
            sb2.append("}");
            sb2.append(z10);
            return sb2.toString();
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000L, false, false);
    }

    public static boolean b(Context context) throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        boolean d10;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.f(false);
            p.h("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                if (!advertisingIdClient.f27142c) {
                    synchronized (advertisingIdClient.f27143d) {
                        ug.a aVar = advertisingIdClient.f27144e;
                        if (aVar == null || !aVar.f55920z) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        advertisingIdClient.f(false);
                        if (!advertisingIdClient.f27142c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e10) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                    }
                }
                p.i(advertisingIdClient.f27140a);
                p.i(advertisingIdClient.f27141b);
                try {
                    d10 = advertisingIdClient.f27141b.d();
                } catch (RemoteException e11) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e11);
                    throw new IOException("Remote exception");
                }
            }
            advertisingIdClient.i();
            return d10;
        } finally {
            advertisingIdClient.e();
        }
    }

    public static void c(boolean z10) {
    }

    public static Info getAdvertisingIdInfo(Context context) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.f(false);
            Info h10 = advertisingIdClient.h(-1);
            advertisingIdClient.g(h10, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", null);
            return h10;
        } finally {
        }
    }

    public Info a() throws IOException {
        return h(-1);
    }

    public void d() throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        f(true);
    }

    public final void e() {
        p.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f27145f == null || this.f27140a == null) {
                return;
            }
            if (this.f27142c) {
                uh.a.b().c(this.f27145f, this.f27140a);
            }
            this.f27142c = false;
            this.f27141b = null;
            this.f27140a = null;
        }
    }

    public final void f(boolean z10) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        p.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f27142c) {
                e();
            }
            Context context = this.f27145f;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int h10 = e.f().h(context, g.f43544a);
                if (h10 != 0 && h10 != 2) {
                    throw new IOException("Google Play services not available");
                }
                nh.a aVar = new nh.a();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (uh.a.b().a(context, intent, aVar, 1)) {
                    this.f27140a = aVar;
                    try {
                        this.f27141b = bi.e.i0(aVar.a(10000L, TimeUnit.MILLISECONDS));
                        this.f27142c = true;
                        if (z10) {
                            i();
                        }
                    } catch (InterruptedException unused) {
                        throw new IOException("Interrupted exception");
                    } catch (Throwable th2) {
                        throw new IOException(th2);
                    }
                } else {
                    throw new IOException("Connection failure");
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new GooglePlayServicesNotAvailableException(9);
            }
        }
    }

    public final void finalize() throws Throwable {
        e();
        super.finalize();
    }

    public final boolean g(Info info, boolean z10, float f10, long j10, String str, Throwable th2) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            String str2 = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
            hashMap.put("app_context", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            if (info != null) {
                if (true != info.isLimitAdTrackingEnabled()) {
                    str2 = "0";
                }
                hashMap.put("limit_ad_tracking", str2);
                String id2 = info.getId();
                if (id2 != null) {
                    hashMap.put("ad_id_size", Integer.toString(id2.length()));
                }
            }
            if (th2 != null) {
                hashMap.put(MRLog.PAYLOAD_KEY_ERROR, th2.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j10));
            new a(this, hashMap).start();
            return true;
        }
        return false;
    }

    public final Info h(int i10) throws IOException {
        Info info;
        p.h("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f27142c) {
                synchronized (this.f27143d) {
                    ug.a aVar = this.f27144e;
                    if (aVar == null || !aVar.f55920z) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    f(false);
                    if (!this.f27142c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e10) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                }
            }
            p.i(this.f27140a);
            p.i(this.f27141b);
            try {
                info = new Info(this.f27141b.b(), this.f27141b.k0(true));
            } catch (RemoteException e11) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e11);
                throw new IOException("Remote exception");
            }
        }
        i();
        return info;
    }

    public final void i() {
        synchronized (this.f27143d) {
            ug.a aVar = this.f27144e;
            if (aVar != null) {
                aVar.f55919y.countDown();
                try {
                    this.f27144e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j10 = this.f27146g;
            if (j10 > 0) {
                this.f27144e = new ug.a(this, j10);
            }
        }
    }

    public AdvertisingIdClient(Context context, long j10, boolean z10, boolean z11) {
        Context applicationContext;
        this.f27143d = new Object();
        p.i(context);
        if (z10 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f27145f = context;
        this.f27142c = false;
        this.f27146g = j10;
    }
}
