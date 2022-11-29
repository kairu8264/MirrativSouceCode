package fm;

import gi.e;
import gi.s;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final b f32049b = new a().a();

    /* renamed from: a  reason: collision with root package name */
    public final fm.a f32050a;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public fm.a f32051a = null;

        public b a() {
            return new b(this.f32051a);
        }

        public a b(fm.a aVar) {
            this.f32051a = aVar;
            return this;
        }
    }

    public b(fm.a aVar) {
        this.f32050a = aVar;
    }

    public static a b() {
        return new a();
    }

    @s(zza = 1)
    public fm.a a() {
        return this.f32050a;
    }

    public byte[] c() {
        return e.b(this);
    }
}
