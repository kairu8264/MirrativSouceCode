package yb;

import java.io.Serializable;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class a implements Serializable {

    /* renamed from: y  reason: collision with root package name */
    public static final C1049a f61602y = new C1049a(null);

    /* renamed from: w  reason: collision with root package name */
    public final String f61603w;

    /* renamed from: x  reason: collision with root package name */
    public final String f61604x;

    /* renamed from: yb.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C1049a {
        public C1049a() {
        }

        public /* synthetic */ C1049a(h hVar) {
            this();
        }

        public final a a(String str, String str2) {
            p.h(str, "userName");
            p.h(str2, "profileImageUrl");
            return new a(str, str2);
        }
    }

    public a(String str, String str2) {
        p.h(str, "userName");
        p.h(str2, "profileImageUrl");
        this.f61603w = str;
        this.f61604x = str2;
    }

    public final String a() {
        return this.f61604x;
    }

    public final String b() {
        return this.f61603w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return p.c(this.f61603w, aVar.f61603w) && p.c(this.f61604x, aVar.f61604x);
        }
        return false;
    }

    public int hashCode() {
        return (this.f61603w.hashCode() * 31) + this.f61604x.hashCode();
    }

    public String toString() {
        return "BecameCheerleaderDialogBindModel(userName=" + this.f61603w + ", profileImageUrl=" + this.f61604x + ')';
    }
}
