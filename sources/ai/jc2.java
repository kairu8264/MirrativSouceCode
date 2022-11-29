package ai;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class jc2 implements wc2<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    public final String f5698a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5699b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5700c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5701d;

    /* renamed from: e  reason: collision with root package name */
    public final Long f5702e;

    public jc2(String str, String str2, String str3, String str4, Long l10) {
        this.f5698a = str;
        this.f5699b = str2;
        this.f5700c = str3;
        this.f5701d = str4;
        this.f5702e = l10;
    }

    @Override // ai.wc2
    public final /* bridge */ /* synthetic */ void d(Bundle bundle) {
        Bundle bundle2 = bundle;
        km2.e(bundle2, "gmp_app_id", this.f5698a);
        km2.e(bundle2, "fbs_aiid", this.f5699b);
        km2.e(bundle2, "fbs_aeid", this.f5700c);
        km2.e(bundle2, "apm_id_origin", this.f5701d);
        Long l10 = this.f5702e;
        if (l10 != null) {
            bundle2.putLong("sai_timeout", l10.longValue());
        }
    }
}
