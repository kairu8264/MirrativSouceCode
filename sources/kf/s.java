package kf;

/* loaded from: classes2.dex */
public final class s implements r {

    /* renamed from: a  reason: collision with root package name */
    public final t f38731a;

    /* renamed from: b  reason: collision with root package name */
    public final k f38732b;

    public s(t tVar, k kVar) {
        jo.p.h(tVar, "settingPreference");
        jo.p.h(kVar, "getNotificationPolicyAccessGranted");
        this.f38731a = tVar;
        this.f38732b = kVar;
    }

    @Override // kf.r
    public void d() {
        if (this.f38732b.d()) {
            return;
        }
        if (this.f38731a.b0() == 1 || this.f38731a.b0() == 2) {
            this.f38731a.I4(-1);
        }
    }
}
