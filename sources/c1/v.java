package c1;

import android.graphics.Shader;

/* loaded from: classes.dex */
public final class v {

    /* loaded from: classes.dex */
    public static final class a extends d1 {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Shader f18777e;

        public a(Shader shader) {
            this.f18777e = shader;
        }

        @Override // c1.d1
        public Shader b(long j10) {
            return this.f18777e;
        }
    }

    public static final d1 a(Shader shader) {
        jo.p.h(shader, "shader");
        return new a(shader);
    }
}
