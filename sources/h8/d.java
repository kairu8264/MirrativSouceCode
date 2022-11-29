package h8;

import i8.j;
import java.security.MessageDigest;
import m7.e;

/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: b  reason: collision with root package name */
    public final Object f34593b;

    public d(Object obj) {
        this.f34593b = j.d(obj);
    }

    @Override // m7.e
    public void a(MessageDigest messageDigest) {
        messageDigest.update(this.f34593b.toString().getBytes(e.f40610a));
    }

    @Override // m7.e
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f34593b.equals(((d) obj).f34593b);
        }
        return false;
    }

    @Override // m7.e
    public int hashCode() {
        return this.f34593b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f34593b + '}';
    }
}
