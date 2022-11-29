package ai;

import android.content.Context;
import android.os.Build;
import com.dena.mirrorman.clientlog.logs.LogBase;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public final class rx {

    /* renamed from: a  reason: collision with root package name */
    public final String f9615a = xy.f12355b.e();

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, String> f9616b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f9617c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9618d;

    public rx(Context context, String str) {
        String packageName;
        this.f9617c = context;
        this.f9618d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f9616b = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put(LogBase.OS, Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        wg.t.d();
        linkedHashMap.put("device", yg.d2.e0());
        if (context.getApplicationContext() != null) {
            packageName = context.getApplicationContext().getPackageName();
        } else {
            packageName = context.getPackageName();
        }
        linkedHashMap.put("app", packageName);
        wg.t.d();
        linkedHashMap.put("is_lite_sdk", true != yg.d2.h(context) ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        Future<ne0> b10 = wg.t.o().b(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(b10.get().f7283k));
            linkedHashMap.put("network_fine", Integer.toString(b10.get().f7284l));
        } catch (Exception e10) {
            wg.t.h().k(e10, "CsiConfiguration.CsiConfiguration");
        }
    }

    public final String a() {
        return this.f9615a;
    }

    public final Context b() {
        return this.f9617c;
    }

    public final String c() {
        return this.f9618d;
    }

    public final Map<String, String> d() {
        return this.f9616b;
    }
}
