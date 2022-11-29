package ai;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class ob2 implements wc2<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    public final String f7709a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7710b;

    public ob2(String str, String str2) {
        this.f7709a = str;
        this.f7710b = str2;
    }

    @Override // ai.wc2
    public final /* bridge */ /* synthetic */ void d(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (((Boolean) ft.c().c(ox.f8002h5)).booleanValue()) {
            bundle2.putString("request_id", this.f7710b);
        } else {
            bundle2.putString("request_id", this.f7709a);
        }
    }
}
