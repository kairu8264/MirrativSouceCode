package v9;

import l0.s0;
import xn.s;

/* loaded from: classes.dex */
public interface b {

    /* loaded from: classes.dex */
    public enum a {
        UnPlayed,
        NowPlaying,
        Finished;

        public final boolean c() {
            return s.m(NowPlaying, Finished).contains(this);
        }

        public final boolean e() {
            return this == NowPlaying;
        }
    }

    /* renamed from: v9.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0909b {
        public static void a(b bVar) {
            bVar.a().setValue(a.Finished);
        }

        public static void b(b bVar) {
            bVar.a().setValue(a.NowPlaying);
        }
    }

    s0<a> a();

    void finish();

    void play();
}
