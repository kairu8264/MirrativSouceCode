package rh;

import android.os.Bundle;
import com.google.android.gms.common.api.a;

/* loaded from: classes3.dex */
public class w implements a.d {

    /* renamed from: c  reason: collision with root package name */
    public static final w f51519c = c().a();

    /* renamed from: b  reason: collision with root package name */
    public final String f51520b;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f51521a;

        public /* synthetic */ a(y yVar) {
        }

        public w a() {
            return new w(this.f51521a, null);
        }
    }

    public /* synthetic */ w(String str, z zVar) {
        this.f51520b = str;
    }

    public static a c() {
        return new a(null);
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        String str = this.f51520b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            return n.a(this.f51520b, ((w) obj).f51520b);
        }
        return false;
    }

    public final int hashCode() {
        return n.b(this.f51520b);
    }
}
