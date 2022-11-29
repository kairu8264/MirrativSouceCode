package wg;

import ai.vd0;
import ai.wg0;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import yg.d2;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f58699a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f58700b;

    /* renamed from: c  reason: collision with root package name */
    public final wg0 f58701c;

    /* renamed from: d  reason: collision with root package name */
    public final vd0 f58702d = new vd0(false, Collections.emptyList());

    public b(Context context, wg0 wg0Var, vd0 vd0Var) {
        this.f58699a = context;
        this.f58701c = wg0Var;
    }

    public final void a() {
        this.f58700b = true;
    }

    public final boolean b() {
        return !d() || this.f58700b;
    }

    public final void c(String str) {
        List<String> list;
        if (d()) {
            if (str == null) {
                str = "";
            }
            wg0 wg0Var = this.f58701c;
            if (wg0Var != null) {
                wg0Var.a(str, null, 3);
                return;
            }
            vd0 vd0Var = this.f58702d;
            if (!vd0Var.f11029w || (list = vd0Var.f11030x) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    t.d();
                    d2.n(this.f58699a, "", replace);
                }
            }
        }
    }

    public final boolean d() {
        wg0 wg0Var = this.f58701c;
        return (wg0Var != null && wg0Var.zzb().B) || this.f58702d.f11029w;
    }
}
