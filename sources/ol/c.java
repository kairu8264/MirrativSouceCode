package ol;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public final a f45447a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f45448b;

    public c(a aVar) {
        this.f45447a = aVar;
        this.f45448b = b(aVar);
    }

    public static void a(String str, String str2, Bundle bundle, Bundle bundle2) {
        String string = bundle.getString(str);
        if (TextUtils.isEmpty(string)) {
            return;
        }
        bundle2.putString(str2, string);
    }

    public static Bundle b(a aVar) {
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = new Bundle();
        if (aVar == null || aVar.U() == null || (bundle = aVar.U().getBundle("scionData")) == null || (bundle2 = bundle.getBundle("_cmp")) == null) {
            return bundle3;
        }
        a("medium", "utm_medium", bundle2, bundle3);
        a("source", "utm_source", bundle2, bundle3);
        a("campaign", "utm_campaign", bundle2, bundle3);
        return bundle3;
    }
}
