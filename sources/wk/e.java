package wk;

import android.os.Bundle;
import java.util.Locale;
import tk.a;

/* loaded from: classes.dex */
public class e implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public yk.b f59174a;

    /* renamed from: b  reason: collision with root package name */
    public yk.b f59175b;

    public static void b(yk.b bVar, String str, Bundle bundle) {
        if (bVar == null) {
            return;
        }
        bVar.onEvent(str, bundle);
    }

    @Override // tk.a.b
    public void a(int i10, Bundle bundle) {
        String string;
        xk.f.f().i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i10), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        c(string, bundle2);
    }

    public final void c(String str, Bundle bundle) {
        yk.b bVar;
        if ("clx".equals(bundle.getString("_o"))) {
            bVar = this.f59174a;
        } else {
            bVar = this.f59175b;
        }
        b(bVar, str, bundle);
    }

    public void d(yk.b bVar) {
        this.f59175b = bVar;
    }

    public void e(yk.b bVar) {
        this.f59174a = bVar;
    }
}
