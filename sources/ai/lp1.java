package ai;

import android.os.Bundle;
import android.text.TextUtils;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Deprecated
/* loaded from: classes3.dex */
public final class lp1 {

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, String> f6640a;

    /* renamed from: b  reason: collision with root package name */
    public final jj0 f6641b;

    public lp1(up1 up1Var, jj0 jj0Var) {
        this.f6640a = new ConcurrentHashMap<>(up1Var.f11709b);
        this.f6641b = jj0Var;
    }

    public final void a(sl2 sl2Var) {
        if (sl2Var.f9876b.f9496a.size() > 0) {
            switch (sl2Var.f9876b.f9496a.get(0).f4082b) {
                case 1:
                    this.f6640a.put("ad_format", MRLog.TARGET_TYPE_BANNER);
                    break;
                case 2:
                    this.f6640a.put("ad_format", "interstitial");
                    break;
                case 3:
                    this.f6640a.put("ad_format", "native_express");
                    break;
                case 4:
                    this.f6640a.put("ad_format", "native_advanced");
                    break;
                case 5:
                    this.f6640a.put("ad_format", "rewarded");
                    break;
                case 6:
                    this.f6640a.put("ad_format", "app_open_ad");
                    this.f6640a.put(TopicConstant.PACKET_TYPE_AUDIO_SPEEX, true != this.f6641b.j() ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    break;
                default:
                    this.f6640a.put("ad_format", "unknown");
                    break;
            }
        }
        if (!TextUtils.isEmpty(sl2Var.f9876b.f9497b.f6277b)) {
            this.f6640a.put("gqi", sl2Var.f9876b.f9497b.f6277b);
        }
        if (((Boolean) ft.c().c(ox.f8034l5)).booleanValue()) {
            boolean a10 = eh.o.a(sl2Var);
            this.f6640a.put("scar", String.valueOf(a10));
            if (a10) {
                String b10 = eh.o.b(sl2Var);
                if (!TextUtils.isEmpty(b10)) {
                    this.f6640a.put("ragent", b10);
                }
                String c10 = eh.o.c(sl2Var);
                if (TextUtils.isEmpty(c10)) {
                    return;
                }
                this.f6640a.put("rtype", c10);
            }
        }
    }

    public final void b(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.f6640a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.f6640a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final Map<String, String> c() {
        return this.f6640a;
    }
}
