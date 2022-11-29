package g6;

import android.content.res.Resources;
import android.net.Uri;
import j6.m;
import java.util.List;
import jo.p;
import so.n;

/* loaded from: classes.dex */
public final class e implements c<Uri, Uri> {
    public final boolean b(Uri uri) {
        if (p.c(uri.getScheme(), "android.resource")) {
            String authority = uri.getAuthority();
            if (!(authority == null || n.r(authority)) && uri.getPathSegments().size() == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // g6.c
    /* renamed from: c */
    public Uri a(Uri uri, m mVar) {
        if (b(uri)) {
            String authority = uri.getAuthority();
            if (authority == null) {
                authority = "";
            }
            Resources resourcesForApplication = mVar.g().getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            if (identifier != 0) {
                Uri parse = Uri.parse("android.resource://" + authority + '/' + identifier);
                p.g(parse, "parse(this)");
                return parse;
            }
            throw new IllegalStateException(p.o("Invalid android.resource URI: ", uri).toString());
        }
        return null;
    }
}
