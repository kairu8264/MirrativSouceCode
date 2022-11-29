package androidx.compose.ui.platform;

import android.view.View;

/* loaded from: classes.dex */
public interface q2 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f14588a = a.f14589a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f14589a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final q2 f14590b = C0054a.f14591b;

        /* renamed from: androidx.compose.ui.platform.q2$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0054a implements q2 {

            /* renamed from: b  reason: collision with root package name */
            public static final C0054a f14591b = new C0054a();

            @Override // androidx.compose.ui.platform.q2
            public final l0.g1 a(View view) {
                jo.p.h(view, "rootView");
                return WindowRecomposer_androidKt.c(view, null, null, 3, null);
            }
        }

        public final q2 a() {
            return f14590b;
        }
    }

    l0.g1 a(View view);
}
