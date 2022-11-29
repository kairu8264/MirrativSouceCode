package pi;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes3.dex */
public final class h4 implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ hi.t0 f47902w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ ServiceConnection f47903x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ i4 f47904y;

    public h4(i4 i4Var, hi.t0 t0Var, ServiceConnection serviceConnection) {
        this.f47904y = i4Var;
        this.f47902w = t0Var;
        this.f47903x = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        i4 i4Var = this.f47904y;
        j4 j4Var = i4Var.f47931x;
        str = i4Var.f47930w;
        hi.t0 t0Var = this.f47902w;
        ServiceConnection serviceConnection = this.f47903x;
        j4Var.f47968a.a().f();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        Bundle bundle2 = null;
        try {
            Bundle g02 = t0Var.g0(bundle);
            if (g02 == null) {
                j4Var.f47968a.r().p().a("Install Referrer Service returned a null response");
            } else {
                bundle2 = g02;
            }
        } catch (Exception e10) {
            j4Var.f47968a.r().p().b("Exception occurred while retrieving the Install Referrer", e10.getMessage());
        }
        j4Var.f47968a.a().f();
        b5.s();
        if (bundle2 != null) {
            long j10 = bundle2.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j10 == 0) {
                j4Var.f47968a.r().v().a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle2.getString("install_referrer");
                if (string != null && !string.isEmpty()) {
                    j4Var.f47968a.r().u().b("InstallReferrer API result", string);
                    Bundle t02 = j4Var.f47968a.N().t0(Uri.parse(string.length() != 0 ? "?".concat(string) : new String("?")));
                    if (t02 == null) {
                        j4Var.f47968a.r().p().a("No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = t02.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j11 = bundle2.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j11 == 0) {
                                j4Var.f47968a.r().p().a("Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                t02.putLong("click_timestamp", j11);
                            }
                        }
                        if (j10 == j4Var.f47968a.E().f47826f.a()) {
                            j4Var.f47968a.r().u().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (j4Var.f47968a.m()) {
                            j4Var.f47968a.E().f47826f.b(j10);
                            j4Var.f47968a.r().u().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            t02.putString("_cis", "referrer API v2");
                            j4Var.f47968a.I().s(TtmlNode.TEXT_EMPHASIS_AUTO, "_cmp", t02, str);
                        }
                    }
                } else {
                    j4Var.f47968a.r().p().a("No referrer defined in Install Referrer response");
                }
            }
        }
        uh.a.b().c(j4Var.f47968a.F(), serviceConnection);
    }
}
