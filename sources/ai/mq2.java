package ai;

import android.os.Bundle;
import android.text.TextUtils;
import com.dena.mirrorman.clientlog.logs.ActionLogBase;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class mq2 {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, String> f7006a;

    /* renamed from: b  reason: collision with root package name */
    public final sq2 f7007b;

    public mq2() {
        HashMap<String, String> hashMap = new HashMap<>();
        this.f7006a = hashMap;
        this.f7007b = new sq2(wg.t.k());
        hashMap.put("new_csi", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
    }

    public static mq2 a(String str) {
        mq2 mq2Var = new mq2();
        mq2Var.f7006a.put(ActionLogBase.ACTION, str);
        return mq2Var;
    }

    public static mq2 b(String str) {
        mq2 mq2Var = new mq2();
        mq2Var.f7006a.put("request_id", str);
        return mq2Var;
    }

    public final mq2 c(String str, String str2) {
        this.f7006a.put(str, str2);
        return this;
    }

    public final mq2 d(String str) {
        this.f7007b.a(str);
        return this;
    }

    public final mq2 e(String str, String str2) {
        this.f7007b.b(str, str2);
        return this;
    }

    public final mq2 f(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.f7006a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.f7006a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    public final mq2 g(sl2 sl2Var, jj0 jj0Var) {
        rl2 rl2Var = sl2Var.f9876b;
        h(rl2Var.f9497b);
        if (!rl2Var.f9496a.isEmpty()) {
            switch (rl2Var.f9496a.get(0).f4082b) {
                case 1:
                    this.f7006a.put("ad_format", MRLog.TARGET_TYPE_BANNER);
                    break;
                case 2:
                    this.f7006a.put("ad_format", "interstitial");
                    break;
                case 3:
                    this.f7006a.put("ad_format", "native_express");
                    break;
                case 4:
                    this.f7006a.put("ad_format", "native_advanced");
                    break;
                case 5:
                    this.f7006a.put("ad_format", "rewarded");
                    break;
                case 6:
                    this.f7006a.put("ad_format", "app_open_ad");
                    if (jj0Var != null) {
                        this.f7006a.put(TopicConstant.PACKET_TYPE_AUDIO_SPEEX, true != jj0Var.j() ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                        break;
                    }
                    break;
                default:
                    this.f7006a.put("ad_format", "unknown");
                    break;
            }
        }
        if (((Boolean) ft.c().c(ox.f8034l5)).booleanValue()) {
            boolean a10 = eh.o.a(sl2Var);
            this.f7006a.put("scar", String.valueOf(a10));
            if (a10) {
                String b10 = eh.o.b(sl2Var);
                if (!TextUtils.isEmpty(b10)) {
                    this.f7006a.put("ragent", b10);
                }
                String c10 = eh.o.c(sl2Var);
                if (!TextUtils.isEmpty(c10)) {
                    this.f7006a.put("rtype", c10);
                }
            }
        }
        return this;
    }

    public final mq2 h(kl2 kl2Var) {
        if (!TextUtils.isEmpty(kl2Var.f6277b)) {
            this.f7006a.put("gqi", kl2Var.f6277b);
        }
        return this;
    }

    public final mq2 i(fl2 fl2Var) {
        this.f7006a.put("aai", fl2Var.f4112w);
        return this;
    }

    public final Map<String, String> j() {
        HashMap hashMap = new HashMap(this.f7006a);
        for (rq2 rq2Var : this.f7007b.c()) {
            hashMap.put(rq2Var.f9536a, rq2Var.f9537b);
        }
        return hashMap;
    }
}
