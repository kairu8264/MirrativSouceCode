package ai;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class x12<AdT> implements ry1<AdT> {
    public static Bundle d(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // ai.ry1
    public final s43<AdT> a(sl2 sl2Var, fl2 fl2Var) {
        String optString = fl2Var.f4111v.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        yl2 yl2Var = sl2Var.f9875a.f8473a;
        wl2 wl2Var = new wl2();
        wl2Var.k(yl2Var);
        wl2Var.L(optString);
        Bundle d10 = d(yl2Var.f12650d.I);
        Bundle d11 = d(d10.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        d11.putInt("gw", 1);
        String optString2 = fl2Var.f4111v.optString(AdMobAdapter.HOUSE_ADS_PARAMETER, null);
        if (optString2 != null) {
            d11.putString(AdMobAdapter.HOUSE_ADS_PARAMETER, optString2);
        }
        String optString3 = fl2Var.f4111v.optString(AdMobAdapter.AD_JSON_PARAMETER, null);
        if (optString3 != null) {
            d11.putString(AdMobAdapter.AD_PARAMETER, optString3);
        }
        d11.putBoolean("_noRefresh", true);
        Iterator<String> keys = fl2Var.D.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = fl2Var.D.optString(next, null);
            if (next != null) {
                d11.putString(next, optString4);
            }
        }
        d10.putBundle("com.google.ads.mediation.admob.AdMobAdapter", d11);
        as asVar = yl2Var.f12650d;
        wl2Var.G(new as(asVar.f1983w, asVar.f1984x, d11, asVar.f1986z, asVar.A, asVar.B, asVar.C, asVar.D, asVar.E, asVar.F, asVar.G, asVar.H, d10, asVar.J, asVar.K, asVar.L, asVar.M, asVar.N, asVar.O, asVar.P, asVar.Q, asVar.R, asVar.S, asVar.T));
        yl2 l10 = wl2Var.l();
        Bundle bundle = new Bundle();
        kl2 kl2Var = sl2Var.f9876b.f9497b;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(kl2Var.f6276a));
        bundle2.putInt("refresh_interval", kl2Var.f6278c);
        bundle2.putString("gws_query_id", kl2Var.f6277b);
        bundle.putBundle("parent_common_config", bundle2);
        String str = sl2Var.f9875a.f8473a.f12652f;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        bundle3.putString("allocation_id", fl2Var.f4112w);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(fl2Var.f4084c));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(fl2Var.f4086d));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(fl2Var.f4105p));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(fl2Var.f4103n));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(fl2Var.f4094h));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(fl2Var.f4096i));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(fl2Var.f4098j));
        bundle3.putString("transaction_id", fl2Var.f4100k);
        bundle3.putString("valid_from_timestamp", fl2Var.f4101l);
        bundle3.putBoolean("is_closable_area_disabled", fl2Var.L);
        if (fl2Var.f4102m != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", fl2Var.f4102m.f6554x);
            bundle4.putString("rb_type", fl2Var.f4102m.f6553w);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return c(l10, bundle);
    }

    @Override // ai.ry1
    public final boolean b(sl2 sl2Var, fl2 fl2Var) {
        return !TextUtils.isEmpty(fl2Var.f4111v.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    public abstract s43<AdT> c(yl2 yl2Var, Bundle bundle);
}
