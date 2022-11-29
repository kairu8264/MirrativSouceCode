package dq;

import android.os.Looper;

/* loaded from: classes4.dex */
public interface g {

    /* loaded from: classes4.dex */
    public static class a implements g {

        /* renamed from: a  reason: collision with root package name */
        public final Looper f29828a;

        public a(Looper looper) {
            this.f29828a = looper;
        }

        @Override // dq.g
        public k a(c cVar) {
            return new e(cVar, this.f29828a, 10);
        }

        @Override // dq.g
        public boolean b() {
            return this.f29828a == Looper.myLooper();
        }
    }

    k a(c cVar);

    boolean b();
}
