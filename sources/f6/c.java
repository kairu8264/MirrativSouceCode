package f6;

import android.net.Uri;
import j6.m;
import jo.p;
import o6.k;

/* loaded from: classes.dex */
public final class c implements b<Uri> {
    @Override // f6.b
    /* renamed from: b */
    public String a(Uri uri, m mVar) {
        if (p.c(uri.getScheme(), "android.resource")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(uri);
            sb2.append('-');
            sb2.append(k.k(mVar.g().getResources().getConfiguration()));
            return sb2.toString();
        }
        return uri.toString();
    }
}
