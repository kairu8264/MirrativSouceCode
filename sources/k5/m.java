package k5;

import android.annotation.SuppressLint;

/* loaded from: classes.dex */
public interface m {
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: a  reason: collision with root package name */
    public static final b.c f38418a = new b.c();
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: b  reason: collision with root package name */
    public static final b.C0534b f38419b = new b.C0534b();

    /* loaded from: classes.dex */
    public static abstract class b {

        /* loaded from: classes.dex */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public final Throwable f38420a;

            public a(Throwable th2) {
                this.f38420a = th2;
            }

            public Throwable a() {
                return this.f38420a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", this.f38420a.getMessage());
            }
        }

        /* renamed from: k5.m$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0534b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            public C0534b() {
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            public c() {
            }
        }
    }
}
