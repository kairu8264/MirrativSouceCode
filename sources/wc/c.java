package wc;

import jo.p;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final int f58587b = ha.a.f34693a;

    /* renamed from: a  reason: collision with root package name */
    public final ha.a f58588a;

    public c(ha.a aVar) {
        p.h(aVar, "statusState");
        this.f58588a = aVar;
    }

    public final c a(ha.a aVar) {
        p.h(aVar, "statusState");
        return new c(aVar);
    }

    public final ha.a b() {
        return this.f58588a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && p.c(this.f58588a, ((c) obj).f58588a);
    }

    public int hashCode() {
        return this.f58588a.hashCode();
    }

    public String toString() {
        return "ChatConfirmationAgreementBindModel(statusState=" + this.f58588a + ')';
    }
}
