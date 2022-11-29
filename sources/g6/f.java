package g6;

import android.net.Uri;
import j6.m;
import jo.p;

/* loaded from: classes.dex */
public final class f implements c<String, Uri> {
    @Override // g6.c
    /* renamed from: b */
    public Uri a(String str, m mVar) {
        Uri parse = Uri.parse(str);
        p.g(parse, "parse(this)");
        return parse;
    }
}
