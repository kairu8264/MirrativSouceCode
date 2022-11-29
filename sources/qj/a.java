package qj;

import android.graphics.Typeface;

/* loaded from: classes3.dex */
public final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    public final Typeface f49532a;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC0746a f49533b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f49534c;

    /* renamed from: qj.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0746a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0746a interfaceC0746a, Typeface typeface) {
        this.f49532a = typeface;
        this.f49533b = interfaceC0746a;
    }

    @Override // qj.f
    public void a(int i10) {
        d(this.f49532a);
    }

    @Override // qj.f
    public void b(Typeface typeface, boolean z10) {
        d(typeface);
    }

    public void c() {
        this.f49534c = true;
    }

    public final void d(Typeface typeface) {
        if (this.f49534c) {
            return;
        }
        this.f49533b.a(typeface);
    }
}
