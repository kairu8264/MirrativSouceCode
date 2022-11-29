package ai;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.dena.mirrorman.clientlog.logs.LogBase;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class vq2 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11154a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11155b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11156c;

    public vq2(Context context, zj0 zj0Var) {
        this.f11154a = context;
        this.f11155b = context.getPackageName();
        this.f11156c = zj0Var.f13013w;
    }

    public final void a(Map<String, String> map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put(LogBase.OS, Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        wg.t.d();
        map.put("device", yg.d2.e0());
        map.put("app", this.f11155b);
        wg.t.d();
        map.put("is_lite_sdk", true != yg.d2.h(this.f11154a) ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        List<String> d10 = ox.d();
        if (((Boolean) ft.c().c(ox.f7986f5)).booleanValue()) {
            d10.addAll(wg.t.h().p().n().h());
        }
        map.put(i7.e.f36387u, TextUtils.join(",", d10));
        map.put("sdkVersion", this.f11156c);
    }
}
