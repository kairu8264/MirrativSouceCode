package ai;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.dena.mirrorman.clientlog.logs.ActionLogBase;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

@Deprecated
/* loaded from: classes3.dex */
public final class tx {

    /* renamed from: d  reason: collision with root package name */
    public String f10491d;

    /* renamed from: e  reason: collision with root package name */
    public Context f10492e;

    /* renamed from: f  reason: collision with root package name */
    public String f10493f;

    /* renamed from: h  reason: collision with root package name */
    public AtomicBoolean f10495h;

    /* renamed from: i  reason: collision with root package name */
    public File f10496i;

    /* renamed from: a  reason: collision with root package name */
    public final BlockingQueue<ey> f10488a = new ArrayBlockingQueue(100);

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap<String, String> f10489b = new LinkedHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, zx> f10490c = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final HashSet<String> f10494g = new HashSet<>(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    public final void a(Context context, String str, String str2, Map<String, String> map) {
        File externalStorageDirectory;
        this.f10492e = context;
        this.f10493f = str;
        this.f10491d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f10495h = atomicBoolean;
        atomicBoolean.set(yy.f12766c.e().booleanValue());
        if (this.f10495h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.f10496i = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.f10489b.put(entry.getKey(), entry.getValue());
        }
        hk0.f4878a.execute(new Runnable(this) { // from class: ai.sx

            /* renamed from: w  reason: collision with root package name */
            public final tx f10013w;

            {
                this.f10013w = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f10013w.f();
            }
        });
        Map<String, zx> map2 = this.f10490c;
        zx zxVar = zx.f13240b;
        map2.put(ActionLogBase.ACTION, zxVar);
        this.f10490c.put("ad_format", zxVar);
        this.f10490c.put(i7.e.f36387u, zx.f13241c);
    }

    public final boolean b(ey eyVar) {
        return this.f10488a.offer(eyVar);
    }

    public final Map<String, String> c(Map<String, String> map, Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String key = entry.getKey();
            String str = (String) linkedHashMap.get(key);
            linkedHashMap.put(key, d(key).a(str, entry.getValue()));
        }
        return linkedHashMap;
    }

    public final zx d(String str) {
        zx zxVar = this.f10490c.get(str);
        return zxVar != null ? zxVar : zx.f13239a;
    }

    public final void e(String str) {
        if (this.f10494g.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.f10493f);
        linkedHashMap.put("ue", str);
        g(c(this.f10489b, linkedHashMap), null);
    }

    public final /* bridge */ /* synthetic */ void f() {
        while (true) {
            try {
                ey take = this.f10488a.take();
                cy c10 = take.c();
                if (!TextUtils.isEmpty(c10.a())) {
                    g(c(this.f10489b, take.e()), c10);
                }
            } catch (InterruptedException e10) {
                uj0.g("CsiReporter:reporter interrupted", e10);
                return;
            }
        }
    }

    public final void g(Map<String, String> map, cy cyVar) {
        Uri.Builder buildUpon = Uri.parse(this.f10491d).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        String uri = buildUpon.build().toString();
        if (cyVar != null) {
            StringBuilder sb2 = new StringBuilder(uri);
            if (!TextUtils.isEmpty(cyVar.a())) {
                sb2.append("&it=");
                sb2.append(cyVar.a());
            }
            if (!TextUtils.isEmpty(cyVar.b())) {
                sb2.append("&blat=");
                sb2.append(cyVar.b());
            }
            uri = sb2.toString();
        }
        if (!this.f10495h.get()) {
            wg.t.d();
            yg.d2.n(this.f10492e, this.f10493f, uri);
            return;
        }
        File file = this.f10496i;
        if (file != null) {
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                    try {
                        fileOutputStream2.write(uri.getBytes());
                        fileOutputStream2.write(10);
                        try {
                            fileOutputStream2.close();
                        } catch (IOException e10) {
                            uj0.g("CsiReporter: Cannot close file: sdk_csi_data.txt.", e10);
                        }
                    } catch (IOException e11) {
                        e = e11;
                        fileOutputStream = fileOutputStream2;
                        uj0.g("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e12) {
                                uj0.g("CsiReporter: Cannot close file: sdk_csi_data.txt.", e12);
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e13) {
                                uj0.g("CsiReporter: Cannot close file: sdk_csi_data.txt.", e13);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException e14) {
                e = e14;
            }
        } else {
            uj0.f("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
        }
    }
}
