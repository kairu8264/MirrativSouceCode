package ai;

import android.os.Bundle;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;

/* loaded from: classes3.dex */
public final class x92 implements wc2<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    public final String f11892a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11893b;

    public x92(String str, boolean z10) {
        this.f11892a = str;
        this.f11893b = z10;
    }

    @Override // ai.wc2
    public final /* bridge */ /* synthetic */ void d(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("gct", this.f11892a);
        if (this.f11893b) {
            bundle2.putString("de", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
    }
}
