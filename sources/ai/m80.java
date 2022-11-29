package ai;

import android.net.Uri;

/* loaded from: classes3.dex */
public final class m80 extends yj0 {

    /* renamed from: b  reason: collision with root package name */
    public final l80 f6833b;

    public m80(l80 l80Var, String str) {
        super(str);
        this.f6833b = l80Var;
    }

    @Override // ai.yj0, ai.mj0
    public final void v(String str) {
        String valueOf = String.valueOf(str);
        uj0.a(valueOf.length() != 0 ? "LeibnizHttpUrlPinger pinging URL: ".concat(valueOf) : new String("LeibnizHttpUrlPinger pinging URL: "));
        if ("oda".equals(Uri.parse(str).getScheme())) {
            return;
        }
        uj0.a("URL does not match oda:// scheme, falling back on HttpUrlPinger");
        super.v(str);
    }
}
