package ai;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class bw0 implements lv0 {

    /* renamed from: a  reason: collision with root package name */
    public final CookieManager f2567a;

    public bw0(Context context) {
        this.f2567a = wg.t.f().k(context);
    }

    @Override // ai.lv0
    public final void a(Map<String, String> map) {
        if (this.f2567a == null) {
            return;
        }
        if (map.get("clear") != null) {
            String str = (String) ft.c().c(ox.f8141z0);
            String cookie = this.f2567a.getCookie(str);
            if (cookie == null) {
                return;
            }
            List<String> f10 = vx2.b(yw2.b(';')).f(cookie);
            for (int i10 = 0; i10 < f10.size(); i10++) {
                CookieManager cookieManager = this.f2567a;
                Iterator<String> it = vx2.b(yw2.b('=')).d(f10.get(i10)).iterator();
                Objects.requireNonNull(it);
                if (it.hasNext()) {
                    String valueOf = String.valueOf(it.next());
                    String valueOf2 = String.valueOf((String) ft.c().c(ox.f8069q0));
                    cookieManager.setCookie(str, valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
                } else {
                    StringBuilder sb2 = new StringBuilder(91);
                    sb2.append("position (0) must be less than the number of elements that remained (");
                    sb2.append(0);
                    sb2.append(")");
                    throw new IndexOutOfBoundsException(sb2.toString());
                }
            }
            return;
        }
        String str2 = map.get("cookie");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f2567a.setCookie((String) ft.c().c(ox.f8141z0), str2);
    }
}
