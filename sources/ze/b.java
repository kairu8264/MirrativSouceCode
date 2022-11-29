package ze;

import com.mirrativ.llstream.encoder.AACEncoder;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: j  reason: collision with root package name */
    public static final a f63104j = new a(null);

    /* renamed from: k  reason: collision with root package name */
    public static final int f63105k = 8;

    /* renamed from: l  reason: collision with root package name */
    public static b f63106l;

    /* renamed from: a  reason: collision with root package name */
    public int f63107a = 30;

    /* renamed from: b  reason: collision with root package name */
    public int f63108b = 524288;

    /* renamed from: c  reason: collision with root package name */
    public int f63109c = 432;

    /* renamed from: d  reason: collision with root package name */
    public int f63110d = 768;

    /* renamed from: e  reason: collision with root package name */
    public final int f63111e = AACEncoder.SAMPLING_RATE;

    /* renamed from: i  reason: collision with root package name */
    public final int f63115i = 64000;

    /* renamed from: g  reason: collision with root package name */
    public final int f63113g = 64000 / 10;

    /* renamed from: h  reason: collision with root package name */
    public final int f63114h = 64000;

    /* renamed from: f  reason: collision with root package name */
    public final int f63112f = 64000;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final b a() {
            if (b.f63106l != null) {
                b bVar = b.f63106l;
                jo.p.f(bVar, "null cannot be cast to non-null type com.dena.mirrorman.feature.recorder.encoder.MediaEncoderPref");
                return bVar;
            }
            new b().b();
            b bVar2 = b.f63106l;
            jo.p.f(bVar2, "null cannot be cast to non-null type com.dena.mirrorman.feature.recorder.encoder.MediaEncoderPref");
            return bVar2;
        }
    }

    public final void b() {
        f63106l = this;
    }

    public final int c() {
        return this.f63112f;
    }

    public final int d() {
        return this.f63111e;
    }

    public final int e() {
        return this.f63108b;
    }

    public final int f() {
        return this.f63107a;
    }

    public final void g(int i10, int i11, int i12, int i13) {
        g9.a.g("Broadcast Setting: width:" + i10 + " / height:" + i11 + " / bitrate:" + i12 + " / framerate:" + i13);
        this.f63109c = i10;
        this.f63110d = i11;
        this.f63108b = i12;
        this.f63107a = i13;
    }

    public final void h(int i10) {
        this.f63108b = i10;
    }
}
