package x7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.List;
import m7.h;
import m7.j;
import o7.u;

/* loaded from: classes.dex */
public class d implements j<Uri, Drawable> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f59773a;

    public d(Context context) {
        this.f59773a = context.getApplicationContext();
    }

    @Override // m7.j
    /* renamed from: c */
    public u<Drawable> b(Uri uri, int i10, int i11, h hVar) {
        Context d10 = d(uri, uri.getAuthority());
        return c.f(a.b(this.f59773a, d10, g(d10, uri)));
    }

    public final Context d(Uri uri, String str) {
        if (str.equals(this.f59773a.getPackageName())) {
            return this.f59773a;
        }
        try {
            return this.f59773a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            if (str.contains(this.f59773a.getPackageName())) {
                return this.f59773a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e10);
        }
    }

    public final int e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e10);
        }
    }

    public final int f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    public final int g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // m7.j
    /* renamed from: h */
    public boolean a(Uri uri, h hVar) {
        return uri.getScheme().equals("android.resource");
    }
}
