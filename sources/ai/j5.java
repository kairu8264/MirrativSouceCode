package ai;

import android.net.Uri;
import java.util.List;

/* loaded from: classes3.dex */
public final class j5 {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f5621a;

    /* renamed from: c  reason: collision with root package name */
    public final List f5623c;

    /* renamed from: e  reason: collision with root package name */
    public final List f5625e;

    /* renamed from: b  reason: collision with root package name */
    public final String f5622b = null;

    /* renamed from: d  reason: collision with root package name */
    public final String f5624d = null;

    /* renamed from: f  reason: collision with root package name */
    public final Object f5626f = null;

    public /* synthetic */ j5(Uri uri, String str, f5 f5Var, a5 a5Var, List list, String str2, List list2, Object obj, i5 i5Var) {
        this.f5621a = uri;
        this.f5623c = list;
        this.f5625e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j5) {
            j5 j5Var = (j5) obj;
            return this.f5621a.equals(j5Var.f5621a) && sb.H(null, null) && sb.H(null, null) && sb.H(null, null) && this.f5623c.equals(j5Var.f5623c) && sb.H(null, null) && this.f5625e.equals(j5Var.f5625e) && sb.H(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f5621a.hashCode() * 923521) + this.f5623c.hashCode()) * 961) + this.f5625e.hashCode()) * 31;
    }
}
