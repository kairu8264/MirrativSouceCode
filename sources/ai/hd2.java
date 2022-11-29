package ai;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class hd2 implements wc2<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    public final String f4824a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4825b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4826c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4827d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f4828e;

    /* renamed from: f  reason: collision with root package name */
    public final int f4829f;

    public hd2(String str, int i10, int i11, int i12, boolean z10, int i13) {
        this.f4824a = str;
        this.f4825b = i10;
        this.f4826c = i11;
        this.f4827d = i12;
        this.f4828e = z10;
        this.f4829f = i13;
    }

    @Override // ai.wc2
    public final /* bridge */ /* synthetic */ void d(Bundle bundle) {
        Bundle bundle2 = bundle;
        String str = this.f4824a;
        km2.b(bundle2, "carrier", str, !TextUtils.isEmpty(str));
        km2.c(bundle2, "cnt", Integer.valueOf(this.f4825b), this.f4825b != -2);
        bundle2.putInt("gnt", this.f4826c);
        bundle2.putInt("pt", this.f4827d);
        Bundle a10 = km2.a(bundle2, "device");
        bundle2.putBundle("device", a10);
        Bundle a11 = km2.a(a10, "network");
        a10.putBundle("network", a11);
        a11.putInt("active_network_state", this.f4829f);
        a11.putBoolean("active_network_metered", this.f4828e);
    }
}
