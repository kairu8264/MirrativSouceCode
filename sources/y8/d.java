package y8;

import com.dena.mirrorman.net.api.response.App;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public a f61289a;

    /* renamed from: b  reason: collision with root package name */
    public App.AppParams f61290b;

    /* loaded from: classes.dex */
    public enum a {
        Normal,
        Selected,
        NotSelected,
        Add,
        AddWithRegistrationGuide
    }

    public final App.AppParams a() {
        return this.f61290b;
    }

    public final a b() {
        return this.f61289a;
    }

    public final void c(App.AppParams appParams) {
        this.f61290b = appParams;
    }

    public final void d(a aVar) {
        this.f61289a = aVar;
    }
}
