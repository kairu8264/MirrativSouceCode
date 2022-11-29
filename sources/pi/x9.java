package pi;

import android.os.Bundle;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes3.dex */
public final class x9 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f48356w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ String f48357x = "_err";

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ Bundle f48358y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ y9 f48359z;

    public x9(y9 y9Var, String str, String str2, Bundle bundle) {
        this.f48359z = y9Var;
        this.f48356w = str;
        this.f48358y = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48359z.f48392a.h((u) rh.p.i(this.f48359z.f48392a.g0().w0(this.f48356w, this.f48357x, this.f48358y, TtmlNode.TEXT_EMPHASIS_AUTO, this.f48359z.f48392a.c().currentTimeMillis(), false, true)), this.f48356w);
    }
}
