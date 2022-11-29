package k5;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final Set<a> f38408a = new HashSet();

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f38409a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f38410b;

        public a(Uri uri, boolean z10) {
            this.f38409a = uri;
            this.f38410b = z10;
        }

        public Uri a() {
            return this.f38409a;
        }

        public boolean b() {
            return this.f38410b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f38410b == aVar.f38410b && this.f38409a.equals(aVar.f38409a);
        }

        public int hashCode() {
            return (this.f38409a.hashCode() * 31) + (this.f38410b ? 1 : 0);
        }
    }

    public void a(Uri uri, boolean z10) {
        this.f38408a.add(new a(uri, z10));
    }

    public Set<a> b() {
        return this.f38408a;
    }

    public int c() {
        return this.f38408a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f38408a.equals(((c) obj).f38408a);
    }

    public int hashCode() {
        return this.f38408a.hashCode();
    }
}
