package k3;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class i implements h {

    /* renamed from: a  reason: collision with root package name */
    public final LocaleList f38384a;

    public i(LocaleList localeList) {
        this.f38384a = localeList;
    }

    @Override // k3.h
    public Object a() {
        return this.f38384a;
    }

    public boolean equals(Object obj) {
        return this.f38384a.equals(((h) obj).a());
    }

    @Override // k3.h
    public Locale get(int i10) {
        return this.f38384a.get(i10);
    }

    public int hashCode() {
        return this.f38384a.hashCode();
    }

    public String toString() {
        return this.f38384a.toString();
    }
}
