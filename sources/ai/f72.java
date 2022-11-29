package ai;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.widget.ActivityChooserModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class f72 implements wc2<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    public final yl2 f3959a;

    /* renamed from: b  reason: collision with root package name */
    public final long f3960b;

    public f72(yl2 yl2Var, long j10) {
        rh.p.j(yl2Var, "the targeting must not be null");
        this.f3959a = yl2Var;
        this.f3960b = j10;
    }

    @Override // ai.wc2
    public final /* bridge */ /* synthetic */ void d(Bundle bundle) {
        Bundle bundle2 = bundle;
        as asVar = this.f3959a.f12650d;
        bundle2.putInt("http_timeout_millis", asVar.S);
        bundle2.putString("slotname", this.f3959a.f12652f);
        int i10 = this.f3959a.f12661o.f7852a;
        int i11 = i10 - 1;
        if (i10 != 0) {
            if (i11 == 1) {
                bundle2.putBoolean("is_new_rewarded", true);
            } else if (i11 == 2) {
                bundle2.putBoolean("is_rewarded_interstitial", true);
            }
            bundle2.putLong("start_signals_timestamp", this.f3960b);
            km2.b(bundle2, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(asVar.f1984x)), asVar.f1984x != -1);
            km2.f(bundle2, "extras", asVar.f1985y);
            km2.c(bundle2, "cust_gender", Integer.valueOf(asVar.f1986z), asVar.f1986z != -1);
            km2.g(bundle2, "kw", asVar.A);
            km2.c(bundle2, "tag_for_child_directed_treatment", Integer.valueOf(asVar.C), asVar.C != -1);
            if (asVar.B) {
                bundle2.putBoolean("test_request", true);
            }
            km2.c(bundle2, "d_imp_hdr", 1, asVar.f1983w >= 2 && asVar.D);
            String str = asVar.E;
            km2.b(bundle2, "ppid", str, asVar.f1983w >= 2 && !TextUtils.isEmpty(str));
            Location location = asVar.G;
            if (location != null) {
                Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
                Long valueOf2 = Long.valueOf(location.getTime() * 1000);
                Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
                Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
                Bundle bundle3 = new Bundle();
                bundle3.putFloat("radius", valueOf.floatValue());
                bundle3.putLong("lat", valueOf3.longValue());
                bundle3.putLong("long", valueOf4.longValue());
                bundle3.putLong(ActivityChooserModel.ATTRIBUTE_TIME, valueOf2.longValue());
                bundle2.putBundle("uule", bundle3);
            }
            km2.e(bundle2, "url", asVar.H);
            km2.g(bundle2, "neighboring_content_urls", asVar.R);
            km2.f(bundle2, "custom_targeting", asVar.J);
            km2.g(bundle2, "category_exclusions", asVar.K);
            km2.e(bundle2, "request_agent", asVar.L);
            km2.e(bundle2, "request_pkg", asVar.M);
            km2.d(bundle2, "is_designed_for_families", Boolean.valueOf(asVar.N), asVar.f1983w >= 7);
            if (asVar.f1983w >= 8) {
                km2.c(bundle2, "tag_for_under_age_of_consent", Integer.valueOf(asVar.P), asVar.P != -1);
                km2.e(bundle2, "max_ad_content_rating", asVar.Q);
                return;
            }
            return;
        }
        throw null;
    }
}
