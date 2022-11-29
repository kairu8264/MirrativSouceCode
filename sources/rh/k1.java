package rh;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes3.dex */
public final class k1 {

    /* renamed from: f  reason: collision with root package name */
    public static final Uri f51464f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a  reason: collision with root package name */
    public final String f51465a;

    /* renamed from: b  reason: collision with root package name */
    public final String f51466b;

    /* renamed from: c  reason: collision with root package name */
    public final ComponentName f51467c;

    /* renamed from: d  reason: collision with root package name */
    public final int f51468d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f51469e;

    public k1(String str, String str2, int i10, boolean z10) {
        p.e(str);
        this.f51465a = str;
        p.e(str2);
        this.f51466b = str2;
        this.f51467c = null;
        this.f51468d = i10;
        this.f51469e = z10;
    }

    public final int a() {
        return this.f51468d;
    }

    public final ComponentName b() {
        return this.f51467c;
    }

    public final Intent c(Context context) {
        Bundle bundle;
        if (this.f51465a != null) {
            if (this.f51469e) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", this.f51465a);
                try {
                    bundle = context.getContentResolver().call(f51464f, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException e10) {
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e10.toString()));
                    bundle = null;
                }
                r2 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
                if (r2 == null) {
                    String valueOf = String.valueOf(this.f51465a);
                    Log.w("ConnectionStatusConfig", valueOf.length() != 0 ? "Dynamic lookup for intent failed for action: ".concat(valueOf) : new String("Dynamic lookup for intent failed for action: "));
                }
            }
            return r2 != null ? r2 : new Intent(this.f51465a).setPackage(this.f51466b);
        }
        return new Intent().setComponent(this.f51467c);
    }

    public final String d() {
        return this.f51466b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k1) {
            k1 k1Var = (k1) obj;
            return n.a(this.f51465a, k1Var.f51465a) && n.a(this.f51466b, k1Var.f51466b) && n.a(this.f51467c, k1Var.f51467c) && this.f51468d == k1Var.f51468d && this.f51469e == k1Var.f51469e;
        }
        return false;
    }

    public final int hashCode() {
        return n.b(this.f51465a, this.f51466b, this.f51467c, Integer.valueOf(this.f51468d), Boolean.valueOf(this.f51469e));
    }

    public final String toString() {
        String str = this.f51465a;
        if (str == null) {
            p.i(this.f51467c);
            return this.f51467c.flattenToString();
        }
        return str;
    }
}
