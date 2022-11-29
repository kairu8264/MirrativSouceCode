package zf;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f63186a;

    public b(String str) {
        Objects.requireNonNull(str, "name is null");
        this.f63186a = str;
    }

    public static b b(String str) {
        return new b(str);
    }

    public String a() {
        return this.f63186a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f63186a.equals(((b) obj).f63186a);
        }
        return false;
    }

    public int hashCode() {
        return this.f63186a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f63186a + "\"}";
    }
}
