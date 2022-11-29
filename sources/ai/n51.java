package ai;

import java.util.Set;

/* loaded from: classes3.dex */
public final class n51 extends ja1<p51> {

    /* renamed from: x  reason: collision with root package name */
    public boolean f7198x;

    public n51(Set<gc1<p51>> set) {
        super(set);
        this.f7198x = false;
    }

    public final synchronized void zza() {
        if (this.f7198x) {
            return;
        }
        C0(m51.f6812a);
        this.f7198x = true;
    }
}
